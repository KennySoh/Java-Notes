package Array2d;

import java.util.ArrayList;

public class Array2d {
    Array2d(){

    }
    public static ArrayList<ArrayList<Integer>> setZero(ArrayList<ArrayList<Integer>> map1){
        ArrayList<int[]> storePos=new ArrayList<>();
        int[] pos=new int[2];
        for(int o=0;o<map1.size();o++){
            //System.out.println("y");
            for(int p=0;p<map1.get(o).size();p++){
                if(map1.get(o).get(p)==0){
                    pos[0]=p;
                    pos[1]=o;
                    storePos.add(pos);
                }
            }
        }
        for(int[] a:storePos){
            for(ArrayList<Integer> setX:map1){
                setX.set(a[0],0);
            }
            for(int setY=0;setY<map1.get(a[1]).size();setY++) {
                map1.get(a[1]).set(setY,0);
            }
        }

        return map1;
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> map1 = new ArrayList<>();
        for(int k=1;k<5;k++){
            ArrayList<Integer> i = new ArrayList<>();
            for(int j=0;j<5;j++){
                i.add(j+k);
            }
            map1.add(i);
            //System.out.println("p");
        }

        map1.get(2).set(2,0);

        for(int o=0;o<map1.size();o++){
            //System.out.println("y");
            for(int p:map1.get(o)){
                System.out.print(p+":"+" ");
            }
            System.out.print("\n");
        }

        ArrayList<ArrayList<Integer>> map2=setZero(map1);
        System.out.println("\n\n");
        for(int o=0;o<map2.size();o++){
            //System.out.println("y");
            for(int p:map2.get(o)){
                System.out.print(p+":"+" ");
            }
            System.out.print("\n");
        }

    }
}
