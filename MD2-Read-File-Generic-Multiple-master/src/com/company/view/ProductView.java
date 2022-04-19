package com.company.view;

import com.company.controller.ProductCategoryControler;
import com.company.controller.ProductControler;
import com.company.model.Product;
import com.company.model.ProductCategory;
import com.company.service.Product.ProductServiceIMPL;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.List;
import java.util.Scanner;

public class ProductView {

    Scanner scanner = new Scanner(System.in);
    ProductControler productControler = new ProductControler();
    ProductCategoryControler productCategoryControler = new ProductCategoryControler();
    List<Product> productList = ProductServiceIMPL.productList;

    public void createProduct() {
        while (true) {
            int id;
            if (ProductServiceIMPL.productList.size() == 0) {
                id = 1;
            } else {
                id = productList.get(productList.size() - 1).getId() + 1;
            }
            System.out.println("Enter the name Product: ");
            String name = scanner.nextLine();
            System.out.println("Enter the Xuat xu Product ");
            String productFrom = scanner.nextLine();
            System.out.println("Enter the gia Product ");
            float price = Float.parseFloat(scanner.nextLine());
            System.out.println("Enter type:");
            String type = scanner.nextLine();
//            int idPrductCatagory=Integer.parseInt(scanner.nextLine());
//            System.out.println("Enter name ProductCatagory ");
//            String nameCatagory=scanner.nextLine();
//            System.out.println("Enter the DesProductCatagory");
//            String desProductCatagory=scanner.nextLine();
//            ProductCategory productCategory=new ProductCategory(idPrductCatagory,nameCatagory,desProductCatagory);
//            productCategoryControler.editById(productCategory);
            Product product = new Product(id, name, productFrom, price, type);
            productControler.creatProduct(product);
            System.out.println("Enter any key to continue create Product or Enter QUIT to come back menu: ");
            String backMenu = scanner.nextLine();
            if (backMenu.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

    public void showListProduct() {
        System.out.println(productControler.showListProduct());
        System.out.println("Enter QUIT to come back menu: ");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }
    }

    public void formDelete() {
        System.out.println(productControler.showListProduct());
        System.out.println("Nhap ID muon xoa:");

        if (productList.size() != 0) {
            int id = scanner.nextInt();
            productControler.deleteById(id);
        } else {
            System.out.println("Nothing to delete!");
            new Main();
        }

        System.out.println(productControler.showListProduct());
        System.out.println("Enter any key to continue create Product or Enter QUIT to come back menu: ");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }
    }

    public void findByCatarogyName() {
        while (true) {
            System.out.println("Enter name of Catarogy");
            String name = scanner.nextLine();
            productControler.findProductByCatagory(name);
            String backMenu = scanner.nextLine();
            if (backMenu.equalsIgnoreCase("quit")) {
                new Main();
            }
        }

    }

    public void editById() {
        while (true) {
            System.out.println(productControler.showListProduct());
            System.out.println("Nhap ID muon sua:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the name muon sua Product: ");
            String name = scanner.nextLine();
            System.out.println("Nhap xuat xu muon sua:");
            String productFrom = scanner.nextLine();
            System.out.println("Nhap gia muon sua:");
            float price = Float.parseFloat(scanner.nextLine());
            System.out.println("Enter type:");
            String type = scanner.nextLine();


            Product product = new Product(id, name, productFrom, price, type);
            productControler.editById(product);
            System.out.println(productControler.showListProduct());
            System.out.println("Enter any key to continue Product or Enter QUIT to come back menu: ");
            String backMenu = scanner.nextLine();
            if (backMenu.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

    public void findProductByPrice() {
        System.out.println("1. Find the Price from 0~5000");
        System.out.println("2. Find the Price from 5000~10000");
        System.out.println("3. Find the Price from 10000~100000");
        System.out.println("Enter a choice");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                productControler.findProductByPrice1();
                System.out.println("Enter any key to continue Product or Enter QUIT to come back menu: ");
                String backMenu = scanner.nextLine();
                if (backMenu.equalsIgnoreCase("quit")) {
                    new Main();
                }


            case 2:
                productControler.findProductByPrice2();
                System.out.println("Enter any key to continue Product or Enter QUIT to come back menu: ");
                String backMenu1 = scanner.nextLine();
                if (backMenu1.equalsIgnoreCase("quit")) {
                    new Main();
                }

            case 3:
                productControler.findProductByPrice3();
                System.out.println("Enter any key to continue Product or Enter QUIT to come back menu: ");
                String backMenu2 = scanner.nextLine();
                if (backMenu2.equalsIgnoreCase("quit")) {
                    new Main();
                }
            case 4:
                new Main();

        }

    }

    public void sortByName() {
        System.out.println("List truoc khi sua");
        System.out.println(productControler.showListProduct());
        productControler.sortByName();
        System.out.println("List sau khi sua");
        System.out.println(productControler.showListProduct());
        System.out.println("Enter any key to continue sort Product or Enter QUIT to come back menu: ");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }

    }

    public void sortByPrice() {
        System.out.println("List truoc khi sua");
        System.out.println(productControler.showListProduct());
        productControler.sortByPrice();
        System.out.println("List sau khi sua");
        System.out.println(productControler.showListProduct());
        System.out.println("Enter any key to continue sort Product or Enter QUIT to come back menu: ");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }

    }

    public void findProductByName() {
        System.out.println("Nhap ten can tim: ");
        String name = scanner.nextLine();
        if (productControler.findProductByName(name) != null) {
            System.out.println(productControler.findProductByName(name));
        } else System.out.println("Khong ton tai san pham");
        System.out.println("Enter any key to continue find Product or Enter QUIT to come back menu: ");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }
    }
}
