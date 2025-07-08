class Solution {
    public ArrayList<Integer> findGreater(int[] arr) {
        HashMap<Integer, Integer> f = new HashMap<>();
        for (int x : arr) f.put(x, f.getOrDefault(x, 0) + 1);
        ArrayList<Integer> r = new ArrayList<>(Collections.nCopies(arr.length, -1));
        Deque<Integer> s = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && f.get(arr[i]) > f.get(arr[s.peekLast()]))
                r.set(s.pollLast(), arr[i]);
            s.add(i);
        }
        return r;
        
    }
}