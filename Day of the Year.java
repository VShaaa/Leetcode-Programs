import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String date=s.next();
		System.out.println(dayOfYear(date));
	}
	public static int dayOfYear(String date){
	    int month[]=new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
	    String d[]=date.split("-");
	    int yy=Integer.parseInt(d[0]);
	    int mm=Integer.parseInt(d[1]);
	    int dd=Integer.parseInt(d[2]);
	    if((yy%4==0 && yy%100!=0) || (yy%400==0))
	       month[2]=29;
	   for(int i =1;i<mm;i++){
	       dd+=month[i];
	   }
	       return dd;
	}
	
}