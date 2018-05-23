package org.alura.spring.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="guest")
public class Guest {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	private String phone;
	
	@Column(name = "createdAt", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@Column(name = "updatedAt", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
	public String getPhone() { return phone; }
	public void setPhone(String phone) { this.phone = phone; }
	
	public Date getCreatedAt() { return createdAt; }
	public Date getUpdatedAt() { return updatedAt; }
	
	
}
