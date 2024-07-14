public class PrimeArray{
public static void main(String []args){
int[] array={1,2,0,4,8,9,11,17,3,99,97,77};
int count=0;
for(int i=0;i<array.length;i++){
if (array[i] < 2){
System.out.println("num is not prime number: "+array[i]);
}
for(int index=1;index<100;index++){
if(array[i]%index==0){
count=count+1;
System.out.println("multiple:"+count);
}
}
if(count<2){
System.out.println("it is prime number:"+array[i]);
}else{
System.out.println("it is not prime number:"+array[i]);

}
}
}
}