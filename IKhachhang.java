/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GKH;
import java.sql.*;
import java.util.List;


/**
 *
 * @author THANTHUY
 */
public interface IKhachhang {
    public Connection getCon();
    public List<Khachhang> getAll();
    public void delKH(String diaChi,String gioiTinh);
}
