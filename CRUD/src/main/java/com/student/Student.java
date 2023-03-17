package com.student;

import javax.swing.plaf.DesktopPaneUI;

public class Student {
    private int sid;
    private String Name;
    private String Contact;
    private Department Dept;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public Department getDept() {
        return Dept;
    }

    public void setDept(Department dept) {
        Dept = dept;
    }

    public Student(int sid, String Name, String Contact, Department Dept) {
        super();
        this.Name = Name;
        this.sid = sid;
        this.Contact = Contact;
        this.Dept = Dept;
    }

    public Student(String Name, String Contact, Department Dept) {
        super();
        this.Name = Name;
        this.Contact = Contact;
        this.Dept = Dept;
    }

    public Student() {
        super();
    }
}
