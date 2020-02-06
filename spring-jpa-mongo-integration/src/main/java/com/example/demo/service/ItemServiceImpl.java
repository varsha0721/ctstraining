package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Item;
import com.example.demo.repo.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService
{
	private ItemRepository itemRepository;

	@Autowired
	public ItemServiceImpl(ItemRepository itemRepository) 
	{
		super();
		itemRepository = this.itemRepository;
	}

	@Override
	@Transactional
	public List<Item> getAllItem() 
	{
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	@Override
	@Transactional
	public Item createItem(Item item) 
	{
		// TODO Auto-generated method stub
		return itemRepository.insert(item);
	}

	@Override
	public Optional<Item> getItemById(String itemId) {
		// TODO Auto-generated method stub
		Optional<Item> item=itemRepository.findById(itemId);
		return item;
	}

	@Override
	public Item updateItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepository.save(item);
	}

	@Override
	public void deleteItemById(String itemId) {
		// TODO Auto-generated method stub
		itemRepository.deleteById(itemId);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		itemRepository.deleteAll();
	}
}