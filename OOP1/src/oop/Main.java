package oop;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String mesaj="Vade oranı";

        Product product1 = new Product(); //class new ile tanımlanır.
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitPrice(3);
        product1.setImageUrl("image.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(7500);
        product2.setDiscount(7);
        product2.setUnitPrice(3);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(7500);
        product3.setDiscount(7);
        product3.setUnitPrice(3);
        product3.setImageUrl("image3.jpg");


        Product[] products={product1,product2,product3};

        System.out.println("<ul>");
        for (Product product:products){
            System.out.println("<li>" + product.getName() + "</liv>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("5555555555");
        individualCustomer.setCustomerNumber("122");
        individualCustomer.setFirstName("Emine");
        individualCustomer.setLastName("Benli");

        CorporateCustomer corporateCustomer=new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("54321");

        //System.out.println(individualCustomer.getCustomerNumber());

        Customer[] customers={individualCustomer,corporateCustomer};
        //System.out.println(individualCustomer.getFirstName());

    }
}