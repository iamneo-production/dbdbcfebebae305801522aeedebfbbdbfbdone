package com.example.model;

public class Product{
    int id;
    String name;
    float price;
    int quantity;
    void setId(int id){
        this.id=id;
    }
    int getId(){
        return id;
    }
    void setName(String name){
        this.name=name;
    }
    void setPrice(float price){
        this.price=price;
    }
    void setQuantity(int quantity){
        this.quantity=quantity;
    }

    String getName(){
        return name;
    }
    float getPrice(){
        return price;
    }
    int getQuantity(){
        return quantity;
    }
}