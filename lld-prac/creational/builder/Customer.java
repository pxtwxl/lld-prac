package org.creational.builder;

// This is a Builder Pattern

public class Customer {
    private String name;
    private String phone;
    private String email;
    private int age;
    private String mail;
    private boolean isPremium;

//    Below constructor causes a constraint where we have to create a separate new
//    parameterised constructor depending on the no. of parameters passed
//    let's say if we have 6 params then it leads to 2^n combinations
//    this will cause a huge problem
    public Customer(String name, String phone, String email, int age, String mail, boolean isPremium) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.mail = mail;
        this.isPremium = isPremium;
    }

    private Customer(CustomerBuilder builder) {
        this.name = builder.getName();
        this.email = builder.getEmail();
        this.mail = builder.getMail();
        this.phone = builder.getPhone();
        this.age = builder.getAge();
        this.isPremium = builder.isPremium();
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }

    public boolean isPremium() {
        return isPremium;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                ", isPremium=" + isPremium +
                '}';
    }

    public static class CustomerBuilder {
        private String name;
        private String phone;
        private String email;
        private int age = 18;
        private String mail;
        private boolean isPremium = false;

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public String getEmail() {
            return email;
        }

        public int getAge() {
            return age;
        }

        public String getMail() {
            return mail;
        }

        public boolean isPremium() {
            return isPremium;
        }

        public CustomerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CustomerBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public CustomerBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public CustomerBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public CustomerBuilder setMail(String mail) {
            this.mail = mail;
            return this;
        }

        public CustomerBuilder setPremium(boolean premium) {
            isPremium = premium;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

}


