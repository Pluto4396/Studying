public class objectHomework03 {
    public static void main(String[] args) {
        Book book = new Book("live", 158);
        book.updatePrice();
        book.info();
    }
}

class Book {
    String name;
    double price;
    public Book(String name, double price){
        this.name=name;
        this.price=price;
    }
    public void updatePrice() {
        if (price > 150) {
            this.price= 150;
        } else if (price > 100) {
            this.price= 100;
        }
    }
    public void info(){
        System.out.println(name +"  "+price);
    }
}
