package out.ithillel;

import org.junit.*;


import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

public class JUnitDemo {

    @BeforeClass
    public static void befCla(){
        System.out.println("Before class...");
    }

    @AfterClass
    public static void AftCla(){
        System.out.println("After class...");
    }


    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }

    @Test
    public void test1(){

        System.out.println("Test 1");
        Assert.assertEquals("hello","hello");
        List<String> list = Arrays.asList("aaa","ddd","ttt");
        assertThat(list, hasItem("ddd"));
    }

    @Test(expected = RuntimeException.class)
    public void test2(){

        System.out.println("Test 2");
        throw new RuntimeException();

    }

    @Test
    public void test3(){

        System.out.println("Test 3");


    }

}
