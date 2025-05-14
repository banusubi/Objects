public class WrapperEx {
    public static void main(String[] args) {
        int prim = 30;
        Integer obj = Integer.valueOf(prim);
        int p = obj.intValue();
        System.out.println(obj);
        System.out.println(p);

        int a = 10;
        Integer b = a;
        System.out.println(b);

        Integer n = 20 ;
        int k = n;
        System.out.println(k);

    }
}
