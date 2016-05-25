/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.avadhesh;

import java.io.*;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author avadhesh
 */
public class DatabaseAdapter {
   public Connection con;
	 public DatabaseAdapter() {
		// TODO Auto-generated constructor stub
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con=DriverManager.getConnection(
					 "jdbc:oracle:thin:@localhost:1521:xe","sem_v","avadhesh");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}

	 public boolean validate(String id,String password)
	 {
		 boolean status=false;
		 try{
		
		 PreparedStatement ps=con.prepareStatement(
		 "select * from studentdetails where userid=? and password=?");
		 ps.setString(1,id);
		 ps.setString(2,password);	
		 ResultSet rs=ps.executeQuery();
		 status=rs.next();
		 
		 }catch (Exception e) {
			// TODO: handle exception
		}
		 
		return status;
			
	}
         

	public int loginrecord(String id,String pass) throws SQLException {
		// TODO Auto-generated method stub
		int i=0;
		try{
		PreparedStatement ps=con.prepareStatement("insert into studentdetails (userid,password) values(?,?)");
		ps.setString(1,id);
		ps.setString(2,pass);
		i=ps.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
		}
		return i;
		
	}
        
         public boolean checkForUserid(String id)
	 {
		 boolean status=false;
		 try{
		 PreparedStatement ps=con.prepareStatement(
		 "select * from studentdetails where userid=?");
		 ps.setString(1,id);	
		 ResultSet rs=ps.executeQuery();
		 status=rs.next();
                 rs.close();
                 ps.close();
		 }catch (Exception e) {
			// TODO: handle exception
		} 
		return status;	
	}
         
         
         public void imgUserid(String id) throws SQLException {
		// TODO Auto-generated method stub
		
		try{
		PreparedStatement ps=con.prepareStatement("insert into img (userid) values(?)");
		ps.setString(1,id);
		ps.executeUpdate();
		}catch (Exception e) {}
			// TODO: handle exception    
		}
         public void profileimgDownload(String id) {
        
             try{
                                PreparedStatement ps=con.prepareStatement("select * from img where userid="+id);
                   ResultSet rs=ps.executeQuery();
                   if(rs.next()){//now on 1st row		
                   Blob b=rs.getBlob(2);//2 means 2nd column data
                   byte barr[]=b.getBytes(1,(int)b.length());//1 means first image

                   FileOutputStream fout=new FileOutputStream("profile.jpg");
                   fout.write(barr);

                   fout.close();
                   }//end of if
                }catch (Exception e) {e.printStackTrace();	}
         }
	 public byte[] imgDownload(String id,String imgColumn) {
                byte [] ba=null;  
             try{
                 int i=2;
                    if(imgColumn!=null)
                    {
                       i=Integer.parseInt(imgColumn);
                    }
                
                   PreparedStatement ps=con.prepareStatement("select * from img where userid= ?");
                   ps.setString(1, id);
                   ResultSet rs=ps.executeQuery();
                   if(rs.next()){//now on 1st row
                  
                   Blob b=rs.getBlob(i);//2 means 2nd column data
                   
                 ba=b.getBytes(1,(int)b.length());

                   //FileOutputStream fout=new FileOutputStream("G:\\bg.jpg");
                   //fout.write(barr);

                  // fout.close();
                   }//end of if
                }catch (Exception e) {System.out.println("Somethig goes wrong");	}
             return ba;
         }
	
        	
}

