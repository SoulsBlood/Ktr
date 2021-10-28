public class Ktr2 {
    public static void main(String[] args) {
        int[] array = new int[8];
        int j = 0;
        int fill = array.length;

        for (int i = 0; i < fill; ++i, j = j + 3) {
            array[i] = j;
            System.out.print(+array[i] + " ");

        }
    }
}
