class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<heights.length;i++){
            map.put(heights[i],i);
            pq.add(heights[i]);
        }
        String[] result = new String[names.length];
        int j=heights.length-1;
        while(!pq.isEmpty()){
            result[j--]=names[map.get(pq.remove())];
        }
        return result;
        
    }
}