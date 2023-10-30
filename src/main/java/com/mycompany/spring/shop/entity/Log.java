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
    private String severity;
    @Column(name = "timestamp")
    private Date date;

    public Log() {
    }

    public Log(String msg, Date date) {
        this.msg = msg;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }

    public Date getDate() {
        return date;
    }

    public String getSeverity() {
        return severity;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}
