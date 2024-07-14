public class ReverseArray{
public static void main(String []args){

int[] num ={367,901,798,543,712,492,351};
for(int i=0;i<num.length;i++){
System.out.println("number:"+num[i]);
int rev=0;
while(num[i]!=0){
int rem =num[i]%10;
rev = rev*10+rem;
System.out.println("reverse:"+rev+" "+"reminder:"+rem);
num[i]=num[i]/10;
//System.out.println("number:"+num);
}
}

}
}