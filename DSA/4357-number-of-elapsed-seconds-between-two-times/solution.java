class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        HashMap<String, Integer> start = new HashMap<>();
        HashMap<String, Integer> end = new HashMap<>();
        start.put("HH", Integer.parseInt(startTime.substring(0, 2)));
        start.put("MM", Integer.parseInt(startTime.substring(3, 5)));
        start.put("SS", Integer.parseInt(startTime.substring(6, 8)));
        end.put("HH", Integer.parseInt(endTime.substring(0, 2)));
        end.put("MM", Integer.parseInt(endTime.substring(3, 5)));
        end.put("SS", Integer.parseInt(endTime.substring(6, 8)));
        int sec= (end.get("HH")-start.get("HH"))*3600;
        sec=sec+(end.get("MM")-start.get("MM"))*60;
        sec=sec+end.get("SS")-start.get("SS");

        return sec;
    }
}
