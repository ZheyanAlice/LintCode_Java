/**
 * Created by yan on 7/14/15.
 */
public class Permutations {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        // write your code here



        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if (nums == null || nums.size() == 0) {
            return rst;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(rst, list, nums);
        return rst;
    }

    public void helper(ArrayList<ArrayList<Integer>> rst, ArrayList<Integer> list, ArrayList<Integer> nums){
        if(list.size() == nums.size()) {
            rst.add(new ArrayList<Integer>(list));
            return;
        }

        for(int i = 0; i<nums.size(); i++){
            if(list.contains(nums.get(i))){
                continue;
            }
            list.add(nums.get(i));
            helper(rst, list, nums);
            list.remove(list.size() - 1);
        }

    }
}
