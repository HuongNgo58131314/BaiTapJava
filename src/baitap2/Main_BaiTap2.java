/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;

/**
 *
 * @author Admin
 */
public class Main_BaiTap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv1 = new NhanVien("Nguyễn Kim", "24", "Khánh Hòa", 5600000, 190);
        NhanVien nv2 = new NhanVien("Trần Phương", "25", "Phú Yên", 7900000, 90);
        NhanVien nv3 = new NhanVien("Nguyễn Cảnh", "30", "Khánh Hòa", 8900000, 210);
        NhanVien nv4 = new NhanVien("Kim Thoa", "26", "Ninh Thuận", 6800000, 154);
        NhanVien nv5 = new NhanVien("Nguyễn Hoàng", "33", "Quãng Bình", 9500000, 210);
        
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        
        qlnv.inDS();
    }
    
}
