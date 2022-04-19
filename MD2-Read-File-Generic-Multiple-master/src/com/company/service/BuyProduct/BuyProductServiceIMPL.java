package com.company.service.BuyProduct;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.BuyProduct;
import com.company.model.Product;
import com.company.model.ProductCategory;

import java.util.List;

public class BuyProductServiceIMPL implements IBuyProductServiceIMPL{
    public static String PATH="C:\\Users\\ASUS\\Downloads\\MD2-Read-File-Generic-Multiple-master\\MD2-Read-File-Generic-Multiple-master\\src\\com\\company\\data\\buyProduct.txt";
    public static  List<BuyProduct> buyProductList=new ConfigReadAndWriteFile<BuyProduct>().readFromFile(PATH);



    @Override
    public List<BuyProduct> findAll() {
        new ConfigReadAndWriteFile<BuyProduct>().writeToFile(PATH,buyProductList);
        return buyProductList;
    }

    @Override
    public void save(BuyProduct buyProduct) {
        buyProductList.add(buyProduct);
    }

    @Override
    public BuyProduct findById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void editById(ProductCategory productCategory) {

    }

    @Override
    public void editById(Product product) {

    }

    @Override
    public void sortByName() {

    }

    @Override
    public void sortByPrice() {

    }

    @Override
    public BuyProduct findProductByName(String name) {
        return null;
    }

}
