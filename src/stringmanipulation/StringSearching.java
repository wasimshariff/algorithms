package stringmanipulation;

public class StringSearching {

    public static void main(String a[]) {
        String search = "sadasdasadasda";
        String subStr = "sda";
        int found = 0;
        for (int i = 0; i <= search.length() - subStr.length(); i++) {
            char ch = search.charAt(i);
            if( ch == subStr.charAt(0) && search.charAt(i+1) == subStr.charAt(1) && search.charAt(i+2) == subStr.charAt(2)) {
                found++;
            }
        }
        System.out.println(found);
    }
}
