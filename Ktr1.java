public class Ktr1{
    public static void main(String[] args)
    {
        System.out.println(c(5,8));
    }
        public static boolean c ( int a, int b){
            int sum = a + b;
            if (sum > 10 && sum < 20) return true;
            else return false;
        }
}
