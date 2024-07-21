package model;

public class Customer extends Account {
    public Boolean frequentFlyer;
    Customer(String id,String password,String name,String email,String phone,Passport pass){
        super(id, name, password, email, phone, pass);
    }
    //constructor overloading
    Customer(String id,String password,String name,String email,String phone,Passport pass,Boolean frequentFlyer){
        super(id, name, password, email, phone, pass);
        this.frequentFlyer = frequentFlyer;
    }
}
