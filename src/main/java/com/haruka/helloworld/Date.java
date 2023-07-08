package com.haruka.helloworld;

import java.time.LocalDateTime;

public class Date {
    private LocalDateTime nowDate;

    public Date(LocalDateTime nowDate) {
        this.nowDate = nowDate;
    }

    public LocalDateTime getNowDate() {
        return nowDate;
    }

    public void setNowDate(LocalDateTime nowDate) {
        this.nowDate = nowDate;
    }
}