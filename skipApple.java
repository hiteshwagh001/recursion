public class skipApple {
    public static void main(String[] args) {
        String str="aappsdapplefghj";
        System.out.println(SkipApple(str));
        System.out.println(SkipAppnotApple(str));
    }
    static String SkipApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.length()<"apple".length()){
            return str;
        }
        if(str.startsWith("apple")){
            return str.substring(5);
        }
        else{
            return str.charAt(0)+SkipApple(str.substring(1));
        }
    }

    static String SkipAppnotApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.length()<"apple".length()){
            return str;
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return str.substring(3);
        }
        else{
            return str.charAt(0)+SkipAppnotApple(str.substring(1));
        }
    }
}
