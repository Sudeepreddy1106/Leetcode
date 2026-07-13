class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
    List<Integer> l= new ArrayList<>();
    String digits="123456789";
    for(int i=2;i<=9;i++){
        for(int j=0;i+j<=9;j++){
            int num=Integer.parseInt(digits.substring(j,i+j));
            if(num<=high && num>=low){
                l.add(num);
            }
        }
    }    
    return l;
    }
}
