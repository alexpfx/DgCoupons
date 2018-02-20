package br.com.alexpfx.dgcoupons.data.pojo;

import java.util.Date;

public class Coupon {
    private String code;
    private int status;
    private Date dateAdded;
    private Date dateLastStatus;


    public Coupon(String code, int status, Date dateAdded, Date dateLastStatus) {
        this.code = code;
        this.status = status;
        this.dateAdded = dateAdded;
        this.dateLastStatus = dateLastStatus;
    }


    public String getCode() {
        return code;
    }


    public int getStatus() {
        return status;
    }


    public Date getDateAdded() {
        return dateAdded;
    }


    public Date getDateLastStatus() {
        return dateLastStatus;
    }
}
