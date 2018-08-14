package daisoTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class ProductBuyDAO {
	
	public Connection Consql() {
		String className="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@192.168.0.6:1521:xe";
		String user="daiso";
		String password="123";
		Connection con =null;
		try {
			Class.forName(className);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		
		}
		return con;
	}
	public Vector<String> Selectsql() {
		PreparedStatement prst=null;
		Connection con=null;
		ResultSet rst=null;
		
		Vector data = new Vector();
		try {
			con=Consql();
			StringBuilder sql = new StringBuilder();
			sql.append("    select item_name, price, balance               ");
			sql.append("    from product                                    ");
			sql.append("   where high_code='C'                              ");
			prst=con.prepareStatement(sql.toString());
//			prst.setString(1, "C");///하이코드
			rst=prst.executeQuery();
			
			while(rst.next())
			{
				Vector<String> arr = new Vector<>();
				arr.addElement(rst.getString("item_name"));
				arr.addElement(rst.getString("price"));
				arr.addElement(rst.getString("balance"));
				data.addElement(arr);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			if(prst!=null)try {prst.close();}catch(SQLException e) {}
		}
		return data;
	}
	public Vector<String> ColHedaer(){
		Vector<String> arr_col = new Vector<>();
		arr_col.addElement("이름");
		arr_col.addElement("가격");
		arr_col.addElement("재고");
		return arr_col;
	}
	
}
