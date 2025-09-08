// Lop Recurdion de quy (factorial)

public class Recursion {
    //Tinh giai thua n! = n*(n-1)*(n-2*...*1)
    public static long factorial(long number){
        if (number <= 1){ //Dieu kien dung
            return 1;
        }else {
            return number * factorial(number - 1); //Goi de quy
        }
    }       
}
