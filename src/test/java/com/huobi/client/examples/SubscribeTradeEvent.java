package com.huobi.client.examples;

import com.huobi.client.SubscriptionClient;
import com.huobi.client.SubscriptionOptions;
import com.huobi.client.constants.YxConfig;

import java.util.Date;

public class SubscribeTradeEvent {


    public static void main(String[] args) {

        String symbol = "eosusdt";
        SubscriptionOptions options = new SubscriptionOptions();
        options.setUri(YxConfig.WSS_URL);
        SubscriptionClient subscriptionClient = SubscriptionClient.create(
                YxConfig.API_KEY, YxConfig.SECRET_KEY, options);

//        subscriptionClient.subscribeTradeEvent(symbol, tradeEvent -> {
//            System.out.println("------------逐笔成交明细11111-------------");
//            tradeEvent.getTradeList().forEach(trade -> {
//                System.out.println(
//                        " date:"+ (new Date(trade.getTimestamp()))  +
////                        " id:" + trade.getTradeId() +
//                        " price:" + trade.getPrice() +
//                        " amount:" + trade.getAmount() +
//                        " direction:" + trade.getDirection());
//            });
//        });

        //时间误差:火币时间:10:28:08 ->本地时间:10:29:17

        subscriptionClient.requestTradeEvent(symbol, tradeEvent -> {
            System.out.println("------------逐笔成交明细222222-------------");
            tradeEvent.getTradeList().forEach(trade -> {
                System.out.println(
                        " date:" + (new Date(trade.getTimestamp())) +
//                        " id:" + trade.getTradeId() +
                                " price:" + trade.getPrice() +
                                " amount:" + trade.getAmount() +
                                " direction:" + trade.getDirection());
            });
        });
    }
}
