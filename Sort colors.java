import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i +1;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}