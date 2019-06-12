
public class junitdemo {

    public String removeA(String ip){
        String op = (ip.charAt(0)=='A')?((ip.charAt(1)=='A')? ip.substring(2) : ip.substring(1)) : ((ip.charAt(1)=='A') ? ip.charAt(0) + ip.substring(2) : ip);
        return op;
    }



}
