package com.hxzy.springmvc.mapper;

import java.util.List;

import com.hxzy.springmvc.pojo.BaseDict;

public interface BaseDictMapper {

	public List<BaseDict> getBaseDictByCode(String code);
	
	
}
