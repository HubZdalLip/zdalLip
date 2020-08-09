package weekend3;

import java.util.Scanner;

public class UserFactory {

    public static User createUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String name = scanner.nextLine();
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        System.out.println("Podaj miasto pochodzenia");
        scanner.nextLine();
        String bornCity = scanner.nextLine();

//        name.equals("") to samo co name.isEmpty()

        if(name.isEmpty()){
            return null;
        }

        return new User(name,age,bornCity);

    }


}
