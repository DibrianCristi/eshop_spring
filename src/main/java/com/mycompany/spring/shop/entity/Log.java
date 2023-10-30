package com.mycompany.spring.shop.entity;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app_logs")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "logger_name")
    private String msg;
    @Column(name = "log_level")
    private String log_level;
    @Column(name = "timestamp")
    private String date;

    public Log() {
    }

    public Log(String msg, String date) {
        this.msg = msg;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }

    public String getDate() {
        return date;
    }

    public String getLogLevel() {
        return log_level;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLogLevel(String log_level) {
        this.log_level = log_level;
    }
}
