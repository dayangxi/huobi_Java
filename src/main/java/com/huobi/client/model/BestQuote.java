package com.huobi.client.model;

import java.math.BigDecimal;

/**
 * The best bid/ask consisting of price and amount.
 */
public class BestQuote {

    private long timestamp;
    private BigDecimal askPrice;
    private BigDecimal askAmount;
    private BigDecimal bidPrice;
    private BigDecimal bidAmount;

    /**
     * Get the Unix formatted timestamp in UTC.
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
     * Get the best ask price.
     *
     * @return The price.
     */
    public BigDecimal getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(BigDecimal askPrice) {
        this.askPrice = askPrice;
    }

    /**
     * Get the best ask amount.
     *
     * @return The amount.
     */
    public BigDecimal getAskAmount() {
        return askAmount;
    }

    public void setAskAmount(BigDecimal askAmount) {
        this.askAmount = askAmount;
    }

    /**
     * Get the best bid price.
     *
     * @return The price.
     */
    public BigDecimal getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(BigDecimal bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * Get the best bid amount.
     *
     * @return The amount.
     */
    public BigDecimal getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(BigDecimal bidAmount) {
        this.bidAmount = bidAmount;
    }
}
