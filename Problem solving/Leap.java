public class Leap{
public static void main(String []args){
int year=100;
if(year%400==0){
System.out.println("this year is leap year"+year);
}else if(year%100!=0 && year%4==0){
System.out.println("this is  leap year"+year);
}else{
	System.out.println("this is not leap year");
}

}

}