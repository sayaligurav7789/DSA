package TwoPointer;
class TrappingRainWaterr{
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int total = 0;

        for(int i = 0; i < height.length; i++){
            int lm = 0;
            int rm = 0;

            for(int j = i; j >= 0; j--){
                lm = Math.max(lm,height[j]);
            }
            for(int j = i; j < height.length; j++){
                rm = Math.max(rm,height[j]);
            }
            if(height[i] < lm && height[i] < rm){
                total += Math.min(lm,rm)-height[i];
            }
        }
        return total;
    }
}