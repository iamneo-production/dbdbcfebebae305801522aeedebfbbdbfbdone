package com.example.model;

@ResponseEntity
public class Product{
    Long id;
    String name;
    float price;
    int quantity;
    void setId(Long id){
        this.id=id;
    }
    Long getId(){
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