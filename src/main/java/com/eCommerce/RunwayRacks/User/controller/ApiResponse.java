package com.eCommerce.RunwayRacks.User.controller;

public class ApiResponse<T> {
    private boolean success;
    private T data;
    private String message;

    // Constructors
    public ApiResponse(boolean success, T data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public ApiResponse(boolean success, T data) {
        this(success, data, null);
    }

    public ApiResponse(boolean success, String message) {
        this(success, null, message);
    }

    // Getters and setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
