package com.xiami.utils;

import java.util.HashMap;
import java.util.Map;

public class Msg {

    private int code;
    private String Msg;

    private Map<String,Object> excetd =new HashMap<String,Object>();


    public static Msg success(){
        Msg reslut =new Msg();
        reslut.code=100;
        reslut.Msg="ok";
        return  reslut;
    }

    public static Msg fail(){
        Msg reslut =new Msg();
        reslut.code=200;
        reslut.Msg="error";
        return  reslut;
    }

    public  Msg add(String key,Object value){
        this.excetd.put(key,value);
        return  this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public Map<String, Object> getExcetd() {
        return excetd;
    }

    public void setExcetd(Map<String, Object> excetd) {
        this.excetd = excetd;
    }
}
