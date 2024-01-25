package com.example.myweatherapp.data;

// 封装一个小时展示温度的数据对象
public class HourData {
    private String hour; // 图片路径 小时
    private int wenDu,src; // 温度

    public HourData(String hour, int wenDu, int src) {
        this.src = src;
        this.hour = hour;
        this.wenDu = wenDu;
    }

    public int getSrc() {
        return src;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getWenDu() {
        return wenDu;
    }

    public void setWenDu(int wenDu) {
        this.wenDu = wenDu;
    }
}
