package com.huobi.client.examples;

import com.alibaba.fastjson.JSON;
import com.huobi.client.SyncRequestClient;
import com.huobi.client.examples.constants.Constants;
import com.huobi.client.model.MarginLoanInfo;

import java.util.List;

public class MarginExamples {

    public static void main(String[] args) {
        SyncRequestClient syncRequestClient = SyncRequestClient.create(Constants.API_KEY, Constants.SECRET_KEY);

        List<MarginLoanInfo> infoList = syncRequestClient.getLoanInfo(null);
        infoList.forEach(marginLoanInfo -> {
            System.out.println("----------------------");
            System.out.println("symbol : " + marginLoanInfo.getSymbol());
            marginLoanInfo.getCurrencies().forEach(currencyInfo -> {
                System.out.println("currency info ::" + JSON.toJSONString(currencyInfo));
            });
        });

    }

}
