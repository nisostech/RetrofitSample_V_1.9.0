package com.nisostech.retrofitsample.network;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Soham Banerjee on 13/3/15.
 * "error" : true,
 * "errorCode" : 3409,
 * "extendedMessage" : "Account email is already exist. Email unique constraint.",
 * "message" : "Account already exist.Please try another email.",
 * "moreInfo" : "Unique email constraint error.",
 * "status" : 409
 */

// This is class should be modified as your server's error response

public class RestError {
    public Integer errorCode;
    public String extendedMessage;
    public String message;
    public String moreInfo;
    public Integer status;

    public RestError() {
    }

    public RestError(String message) {
        this.message = message;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getExtendedMessage() {
        return extendedMessage;
    }

    public void setExtendedMessage(String extendedMessage) {
        this.extendedMessage = extendedMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String toJSON() {

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("errorCode", errorCode);
            jsonObject.put("extendedMessage", extendedMessage);
            jsonObject.put("message", message);
            jsonObject.put("moreInfo", moreInfo);
            jsonObject.put("status", status);

            return jsonObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}