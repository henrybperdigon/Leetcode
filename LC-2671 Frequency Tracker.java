class FrequencyTracker {
    private Map<Integer,Integer> map;
    int[] freq;

    public FrequencyTracker() {
        map = new HashMap<>();
        freq = new int[1000001];
    }
    
    public void add(int number) {
        if (map.containsKey(number)) {
            freq[map.get(number)]--;
        }

        map.put(number, map.getOrDefault(number,0) + 1);
        freq[map.get(number)]++;
    }
    
    public void deleteOne(int number) {
        if (!map.containsKey(number)) return;

        freq[map.get(number)]--;
        map.put(number, map.getOrDefault(number,0) - 1);

        if (map.get(number) > 0) {
            freq[map.get(number)]++;
        } else {
            map.remove(number);
        }
        
    }
    
    public boolean hasFrequency(int frequency) {
        if (freq[frequency] > 0) return true;
        return false;
    }
}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */
