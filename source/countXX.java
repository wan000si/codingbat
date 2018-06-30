import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class countXX {
    int countXX(String str) {
       int count=0;
        for (int i = 0; i < str.length() - 1; ++i) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count++;
    }

    boolean doubleX(String str) {
        if (str.indexOf("x") >= 0 && str.indexOf("x") < str.length() - 2) {
            return str.substring(str.indexOf("x") + 1, str.indexOf("x") + 2).equals("x");
        }
        return false;
    }

    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }

    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0,i+1);
        }
        return result;
    }

    public int last2(String str) {
        if (str.length() <= 2) {
            return 0;
        }

        String last2Str = str.substring(str.length() - 2);
        int count=0;
        for (int i = 0; i < str.length() - 2; ++i) {
            if (str.substring(i, i + 2).equals(last2Str)) {
                count++;
            }
        }
        return count;
        }

    public int arrayCount9(int[] nums) {
        return (int)Arrays.stream(nums).filter(i -> i == 9).count();
    }

    public boolean arrayFront9(int[] nums) {
        return Arrays.stream(nums).limit(4).anyMatch(i -> i == 9);
    }

    public boolean array123(int[] nums) {
        for (int i=0;i<nums.length-2;++i) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int count=0;
        for (int i = 0; i < Math.min(a.length()-1, b.length()-1); ++i) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }

    public String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); ++i) {
            if (!(i > 0 && i < str.length() - 1 && str.substring(i, i + 1).equals("x"))) {
                result += str.substring(i, i + 1);
            }
        }
        return result;
    }

    public String altPairs(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result += str.substring(i, end);
        }
        return result;
    }

    public String stringYak(String str) {
        String result = "";
        for(int i=0;i<str.length();++i) {
            if ((i + 2 < str.length()) && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 2;
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; ++i) {
            if ((nums[i] == nums[i + 1]) && (nums[i] == nums[i + 2])) {
                return false;
            }
        }
        return true;
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; ++i) {
            if ((nums[i] + 5 == nums[i + 1]) && Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }





}
