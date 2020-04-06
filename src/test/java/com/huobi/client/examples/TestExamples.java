package com.huobi.client.examples;

import com.huobi.client.SubscriptionClient;
import com.huobi.client.SubscriptionOptions;
import com.huobi.client.constants.YxConfig;

public class TestExamples {

    public static void main(String[] args) {
        String symbol = "htusdt,btcusdt";

        SubscriptionOptions options = new SubscriptionOptions();
        options.setUri(YxConfig.WSS_URL);

        SubscriptionClient subscriptionClient = SubscriptionClient.create(
                YxConfig.API_KEY, YxConfig.SECRET_KEY, options);
        subscriptionClient.requestAccountListEvent(event -> {
            System.out.println(event);
        });


    }

}
