package com.company.view;


import com.company.config.ConfigReadAndWriteFile;
import com.company.controller.ProductCategoryControler;
import com.company.model.Product;
import com.company.model.ProductCategory;
import com.company.service.Product.ProductServiceIMPL;
import com.company.service.ProductCategory.ProductCategoryServiceIMPL;


import java.util.List;
import java.util.Scanner;

public class ProductCategoryView {


    ProductCategoryControler productCategoryControler = new ProductCategoryControler();
    Scanner scanner = new Scanner(System.in);
    List<ProductCategory> productCategoryList = ProductCategoryServiceIMPL.productCategoryList;


    public void formCreateProductCatagory() {
        while (true) {
            int id;
            if (productCategoryList.size() == 0) {
                id = 1;
            } else {
                id = productCategoryList.get(productCategoryList.size() - 1).getId() + 1;
            }
            System.out.println("Enter the name ProducCatagory: ");
            String name = scanner.nextLine();
            System.out.println("Enter the DesProductCatagory");
            String desProductCatagory = scanner.nextLine();
            System.out.println("Enter id Product");
            int idProduct = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter name Product");
            String namePro = scanner.nextLine();
            System.out.println("Enter ProductFrom");
            String ProductFrom = scanner.nextLine();
            System.out.println("Enter Price");
            float pricePro = Float.parseFloat(scanner.nextLine());
            System.out.println("Enter type");
            String typeProduct=scanner.nextLine();
            Product product = new Product(idProduct, namePro, ProductFrom, pricePro,typeProduct);
            ProductCategory productCategory = new ProductCategory(id, name, desProductCatagory, product);
            productCategoryControler.creatProductCategory(productCategory);
            System.out.println(productCategoryControler.showListProductCategory());
            System.out.println("Enter any key to continue create ProductCatagory or Enter QUIT to come back menu: ");
            String backMenu = scanner.nextLine();
            if (backMenu.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

    public void formListProductCategory() {
        System.out.println(productCategoryControler.showListProductCategory());
        System.out.println("Enter QUIT to come back menu: ");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }
    }

    public void formDeleteProductCatagory() {
        while (true) {
            System.out.println(productCategoryControler.showListProductCategory());
            System.out.println("Nhap ID muon xoa:");
            int id = scanner.nextInt();
            productCategoryControler.delteteByID(id);
            productCategoryControler.showListProductCategory();
            scanner.nextLine();
            System.out.println("Enter any key to continue delete ProductCatagory or Enter QUIT to come back menu: ");
            String backMenu = scanner.nextLine();
            if (backMenu.equalsIgnoreCase("quit")) {
                new Main();
            }
        }

    }

    public void editById() {
        while (true) {
            System.out.println(productCategoryControler.showListProductCategory());
            System.out.println("Nhap ID muon sua:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the name ProductCatagory: ");
            String name = scanner.nextLine();
            System.out.println("Enter the DesProductCatagory");
            String desProductCatagory = scanner.nextLine();
            ProductCategory productCategory = new ProductCategory(id, name, desProductCatagory);
            productCategoryControler.editById(productCategory);
            System.out.println(productCategoryControler.showListProductCategory());
            System.out.println("Enter any key to continue edit ProductCatagory or Enter QUIT to come back menu: ");
            String backMenu = scanner.nextLine();
            if (backMenu.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

}
