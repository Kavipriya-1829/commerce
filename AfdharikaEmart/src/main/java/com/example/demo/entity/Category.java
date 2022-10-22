package com.example.demo.entity;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="elmart_category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="elcategory_id")
    private int elcategory_id;
    @Column(name="elcategory_name")
    private String elcategory_name;
    @OneToMany(mappedBy="elmart_category")
	private Set<Product>product;
	
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	public Category() {
    
    }
    public Category(int elcategory_id,String elcategory_name) {
        super();
        this.elcategory_id=elcategory_id;
        this.elcategory_name=elcategory_name;
    }
    public int getElcategory_id() {
        return elcategory_id;
    }
    public void setElcategory_id(int elcategory_id) {
        this.elcategory_id = elcategory_id;
    }
    public String getElcategory_name() {
        return elcategory_name;
    }
    public void setElcategory_name(String elcategory_name) {
        this.elcategory_name = elcategory_name;
    }
    
}
