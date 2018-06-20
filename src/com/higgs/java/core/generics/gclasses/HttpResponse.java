package com.higgs.java.core.generics.gclasses;

import java.io.Serializable;

public class HttpResponse <T> implements Serializable {
    private String code;
    private String message;
    private T data;

    public HttpResponse(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // Getter & setter -------------------------------------------------------------------------------------------------

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
