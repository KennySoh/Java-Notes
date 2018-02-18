package countPairs;

public class count111 {
    static int count=0;
    public static void count11(String str){
        char[] current=str.toCharArray();
        System.out.println(str);
        if(current.length<2){
            return;
        }
        else if(current[0]=='1'&&current[1]=='1'){
            count++;
            if(current.length<3){
                return;
            }
            count11(str.substring(2,str.length()));
        }else count11(str.substring(1,str.length()));
    }

    public static void main(String[] args) {
        count11("1111");
        System.out.println(count111.count);

    }
}
