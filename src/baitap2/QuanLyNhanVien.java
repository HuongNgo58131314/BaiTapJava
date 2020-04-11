/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> dsnv = new ArrayList<>();
    
    @Override
    public void them(NhanVien nv) {
        dsnv.add(nv);
    }

    @Override
    public void inDS() {
        for(int i=0; i<dsnv.size(); i++)
        {
            System.out.println("Nhân viên thứ: "+(i+1));
            System.out.println(dsnv.get(i).getTen());
            System.out.println(dsnv.get(i).getDiaChi());
            System.out.println(dsnv.get(i).getTuoi());
            System.out.println(dsnv.get(i).getTongGioLam());
            System.out.println(dsnv.get(i).getTienLuong());
        }
    }
    
}
