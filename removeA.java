public class removeA {
    public static void main(String[] args) {
        String str="abcabaac";
        System.out.println(skip(str));
        skip2("",str);
        
    }
    public static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skip(up.substring(1));
        }
        else{
            return ch+skip(up.substring(1));
        }
    }

    public static void skip2(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip2(p,up.substring(1));
        }
        else{
            skip2(p+ch,up.substring(1));
        }
    }
}
