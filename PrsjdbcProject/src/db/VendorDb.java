package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.User;
import model.Vendor;

public class VendorDb {

		public static ArrayList<Vendor> getAll(){
			
			ArrayList<Vendor> vendors = new ArrayList<>();
			String sql = "Select * from Vendor";
			try(Connection connection = PrsDb.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet rs = ps.executeQuery())
			{
				while(rs.next()) {
					//parse vendor into rs
					
					Vendor v = parseVendorFromResultSet(rs);
					vendors.add(v);
					
				}
			}
			catch(SQLException sqle) {
				System.err.println(sqle);
				vendors = null;
			}
		
			return vendors;
			
		}
		
		public static boolean add(Vendor vendor)
		{
			boolean success = false;
			
			String sql = "INSERT INTO Vendor (Code, Name, Address, City, State, Zip, Phone, Email)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			// to prevent sequel injection attack, ?
			
			try (Connection connection = PrsDb.getConnection();
					PreparedStatement ps = connection.prepareStatement(sql)){
				ps.setString(1, vendor.getCode());
				ps.setString(2, vendor.getName());
				ps.setString(3, vendor.getAddress());
				ps.setString(4, vendor.getCity());
				ps.setString(5, vendor.getState());
				ps.setString(6, vendor.getZip());
				ps.setString(7, vendor.getPhone());
				ps.setString(8, vendor.getEmail());
				ps.executeUpdate();
				success = true;
			}
			catch (SQLException sqle) {
				System.err.println(sqle);
			}
			
			return success;
		}
		
		
		private static Vendor parseVendorFromResultSet(ResultSet rs) throws SQLException
		{
			
			int Id = rs.getInt(1);
			String Code = rs.getString(2);
			String Name = rs.getString(3);
			String Address = rs.getString(4);
			String City = rs.getString(5);
			String State = rs.getString(6);
			String Zip = rs.getString(7);
			String Phone = rs.getString(8);
			String Email = rs.getString(9);
			
			Vendor v = new Vendor(Id, Code, Name, Address, City, State, Zip, Phone, Email);
			
			return v;
		}
}
