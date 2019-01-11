package com.socket.cleiser.message;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Message {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm/dd/yyy HH:mm:ss");

    private String username;
    
    private String pic_data;

    private Date date;

    private String message;

    public Message(String username, String pic_data, Date date, String message) {
        this.username = username;
        this.pic_data = pic_data;
        this.date = date;
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public String getPic_Data() {
        return pic_data;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public String toString() {
        return String.format("{message: %s, user: {username: %s, pic: %s}, date: %s}", getMessage(), getUsername(), getPic_Data(), simpleDateFormat.format(getDate()));
    }
}