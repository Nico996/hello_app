package com.globant.cartService.entities;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@Data
@Entity
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private @Id Long id;
	private String title;
	private double price;
	
	public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    } 
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Description: " + title + ";");
        buffer.append("Price: " + price);
        return buffer.toString();
    }
	
	public Item() {
		
	}
	public Item(String title, double price) {
		this.title = title;
		this.price = price;
	}
	
	
}
