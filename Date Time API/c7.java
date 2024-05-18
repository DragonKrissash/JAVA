enum Result {
    PASS, FAIL, NR;
}

public class c7 {
    public static void main(String[] args) {
        Result res = Result.PASS;
        switch (res) {
            case PASS:
                System.out.println(res);
                break;
            case FAIL:
                System.out.println(res);
                break;
            default:
                break;
        }
    }
}
