package com.huobi.client.model;

import java.math.BigDecimal;

/**
 * The last trade and best bid/ask.
 */
public class LastTradeAndBestQuote {

    private BigDecimal lastTradePrice;
    private BigDecimal lastTradeAmount;
    private BigDecimal askPrice;
    private BigDecimal askAmount;
    private BigDecimal bidPrice;
    private BigDecimal bidAmount;

    /**
     * Get the last trade price.
     *
     * @return The last price.
     */
    public BigDecimal getLastTradePrice() {
        return lastTradePrice;
    }

    public void setLastTradePrice(BigDecimal lastTradePrice) {
        this.lastTradePrice = lastTradePrice;
    }

    /**
     * The last trade amount.
     *
     * @return The amount.
     */
    public BigDecimal getLastTradeAmount() {
        return lastTradeAmount;
    }

    public void setLastTradeAmount(BigDecimal lastTradeAmount) {
        this.lastTradeAmount = lastTradeAmount;
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
