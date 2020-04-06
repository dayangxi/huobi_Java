package com.huobi.client.model;

import java.math.BigDecimal;

/**
 * The candlestick/kline data.
 */
public class Candlestick {

    private Long id;
    private long timestamp;
    private BigDecimal amount;
    private long count;
    private BigDecimal open;
    private BigDecimal close;
    private BigDecimal low;
    private BigDecimal high;
    private BigDecimal volume;

    /**
     * Get the UNIX formatted timestamp in UTC.
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
     * Get the aggregated trading volume in USDT.
     *
     * @return The amount.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Get the number of completed trades.<br>
     * it returns 0 when get ETF candlestick
     *
     * @return The number of trades.
     */
    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    /**
     * Get the opening price.
     *
     * @return The open price.
     */
    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    /**
     * Get the closing price.
     *
     * @return The close price.
     */
    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

    /**
     * Get the low price.
     *
     * @return The low price.
     */
    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    /**
     * Get the high price.
     *
     * @return The high price.
     */
    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    /**
     * Get the trading volume in base currency.
     *
     * @return The volume.
     */
    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
