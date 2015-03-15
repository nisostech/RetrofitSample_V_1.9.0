package com.nisostech.retrofitsample.network.Responses;

import com.nisostech.retrofitsample.vos.UserVo;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by  Soham Banerjee on 13/3/15.
 */

public class LoginResponse {
    //TODO might have to make this public as private means introspection and it might be a performance hit.
    public String email;
    public String id;
    public String error;
    public UserVo resp;

    // default constructor, getters and setters
    public LoginResponse() {

    }

    public LoginResponse(String error, UserVo resp) {
        this.error = error;
        this.resp = resp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public UserVo getUserVo() {
        return resp;
    }

    public void setUserVo(UserVo resp) {
        this.resp = resp;
    }

    public String toJSON() {

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("error", error);
            jsonObject.put("UserVo", resp);
            return jsonObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
