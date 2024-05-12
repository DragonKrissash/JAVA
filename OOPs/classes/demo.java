package classes;

class Calc {
    public int add(int nums[]) {
        int result = 0;
        for (int n : nums) {
            result += n;
        }
        return result;
    }
}

public class demo {
    public static void main(String[] args) {

        Calc ob = new Calc();
        int nums[] = { 10, 2, 0 };
        int result = ob.add(nums);
        System.out.println(result);
    }
}
