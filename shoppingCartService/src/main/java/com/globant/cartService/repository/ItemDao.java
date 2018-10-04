package com.globant.cartService.repository;

import java.util.List;

import com.globant.cartService.entities.Item;


public interface ItemDao {

	public List<Item> getItemList();

    public void saveItem(Item item);

}
