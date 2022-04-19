package com.company.view;

import com.company.controller.BuyProductControler;
import com.company.controller.ProductCategoryControler;
import com.company.controller.ProductControler;
import com.company.model.BuyProduct;
import com.company.model.Product;
import com.company.model.ProductCategory;
import com.company.service.BuyProduct.BuyProductServiceIMPL;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BuyProductView {
    Scanner scanner=new Scanner(System.in);
    BuyProductControler buyProductControler=new BuyProductControler();
    BuyProduct buyProduct=new BuyProduct();
    ProductControler productControler=new ProductControler();
    ProductCategoryControler productCategoryControler=new ProductCategoryControler();
    List<BuyProduct> buyProductList= BuyProductServiceIMPL.buyProductList;

    public void createBuyProduct()  {
        while (true){
            int count;
            if(BuyProductServiceIMPL.buyProductList.size()==0){
                count = 1;
            } else {
                count = buyProductList.get(buyProductList.size()-1).getCount()+1;
            }
            System.out.println("Enter the so luong mua: ");
            int amount=Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the ngay mua BuyProduct: ");
            String ngMua=scanner.nextLine();
            System.out.println("Enter the Id Product: ");
            int idProduct =Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the name cua Product: ");
            String nameProduct=scanner.nextLine();
            System.out.println("Enter the Xuat xu Product ");
            String productFrom = scanner.nextLine();
            System.out.println("Enter the gia Product ");
            float price = Float.parseFloat(scanner.nextLine());
            System.out.println("nhap type");
            String type=scanner.nextLine();
            Product product = new Product(idProduct,nameProduct,productFrom,price,type);
            BuyProduct buyProduct=new BuyProduct(count,product,ngMua,amount);
            buyProductControler.creatBuyProduct(buyProduct);
            double total=amount*price;
            buyProductControler.showList();
            System.out.println("Total is: "+total);
            System.out.println("Enter any key to continue create Product or Enter QUIT to come back menu: ");
            String backMenu = scanner.nextLine();
            if(backMenu.equalsIgnoreCase("quit")){
                new Main();
            }
        }
    }

    public void showListBuyProduct()  {
        System.out.println(buyProductControler.showList());
        System.out.println("Enter QUIT to come back menu: ");
        String backMenu = scanner.nextLine();
        if(backMenu.equalsIgnoreCase("quit")){
            new Main();
        }
    }


}
