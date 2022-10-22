package com.example.demo.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="elmart_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="elproduct_id")
    private int elproduct_id;
    @Column(name="pname")
    private String pname;
    @Column(name="elproduct_description")
    private String elproduct_description;
    @Column(name="unit_price")
    private int unit_price;
    @Column(name="elproduct_image")
    private String elproduct_image;
    @Column(name="active")
    private int active;
    @Column(name="available_stock")
    private int available_stock;
    @Column(name="date_created")
    private Date date_created;
    @Column(name="last_updated")
    private Date last_updated;
    @Column(name="elcategory_id")
    private int elcategory_id;
    @ManyToOne(targetEntity=Category.class,fetch=FetchType.EAGER)
	@JoinColumn(name="elcategory_id",insertable = false,updatable = false)
	private Category elmart_category;
    
	public Category getCategory() {
		return elmart_category;
	}

	public void setCategory(Category elmart_category) {
		this.elmart_category = elmart_category;
	}

	public Product() {
        
    }

	public Product(int elproduct_id, String pname, String elproduct_description, int unit_price,
			String elproduct_image, int active, int available_stock, Date date_created, Date last_updated,
			int elcategory_id) {
		super();
		this.elproduct_id = elproduct_id;
		this.pname = pname;
		this.elproduct_description = elproduct_description;
		this.unit_price = unit_price;
		this.elproduct_image = elproduct_image;
		this.active = active;
		this.available_stock = available_stock;
		this.date_created = date_created;
		this.last_updated = last_updated;
		this.elcategory_id = elcategory_id;
	}

	public int getElproduct_id() {
		return elproduct_id;
	}

	public void setElproduct_id(int elproduct_id) {
		this.elproduct_id = elproduct_id;
	}

	public String getPname() {
		return pname;
	}

	public void setpname(String pname) {
		this.pname = pname;
	}

	public String getElproduct_description() {
		return elproduct_description;
	}

	public void setElproduct_description(String elproduct_description) {
		this.elproduct_description = elproduct_description;
	}

	public int getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}

	public String getElproduct_image() {
		return elproduct_image;
	}

	public void setElproduct_image(String elproduct_image) {
		this.elproduct_image = elproduct_image;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public int getAvailable_stock() {
		return available_stock;
	}

	public void setAvailable_stock(int available_stock) {
		this.available_stock = available_stock;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public Date getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(Date last_updated) {
		this.last_updated = last_updated;
	}

	public int getElcategory_id() {
		return elcategory_id;
	}

	public void setElmart_category_id(int elcategory_id) {
		this.elcategory_id = elcategory_id;
	}
    
    
}
