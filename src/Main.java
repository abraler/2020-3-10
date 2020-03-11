import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){

            int win=0;//甲赢得次数
            int ping=0;//甲平的次数
            int lose=0;//甲输的次数

            Map<String,Integer>map1=new HashMap<>();
            Map<String,Integer>map2=new HashMap<>();

            int num=in.nextInt();
            in.nextLine();
            for(int i=0;i<num;i++){
                String str=in.nextLine();
                String []s=str.split(" ");
                if(Vctory(s[0],s[1])==1){
                    win++;
                    if(map1.containsKey(s[0])){
                        int n=map1.get(s[0])+1;
                        map1.remove(s[0]);
                        map1.put(s[0],n);
                    }else{
                        map1.put(s[0],1);
                    }
                }else if(Vctory(s[0],s[1])==0){
                    ping++;

                }else{
                    lose++;
                    if(map2.containsKey(s[1])){
                        int n=map2.get(s[1])+1;
                        map2.remove(s[1]);
                        map2.put(s[1],n);
                    }else{
                        map2.put(s[1],1);
                    }
                }
            }
            System.out.println(win+" "+ping+" "+lose);
            System.out.println(lose+" "+ping+" "+win);
            //map1.entrySet();
            Set<Map.Entry<String,Integer>>set=map1.entrySet();
            String s=null;
            int n=0;
            for(Map.Entry<String,Integer>e:set){
                if(e.getValue()>n){
                    s=e.getKey();
                    n=e.getValue();
                }else if(e.getValue()==n&&e.getKey().charAt(0)<s.charAt(0)){
                    s=e.getKey();
                }
            }
            Set<Map.Entry<String,Integer>>set1=map2.entrySet();
            String s1=null;
            int n1=0;
            for(Map.Entry<String,Integer>e:set1){
                if(e.getValue()>n1){
                    s1=e.getKey();
                    n1=e.getValue();
                }else if(e.getValue()==n1&&e.getKey().charAt(0)<s1.charAt(0)){
                    s1=e.getKey();
                }
            }
            System.out.println(s+" "+s1);
        }
    }
    public static int Vctory(String s1,String s2){
        char c=s1.charAt(0);
        char n=s2.charAt(0);
        if(c==n){
            return 0;
        }else if(c=='C'&&n=='J'||c=='B'&&n=='C'||c=='J'&&n=='B'){
            return 1;
        }else{
            return -1;
        }
    }
}