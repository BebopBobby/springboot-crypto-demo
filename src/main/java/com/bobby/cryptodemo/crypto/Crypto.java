package com.bobby.cryptodemo.crypto;


public class Crypto {
    Ticker ticker;
    Long timeStamp;
    boolean success;
    String error;

    public Crypto(Ticker ticker, Long timeStamp, boolean success, String error) {
        this.ticker = ticker;
        this.timeStamp = timeStamp;
        this.success = success;
        this.error = error;
    }

    public Crypto() {
    }

    public Ticker getTicker() {
        return ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Crypto{" +
                "ticker=" + ticker +
                ", timeStamp=" + timeStamp +
                ", success=" + success +
                ", error='" + error + '\'' +
                '}';
    }
}
