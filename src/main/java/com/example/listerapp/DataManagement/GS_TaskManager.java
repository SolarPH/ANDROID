package com.example.listerapp.DataManagement;

public class GS_TaskManager {
    public String task_type, task_name, task_desc, task_date, task_time, task_status, task_owner;

    public GS_TaskManager(String task_type, String task_name, String task_desc, String task_date, String task_time, String task_status, String task_owner){
        this.task_type = task_type;
        this.task_name = task_name;
        this.task_desc = task_desc;
        this.task_date = task_date;
        this.task_time = task_time;
        this.task_status = task_status;
        this.task_owner = task_owner;
    }

    public String getTask_type() {
        return task_type;
    }

    public void setTask_type(String task_type) {
        this.task_type = task_type;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_desc() {
        return task_desc;
    }

    public void setTask_desc(String task_desc) {
        this.task_desc = task_desc;
    }

    public String getTask_date() {
        return task_date;
    }

    public void setTask_date(String task_date) {
        this.task_date = task_date;
    }

    public String getTask_time() {
        return task_time;
    }

    public void setTask_time(String task_time) {
        this.task_time = task_time;
    }

    public String getTask_status() {
        return task_status;
    }

    public void setTask_status(String task_status) {
        this.task_status = task_status;
    }

    public String getTask_owner() {
        return task_owner;
    }

    public void setTask_owner(String task_owner) {
        this.task_owner = task_owner;
    }
}
