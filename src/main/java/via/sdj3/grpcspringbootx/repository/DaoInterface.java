package via.sdj3.grpcspringbootx.repository;

import via.sdj3.grpcspringbootx.model.Animal;
import via.sdj3.grpcspringbootx.model.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface DaoInterface {

    public ArrayList<Animal> getByProductId(int id);
    public ArrayList<Product> getByAnimalId(int id);
}
