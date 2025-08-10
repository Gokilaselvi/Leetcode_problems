class Solution {
    public boolean reorderedPowerOf2(int n) {
        String num=String.valueOf(n);
        ArrayList<Character>nchar=new ArrayList<>();
        for(int i=0;i<num.length();i++){
            nchar.add(num.charAt(i));
            Collections.sort(nchar);
        }//System.out.prinln(nchar);
        ArrayList<Character>check=new ArrayList<>();
        for(int i=0;i<32;i++){
            int pow=(int)Math.pow(2,i);
            String val=String.valueOf(pow);
            for(int ind=0;ind<val.length();ind++){
                check.add(val.charAt(ind));

            }
            Collections.sort(check);
            if(check.equals(nchar))return true;
            check.clear();
        }
                //System.out.prinln(nchar);

        return false;
    }
}