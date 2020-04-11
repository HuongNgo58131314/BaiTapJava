/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author Admin
 */
public abstract class ChuyenXe {
    public String maChuyenXe;
    public String hoten;
    public String soXe;
    public double doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maChuyenXe, String hoten, String soXe, double doanhThu) {
        this.maChuyenXe = maChuyenXe;
        this.hoten = hoten;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaChuyenXe() {
        return maChuyenXe;
    }

    public void setMaChuyenXe(String maChuyenXe) {
        this.maChuyenXe = maChuyenXe;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "ChuyenXe{" + "maChuyenXe=" + maChuyenXe + ", hoten=" + hoten + ", soXe=" + soXe + ", doanhThu=" + doanhThu + '}';
    }
    
    
}
