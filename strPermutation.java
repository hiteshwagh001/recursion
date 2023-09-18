public class strPermutation {
    public static void printPer(String str,String per){
        if(str.length()==0){
            System.out.println(per);            
            return;
        }
        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);//a
            // newstr= _+ bc
            String newStr=str.substring(0,i)+str.substring(i+1);
            // System.out.println("newStr:  "+newStr);
            printPer(newStr,per+currentChar);
        }
    }

    public static void main(String[] args) {
        String str="abc";
        printPer(str,"");
    }
}
