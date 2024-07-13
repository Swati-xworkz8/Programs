public class Reverse{
public static void main(String []args){
long rev=0;
long num=9876543210L;
while(num!=0){
long rem=num%10;
 rev=rev*10 + rem;
System.out.println("reverse:"+rev+" "+"reminder:"+rem);
num=num/10;
System.out.println("number:"+num);
}
}
}