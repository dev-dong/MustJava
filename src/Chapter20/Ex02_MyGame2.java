package Chapter20;

class Npc2 extends Camp2 {
    public String toString() {
        return "This is a Npc2";
    }
}

class Tank2 extends Camp2 {
    public String toString() {
        return "This is a Tank2";
    }
}

class Camp2 {
    private Object unit;

    public Object getUnit() {
        return unit;
    }

    public void setUnit(Object unit) {
        this.unit = unit;
    }
}

public class Ex02_MyGame2 {
    public static void main(String[] args) {
        // 게임 종족 생성
        Camp2 human = new Npc2();
        Camp2 machine = new Tank2();

//        human.setUnit(new Npc2());
//        machine.setUnit(new Tank2());
//
//        Npc2 hUnit = (Npc2)human.getUnit();
//        Tank2 mUnit = (Tank2)machine.getUnit();

//        System.out.println(hUnit.toString());
//        System.out.println(mUnit.toString());

        System.out.println(human.toString());
        System.out.println(machine.toString());
    }
}
