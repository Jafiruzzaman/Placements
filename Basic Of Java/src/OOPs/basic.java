package OOPs;

public class basic {

    

  public static void main(String[] args) {
    class Car {
    int price;
    int releaseYear;
    String name;
    void openTrunk() {
      System.out.println("The car trunk is opened");
    }
    }
    System.out.println("basic of oops ");
    /*
     * OOPs the full form of oops is object oriented programming.OOPs used to solve the readWorld problem.
     * There are 4 pilar of oops
     * Polymorphism
     * Abstraction
     * Inheritance

     * Classes --> class is a user defined blueprint of attributes and methods
     * Object --> Object are the instance of classes
     */
    Car bmwCar = new Car();
    // here make sure the car class then pick a name just like bmwcar then new keyword and car constructor
    bmwCar.name = "bmw";
    bmwCar.price = 1245041;
    bmwCar.releaseYear = 2024;
    bmwCar.openTrunk();
    // There are 4 types of identifier 
    /*
     * public --> public means anyone can access. just like public toilet or lamp post.
     * protected --> protected only protected user can access.just like property or bank balance .
     * private --> private means it means only you can access your bank account,whatsUp,faceBook account.
     * default --> default means private and protected. just like our relatives.
     */
   
  }

}