public class permutaionString {
    public static void main(String[] args) {
        String str="abc";
        String per="";
        strPer(per , str);
    }

     static void strPer(String per, String str) {
        if(str.isEmpty()){
            System.out.println(per);
            return;
        }
        char ch=str.charAt(0);
        strPer( per+ch,str.substring(1));
        strPer( ch+per,str.substring(1));

    }
}
