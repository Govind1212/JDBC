package com.student;

public class Department {
    private int deptid;
    private String dept_name;

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Department(int deptid, String dept_name) {
        super();
        this.deptid = deptid;
        this.dept_name = dept_name;
    }

    public Department(int deptid) {
        super();
        this.deptid = deptid;
    }


    public Department() {
        super();
    }
}
