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
public class Main_BaiTap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienPoly svPoly = new SinhVienPoly("Nguyễn Cảnh Tùng", "CNTT") {
            @Override
            public double getDiem() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        System.out.println(svPoly);
        svPoly.Xuat();
        
        
        SinhVienIT sinhVienIT = new SinhVienIT(7.5, 5.6, 9, "Nguyễn Văn Quân", "CNTT");
        System.out.println(sinhVienIT); 
        sinhVienIT.Xuat();
        System.out.println("Điểm của sv IT:" +sinhVienIT.getDiem());
        System.out.println("Học lực của sv IT: "+sinhVienIT.getHocLuc());
        
        
        SinhVienBiz sinhVienBiz = new SinhVienBiz(7.8, 9.2, "Nguyễn Lan Anh", "CNSH");
        System.out.println(sinhVienBiz);
        sinhVienBiz.Xuat();
        System.out.println("Điểm của sv Biz: "+sinhVienBiz.getDiem());
        System.out.println("Học lực của sv Biz là: "+sinhVienBiz.getHocLuc());
    }
    
}
