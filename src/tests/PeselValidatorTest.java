import org.junit.Before;
import org.junit.Test;
import pl.krystiano.PeselValidator;
import org.hamcrest.Description;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PeselValidatorTest {

    static final String samplePeselNumber = "90010123332";
    static final String birthDate = "01.01.1990";

    static final String samplePeselNumber2 = "76123104552";
    static final String birthDate2 = "31.12.1976";

    static final String samplePeselNumber3 = "00210538666";
    static final String birthDate3 = "31.12.1976";

    @Before
    public void setUp(){

    }

    @Test
    public void shouldReturnBirthDateCorrespondingToPesel(){
        PeselValidator peselValidator = new PeselValidator(samplePeselNumber);
        assertThat(peselValidator.buildBirthDate(), is(birthDate));
    }

}