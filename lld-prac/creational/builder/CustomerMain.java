package org.creational.builder;

public class CustomerMain {
    public static void main(String[] args) {
        Customer.CustomerBuilder customerBuilder = new Customer.CustomerBuilder();
        Customer c1 = customerBuilder
                .setName("Anuj").setEmail("anuj@gmail.com").setMail("anuj@gmail.com").setPhone("8394894381").build();
        System.out.println(c1.toString());
    }
}
