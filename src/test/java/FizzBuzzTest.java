import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {
    @Test
    public void given_0_should_return_0(){
        Assert.assertThat(FizzBuzz.of(0),is("0"));
    }

    @Test
    public void given_1_should_return_1(){
        Assert.assertThat(FizzBuzz.of(1),is("1"));
    }

    @Test
    public void given_2_should_return_2(){
        Assert.assertThat(FizzBuzz.of(2),is("2"));
    }

    @Test
    public void given_3_should_return_Fizz(){
        Assert.assertThat(FizzBuzz.of(3),is("Fizz"));
    }

    @Test
    public void given_5_should_return_Buzz(){
        Assert.assertThat(FizzBuzz.of(5),is("Buzz"));
    }

    @Test
    public void given_6_should_return_Fizz(){
        Assert.assertThat(FizzBuzz.of(6),is("Fizz"));
    }

    @Test
    public void given_7_should_return_7(){
        Assert.assertThat(FizzBuzz.of(7),is("7"));
    }

    @Test
    public void given_8_should_return_8(){
        Assert.assertThat(FizzBuzz.of(8),is("8"));
    }

    @Test
    public void given_9_should_return_Fizz(){
        Assert.assertThat(FizzBuzz.of(9),is("Fizz"));
    }

    @Test
    public void given_10_should_return_Buzz(){
        Assert.assertThat(FizzBuzz.of(10),is("Buzz"));
    }

    @Test
    public void given_15_should_return_FizzBuzz(){
        Assert.assertThat(FizzBuzz.of(15),is("FizzBuzz"));
    }
}
