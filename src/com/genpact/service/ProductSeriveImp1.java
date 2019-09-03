package com.genpact.service;

import com.genpact.dao.ProductDao;
import com.genpact.dao.ProductDaoImp1;
import com.genpact.model.Product;

public class ProductSeriveImp1 implements ProductService{

	public boolean insertProduct(Product product) {
		// TODO Auto-generated method stub
		ProductDao productDao = new ProductDaoImp1();
		return productDao.insertProduct(product);
		
	}

}
