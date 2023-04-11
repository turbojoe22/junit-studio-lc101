package test;

import org.junit.Before;
import org.junit.Test;

import static main.BalancedBrackets.hasBalancedBrackets;
import static org.junit.Assert.*;
public class BalancedBracketsTest {
    //DUMMY TEST
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Test for equal number of left and right brackets
    @Test
public void equalNumberLeftAndRightBrackets(){
        String strFalse = "[[This is a ]]]test[ string[";
        assertEquals(hasBalancedBrackets(strFalse), false);
    }
public void


}
