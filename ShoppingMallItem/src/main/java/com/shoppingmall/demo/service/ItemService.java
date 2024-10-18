package com.shoppingmall.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoppingmall.demo.entity.Item;
@Service
public interface ItemService {

	Item saveItem(Item item);

	List<Item> fetchItemList();

	Item fetchItemById(Long itemId);

	void deleteItemById(Long itemId);

	Item updateItem(Long itemId, Item item);

}
