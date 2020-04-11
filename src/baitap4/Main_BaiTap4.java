/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Main_BaiTap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<XeNoiThanh> dsXeNoiThanhs = new ArrayList<>();
        ArrayList<XeNgoaiThanh> dsXeNgoaiThanhs = new ArrayList<>();
        
        //Thông tin các chuyến xe nội thành
        System.out.println("--------------THÔNG TIN CHUYẾN XE NỘI THÀNH---------------");

            XeNoiThanh xeNoiThanh1 = new XeNoiThanh( "CX01","Thành Long", "79QFH9853", 866000, "T01", 1272);
            XeNoiThanh xeNoiThanh2 = new XeNoiThanh("CX02", "Kim Cương", "79TH04528", 1200000, "T02", 3627);
            XeNoiThanh xeNoiThanh3 = new XeNoiThanh("CX03", "Hoàng Linh", "79THY0953", 219080, "T03", 2301);
            
            QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
            qlcx.them(xeNoiThanh1);
            qlcx.them(xeNoiThanh2);
            qlcx.them(xeNoiThanh3);
            qlcx.inDS();
        
        //Thông tin các chuyến xe nội thành
        System.out.println("--------------THÔNG TIN CHUYẾN XE NGOẠI THÀNH---------------");

            XeNgoaiThanh xeNgoaiThanh1 = new XeNgoaiThanh( "CX05","Kim An", "79QFH9765", 2266000, "Phú Yên", "1");
            XeNgoaiThanh xeNgoaiThanh2 = new XeNgoaiThanh("CX06", "Bình Dương", "79TH04528", 3520000, "Ninh Thuận", "2");
            XeNgoaiThanh xeNgoaiThanh3 = new XeNgoaiThanh("CX07", "Hoàng Phan", "79KB0953", 5500000, "Bình Dương", "3");
            
            QuanLyChuyenXe qlcx2 = new QuanLyChuyenXe();
            qlcx2.them(xeNgoaiThanh1);
            qlcx2.them(xeNgoaiThanh2);
            qlcx2.them(xeNgoaiThanh3);
            qlcx2.inDS(); 
            
        //Doanh thu của các chuyến xe
        System.out.println("----------Doanh Thu Của Từng Chuyến Xe----------");
        double tongDT = xeNoiThanh1.getDoanhThu()+xeNoiThanh2.getDoanhThu()+xeNoiThanh3.getDoanhThu();
        System.out.println("Tổng qoanh thu của xe nội thanh:" +tongDT);
        
       double tongDT2 = xeNgoaiThanh1.getDoanhThu()+xeNgoaiThanh2.getDoanhThu()+xeNgoaiThanh3.getDoanhThu();
        System.out.println("Tỏng doanh thu của xe ngoại thành:" +tongDT2);
        
        double tong = tongDT + tongDT2;
        System.out.println("Tổng doanh thu của cả hai loại xe:" +tong);
    
    }
    
}
