/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author ADMIN
 */
@AllArgsConstructor //constructor full tham số
@NoArgsConstructor  //constructor ko tham số
@Getter 
@Setter
@ToString
@Builder //constructor tùy ý tham số


public class KhachHang {
    private Integer id;
    private String ma;
    private String ten;
    private String tenDem;
    private String ho;
    private Date ngaySinh;
    private String soDienThoai;
    private String diaChi;
    private String thanhPho;
    private String quocGia;
    private String matKhau;
    private Integer trangThai;

    
    
}
