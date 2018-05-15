package pl.krystiano;

public class Main {

    public static void main(String[] args) {
        PeselValidator peselValidator = new PeselValidator("91080603115");
        System.out.println(peselValidator.buildBirthDate());

    }
}
