package weekend4;

// interfejs to taka klasa ktora jest w pelni abstrakcyjna a wszystkie jej metody są publiczne....


// interfejs udostpenia funkcjonalnosci ale nie martwi sie juz ich implemenetacja....

// ATM
// private Payment payment.... <= to jest interfejs.... posiada metode pay()
//....
//....
//....
// wybierz platnosc!!!
//1. paypal
//2. pay by cc
// gdy np 1. to payment = new Paypal() gdzie Paypal impementuje Payment....
// gdy np 2. to payment = new PayByCard() gdzie PayByCard impementuje Payment....
// implementacje tych dwoch klas mogą być skrajnie róznie.... np pod katem algorymtow... branie prowizji na paypalu....
//....
//....
//....
// plac!
// payment.pay() algorytm w zaleznosci od tego co zostanie wybrane w spospbie platnosci.....

public interface Vehicle {
    void run();
    void stop();
}