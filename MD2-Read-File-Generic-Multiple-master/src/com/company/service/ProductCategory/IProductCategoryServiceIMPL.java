package com.company.service.ProductCategory;

import com.company.model.ProductCategory;
import com.company.service.IGenericService;

public interface IProductCategoryServiceIMPL extends IGenericService<ProductCategory> {
    ProductCategory findByCatarogyName(String name);
}
