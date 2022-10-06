public abstract class BaseCreditManager {
    public void save()
    {
        System.out.println("Kredi hesaplandi");
    }
    public abstract void calculate();
    // Bu save metodu her yerde ayni sekilde kullanilabilmesi icin burada bir soyutlama islemi yapmis oldum.
}
