package com.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e3mall.mapper.TbItemMapper;
import com.e3mall.pojo.TbItem;
import com.e3mall.service.TbIteamService;

@Service
public class TbIteamServiceImpl implements TbIteamService {
	
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem findItemById(Long itamId) {
		return itemMapper.selectByPrimaryKey(itamId);
	}
	
	

}
