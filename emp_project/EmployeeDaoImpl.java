package com.emp_project;

import java.sql.*;



public class EmployeeDaoImpl implements EmployeeDaoIntrf {

	Connection con;
	@Override
	
	//Create employee detail
	public void createEmployee(Employee emp) {
		con=DBconnection.createDBConnection();
		String query="insert into employee values(?,?,?,?)";
		
		try {
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setInt(1,emp.getId());
			pstm.setString(2,emp.getName());
			pstm.setDouble(3,emp.getSalary());
			pstm.setInt(4, emp.getAge());
			
			int cnt=pstm.executeUpdate();
			
			if(cnt!=0) {
				System.out.println("Data Inserted Successfully");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}

	
	// End Create employee detail
	
	
	//Show employee detail

	@Override
	public void showAllEmployee() {
		con=DBconnection.createDBConnection();
		String query="Select * from employee ";
		System.out.println("-----------------------------------");
		System.out.println("Employee Details");
		System.out.println("-----------------------------------");
		System.out.println("ID\tName\tSalary\tAge\n");
		
		try {
			Statement stmt=con.createStatement();
			ResultSet result=stmt.executeQuery(query);
			while(result.next()) {
				System.out.format("%d\t%s\t%f\t%d\n",result.getInt(1),result.getString(2),result.getDouble(3),result.getInt(4));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//End Show employee detail

	@Override
	public void showEmployeeBasedOnId(int id) {
		con=DBconnection.createDBConnection();
		String query="Select * from employee where id="+id;
		System.out.println("-----------------------------------");
		System.out.println("Employee Details");
		System.out.println("-----------------------------------");
		System.out.println("ID\tName\tSalary\tAge\n");
		
		
		try {
			Statement stmt=con.createStatement();
			ResultSet result=stmt.executeQuery(query);
			while(result.next()) {
				System.out.format("%d\t%s\t%f\t%d\n",result.getInt(1),result.getString(2),result.getDouble(3),result.getInt(4));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateEmployee(int id, String name) {
		con=DBconnection.createDBConnection();
		String query="update employee set name=? where id=?";
		try {
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setString(1, name);
			pstm.setInt(2, id);
			int cnt=pstm.executeUpdate();
			if(cnt!=0) {
				System.out.println("Data Update Sucesfully");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteEmployee(int id) {
		con=DBconnection.createDBConnection();
		String query="delete from employee where id=?";
		try {
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setInt(1, id);
			int cnt=pstm.executeUpdate();
			if(cnt!=0) {
				System.out.println("Data Deleted Successfully!!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
