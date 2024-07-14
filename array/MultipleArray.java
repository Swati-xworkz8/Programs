public class MultipleArray{
public static void main(String []args){
int[] array={6,12,18,24,35,30,89,36};
for(int i=0;i<array.length;i++){
if(array[i]%6==0){
System.out.println("num is multiple of six: "+array[i]);
}else{
System.out.println("num is not multiple of six: "+array[i]);
}
}
}
}