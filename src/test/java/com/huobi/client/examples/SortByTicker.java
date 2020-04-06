package com.huobi.client.examples;

import com.huobi.client.RequestOptions;
import com.huobi.client.SyncRequestClient;
import com.huobi.client.constants.YxConfig;
import com.huobi.client.model.TradeStatistics;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortByTicker {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        options.setUrl(YxConfig.HTTP_URL);
        SyncRequestClient syncRequestClient = SyncRequestClient.create(
                YxConfig.API_KEY, YxConfig.SECRET_KEY, options
        );

        Map<String, TradeStatistics> tickers1 = syncRequestClient.getTickers();

        List<Ticker> list = new LinkedList<>();
        for (Entry<String, TradeStatistics> entry : tickers1.entrySet()) {
            Ticker ticker = new Ticker();
            ticker.symbol = entry.getKey();
            ticker.statistics = entry.getValue();
            list.add(ticker);
        }
        Collections.sort(list, (o1, o2) -> -o1.statistics.getAmount().compareTo(o2.statistics.getAmount()));

        System.out.println("Sort by Amount");
        for (Ticker ticker : list) {
            System.out.println(String.format("%s,%s", ticker.symbol, ticker.statistics.getAmount().toPlainString()));
        }
    }

    static class Ticker {
        public String symbol;
        public TradeStatistics statistics;
    }
}
