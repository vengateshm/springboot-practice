package dev.vengateshm.springboot_practice.adapter_pattern;

public class PaymentResponse {
    private boolean isSuccess;
    private long transactionId;

    public PaymentResponse(boolean isSuccess, long transactionId) {
        this.isSuccess = isSuccess;
        this.transactionId = transactionId;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }
}
