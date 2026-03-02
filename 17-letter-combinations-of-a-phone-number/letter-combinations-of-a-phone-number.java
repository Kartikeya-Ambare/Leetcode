class Solution {
    // public List<String> letterCombinations(String digits) {
    //     List<String> list = new ArrayList<>();
    //     Map<Integer,String> mapp = new HashMap<>();

    //     mapp.put(2,"abc");
    //     mapp.put(3,"def");
    //     mapp.put(4,"ghi");
    //     mapp.put(5,"jkl");
    //     mapp.put(6,"mno");
    //     mapp.put(7,"pqrs");
    //     mapp.put(8,"tuv");
    //     mapp.put(9,"wxyz");

    //     create_list(mapp,list,digits);

    //     return list;

    // }

    // public static void create_list(Map<Integer,String> mapp,List<String> list,String digits){
    //     if(digits.length() == 1){
    //         create_list1(mapp,list,digits);
    //     }
    //     else if(digits.length() == 2){
    //         create_list2(mapp,list,digits);
    //     }
    //     else if(digits.length() == 1){
    //         create_list3(mapp,list,digits);
    //     }
    //     else if(digits.length() == 1){
    //         create_list4(mapp,list,digits);
    //     }
    // }

    // public static void create_list1(Map<Integer,String> mapp,List<String> list,String digits){
    //     String s = mapp.get(Integer.parseInt(digits));
    //     for(int i = 0;i<s.length();i++){
            
    //     StringBuilder rs  = new StringBuilder();
    //         rs.append(s.charAt(i));
    //         list.add(rs.toString());
            
    //     }
    // }

    // public static void create_list2(Map<Integer,String> mapp,List<String> list,String digits){
    //     String s = mapp.get(Integer.parseInt(digits));
    //     StringBuilder rs  = new StringBuilder();
    //     for(int i = 0;i<s.length();i++){
            
    //     StringBuilder rss  = new StringBuilder();
    //         rss.append(s.charAt(i));
    //         list.add(rs.toString());
    //     }
    // }

    // public static void create_list3(Map<Integer,String> mapp,List<String> list,String digits){
    //     String s = mapp.get(Integer.parseInt(digits));
    //     StringBuilder rs  = new StringBuilder();
    //     for(int i = 0;i<s.length();i++){
            
    //     StringBuilder rsss  = new StringBuilder();
    //         rsss.append(s.charAt(i));
    //         list.add(rs.toString());
    //     }
    // }

    // public static void create_list4(Map<Integer,String> mapp,List<String> list,String digits){
    //     String s = mapp.get(Integer.parseInt(digits));
    //     StringBuilder rs  = new StringBuilder();
    //     for(int i = 0;i<s.length();i++){
            
    //     StringBuilder rssss  = new StringBuilder();
    //         rssss.append(s.charAt(i));
    //         list.add(rs.toString());
    //     }
    // }
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length() == 0) return list;

        Map<Integer, String> mapp = new HashMap<>();
        mapp.put(2, "abc");
        mapp.put(3, "def");
        mapp.put(4, "ghi");
        mapp.put(5, "jkl");
        mapp.put(6, "mno");
        mapp.put(7, "pqrs");
        mapp.put(8, "tuv");
        mapp.put(9, "wxyz");

        create_list(mapp, list, digits);
        return list;
    }

    public static void create_list(Map<Integer, String> mapp, List<String> list, String digits) {
        int len = digits.length();
        if (len == 1) {
            create_list1(mapp, list, digits);
        } else if (len == 2) {
            create_list2(mapp, list, digits);
        } else if (len == 3) {
            create_list3(mapp, list, digits);
        } else if (len == 4) {
            create_list4(mapp, list, digits);
        }
    }

    public static void create_list1(Map<Integer, String> mapp, List<String> list, String digits) {
        String s1 = mapp.get(digits.charAt(0) - '0');
        for (int i = 0; i < s1.length(); i++) {
            list.add(String.valueOf(s1.charAt(i)));
        }
    }

    public static void create_list2(Map<Integer, String> mapp, List<String> list, String digits) {
        String s1 = mapp.get(digits.charAt(0) - '0');
        String s2 = mapp.get(digits.charAt(1) - '0');
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                list.add("" + s1.charAt(i) + s2.charAt(j));
            }
        }
    }

    public static void create_list3(Map<Integer, String> mapp, List<String> list, String digits) {
        String s1 = mapp.get(digits.charAt(0) - '0');
        String s2 = mapp.get(digits.charAt(1) - '0');
        String s3 = mapp.get(digits.charAt(2) - '0');
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                for (int k = 0; k < s3.length(); k++) {
                    list.add("" + s1.charAt(i) + s2.charAt(j) + s3.charAt(k));
                }
            }
        }
    }

    public static void create_list4(Map<Integer, String> mapp, List<String> list, String digits) {
        String s1 = mapp.get(digits.charAt(0) - '0');
        String s2 = mapp.get(digits.charAt(1) - '0');
        String s3 = mapp.get(digits.charAt(2) - '0');
        String s4 = mapp.get(digits.charAt(3) - '0');
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                for (int k = 0; k < s3.length(); k++) {
                    for (int l = 0; l < s4.length(); l++) {
                        list.add("" + s1.charAt(i) + s2.charAt(j) + s3.charAt(k) + s4.charAt(l));
                    }
                }
            }
        }
    }
}
