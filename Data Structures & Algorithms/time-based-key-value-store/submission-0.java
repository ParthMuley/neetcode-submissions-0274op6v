class TimeMap {

    private static class Entry {
        final String value;
        final int timestamp;

        Entry(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    private final Map<String, List<Entry>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new Entry(value, timestamp));
    }
    public String get(String key, int timestamp) {
        List<Entry> entries = map.get(key);
        if (entries == null || entries.isEmpty()) {
            return "";
        }
        int left = 0;
        int right = entries.size() - 1;
        int candidateIdx = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (entries.get(mid).timestamp <= timestamp) {
                candidateIdx = mid; 
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return candidateIdx == -1 ? "" : entries.get(candidateIdx).value;
    }
}