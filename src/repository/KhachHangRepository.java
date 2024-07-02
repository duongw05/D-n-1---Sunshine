/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import Config.DBconnect;
import entity.KhachHang;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author ADMIN
 */
public class KhachHangRepository {
    //CRUD 
    public ArrayList<KhachHang> getAll(){
        //b1: tạo câu sql
        String sql = """
                     SELECT [Id]
                           ,[Ma]
                           ,[Ten]
                           ,[TenDem]
                           ,[Ho]
                           ,[NgaySinh]
                           ,[Sdt]
                           ,[DiaChi]
                           ,[ThanhPho]
                           ,[QuocGia]
                           ,[MatKhau]
                           ,[TrangThai]
                       FROM [dbo].[KhachHang]
                     """;
        //b2: mở cổng kết nối
        //try .. with ..resource => tự đóng cổng kết nối
        try(Connection con = DBconnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            // table => Resultset
            ResultSet rs = ps.executeQuery();
            ArrayList<KhachHang> list = new ArrayList<>();
            //Đối với các câu SQL
            // sử dụng excuteQuery => trả về 1 bảng (resultset)
            while(rs.next()){
                KhachHang kh = new KhachHang();
                kh.setId(rs.getInt(1));
                kh.setMa(rs.getString(2));
                kh.setTen(rs.getString(3));
                kh.setTenDem(rs.getString(4));
                kh.setHo(rs.getString(5));
                kh.setNgaySinh(rs.getDate(6));
                kh.setSoDienThoai(rs.getString(7));
                kh.setDiaChi(rs.getString(8));
                kh.setThanhPho(rs.getString(9));
                kh.setQuocGia(rs.getString(10));
                kh.setMatKhau(rs.getString(11));
                kh.setTrangThai(rs.getInt(12));
                list.add(kh);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
}
