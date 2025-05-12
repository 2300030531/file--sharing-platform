package com.klef.fsd.exam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "farmer_table")
public class Farmer {
    @Id
    @Column(name = "fid")
    private int id;
    @Column(name = "fname", nullable = false, length = 100)
    private String name;
    @Column(name = "fgender", nullable = false, length = 20)
    private String gender;
    @Column(name="fage", nullable = false)
	private double age;
    @Column(name = "fcontact", nullable = false, unique = true, length = 10)
    private String contact;
    @Column(name = "flocation", nullable = false, length = 100)
    private String location;
    @Column(name = "fcrop", nullable = false, length=50)
    private String mainCrop;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMainCrop() {
		return mainCrop;
	}
	public void setMainCrop(String mainCrop) {
		this.mainCrop = mainCrop;
	}
	@Override
	public String toString() {
		return "Farmer [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", contact=" + contact
				+ ", location=" + location + ", mainCrop=" + mainCrop + "]";
	}
}
