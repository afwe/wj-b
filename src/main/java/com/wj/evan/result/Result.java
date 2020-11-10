package com.wj.evan.result;

public class Result {
    //响应码
    private int code;
    private String message="fuck";
    private Object data;

    public Result(int code) {
        this.code = code;
    }

    public Result(int code,String message,Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String Message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}

