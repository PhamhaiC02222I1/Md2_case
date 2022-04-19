package com.company.view;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
public Main(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("====================PRODUCT MANAGE===================");
    System.out.println("1. ADD PRODUCT");
    System.out.println("2. SHOW LIST PRODUCT BY ID");
    System.out.println("3. DELETE PRODUCT BY ID");
    System.out.println("4. EDIT PRODUCT BY ID");
    System.out.println("5. SORT PRODUCT BY NAME");
    System.out.println("6. SORT PRODUCT BY PRICE");
    System.out.println("7. FIND PRODUCT BY NAME");
    System.out.println("8. ADD PRODUCTCATAGORY ");
    System.out.println("9. SHOWLIST PRODUCTCATAGORY ");
    System.out.println("10. DELETE PRODUCTCATAGORY ");
    System.out.println("11. EDIT PRODUCTCATAGORY BY ID");
    System.out.println("12. CREAT BUYPRODUCT");
    System.out.println("13. SHOWLIST BUYPRODUCT");
    System.out.println("14. Find PRODUCT By CATAROGYNAME");
    System.out.println("16. Find PRODUCT By Price");
    System.out.println("15. Exit");
    System.out.println("choose Menu: ");
    int chooseMenu = scanner.nextInt();
    switch (chooseMenu){
        case 1:
            new ProductView().createProduct();
            break;
        case 2:
            new ProductView().showListProduct();
            break;
        case 3:
            new ProductView().formDelete();
            break;
        case 4:
            new ProductView().editById();
            break;
        case 5:
            new ProductView().sortByName();
            break;
        case 6:
            new ProductView().sortByPrice();
            break;
        case 7:
            new ProductView().findProductByName();
            break;
        case 8:
            new ProductCategoryView().formCreateProductCatagory();
            break;
        case 9:
            new ProductCategoryView().formListProductCategory();
            break;
        case 10:
            new ProductCategoryView().formDeleteProductCatagory();
            break;
        case 11:
            new ProductCategoryView().editById();
            break;
        case 12:
            new BuyProductView().createBuyProduct();
            break;
        case 13:
            new BuyProductView().showListBuyProduct();
            break;
        case 14:
            new ProductView().findByCatarogyName();
            break;
        case 16:
            new ProductView().findProductByPrice();
            break;
        case 15:
            new Register();
            break;
    }
}
    public static void main(String[] args) {
	// write your code here
        new Main();
    }
}
