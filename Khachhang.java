/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GKH;

/**
 *
 * @author THANTHUY
 */
public class Khachhang {
     private int soTK;
    private String hoTen ;
    private String gioiTinh;
    private String diaChi;
    private int soDu;

    public Khachhang() {
    }

    public Khachhang(int soTK, String hoTen, String gioiTinh, String diaChi, int soDu) {
        this.soTK = soTK;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDu =  soDu;
    }

    public int getSoTK() {
        return soTK;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public long getSoDu() {
        return soDu;
    }

    public void setSoTK(int soTK) {
        this.soTK = soTK;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }
    
    
}
