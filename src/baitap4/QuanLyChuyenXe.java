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
public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> qlChuyenXes = new ArrayList<>();
    
    public int them(ChuyenXe chuyenXe)
    {
        qlChuyenXes.add(chuyenXe);
            return 1;
    }
    
    public void inDS()
    {
        for(int i=0; i<qlChuyenXes.size(); i++)
        {
            System.out.println("Danh sách chuyến xe: "+(i+1));
            System.out.println(qlChuyenXes.get(i).getHoten());
            System.out.println(qlChuyenXes.get(i).getMaChuyenXe());
            System.out.println(qlChuyenXes.get(i).getSoXe());
            System.out.println(qlChuyenXes.get(i).getDoanhThu());
        }
    }
    public double tinhDoanhThu(){
        return 0;
    }
    
}
