
public class Main {
    public static void main (String[] args) {
        int count = 1;
        int result = 2;
        int number = 3;
        while(count < 1000){
            if(isPrime(number)){
                result += number;
                count++;    
            }
            number++;
            
        }
        System.out.println(result);
    }
    public static Boolean isPrime(int _val){
        for(int i = 2; i < (int)(Math.sqrt(_val)+1); i++){
            if(_val%i == 0){
                return false;
            }
        }
        return true;
    }
}
