class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int n1 = event1.length , n2 = event2.length;
        int s1=0,s2=0,e1=0,e2=0;
        String str = event1[0] , str2 = event1[1];
        s1 = Integer.parseInt(str.substring(0,2));
        e1 = Integer.parseInt(str.substring(3,5));
        s2 = Integer.parseInt(str2.substring(0,2));
        e2 = Integer.parseInt(str2.substring(3,5));
        double time1 = (double)((s1*100)+e1)/100;
        double time2 = (double)((s2*100)+e2)/100;
        System.out.println(time1+" "+time2);

        int ss1=0,ss2=0,ee1=0,ee2=0;
        String strr = event2[0] , strr2 = event2[1];
        ss1 = Integer.parseInt(strr.substring(0,2));
        ee1 = Integer.parseInt(strr.substring(3,5));
        ss2 = Integer.parseInt(strr2.substring(0,2));
        ee2 = Integer.parseInt(strr2.substring(3,5));
        double timee1 = (double)((ss1*100)+ee1)/100;
        double timee2 = (double)((ss2*100)+ee2)/100;
        System.out.println(timee1+" "+timee2);
        
        if((time2 < timee1) || (time1 > timee2) ) return false;
        return true;
        //if((timee1>=time1 && timee1<=time2) || (timee2>=time1 && timee2<=time2)) return true;
        //return false;
    }
}