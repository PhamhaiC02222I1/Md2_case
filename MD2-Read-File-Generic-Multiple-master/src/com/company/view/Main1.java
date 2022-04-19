package com.company.view;

import java.util.Scanner;

public class Main1 {
    public Main1(){
        System.out.println("2. SHOW LIST CLASS ROOM");
        System.out.println("3. CREATE STUDENT");
        System.out.println("choose Menu: ");
        Scanner scanner=new Scanner(System.in);
        int chooseMenu = scanner.nextInt();
        switch (chooseMenu){
            case 1:
                new ProductView().findProductByName();
                break;
            case 2:
                new ProductView().sortByPrice();
                break;
    }
}
}
