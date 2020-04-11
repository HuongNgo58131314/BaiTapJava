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
public class XeNgoaiThanh extends ChuyenXe
{
    public String noiDen;
    public String soNgayDi;

    public XeNgoaiThanh() {
    }

    public XeNgoaiThanh(String maChuyenXe, String hoten, String soXe, double doanhThu, String noiDen, String soNgayDi) {
        this.maChuyenXe = maChuyenXe;
        this.hoten = hoten;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public String getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(String soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    @Override
    public String toString() {
        return "XeNgoaiThanh{" + "noiDen=" + noiDen + ", soNgayDi=" + soNgayDi + '}';
    }
    
    
}
