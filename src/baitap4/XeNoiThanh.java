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
public class XeNoiThanh extends ChuyenXe{
    public String soTuyen;
    public float soKm;

    public XeNoiThanh() {
    }

    public XeNoiThanh(String maChuyenXe, String hoten, String soXe, double doanhThu, String soTuyen, float soKm) {
        this.maChuyenXe = maChuyenXe;
        this.hoten = hoten;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }
    

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public float getSoKm() {
        return soKm;
    }

    public void setSoKm(float soKm) {
        this.soKm = soKm;
    }

    @Override
    public String toString() {
        return "XeNoiThanh{" + "soTuyen=" + soTuyen + ", soKm=" + soKm + '}';
    }

    
}
