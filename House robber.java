import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++){
		    nums[i]=s.nextInt();
		}
		System.out.println(rob(nums));
	}
	public static int rob(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int p2=0;
        int p1=0;
        for(int num:nums){
            int c=Math.max(p1,p2+num);
            p2=p1;
            p1=c;
        }
        return p1;
    }
}