
package com.mycompany.quanlydemo1;

public class Quanly {
   private String hoten;
   private String cccd;
   private String sdt;
   private String nhamang;
   private String goi;
   private String time;
   private double giacuoc;
   
//constructor
    public Quanly(String hoten, String cccd, String sdt, String nhamang, String goi, String time, double giacuoc ) {
        this.hoten = hoten;
        this.cccd = cccd;
        this.sdt = sdt;
        this.nhamang = nhamang;
        this.goi = goi;
        this.giacuoc = giacuoc;
        this.time = time;
    }
//get set
    public String getHoten() {
        return hoten;
    }

    public String getCccd() {
        return cccd;
    }

    public String getSdt() {
        return sdt;
    }

    public String getNhamang() {
        return nhamang;
    }

    public String getGoi() {
        return goi;
    }

    public double getGiacuoc() {
        return giacuoc;
    }

    public String getTime() {
        return time;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setNhamang(String nhamang) {
        this.nhamang = nhamang;
    }

    public void setGoi(String goi) {
        this.goi = goi;
    }

    public void setGiacuoc(double giacuoc) {
        this.giacuoc = giacuoc;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
}
