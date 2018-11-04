import ru.cinimex.mzmeevskiy.SuperMegaRandomGenerator;

import java.util.Random;

public class AppMain {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(SuperMegaRandomGenerator.generateNumericString(20));
            System.out.println(SuperMegaRandomGenerator.generateCharNumString(20));
        }
    }
}
