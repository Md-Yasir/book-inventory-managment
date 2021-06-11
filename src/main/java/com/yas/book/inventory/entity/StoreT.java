package com.yas.book.inventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="store_t")
@Getter
@Setter

public class StoreT {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String name;
	
	@Column(name="user_id")
	private Integer userId;
	
	@ManyToOne
	@JoinColumn(name="user_id", insertable = false, updatable = false)
	private UserT userT;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUserid() {
		return userId;
	}

	public void setUserid(Integer userid) {
		this.userId = userid;
	}

	public UserT getUserT() {
		return userT;
	}

	public void setUserT(UserT userT) {
		this.userT = userT;
	}
	
	
}
