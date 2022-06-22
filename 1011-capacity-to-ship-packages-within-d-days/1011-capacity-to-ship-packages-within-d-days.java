class Solution {
    public int shipWithinDays(int[] weights, int D) {
        //weight capacity lies between [1, sum(weights)]
        int sum = 0;
        for(int i = 0; i < weights.length; i++){
            sum += weights[i];
        }
        //do Binary Search to decrease search space
        int lo = 1, hi = sum;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(isValid(weights, D, mid)){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return lo;
    }
    
    public boolean isValid(int[] weights, int D, int capacity){
	//note that we load in order of weights[], which making it easy
        int dayNeed = 0;
        int weightSum = 0;
        for(int i = 0; i < weights.length; i++){
		//if weights[i] > capacity, it means this good can not be shiped under certain capacity
            if(weights[i] > capacity){
                return false;
            }
            weightSum += weights[i];
            if(weightSum > capacity){
                ++dayNeed;
                weightSum = weights[i];
            }
        }
        if(weightSum > 0){
            ++dayNeed;
        }
        return dayNeed <= D;
    }
}