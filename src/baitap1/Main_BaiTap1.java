/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Admin
 */
public class Main_BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.setTen("Nguyễn Bằng");
        nv.setDiaChi("Khánh Hòa");
        nv.setTuoi("25");
        nv.setTongGioLam(156);
        nv.setTienLuong(7500000);
        nv.XuatTT();
       
    }
    
}
