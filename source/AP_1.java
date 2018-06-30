import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class AP_1 {
    public boolean scoresIncreasing(int[] scores) {
            for (int i = 0; i < scores.length-1; i++) {
                if (scores[i + 1] < scores[i]) {
                    return false;
                }
            }
            return true;
    }

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length-1; i++) {
            if (scores[i]==100 && scores[i + 1] == 100) {
                return true;
            }
        }
        return false;
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            if (scores[i + 2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }

    public int scoresAverage(int[] scores) {
        double firstHalf = Arrays.stream(scores).limit(scores.length / 2).average().getAsDouble();
        double secondHalf = Arrays.stream(scores).skip(scores.length / 2).average().getAsDouble();
        return (int) Math.max(firstHalf, secondHalf);
    }

    public int wordsCount(String[] words, int len) {
        return (int) Arrays.stream(words).filter(i -> i.length() == len).count();
    }

    public String[] wordsFront(String[] words, int n) {
        return Arrays.stream(words).limit(n).collect(Collectors.toList()).toArray(new String[n]);
    }

    public List wordsWithoutList(String[] words, int len) {
//        List<String> listA = Arrays.asList(words);
//        List<String> listB = new ArrayList<String>(listA);
//        listB.removeIf(i -> i.length() == len);
//        return listB;
        return Arrays.stream(words).filter(i -> i.length() != len).collect(Collectors.toList());
    }

    public boolean hasOne(int n) {
        while (n != 0) {
            if (n % 10 == 1) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public boolean dividesSelf(int n) {
        int k = n;
        while (k != 0) {
            int temp = k % 10;
            if (temp == 0 || (n / temp) % 2 != 0) {
                return false;
            }
            k /=10;
        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        return Arrays.stream(nums).filter(i -> i % 2 == 0).limit(count).toArray();
    }

    public int[] copyEndy(int[] nums, int count) {
        return Arrays.stream(nums).filter(i -> i >= 0 && i <= 10 || (i >= 90 && i <= 100)).limit(count).toArray();
    }

    public int matchUp(String[] a, String[] b) {
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals("") && !b[i].equals("") && a[i].charAt(0) == b[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }

    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i].equals(answers[i])) {
                score += 4;
            } else if (!answers[i].equals("?")) {
                score -= 1;
            }
        }
        return score;
    }

    public String[] wordsWithout(String[] words, String target) {
        int len =(int) Arrays.stream(words).filter(i -> !i.equals(target)).count();
        return Arrays.stream(words).filter(i -> !i.equals(target)).collect(Collectors.toList()).toArray(new String[len]);
    }

    public int scoresSpecial(int[] a, int[] b) {
        int maxA = getSpecial(a).length > 0 ? Arrays.stream(getSpecial(a)).max().getAsInt() : 0;
        int maxB = getSpecial(b).length > 0 ? Arrays.stream(getSpecial(b)).max().getAsInt() : 0;
        return maxA + maxB;
    }

    public int[] getSpecial(int[] a) {
        return Arrays.stream(a).filter(i -> i % 10 == 0).toArray();
    }

    public int sumHeights(int[] heights, int start, int end) {

    }





}
