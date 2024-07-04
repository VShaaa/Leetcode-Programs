import java.util.*;
class Main {
    public static void main(String[] args){
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int nums[]=new int[n];
	    for(int i=0;i<n;i++){
	        nums[i]=s.nextInt();
	    }
	    List<List<Integer>> ans=threeSum(nums);
	    System.out.println(ans);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> s=new HashSet<>();
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        res.addAll(s);
        return res;
    }
}