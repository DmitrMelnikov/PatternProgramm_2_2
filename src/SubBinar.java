public class SubBinar {
    public String sub(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, вычтите друг из друга и переведите
      обратно в двоичную запись*/
        int result = Integer.parseInt(a, 2) - Integer.parseInt(b, 2);
        return Integer.toBinaryString(result);
    }
}
