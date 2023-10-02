package junit;

public class Test2 {
    public int function (int a) {
        int b = a + 1; //Deveria ser a - 1
        int c = b / 30000;
        return c;
    }
}

// Considere apenas numeros inteiros de -32567 a 32568
// Quais entradas mostram defeitos? = -29999, 29999, -30000, 30000
// É possível testar tudo???