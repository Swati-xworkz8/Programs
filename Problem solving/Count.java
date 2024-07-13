public class Count{
public static void main(String []args){
int evenCount=0;
int oddCount=0;
for(int num=0;num<=50;num++){
if(num%2==0){
evenCount++;
}else{
oddCount++;
}
}
System.out.println("evenCount:"+evenCount+" "+"oddCount:"+oddCount);
}
}