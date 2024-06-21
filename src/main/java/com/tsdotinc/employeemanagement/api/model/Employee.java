package com.tsdotinc.employeemanagement.api.model;

import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name="employee_tbl")
public class Employee implements Serializable {

    @Serial
    private static final long serialVersionUID = 1954355911137869829L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long id;

    @Column(name="First_Name")
    private String firstName;

    @Column(name="Last_Name")
    private String lastName;

    @Column(name="Email_Id")
    private String emailId;

    @Column(name="Job_Title")
    private String jobTitle;

    @Column(name="Department_Name")
    private String departmentName;

    @Column(name="Phone")
    private String phone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", jobTitle=" + jobTitle + ", departmentName=" + departmentName + ", phone=" + phone + "]";
	}

	public Employee(Long id, String firstName, String lastName, String emailId, String jobTitle, String departmentName,
			String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.jobTitle = jobTitle;
		this.departmentName = departmentName;
		this.phone = phone;
	}

	public Employee() {
		super();
	}
    
	
	
    
    
}
