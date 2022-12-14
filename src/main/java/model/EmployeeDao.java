package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao implements DBService {
	
	private int eid;
	private String name;
	private int contact;
	private int salary;
	private Connection con;
	
	public EmployeeDao() throws ClassNotFoundException, SQLException {
		super();
		con=DBService.getConn();
		// TODO Auto-generated constructor stub
	}
	
	public boolean addEmp(EmployeePojo obj) throws ClassNotFoundException, SQLException {
		
		eid=obj.getEid();
		name=obj.getName();
		contact=obj.getContact();
		salary=obj.getSalary();
		PreparedStatement ps=con.prepareStatement("insert into Employee values(?,?,?,?)");
		ps.setInt(1, eid);
		ps.setString(2, name);
		ps.setInt(3, contact);
		ps.setInt(4, salary);
		int ans=ps.executeUpdate();
		if(ans>0)
		    return true;
		else
			return false;
	}
	public boolean updateEmp(EmployeePojo obj) throws ClassNotFoundException, SQLException {
		eid=obj.getEid();
		name=obj.getName();
		contact=obj.getContact();
		salary=obj.getSalary();
		PreparedStatement ps=con.prepareStatement("update Employee set name=?,contact=?,salary=? where eid=?");
		ps.setString(1, name);
		ps.setInt(2, contact);
		ps.setInt(3, salary);
		ps.setInt(4, eid);
		int ans=ps.executeUpdate();
		if(ans>0)
		    return true;
		else
			return false;
	}
	public boolean deleteEmp(EmployeePojo obj) throws ClassNotFoundException, SQLException {
		eid=obj.getEid();
		PreparedStatement ps=con.prepareStatement("delete from Employee where eid=?");
		ps.setInt(1, eid);
		int ans=ps.executeUpdate();
		if(ans>0)
		    return true;
		else
			return false;
	}
	public ResultSet searchEmp(EmployeePojo obj) throws ClassNotFoundException, SQLException {
		name=obj.getName();
		PreparedStatement ps=con.prepareStatement("select * from Employee where name=?");
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		return rs;
	}
	public ResultSet showAllEmp() throws ClassNotFoundException, SQLException {
		PreparedStatement ps=con.prepareStatement("select * from Employee");
		ResultSet rs=ps.executeQuery();
		return rs;
	}
	
	
}
