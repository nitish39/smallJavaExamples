class Animal { // Base Class or Super Class or Parent Class
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }

  class Tiger extends Animal { // Derived Class or Subclass Class or Child class 
    public void animalSound() {
      System.out.println("The Tiger roars");
    }
  }
  
  class Main {
    public static void main(String[] args) {
     
        /* In Method Overriding a base class reference variable(myTiger) 
        pointing to a child class object */
      Animal myTiger = new Tiger(); 
      
      // Polymorphism allow us to invoke child class method[animalSound()], 
      //through a base class reference variable (myTiger) during runtime.
      myTiger.animalSound(); 
    }
  }