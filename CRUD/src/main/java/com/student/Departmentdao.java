package com.student;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Departmentdao {

    public static boolean insertdeptindb(Department dt)
    {
        boolean f = false;
        try
        {
            Connection con = cp.createConnection();
            String query = "insert into department(deptid, deptname) values(?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, dt.getDeptid());
            pstmt.setString(2, dt.getDept_name());

            pstmt.executeUpdate();

            f = true;
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean searchdeptindb(int id)
    {
        boolean f = false;
        try
        {
            Connection con = cp.createConnection();
            String query = "Select * from department where deptid=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()==false)
            {
                f = false;
            }
            else {
                f = true;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }


    public static boolean deletedeptfromdb(int id)
    {
        boolean f= false;
        try
        {
            Connection con = cp.createConnection();
            String query = "delete from department where deptid=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            f = true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }
}
