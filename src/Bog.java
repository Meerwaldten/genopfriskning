public class Bog {
    private int ISBNnumber;
    private String titel;
    private int publicationYear;

    public Bog (int ISBNnumber, String titel, int publicationYear){
        this.ISBNnumber = ISBNnumber;
        this.titel = titel;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "ISBNnumber=" + ISBNnumber +
                ", titel='" + titel + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

    public int getISBNnumber() {
        return ISBNnumber;
    }

    public void setISBNnumber(int ISBNnumber) {
        this.ISBNnumber = ISBNnumber;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getTitel() {
        return titel;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}

