package com.e3mall.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e3mall.pojo.TbItem;
import com.e3mall.service.TbIteamService;

@RestController
public class ItemController {
	
	@Autowired
	private TbIteamService iteamService;
	
	@RequestMapping("item/{itemId}")
	public TbItem findItemById(@PathVariable Long itemId) {
		TbItem item = iteamService.findItemById(itemId);
		return item;
	}

}
