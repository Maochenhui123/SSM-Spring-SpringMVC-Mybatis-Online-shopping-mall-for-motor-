package com.maoc.utils;

public class StringUtils {
    /**
     * This method is used to operate the number of balance
     * @param A balance
     * @param B price
     * @return result of new balance
     */
    public static String subs(String A,String B) {
        String[] As = A.split(",");
        String[] Bs = B.split(",");
        String result = null;
        if(As.length>=Bs.length) {
            String AA = concate(As);
            String BB = concate(Bs);
            int left = Integer.valueOf(AA)-Integer.valueOf(BB);
            if(left>=0)
                result = transferStr(String.valueOf(left));
            else
                return null;
        }

        return result;
    }
    /**
     * This method is used to connect number of money
     * @param args string of balance
     * @return the result of  conneted balance
     */
    public static String concate(String[] args) {
        String con = "";
        for(int i=0;i<args.length;i++) {
            con+=args[i];
        }
        return con;
    }
    /**
     * This method is used to set the formatted balance
     * @param args string of balance
     * @return the result of formatted balance
     */
    public static String transferStr(String args) {
        int length = args.length();
        String[] text = args.split("");
        String result="";
        if(length%3!=0 && length>3) {
            for(int i=0;i<length%3;i++)
                result+=text[i];
            result+=",";
        }
        else if(length<3)
            for(int i=0;i<length;i++)
                result+=text[i];
        int count = 0;
        for(int i= length%3;i<length;i++) {
            count++;
            result+=text[i];
            if(count%3==0&&count!=(length-length%3))
                result+=",";
        }

        return result;
    }
}
