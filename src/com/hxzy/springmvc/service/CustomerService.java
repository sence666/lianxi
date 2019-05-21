package com.hxzy.springmvc.service;

import com.hxzy.springmvc.pojo.Customer;
import com.hxzy.springmvc.pojo.QueryVo;
import com.hxzy.springmvc.utils.Page;

public interface CustomerService {

	Page<Customer> getCustomerByQueryVo(QueryVo vo);
	
	Customer getCustomerById(Integer id);
	
	void updateCustomer(Customer c);

	void deleteCustomer(Integer id);

}

