package com.example.ai_tool;

import com.google.gson.annotations.SerializedName;

public class MsgModel {
    @SerializedName("cnt")
    private  String cnt;

    public String getCnt() {
        return cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt;
    }

    public MsgModel(String cnt) {
        this.cnt = cnt;
    }
}
