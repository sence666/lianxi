package com.hxzy.springmvc.service;

import java.util.List;

import com.hxzy.springmvc.pojo.BaseDict;

public interface BaseDictService {
	
	public List<BaseDict> getBaseDictByCode(String code);

}
