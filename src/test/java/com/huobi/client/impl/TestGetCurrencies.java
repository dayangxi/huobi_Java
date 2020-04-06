package com.huobi.client.impl;

import com.huobi.client.RequestOptions;
import com.huobi.client.exception.HuobiApiException;
import com.huobi.client.impl.utils.JsonWrapper;
import okhttp3.Request;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestGetCurrencies {

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    private RestApiRequestImpl impl = null;
    private String data = "{\n"
            + "\t\"status\": \"ok\",\n"
            + "\t\"data\": [\"hb10\", \"usdt\", \"btc\", \"bch\"]\n"
            + "}";
    private String dataError = "{\n"
            + "\t\"status\": \"ok\"\n"
            + "}";

    @Before
    public void Initialize() {
        impl = new RestApiRequestImpl("", "", new RequestOptions());
    }

    @Test
    public void test() {
        RestApiRequest<List<String>> restApiRequest = impl.getCurrencies();
        Request request = restApiRequest.request;
        assertEquals("GET", request.method());
        assertTrue(request.url().toString().contains("/v1/common/currencys"));
        List<String> result = restApiRequest.jsonParser.parseJson(JsonWrapper.parseFromString(data));
        assertEquals(4, result.size());
        assertEquals("hb10", result.get(0));
        assertEquals("usdt", result.get(1));
        assertEquals("btc", result.get(2));
    }

    @Test

    public void test_error() {
        RestApiRequest<List<String>> restApiRequest = impl.getCurrencies();
        thrown.expect(HuobiApiException.class);
        thrown.expectMessage("Get json item field");
        restApiRequest.jsonParser.parseJson(JsonWrapper.parseFromString(dataError));
    }
}
