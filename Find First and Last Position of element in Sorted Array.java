import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        int target=s.nextInt();
        int ans[]=searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }        
        return new int[]{first, last};
    }
}