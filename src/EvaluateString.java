
import java.util.Stack;

/*Stack kullanılarak denklem hesaplama - Infix Notasyonu ile*/

public class EvaluateString{
    public static double evaluate(String expression){
        char[] tokens = expression.toCharArray();
        //değerlerimizi tutan stack
        Stack<Double> values = new Stack<>();
        //operator'lerimizi tutan stack
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < tokens.length; i++){
            //eğer sayı ise stack'e ekleriz
            if (tokens[i] >= '0' && tokens[i] <= '9'){
                StringBuilder sbuf = new StringBuilder();

                //birden fazla basamak varsa
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    sbuf.append(tokens[i++]);
                values.push(Double.parseDouble(sbuf.toString()));

                i--;
            }else if (tokens[i] == '(') //aç parantez ise operator stack'ine atarız
                ops.push(tokens[i]);
            else if (tokens[i] == ')'){ //kapa parantez görürsek aç parantez görene kadar her şeyi stackten alıp işlemi yapıp değer stack'ine atarız
                while (ops.peek() != '(')
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                ops.pop(); //aç parantezi okuyorum
            }else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/'){
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) 
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                ops.push(tokens[i]);
            }
        }
        
   
        while (!ops.empty())
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        
        return values.pop();
    }
    
    //önceliği kontrol eder
    public static boolean hasPrecedence(char op1, char op2){
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
    
    //işlemleri yapar
    public static double applyOp(char op, double b, double a){
        switch (op){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) //buraya hiçbir zaman girmemesi için sayı olarak sıfır üretimini engelledim
                    throw new UnsupportedOperationException(
                            "Cannot divide by zero");
                return a / b;
        }
        return 0;
    }
}
