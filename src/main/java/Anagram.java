import java.util.*;

public class Anagram {
    public static void main(String[] args) {

        List lst = new ArrayList<String>();
        lst.add("code");
        lst.add("aaagmnrs");
        lst.add("anagrams");
        lst.add("doce");

        List secondList = checkAnagramString(lst);

        for(Object str:secondList) {
            System.out.println(str);
        }
    }
    static List<String> checkAnagramString(List<String> lst) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> secondList = new ArrayList<String>();
        for (String fs: lst) {
            char[] lstElm = fs.toLowerCase().toCharArray();
            Arrays.sort(lstElm);
            for(String sl: lst) {
                char[] secondLstElm = sl.toLowerCase().toCharArray();
                Arrays.sort(secondLstElm);
                if(Arrays.equals(lstElm,secondLstElm)) {
                    if (list.contains(lstElm.toString())) {
                        continue;
                    }
                    list.add(lstElm.toString());
                    if(!secondList.contains(sl.toString()))
                    secondList.add(sl);
                }
            }
        }
        Collections.sort(secondList);
        return secondList;
    }
}

