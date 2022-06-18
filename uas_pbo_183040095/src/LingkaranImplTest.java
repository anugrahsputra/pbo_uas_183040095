public class LingkaranImplTest {
    public static void main(String[] args) throws Exception {
        LingkaranImpl lingkaran1 = new LingkaranImpl(10);
        LingkaranImpl lingkaran2 = new LingkaranImpl(5);
        LingkaranImpl lingkaran3 = new LingkaranImpl(0);
        System.out.println(lingkaran1.hitungLuasLingkaran());
        System.out.println(lingkaran2.hitungLuasLingkaran());
        System.out.println(lingkaran3.hitungLuasLingkaran());
    }
}
