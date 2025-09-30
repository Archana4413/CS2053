public class Varags1
{
public static int add(int... numbers) {
       int sum = 0;
       for (int num : numbers) {
            sum += num;
       }
       return sum;
    }

public static float multiply(float... numbers) {
       float product = 1.0f;
       for (float num : numbers) {
            product *= num;
       }
       return product;
     }

public static void main(String args[])
    {
        int sum = add(1, 2, 3, 4, 5);
        System.out.println("Sum of integers: " + sum);

        float product = multiply(1.0f, 2.0f, 3.0f);
        System.out.println("Product of floats: " +product);
     }
  }








