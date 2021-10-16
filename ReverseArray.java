public class ReverseArray
{
	public static void main(String[] args) {
	    int [] marks ={100, 20, 90, 89, 99};
	    for (int i=marks.length - 1; i>=0; i--){
	        System.out.println(marks[i]);
	    }
	}
}