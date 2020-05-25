package libraryModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library implements Serializable {
    //krijon nje liste me libra
    private List<Book> collection;

    //konstruktori
    public Library(){
        //List is an interface and ArrayList an implmenatation
        collection = new ArrayList<Book>();
    }
    //funskion qe shton  libra
    public void addBook(Book book){
        collection.add(book);
    }
    @Override
    public String toString(){
        String total="\n";
        for(int i=0;i<collection.size();i++){
            Book b= collection.get(i);
            total=total+ b.toString();

        }
        return total;
    }

    public Book getBookByISBN(String isbn) {
        for (int i = 0; i < collection.size(); i++) {
            if(collection.get(i).getISBN().contentEquals(isbn)){
                return collection.get(i);
            }
        }
        return null;
    }
    public boolean doesISBNAlreadyExist(int isbn) {
        Iterator<Book> i = collection.iterator();
        while (i.hasNext()) {
            if (i.next().getIsbn() == isbn) {
                return true;
            }
        }
        return false;
    }
    public String[][] toStringVector() {
        String[][] total = new String[collection.size()][5];

        for (int i = 0; i < collection.size(); i++) {
            total[i][0] = collection.get(i).getTitle();
            total[i][1] = collection.get(i).getAuthor();
            total[i][2] = collection.get(i).getAmount();
            total[i][3] = collection.get(i).getISBN();
        }

        return total;

    }


}
