import java.util.ArrayList;

public class Bibliotek {

    ArrayList<Bog> listOfBooks = new ArrayList<>();

    public void addBooks(Bog bog){
        listOfBooks.add(bog);
    }

    public boolean isBookThere(Bog bog){
        boolean returnValue = false;
        for (int i = 0; i < listOfBooks.size(); i++) {
            if (bog.getISBNnumber() == listOfBooks.get(i).getISBNnumber()){
                returnValue = true;
            }
        }
        return returnValue;
    }

}
