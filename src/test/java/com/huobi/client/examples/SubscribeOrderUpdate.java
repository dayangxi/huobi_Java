package com.huobi.client.examples;

import com.alibaba.fastjson.JSON;
import com.huobi.client.SubscriptionClient;
import com.huobi.client.examples.constants.Constants;
import com.huobi.client.model.enums.OrderState;
import com.huobi.client.model.enums.OrderType;
import com.huobi.client.model.enums.QueryDirection;
import com.huobi.client.model.request.OrdersRequest;
import org.apache.commons.lang.time.DateUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubscribeOrderUpdate {

    public static void main(String[] args) {

        String symbol = "htusdt";
        SubscriptionClient client = SubscriptionClient.create(Constants.API_KEY, Constants.SECRET_KEY);
        /**
         * subscribe order updateEvent ,old interface
         */
        client.subscribeOrderUpdateEvent(symbol, (event -> {
            System.out.println(JSON.toJSONString(event));
        }));

        /**
         * subscribe order updateEvent ,new interface (recommend)
         *
         * Wild card (*) is supported
         * examples : symbol = "*"
         */
        client.subscribeOrderUpdateNewEvent(symbol, (event -> {
            System.out.println(JSON.toJSONString(event));
        }));

        /**
         * request order list event
         */
        List<OrderState> stateList = new ArrayList<>();
        stateList.add(OrderState.CANCELED);
        stateList.add(OrderState.FILLED);

        List<OrderType> typeList = new ArrayList<>();
        typeList.add(OrderType.BUY_LIMIT);
        typeList.add(OrderType.SELL_LIMIT);
        typeList.add(OrderType.BUY_MARKET);
        typeList.add(OrderType.SELL_MARKET);

        Date today = new Date();
        Date startDate = DateUtils.addDays(today, -2);

        long startOrderId = 48909764277L;

        OrdersRequest ordersRequest = new OrdersRequest(symbol, stateList, typeList, startDate, today, startOrderId, 20, QueryDirection.PREV);

        client.requestOrderListEvent(ordersRequest, orderListEvent -> {
            System.out.println("=================Request Order List======================");
            orderListEvent.getOrderList().forEach(order -> {
                System.out.println("Request Orders:" + JSON.toJSONString(order));
            });
        });

        System.out.println("------------------------------------------");

        /**
         * request order detail event
         */
        client.requestOrderDetailEvent(startOrderId, orderListEvent -> {
            System.out.println("=================Request Order Detail======================");
            orderListEvent.getOrderList().forEach(order -> {
                System.out.println("Request Order:" + JSON.toJSONString(order));
            });
        });

    }

}
