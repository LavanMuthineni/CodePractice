public class Lavan1 {
public static void main(String [] args){
int z = mymethod(5,6);
System.out.println(z);
}

4 6 1 7 2 6 


static int mymethod(int x,int y){

if(x<y){
	return y;
}
else{

	return x;
}
}


}