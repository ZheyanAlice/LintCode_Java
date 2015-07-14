/**
 * Created by yan on 7/14/15.
 */
public class Subsets_Two {

        /**
         * @param S: A set of numbers.
         * @return: A list of lists. All valid subsets.
         */
        public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> S) {
            // write your code here

            ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
            ArrayList<Integer> list = new ArrayList<Integer>();
            if(S == null || S.size() ==0) {
                return result;
            }
            Collections.sort(S);
            subsetsHelper(result, list, S, 0);

            return result;
        }

        private void subsetsHelper(ArrayList<ArrayList<Integer>> result,
                                   ArrayList<Integer> list, ArrayList<Integer> S, int pos) {

            result.add(new ArrayList<Integer>(list));

            for (int i = pos; i < S.size(); i++) {
                if ( i != pos && S.get(i) == S.get(i - 1)) {
                    continue;
                }
                list.add(S.get(i));
                subsetsHelper(result, list, S, i + 1);
                list.remove(list.size() - 1);
            }
        }
    


}
