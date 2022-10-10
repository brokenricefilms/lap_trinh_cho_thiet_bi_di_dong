package vn.edu.stu.demointent_sendreceiveobject.model;

import android.os.Parcelable;

import java.io.Serializable;

public class Sinhvien implements Serializable {
    private int ma;
    private String ten;

    public Sinhvien() {
    }

    public Sinhvien(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "Mã: " + ma +
                "\nTên:" + ten;
    }
}
