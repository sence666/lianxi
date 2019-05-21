package com.hxzy.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxzy.springmvc.mapper.BaseDictMapper;
import com.hxzy.springmvc.pojo.BaseDict;
import com.hxzy.springmvc.service.BaseDictService;

@Service
public class BaseDictServiceImpl implements BaseDictService {
	@Autowired
	private BaseDictMapper baseDictMapper;

	@Override
	public List<BaseDict> getBaseDictByCode(String code) {
	
		return baseDictMapper.getBaseDictByCode(code);
	}

}