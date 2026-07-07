class Solution {
    public String binary(int num)
    {
        int temp = num;
        boolean flag = false;
        StringBuilder str = new StringBuilder();
        while(temp!=0)
        {
            int rem = temp%2;
            str.append(rem);
            temp/=2;
        }
        String string = str.reverse().toString();
        for(int i=0 ; i<string.length() ; i++)
        {
            if(string.charAt(i) == '1') return string.substring(i,string.length());
        }
        return string;
    }
    public String convertDateToBinary(String date) {
        String[] arr = date.split("-");
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        
        return binary(year)+"-"+binary(month)+"-"+binary(day);
    }
}