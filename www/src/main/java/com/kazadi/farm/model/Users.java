package com.kazadi.farm.model;

import javax.persistence.*;

@Entity
@Table(schema = "Farm2", name="Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first-name")
    private String fName;

    @Column(name = "last-name")
    private String lName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone-number")
    private int phone;

    @Column(name = "user_role")
    private String user_role;

    @Column(name = "password")
    private String password;


    public Users(){
        super();
    }

    public Users(int id, String fname, String lname, String email, int phone, String user_role, String password){
        super();
        this.id = id;
        this.fName = fname;
        this.lName = lname;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.user_role = user_role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String name) {
        this.fName = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String name) {
        this.lName = name;
    }

    public String getEmail() { return email;}

    public void setEmail(){this.email = email;}

    public int getPhone() { return 0;}

    public void setPhone(){this.phone = phone;}

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }







    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
