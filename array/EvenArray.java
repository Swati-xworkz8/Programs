public class EvenArray{
public static void main(String []args){
int[] array={1,3,4,2,6,5,8,9};
int evenCount=0;
int oddCount=0;
for(int i=0;i<array.length;i++){
if(array[i] % 2 ==0){
	evenCount++;

}else{
	oddCount++;
}
}
System.out.println("even Count:"+evenCount+" "+"odd Count:"+oddCount);


}
}