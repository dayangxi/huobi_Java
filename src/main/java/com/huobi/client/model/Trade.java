package com.huobi.client.model;

import com.huobi.client.model.enums.TradeDirection;

import java.math.BigDecimal;

/**
 * The trade information with price and amount etc.
 */
public class Trade {

    private Long uniqueTradeId;
    private String tradeId;
    private long timestamp;
    private BigDecimal price;
    private BigDecimal amount;
    private TradeDirection direction;

    public Long getUniqueTradeId() {
        return uniqueTradeId;
    }

    public void setUniqueTradeId(Long uniqueTradeId) {
        this.uniqueTradeId = uniqueTradeId;
    }

    /**
     * Get the unique trade id of this trade.
     *
     * @return The unique trade id of this trade.
     */
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    /**
     * Get the UNIX formatted timestamp generated by server in UTC.
     *
     * @return The timestamp.
     */
    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Get the trading price in quote currency.
     *
     * @return The trading price in quote currency.
     */
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Get the trading volume in base currency.
     *
     * @return The trading price in quote currency.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Get the direction of the taker trade: 'buy' or 'sell'.
     *
     * @return The direction of the trade, see {@link TradeDirection}
     */
    public TradeDirection getDirection() {
        return direction;
    }

    public void setDirection(TradeDirection direction) {
        this.direction = direction;
    }
}
