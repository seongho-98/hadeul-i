package com.ssafy.user.model.dto;

public class User {
    int no;
    String id;
    String pw;
    String name;
    String email;
    
    public User() {}
    
    public User(String id, String pw) {
        super();
        this.id = id;
        this.pw = pw;
    }


    public User(String id, String pw, String name, String email) {
        super();
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
    }
    
    public User(int no, String id, String pw, String name, String email) {
        super();
        this.no = no;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
    }

    public int getNo() {
        return no;
    }
    
    public void setNo(int no) {
        this.no = no;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + "]";
	}

}
