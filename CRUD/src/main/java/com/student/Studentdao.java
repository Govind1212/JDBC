package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Studentdao {
    public static boolean insertstudentindb(Student st)
    {
        boolean f = false;

        try
        {
            Connection con = cp.createConnection();

            String query = "insert into student(sname, smobile, deptid) values(?, ?, ?) ";



            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, st.getName());
            pstmt.setString(2, st.getContact());
            pstmt.setInt(3,st.getDept().getDeptid());

            pstmt.executeUpdate();
            f= true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }

    public static void displaystudentsindb()
    {
        try
        {
            Connection con = cp.createConnection();
            String query = "Select student.rollno, student.sname, student.smobile, student.deptid, department.deptname from student join department on student.deptid = department.deptid";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next())
            {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String phone = rs.getString(3);
                String dept = rs.getString(5);

                System.out.println("Rollno: "+id);
                System.out.println("Name: "+ name);
                System.out.println("Phone: "+ phone);
                System.out.println("Department: "+ dept);
                System.out.println("++++++++++++++++++++++++++++++++++++");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void updateStudentdeptindb(int id)
    {
        try
        {
            Connection con = cp.createConnection();
            String query = "update student set deptid=NULL where deptid=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
