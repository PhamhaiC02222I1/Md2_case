package com.company.service.Product;

import com.company.model.Product;
import com.company.model.ProductCategory;
import com.company.service.IGenericService;

public interface IProductServiceIMPL extends IGenericService<Product> {
    Product findByCatagoryName(String name);
    Product findProductByPrice1();
    Product findProductByPrice2();
    Product findProductByPrice3();
}
