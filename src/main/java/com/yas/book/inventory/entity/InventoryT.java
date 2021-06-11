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
@Table(name="inventory_t")
@Getter
@Setter

public class InventoryT {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="book_id")
	private Integer bookId;
	
	@ManyToOne
	@JoinColumn(name="book_id", insertable = false, updatable = false)
	private BookT bookT;
	
	@Column(name="store_id")
	private Integer storeId;
	
	@ManyToOne
	@JoinColumn(name="store_id", insertable = false, updatable = false)
	private StoreT storeT;
	
	private Integer count;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public BookT getBookT() {
		return bookT;
	}

	public void setBookT(BookT bookT) {
		this.bookT = bookT;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public StoreT getStoreT() {
		return storeT;
	}

	public void setStoreT(StoreT storeT) {
		this.storeT = storeT;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	

}
