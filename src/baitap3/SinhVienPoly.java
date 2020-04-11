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
public abstract class SinhVienPoly {
    public String hoTen;
    public String nganh;
    
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    
    public abstract double getDiem();
    
    public String getHocLuc()
    {
        if(this.getDiem()<5)
        {
            return "Yeu";
        }
        if(this.getDiem()<6.5){
            return "Trung binh";
        }
        if(this.getDiem()<7.5){
            return "Kha";
        }
        if(this.getDiem()<9){
            return "Gioi";
        }
        return "Xuat sac";
    }
    
    //Xuất thông tin sinh viên
    public void Xuat()
    {
        System.out.println("Họ tên:" +this.getHoTen()+ "Nganh: " +this.getNganh());
    }
}
