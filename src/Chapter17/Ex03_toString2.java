package Chapter17;

class Book3 {
    String author;

    @Override
    public String toString() {
        return author;
    }
}

public class Ex03_toString2 {
    public static void main(String[] args) {
        Book3 myBook = new Book3();
        myBook.author = "홍길동";
        System.out.println(myBook.author);
        System.out.println(myBook); //System.out.println() 메서드는 객체 자체가 매개변수로 주어졌기 때문에 객체 안의 toString() 메서드를 찾는다.
    }
}
