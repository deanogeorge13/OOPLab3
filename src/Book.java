public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int noOfPages;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getNoOfPages(){
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages){
        this.noOfPages = noOfPages;
    }

    public String getISBN(){
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String toString(){
        return "Title: " + title + "\nPrice: " + price + ....;
    }

    public Book{
        title = "No Title";
        price = 0.00;
        ISBN = "No ISBN";
        noOfPages = 0;
    }

    public Book(String title, double price, String ISBN, int noOfPages){
        setTitle();
    }

}
