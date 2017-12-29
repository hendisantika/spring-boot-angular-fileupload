package com.hendisantika.service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-angular-fileupload
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/12/17
 * Time: 06.46
 * To change this template use File | Settings | File Templates.
 */

public class ResponseMetadata {

    private int status;
    private String message;
    private Object data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
