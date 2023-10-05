

@ResponseEntity
public class Product{
    Long id;
    String name;
    float price;
    int quantity;
    public Product(Long id, String name, float price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
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