package Chapter20;

class Camp8<T extends Number> {
    private T ob;

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }
}

public class Ex08_BoundedCamp {
    public static void main(String[] args) {
        Camp8<Integer> iBox = new Camp8<>();
        iBox.setOb(24);

        Camp8<Double> dBox = new Camp8<>();
        dBox.setOb(5.97);

        System.out.println(iBox.getOb());
        System.out.println(dBox.getOb());
    }
}
