package junittests.basicjunittests.stringutilitytests;
import junit.basicjunittestproblems.testingstringutility.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilityTest {
    @Test
    public void reverseStringTest(){

        StringUtils s = new StringUtils();
        String str = "Naman";
        Assert.assertEquals("namaN",s.reverse(str));
    }
    @Test
    public void pallindromeStringTest(){

        StringUtils s = new StringUtils();
        String str = "Naman";
        Assert.assertEquals(false,s.isPalindrome(str));
    }


    @Test
    public void uppercaseStringTest(){

        StringUtils s = new StringUtils();
        String str = "Naman";
        Assert.assertEquals("NAMAN",s.toUpperCase(str));
    }

}
