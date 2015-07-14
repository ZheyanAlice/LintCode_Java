/**
 * Created by yan on 7/14/15.
 */
public class Subsets {



    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> S) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Collections.sort(S);
        subsetsHelper(res, S, 0, new ArrayList<Integer>());
        return res;
    }
    private void subsetsHelper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> S, int pos, ArrayList<Integer>  list){

        res.add(new ArrayList<Integer>(list));
        for(int i = pos; i < S.size(); i++){
            list.add(S.get(i));
            subsetsHelper(res, S, i+1, list);
            list.remove(list.size()-1);
        }
    }
}