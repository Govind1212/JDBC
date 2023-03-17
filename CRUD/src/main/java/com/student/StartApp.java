package com.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartApp {
    public static void main(String[]args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            int c = Integer.parseInt(br.readLine());

            if(c==1)
            {
                System.out.println("Enter the name of Student: ");
                String sname = br.readLine();
                System.out.println("Enter the Mobile no. of student: ");
                String smobile = br.readLine();
                System.out.println("Enter the Department id of Student: ");
                int deptid = Integer.parseInt(br.readLine());
                boolean f = Departmentdao.searchdeptindb(deptid);
                Department dt;
                if (f == false)
                {
                    System.out.println("Department not Found, Enter Department Name: ");
                    String deptname = br.readLine();
                    dt = new Department(deptid, deptname);
                    Departmentdao.insertdeptindb(dt);
                }
                dt = new Department(deptid);
                Student st = new Student(sname, smobile, dt);
                boolean res =  Studentdao.insertstudentindb(st);
                if(res==true)
                {
                    System.out.println("Student inserted Successfully.");
                }
                else {
                    System.out.println("Oops.. Something went wrong");
                }

            }
            else if(c==2)
            {
                Studentdao.displaystudentsindb();
            }

            if(c==13)
            {
                System.out.println("Enter deptid to remove from database: ");
                int id = Integer.parseInt(br.readLine());

                Studentdao.updateStudentdeptindb(id);
                boolean r = Departmentdao.deletedeptfromdb(id);


                if(r) System.out.println("Department Deleted Sucessfully...");
                else System.out.println("Oops. Something went wrong!!!..");
            }
        }


    }
}
