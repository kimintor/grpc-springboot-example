package via.sdj3.grpcspringbootx.repository;

import via.sdj3.grpcspringbootx.model.Animal;
import via.sdj3.grpcspringbootx.model.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

 public class RepositoryTest implements DaoInterface {

    private static RepositoryTest repositoryTest = null;

    private RepositoryTest(){
        initDataSource();
    }
    public static RepositoryTest getInstance(){
        if (repositoryTest == null){
            repositoryTest = new RepositoryTest();
        }
        return repositoryTest;
    }

    private static final Map<Integer, Animal> animalMap = new HashMap<>();

    private static final Map<Integer, Product> productMap = new HashMap<>();


    private static void initDataSource(){
        Animal animal0 = new Animal(1,"bello",12.99);
        Animal animal1 = new Animal(2,"brutto",32.70);
        Animal animal2 = new Animal(3,"cervo",80.99);
        Animal animal3 = new Animal(4,"cinghiale",45.90);

        ArrayList<Animal> array1 = new ArrayList<>();
        ArrayList<Animal> array2 = new ArrayList<>();

        array1.add(animal0);
        array1.add(animal1);
        array1.add(animal2);

        array2.add(animal0);
        array2.add(animal3);


        animalMap.put(animal0.getId(),animal0);
        animalMap.put(animal1.getId(),animal1);
        animalMap.put(animal2.getId(),animal2);
        animalMap.put(animal3.getId(),animal3);

        Product product1 = new Product(1,array1,"piled meat");
        Product product2 = new Product(2,array2,"nuggets");

        productMap.put(product1.getProductId(),product1);
        productMap.put(product2.getProductId(),product2);
    }


    @Override
    public ArrayList<Animal> getByProductId(int id) {
        ArrayList<Animal> result = new ArrayList<>();
        Product tmp = productMap.get(id);
        result = tmp.getAnimals();
        return result;
    }

    @Override
    public ArrayList<Product> getByAnimalId(int id) {
        ArrayList<Product> result = new ArrayList<>();

        for(Product x: productMap.values()){
            if (x.hasAnimal(id)){
                result.add(x);
            }
        }
        return result;
    }

}
