package pl.javastart;

public class User {
   private String imie;
   private String nazwisko;
   private int wiek;

    public User(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void addUser (User user){


    }

    @Override
    public String toString(){
       return "Imię: "+imie+" Nazwisko: "+nazwisko+" Wiek: "+wiek;
    }
}
