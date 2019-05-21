/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pushya Mithra
 */ 
import java.sql.*;
import java.sql.DriverManager;

public class Javaconnect {
	public static Connection getConnection(){
		Connection connect=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connect =DriverManager.getConnection("jdbc:mysql://localhost:3306/lms?autoReconnect=true&useSSL=false","root","9704");
		}catch(ClassNotFoundException | SQLException e){
                    System.out.println(e);
                }
		return connect;
	}

}
