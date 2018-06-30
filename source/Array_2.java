import com.sun.deploy.util.ArrayUtil;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array_2 {
    public int countEvens(int[] nums) {
        return (int)Arrays.stream(nums).filter(i -> i % 2 == 0).count();
    }

    public int bigDiff(int[] nums) {
        return (Arrays.stream(nums).max().getAsInt()- Arrays.stream(nums).min().getAsInt());
    }

    public int centeredAverage(int[] nums) {
        return (Arrays.stream(nums).sum()
                -(Arrays.stream(nums).max().getAsInt()+Arrays.stream(nums).min().getAsInt()))
                /(nums.length-2);

    }

    public int sum13(int[] nums) {
//        List list = Arrays.asList(nums);
//        if (!list.contains(13)) {
//            return Arrays.stream(nums).sum();
//        }
//        int index = list.indexOf(13);
//        return index == 0 ? 0 : Arrays.stream(nums).limit(index).sum();

//        return nums.length <= 0 ?
//                0 : Arrays.stream(nums)
//                .limit(Arrays.asList(nums).contains(13) ?
//                        Arrays.asList(nums).indexOf(13) : nums.length)
//                .sum();
        int sum = 0;
        for (int i = 0; i < nums.length; ) {
            if (nums[i] == 13) {
                i += 2;
                continue;
            }
            sum += nums[i];
            i++;
        }
        return sum;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        int i = 0;
        for (; i < nums.length; ) {
            if (nums[i] == 6) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 7) {
                        i = j + 1;
                        break;
                    }
                }
            } else {
                sum += nums[i];
                i++;
            }
        }
        if (i == nums.length-1) {
            sum += nums[nums.length - 1];
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
//        return !(Arrays.asList(nums).contains(1) && Arrays.asList(nums).contains(3));
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1 || nums[i] == 3) {
//                return false;
//            }
//        }
//        return true;
        return Arrays.stream(nums).filter(i -> i == 0 || i == 3).count() == 0;
    }

    public boolean sum28(int[] nums) {

        return Arrays.stream(nums).filter(i -> i == 2).sum() == 8;
    }

    public boolean more14(int[] nums) {
        return Arrays.stream(nums).filter(i -> i == 1).count()
                > Arrays.stream(nums).filter(i -> i == 4).count();
    }

    public int[] fizzArray(int n) {
        int[] result = new int[n];
        if (n != 0) {
            for (int i = 0; i < n; i++) {
                result[i] = i;
            }
        }
        return result;

    }

    public boolean only14(int[] nums) {
        return Arrays.stream(nums).filter(i -> i != 1 && i != 4).count() == 0;
    }

    public String[] fizzArray2(int n) {
        String[] result = new String[n];
        if (n != 0) {
            for (int i = 0; i < n; i++) {
                result[i] = String.valueOf(i);
            }
        }
        return result;
//        Arrays.stream(result).forEach(i->i=String.valueOf(i));
    }

    public boolean no14(int[] nums) {
        if (Arrays.stream(nums).filter(i -> i == 1).count() != 0) {
            return Arrays.stream(nums).filter(i -> i == 4).count() == 0;
        }
        if (Arrays.stream(nums).filter(i -> i == 4).count() != 0) {
            return Arrays.stream(nums).filter(i -> i ==1).count() == 0;
        }
        return true;
    }

    public boolean isEverywhere(int[] nums, int val) {
        boolean flag = true;
//        if (nums.length % 2 == 0) {
//            for (int i = 1; i < nums.length; i += 2) {
//                if (nums[i] == val) {
//                    flag &= true;
//                } else {
//                    flag &= false;
//                }
//
//            }
//            for (int i = 0; i < nums.length; i += 2) {
//                if (nums[i] == val) {
//                    flag &= true;
//                }
//                else {
//                    flag &= false;
//                }
//            }
//        } else {
//            for (int i = 0; i < nums.length; i += 2) {
//                if (nums[i] == val) {
//                    return true;
//                }
//                else {
//                    flag &= false;
//                }
//            }
//        }
        return flag;
    }

    public boolean either24(int[] nums) {
        int count22 = 0,count44 = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                count22++;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                count44++;
            }
        }
        return count22 != 0 ? count44 == 0 : count44 != 0;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; ++i) {
            if (Math.abs(nums1[i] - nums2[i]) > 0 && Math.abs(nums1[i] - nums2[i]) <= 2) {
                count++;
            }
        }
        return count;
    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 7 && (nums[i + 1] == 7 || (i < nums.length - 2 && nums[i + 2] == 7))) {
                return true;
            }
        }
        return false;
    }

    public boolean has12(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean modThree(int[] nums) {
        boolean flag = false;
        if (nums.length>=3){
            for (int i = 0; i < nums.length-2; i++) {
                if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0)
                        || (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0)) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
        }
        return flag;
    }

    public boolean haveThree(int[] nums) {
        boolean flag3 = true;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 3 && nums[i + 1] == 3) {
                flag3 = false;
                break;
            }
        }
        return flag3 && (Arrays.stream(nums).filter(i -> i == 3).count() == 3);
    }

    public boolean twoTwo(int[] nums) {
        if (nums.length == 1 && nums[0] == 2) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (i == 0 ) {
                    if (nums[i + 1] != 2)return false ;
                }else if (i == nums.length - 1 ) {
                    if(nums[i - 1] != 2)return false;
                }else {
                   if (nums[i - 1] != 2 && nums[i + 1] != 2) {
                        return false;
                   }
                }
            }
        }
        return true;
    }

    public boolean sameEnds(int[] nums, int len) {
        int numsLen = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[numsLen - len + i]) {
                return false;
            }
        }
        return true;
    }

    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] - nums[i] == 1 && nums[i + 2] - nums[i + 1] == 1) {
                return true;
            }
        }
        return false;
    }

    public int[] fizzArray3(int start, int end) {
        int[] result = new int[end-start];
        for (int i = start, j = 0; i < end; i++) {
            result[j++] = i;
        }
        return result;
    }

    public int[] shiftLeft(int[] nums) {
        if (nums.length < 1) {
            return nums;
        }
        int[] result = new int[nums.length];
        int end = nums[0];
        int i = 0;
        for (; i < nums.length - 1; i++) {
            result[i] = nums[i + 1];
        }
        result[i] = end;
        return result;
    }

    public int[] tenRun(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length;i++) {
            result[i] = nums[i];
            if (nums[i] % 10 == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    result[i] = nums[i];
                    if (nums[j] % 10 == 0) {
                        i = j;
                        break;
                    } else {
                        result[j] = nums[i];
                    }
                }
            }
        }
        return result;
    }

    public int[] pre4(int[] nums) {
        if (nums[0] == 4) {
            return new int[0];
        }
        int index=0;
        for (int i = 0; i <nums.length; i++) {
            if (nums[i] == 4) {
                index = i;
                break;
            }
        }
        int[] result = new int[index-1];
        for (int i = 0; i <index ; i++) {
            result[i] = nums[i];
        }
        return result;
    }

    public int[] post4(int[] nums) {
        if (nums[nums.length-1] == 4) {
            return new int[0];
        }
        int index=0;
        for (int i = nums.length-2; i >=0; i--) {
            if (nums[i] == 4) {
                index = i;
                break;
            }
        }
        int[] result = new int[nums.length-index-1];
        for (int i = index,j=0; i <nums.length ; i++) {
            if (j<nums.length-index-1) {
                result[j++] = nums[i];
            }
        }
        return result;
    }

    public int[] notAlone(int[] nums, int val) {
        int[] result = new int[nums.length];
        result = nums;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val) {
                result[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return result;
    }

    public int[] zeroFront(int[] nums) {
        // if (!Arrays.asList(nums).contains(0)) {
        //           return nums;
        //       }
        int[] result = new int[nums.length];
        int count0 = (int) Arrays.stream(nums).filter(i -> i == 0).count();
        Arrays.fill(result, 0, count0, 0);
        Arrays.stream(nums).filter(i -> i != 0).forEach(i->{
            for (int j = count0; j < nums.length; j++) {
                result[j] = i;
            }
        });
        return result;
    }

    public int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int countNot10 = (int) Arrays.stream(nums).filter(i -> i != 10).count();
        int[] temp= Arrays.stream(nums).filter(i -> i != 10).toArray();
        for (int i = 0; i < temp.length; i++) {
            result[i] = temp[i];
        }
        Arrays.fill(result, countNot10, nums.length, 0);
        return result;
    }

    public int[] zeroMax(int[] nums) {
        int[] result = nums;
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1 && nums[i] == 0) {
                int[] temp = Arrays.copyOfRange(nums, i+1, nums.length);
                if ((int) Arrays.stream(temp).filter(item -> item % 2 != 0).count() > 0) {
                    nums[i] = Arrays.stream(temp).filter(j -> j % 2 != 0).max().getAsInt();
                }
            }
        }
        return result;
    }

    public int[] evenOdd(int[] nums) {
        int[] even = Arrays.stream(nums).filter(i -> i % 2 == 0).toArray();
        int[] odd = Arrays.stream(nums).filter(i -> i % 2 != 0).toArray();
        int[] result = Arrays.copyOf(even, nums.length);
//        System.arraycopy(odd, 0, result, even.length, odd.length);
        for (int i = 0; i < odd.length; i++) {
            result[i + even.length] = odd[i];
        }
        return result;
    }

    public String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];
        for (int i = 0; i < result.length; i++) {
            int temp = start + i;
            if (temp % 3 == 0 && temp % 5 != 0) {
                result[i] = "Fizz";
            } else if (temp % 3 != 0 && temp % 5 == 0) {
                result[i] = "Buzz";
            } else if (temp % 3 == 0 && temp % 5 == 0) {
                result[i] = "FizzBuzz";
            } else {
                result[i] = String.valueOf(temp);
            }
        }
        return result;
    }






}
