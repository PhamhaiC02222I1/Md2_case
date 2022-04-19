package com.company.controller;

import com.company.model.BuyProduct;
import com.company.service.BuyProduct.BuyProductServiceIMPL;

import java.util.List;

public class BuyProductControler {
    BuyProductServiceIMPL buyProductServiceIMPL=new BuyProductServiceIMPL();

    public List<BuyProduct> showList(){
        return buyProductServiceIMPL.findAll();
    }

    public void creatBuyProduct(BuyProduct buyProduct){
        buyProductServiceIMPL.save(buyProduct);
    }
}
