package via.sdj3.grpcspringbootx.model;

import java.util.ArrayList;

public class Product {

    private int productId;
    private ArrayList<Animal> animals;
    private String description;

    public Product(int productId, ArrayList<Animal> animals, String description) {
        this.productId = productId;
        this.animals = animals;
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", animals=" + animals +
                ", description='" + description + '\'' +
                '}';
    }
    public boolean hasAnimal(int id){
        for (Animal x: animals) {
            if(id==x.getId())
                return true;
        }
        return false;
    }
}
