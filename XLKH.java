/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GKH;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author THANTHUY
 */
public class XLKH implements IKhachhang{

    @Override
    public Connection getCon(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dlkh", "root", "");
        } catch (SQLException e) {
        }
        return conn;
    }
    
    @Override
    public void delKH(String diaChi, String gioiTinh){
        Connection conn = getCon();
        String query = "delete  from tbkhachhang where Diachi  = '"+diaChi+"' and GT = '"+gioiTinh+"'";
        
        try {
            Statement stm = conn.createStatement();
            stm.execute(query);
            
            System.out.println("DELETED!");
        } catch (SQLException e) {
        }
    }
    
    
    @Override
    public List<Khachhang> getAll(){
        List<Khachhang> khachhangs = new ArrayList<>();
        Connection conn = getCon();
        String query = "select * from tbkhachhang";
        
        try {
            Statement stm = conn.createStatement();
            
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                int stk = rs.getInt("SoTK");
                String hoten = rs.getString("Hoten");
                String gioitinh = rs.getString("GT");
                String diachi = rs.getString("Diachi");
                int sodu = rs.getInt("Sodu");
                
                Khachhang kh = new Khachhang(stk, hoten, gioitinh, diachi, sodu);
                
                khachhangs.add(kh);
            }
            
            
        } catch (SQLException e) {
        }
        return khachhangs;
    }
}
