import java.util.*;
import java.util.stream.Collectors;

public class String_2 {
    public String doubleChar(String str) {
        String result="";
        for (int i = 0; i < str.length(); ++i) {
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;
    }

    public int countHi(String str) {
        int count=0;
        for (int i = 0; i < str.length() - 1; ++i) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; ++i) {
            if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                countDog++;
            }
        }
        if (countCat == countDog) {
            return true;
        }
        return false;
    }

    public int countCode(String str) {
        TreeMap tm = new TreeMap();
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == 'c') {
                if (tm.containsKey('c')) {
                    tm.put('c', (int) tm.get('c') + 1);
                } else {
                    tm.put('c', 1);
                }
            }
            if (str.charAt(i) == 'o') {
                if (tm.containsKey('o')) {
                    tm.put('o', (int) tm.get('o') + 1);
                } else {
                    tm.put('o', 1);
                }
            }
            if (str.charAt(i) == 'e') {
                if (tm.containsKey('e')) {
                    tm.put('e', (int) tm.get('e') + 1);
                } else {
                    tm.put('e', 1);
                }
            }
        }

        int countC = tm.containsKey('c')?(int) tm.get('c'):0;
        int countO = tm.containsKey('o')?(int) tm.get('o'):0;
        int countE = tm.containsKey('e')?(int) tm.get('e'):0;

        return Math.min(Math.min(countC, countO), Math.min(countC, countE));

    }

    public boolean endOther(String a, String b) {
        int lena = a.length();
        int lenb = b.length();
        if (((lena >= lenb) && (a.substring(lena - lenb).toLowerCase().equals(b.toLowerCase())))
                || (lena < lenb && b.substring(lenb - lena).toLowerCase().equals(a.toLowerCase()))) {
            return true;
        }
        return false;
    }

    public boolean xyzThere(String str) {
        boolean flag=false;
        for (int i = 0; i < str.length() - 2; ++i) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i == 0) {
                    flag=true;
                } else {
                    flag = (str.charAt(i - 1) != '.');
                }
            }
        }
        return flag;
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; ++i) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public boolean xyBalance(String str) {
        if (str.indexOf('x') < 0) {
            return true;
        }
        if (str.lastIndexOf("x") < str.lastIndexOf("y")) {
            return true;
        }
        return false;
    }

    public String mixString(String a, String b) {
        String result = "";
        int lena = a.length();
        int lenb = b.length();
        for(int i=0;i<Math.min(lena,lenb);++i) {
            result += a.charAt(i);
            result += b.charAt(i);
        }
        result += (lena > lenb) ? a.substring(lenb) : b.substring(lena);
        return result;
    }

    public String repeatEnd(String str, int n) {
        String result="";
        String validStr = str.substring(str.length() - n);
        for (int i = 0; i < n; ++i) {
            result += validStr;
        }
        return result;
    }

    public String repeatFront(String str, int n) {
        String result="";
        for (int i = 0; i < n; ++i) {
            result += str.substring(0, n - i);
        }
        return result;
    }

    public String repeatSeparator(String word, String sep, int count) {
        String result = "";
        for (int i = 1; i <= count; ++i) {
            result += word;
            if (i != count) {
                result += sep;
            }
        }
        return result;
    }

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n );
        for (int i = n; i < str.length() - n ; ++i) {
            if (str.substring(i, i + n).equals(prefix)) {
                return true;
            }
        }
        return false;
    }

    public boolean xyzMiddle(String str) {
        String frontStr = "";
        String endStr = "";
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                frontStr = str.substring(0, i);
                endStr = str.substring(i + 3);
                if (Math.abs(frontStr.length() - endStr.length()) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getSandwich(String str) {
        String result = "";
        String sanString = "bread";
        int sanlen = sanString.length();
        int i = 0;
        List<Integer> indexList = new ArrayList<>();
        for (;i < str.length() - sanlen+1; i++) {
            if (str.substring(i, i + sanlen).equals(sanString)) {
                indexList.add(i);
            }
        }
        if (indexList.size() > 1 && (indexList.get(indexList.size()-1) - indexList.get(0)) > 5) {
            result = str.substring(indexList.get(0) + sanlen, indexList.get(indexList.size()-1));
        }
        return result;
    }

    public boolean sameStarChar(String str) {
        boolean flag = true;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) == str.charAt(i + 1)) {
                    flag &= true;
                } else {
                    flag &= false;
                    break;
                }
            }
        }
        return flag;
    }

    public String oneTwo(String str) {
        String result = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            String temp = str.substring(i, i + 3);
            String moveRight = temp.substring(1, 3) + temp.charAt(0);
            result += moveRight;
        }
        return result;
    }

    public String zipZap(String str) {
        String zp = "zp";
        String result = "";
        if (str.length() < 3) {
            return str;
        }
        int i = 0;
        for (; i < str.length() - 2; ) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result += zp;
                i += 3;
            } else {
                result += str.charAt(i);
                i += 1;
            }
        }
        if (i < str.length()-1) {
            result += str.substring(i);
        }
        return result;
    }

    public String starOut(String str) {
        String startStr = "", endStr = "";
        if (!str.contains("*")) {
            return str;
        }
        for ( int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == '*') {
                if (i != 0) {
                    startStr = starOut(str.substring(0, i - 1));
                }
                if (i < str.length() - 2) {
                    int j = i + 1;
                    for (; j < str.length(); j++) {
                        if (str.charAt(j) != '*') {
                            break;
                        }
                    }
                    endStr=starOut(str.substring(j+1));
                }
                break;
            }
        }
        return startStr + endStr;
        }

    public String plusOut(String str, String word) {
        String result = "";
        int i = 0, len = word.length();
        for (; i < str.length()-len+1; ) {
            if (str.substring(i,i+len).equals(word)) {
                result += word;
                i += len;
            }
            else{
                result += "+";
                i += 1;
            }
        }
        if (i<str.length()) {
            for (int j = i; j < str.length(); j++) {
                result+="+";
            }
        }
        return result;
    }

    public String wordEnds(String str, String word) {
        String result = "";
        int i = 0, len = word.length();
        for (; i < str.length()-len+1;++i ) {
            String frontStr = "";
            String endStr = "";
            if (str.substring(i,i+len).equals(word)) {
                if (i!=0) {
                    frontStr = str.substring(i-1, i);
                }
                if (i != str.length() - len) {
                    endStr = str.substring(i + len,i+len+1);
                }
                result += frontStr + endStr;
            }
        }
        return result;
    }








}
