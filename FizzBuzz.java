public class FizzBuzz {
    public static void main(String[] args) {
       int arrayFizz [] = new int[100];
        for(int i = 0; i < arrayFizz.length; i++){
            arrayFizz[i] = i;
        }
        for(int j = 0; j < arrayFizz.length; j++){
            if(arrayFizz[j] % 3 == 0){
                System.out.println("Fizz");
            }
            else if (arrayFizz[j] % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else if (arrayFizz[j] % 5 == 0 && arrayFizz[j] % 3 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else
            {
                System.out.println(arrayFizz[j]);
            }
        }
    }
}