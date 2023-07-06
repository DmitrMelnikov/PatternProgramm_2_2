public class BinOps {

    protected SubBinar subBinar = new SubBinar();
    protected MultBinar multBinar = new MultBinar();

    public String sub(String a, String b) {
        return subBinar.sub(a, b);
    }

    public String mult(String a, String b) {
        return multBinar.mult(a, b);
    }
}
