import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StartTest{
    @Test
    public void testSomma(){
        Start start = new Start();

        Assertions.assertEquals(start.somma(3,2),5);
    }
}
//vedi canale you tube Programming Acedemy di Antonio Pagano per ulteriori approfondimenti con vari video sui test