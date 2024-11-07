interface Animal{
    void Drinkswater();
}

interface Pet extends Animal{
    void DoesSpecialActivities();
}

class Lion implements Animal{

    @Override
    public void Drinkswater() {
        System.out.println("Lion Drinkswater");
    }
}

class Dog implements Pet{

    @Override
    public void DoesSpecialActivities() {
        System.out.println("Dog DoesSpecialActivities");
    }

    @Override
    public void Drinkswater() {
        System.out.println("Dog Drinkswater");
    }
}

public class InterfaceSegregation {
    /*
    This principle is the first principle that applies to Interfaces instead of classes in SOLID and
    it is similar to the single responsibility principle. It states that “do not force any client to
    implement an interface which is irrelevant to them“. Here your main goal is to focus on avoiding fat
    interface and give preference to many small client-specific interfaces.


    Example - Animal interface has 2 abstract methods
        - DrinksWater
        - DoesSpecialActivities
    now lion and Dog implements animal but here lion can not do special activities and dog can do special activities as it is pet
    this voilates Interface segregation principle

    Right way to implement is
    Animal interface
        - Drinkswater
    Pet interface extends animal
        -DoesSpecialActivities

    Now Lion class can implement animal and dog can implement pet

     */
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.Drinkswater();
        Dog dog = new Dog();
        dog.DoesSpecialActivities();
        dog.Drinkswater();
    }
}
