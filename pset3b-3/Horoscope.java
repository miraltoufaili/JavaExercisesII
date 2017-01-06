import java.util.Scanner;

class Horoscope
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the number of the month you were born at: ");
        int month = myScanner.nextInt();
        System.out.println("Enter the number of the day you were born at: ");
        int day = myScanner.nextInt();
        
        System.out.println (sign(month,day));
    }
            public static String sign(int month, int day)
            {
            String answer = "INVALID_DATE";
            if (month <=0 || month >12 && day <= 0 || day >32){
                 
            } else if ( month == 3 && day >=21  || month == 4 && day <= 19){
                 answer = "Aries";
            } else if (month == 4 && day >=20 && day!=31 || month == 5 && day <= 20) {
                answer = "Taurus";
            } else if ( month == 5 && day >= 21 || month == 6 && day <= 20){ 
                answer = "Gemini";
            } else if (month == 6 && day >=21 && day!=31 || month == 7 && day <= 22){
                answer = "Cancer";
            } else if (month == 7 && day >= 23 || month == 8 && day <= 22){
                answer = "Leo";
            } else if (month == 8 && day >= 23|| month == 9 && day<=22) {
                answer = "Vigro";
            } else if (month == 9 && day >= 23 && day != 31 || month == 10 && day <= 22){
                answer = "Libra";
            } else if (month == 10 && day >= 23 || month == 11 && day <= 21 ){
                answer = "Scorpio";
            } else if (month == 11 && day >= 22 && day != 31 || month == 12 && day <= 21){
                answer = "Sagittarius";
            } else if (month == 12 && day >= 22 || month ==1 && day <= 19 ){
                answer = "Caprison";
            } else if (month == 1 && day >= 20 || month ==2 && day <= 18){
                answer = "Aquarius";
            } else if (month == 2 && day >= 19 && day!= 30 && day!=31 || month == 3 && day <=20 ){
                answer = "Pisces";
            }
            return answer;
            }
            
        

   
    
}