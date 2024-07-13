public class Prime{
public static void main(String []args){
int count=0;
int num=8;
if(num<2){
System.out.println("num is not prime number");
}

for (int i=1;i<num;i++){
	if (num%i==0){
	count++;
	System.out.println("multiple:"+i);
	
	}
}
if(count<2){
System.out.println("it is the prime number:"+num);
}else{
	System.out.println("not prime number"+num);
}

}
}