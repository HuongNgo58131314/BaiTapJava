/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author Admin
 */
public class SinhVienIT extends SinhVienPoly{
    public double diemJava;
    public double diemCss;
    public double diemHtml;
    
    public SinhVienIT(String hoTen, String nganh) {
        super(hoTen, nganh);
    }

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    
    @Override
    public double getDiem() {
        return (this.diemJava*2 + this.diemCss + this.diemHtml)/4;
    }
    
}
