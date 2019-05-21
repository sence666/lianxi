package com.hxzy.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxzy.springmvc.mapper.CustomerMapper;
import com.hxzy.springmvc.pojo.Customer;
import com.hxzy.springmvc.pojo.QueryVo;
import com.hxzy.springmvc.service.CustomerService;
import com.hxzy.springmvc.utils.Page;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public Page<Customer> getCustomerByQueryVo(QueryVo vo) {
		
		vo.setStart((vo.getPage()-1)*vo.getRows());
		
		Integer total=customerMapper.getCountByQueryVo(vo);
		
		List<Customer> list=	customerMapper.getCustomerByQueryVo(vo);
		

		Page<Customer> page=new Page<Customer>(total,vo.getPage(),vo.getRows(),list);
		return page;
	}

	@Override
	public Customer getCustomerById(Integer id) {
		
		return customerMapper.getCustomerById(id);
	}

	@Override
	public void updateCustomer(Customer c) {
		customerMapper.updateCustomer(c);
		
	}

	@Override
	public void deleteCustomer(Integer id) {
		customerMapper.deleteCustomer(id);
		
	}

}
