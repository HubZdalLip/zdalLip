package weekend3;

public class Account {
    private int balance; // private - dostep tylko na poziomie kalsy......
    private String pesel;
    public final String NAME_OF_BANK ="Millenium"; // sprawdzic czy jak final bez static to konwencja camel case dalej oczekuje wielkich liter....
    public static final long VALUE_OF_MBANK = 1000000000000L; // kapital....

    //dazymy do absolutnej minimalizacji pol ktore maja modyfikator dostepu public.... przeczy to z idea obiektowoscia / hermetyzacji.... itd
//    jak cos jest public to na pewno moga to byc stale.....
//    reszta w miare mozliwosc private....
//    dazymy do jedynie udsotepniania uslug....


    public void add(int amountOfMoney) {
        System.out.println("Wplata jest ksiegowana");
        saveTransaction(amountOfMoney);
        balance += amountOfMoney;
    }

    private void saveTransaction(int amountOfMoney) {
        //some very important operations....
        doImportantCalculationsKnownOnlyForBank();
    }

    private void doImportantCalculationsKnownOnlyForBank() {
        //important calculations.....
    }

    public void debit(int amountOfMoney) {
        if (balance < amountOfMoney) {
            System.out.println("Operacja niewykonalna....");
        }
        balance -= amountOfMoney;
    }

    public int getBalance() { // getter....
        return balance;
    }

    public void setPesel(String pesel) {
        if (pesel.length() == 11) {
            this.pesel = pesel;
        } else {
            System.out.println("Pesel nie zostal ustawiona poniewaz wartosc wyslana jest niepoprawna....");
        }
    }

    public String getPesel() {
        return pesel;
    }
}
