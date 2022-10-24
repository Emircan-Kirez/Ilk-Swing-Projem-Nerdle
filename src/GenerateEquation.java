import java.util.Random;

//rastgele denklem üretir
public class GenerateEquation {
    public static String generateEquation()  {
        Random random = new Random();
        String operators = "+-*/";
        int operatorCount = random.nextInt(1,3); // 1 ya da 2 operator olabilir.
        int x, y, z;
        char op1, op2;
        String exp;
        Double result;
        if(operatorCount == 1){ //eğer tek operator varsa
            do{
                x = random.nextInt(1, 100);
                op1 = operators.charAt(random.nextInt(4));
                y = random.nextInt(1, 100);
                result = EvaluateString.evaluate(String.format("%d%c%d", x, op1, y)); //denklemi eşittir olmadan hazırlayıp EvaluateString sınıfının methodu ile hesaplıyorum
                exp = String.format("%d%c%d=%.0f", x, op1, y, result); //bütün denklem oluşturulur
            }while (!((7 <= exp.length() && exp.length() <= 9) && result % 1 == 0 && result >= 0)); //denklemin uzunluğuna, sonucun pozitif ve tam olması koşullarına bakılır
        }else{
            do{
                x = random.nextInt(1, 15);
                op1 = operators.charAt(random.nextInt(4));
                y = random.nextInt(1, 15);
                op2 = operators.charAt(random.nextInt(4));
                z = random.nextInt(1, 15);
                result = EvaluateString.evaluate(String.format("%d%c%d%c%d", x, op1, y, op2, z));
                exp = String.format("%d%c%d%c%d=%.0f", x, op1, y, op2, z, result);
            }while(!((7 <= exp.length() && exp.length() <= 9) && result % 1 == 0 && result >= 0));//denklemin uzunluğu, sonuç pozitif ve tam olması koşullarına bakılır
        }
        return exp; //üretilen denklemi geri döndürür
    }
}

