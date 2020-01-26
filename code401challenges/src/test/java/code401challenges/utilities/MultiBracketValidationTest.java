package code401challenges.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test
    public void testMultiBracketValidation(){
        String balanced  = "{Read [all of (these) instructions] carefully}";
        String missingLeftCurlyBraces = "Read [all of (these) instructions] carefully}";
        String balanced1 = "{Read} [all of (these) instructions] carefully";
        String rightSquareBracketInTheBegining = "Read} [all the]";
        String onlyOpeningBrace = "(Where is the thang";

        assertTrue("true", MultiBracketValidation.multiBracketValidation(balanced));
        assertFalse("false", MultiBracketValidation.multiBracketValidation(missingLeftCurlyBraces));
        assertTrue("true", MultiBracketValidation.multiBracketValidation(balanced1));
        assertFalse("false", MultiBracketValidation.multiBracketValidation(rightSquareBracketInTheBegining));
        assertFalse("false", MultiBracketValidation.multiBracketValidation(onlyOpeningBrace));
    }

}