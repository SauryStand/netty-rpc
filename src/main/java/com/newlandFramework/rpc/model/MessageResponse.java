package com.newlandFramework.rpc.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * @Description:
 * @Created by Johnny Chou on 2017/9/30.
 * @Author：
 */
public class MessageResponse implements Serializable{
    private String messageId;
    private String error;
    private Object result;
    private boolean returnNotNull;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public boolean isReturnNotNull() {
        return returnNotNull;
    }

    public void setReturnNotNull(boolean returnNotNull) {
        this.returnNotNull = returnNotNull;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
}
