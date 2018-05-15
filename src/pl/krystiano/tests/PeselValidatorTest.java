package pl.krystiano.tests;

import org.junit.BeforeClass;
import org.junit.Test;
import pl.krystiano.PeselValidator;

public class PeselValidatorTest {

    @BeforeClass
    public static void createPeselValidatorObject() {
        PeselValidator peselValidator = new PeselValidator();
    }

}
