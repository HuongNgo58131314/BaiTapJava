/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {
    String ten;
    String tuoi;
    String diaChi;
    double tienLuong;
    int tongGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, String tuoi, String diaChi, double tienLuong, int tongGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }
    
    public void getThongTin()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Tên nhân viên: ");
        ten = input.nextLine();
        System.out.println("Tuổi: ");
        tuoi = input.nextLine();
        System.out.println("Địa chỉ: ");
        diaChi = input.nextLine();
        System.out.println("Lương: ");
        tienLuong = input.nextDouble();
        System.out.println("Tổng giờ làm: ");
        tongGioLam = input.nextInt();
        
    }
    
    public void XuatTT()
    {
        System.out.println("-----------THÔNG TIN NHÂN VIÊN----------------");
        System.out.println("Tên nhân viên:"+ten);
        System.out.println("Tuôi:"+tuoi);
        System.out.println("Địa chỉ:"+diaChi);
        System.out.println("Tổng giờ làm:"+tongGioLam);   
        System.out.println("Tiền thưởng: "+tinhThuong());
        System.out.println("Lương:"+(tienLuong+tinhThuong()));
    }
    
    public double tinhThuong()
    {
        double tienThuong;
        if(tongGioLam >= 200)
            tienThuong = tienLuong*0.2;
        else if(tongGioLam >= 100 && tongGioLam < 200)
            tienThuong = tienLuong*0.1;
        else tienThuong = 0;
        return tienThuong;
    }
}
