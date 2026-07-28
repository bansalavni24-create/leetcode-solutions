class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        float maxl=-1;
        int maxarea=-1;
        for(int i=0;i<dimensions.length;i++){
            int a=dimensions[i][0];
            int b=dimensions[i][1];
            float l=a*a+b*b;
            int area=a*b;
            if(l>maxl){
                maxl=l;
                maxarea=area;
            }
            else if(l==maxl){
                maxarea=Math.max(area,maxarea);
            }
        }
        return maxarea;
    }

}