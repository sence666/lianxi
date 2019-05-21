package com.hxzy.springmvc.mapper;

import java.util.List;

import com.hxzy.springmvc.pojo.Customer;
import com.hxzy.springmvc.pojo.QueryVo;

public interface CustomerMapper {
	
	public Integer getCountByQueryVo(QueryVo vo);
	
	public List<Customer> getCustomerByQueryVo(QueryVo vo);

	
	Customer getCustomerById(Integer id);
	
	void updateCustomer(Customer c);

	 void deleteCustomer(Integer id);
	
	
}
