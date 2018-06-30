import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Function_1 {
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(i -> i *= 2)
                .collect(Collectors.toList());
    }

    public List<Integer> square(List<Integer> nums) {
        return nums.stream().map(i -> i =i*i)
                .collect(Collectors.toList());
    }

    public List<String> addStar(List<String> strings) {
        return strings.stream().map(i -> i.concat("*"))
                .collect(Collectors.toList());
    }

    public List<String> copies3(List<String> strings) {
//        return strings.stream().map(i -> i = i + i + i).collect(Collectors.toList());
        return strings.stream().map(i -> i.concat(i).concat(i)).collect(Collectors.toList());
    }

    public List<String> moreY(List<String> strings) {
        return strings.stream().map(i -> i="y"+i+"y")
                .collect(Collectors.toList());
    }

    public List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(i -> i=(i+1)*10)
                .collect(Collectors.toList());
    }

    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(i -> i %= 10)
                .collect(Collectors.toList());
    }

    public List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    public List<String> noX(List<String> strings) {
        return strings.stream().map(i->i.replace("x","")).collect(Collectors.toList());
    }



}
