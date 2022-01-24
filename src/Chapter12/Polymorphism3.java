package Chapter12;

abstract class Animal {
    abstract void doMove();
}

class Tiger extends Animal {
    @Override
    void doMove() {
        System.out.println("호랑이는 산을 달립니다.");
    }
}

class Lion extends Animal {
    @Override
    void doMove() {
        System.out.println("사자는 평원을 달립니다.");
    }
}

public class Polymorphism3 {
    public static void animalChoose(Animal obj) {
        if (obj instanceof Tiger) {
            // Animal obj = new Tiger();
            obj.doMove();
        } else {
            // Animal obj = new Lion();
            obj.doMove();
        }
    }

    public static void main(String[] args) {
        Polymorphism3.animalChoose(new Tiger());
        Polymorphism3.animalChoose(new Lion());
    }
}
