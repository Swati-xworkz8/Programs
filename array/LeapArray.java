public class LeapArray{
public static void main(String []args){
int count=0;
int[] array={2024,100,300,2025,2023,2028,200,2029,2032};
for(int i=0;i<array.length;i++){
if(array[i]%400==0){
count++;
System.out.println("it is a leap year: "+array[i]);
}else if(array[i]%4==0 && array[i]%100!=0){
count++;
System.out.println("it is a leap year: "+array[i]);
}else{
System.out.println("it is not a leap year: "+array[i]);
}
}
System.out.println("total count:"+count);
}
}