public class Main {
    public static void main(String[] args)
    {
        /*
        int sayi1=10;
        int sayi2=20;
        sayi1=sayi2;
        sayi2=100;
        System.out.println(sayi1);
        // Sayi1'in degeri 20'dir. Cunku temel veri tipleri degisken tiplidir, referans tipli degil.
        // Degisken tipler sadece bellegin "stack" alaninda olusur.

        int[] sayilar1={1,2,3};
        int[] sayilar2={10,20,30};
        sayilar1=sayilar2;
        sayilar2[0]=1000;

        System.out.println(sayilar1[0]);
        // New yapisi ile olusan tum tipler referans tiplerdir. Referans tipler oldugu icin bellegin "stack ve heap" alanini kullanilir.
        // Bu yuzden yukaridaki ornekte sayilar1 sayilar2'nin referansini tuttugu icin 0.indeksteki degeride degisti.


        CreditManager creditManager=new CreditManager();
        //creditManager.calculate();
        //creditManager.Save();

        Customer customer=new Customer();

        customer.setId(10);
        customer.setFirstName("Serhat");
        customer.setLastName("Kamaci");
        customer.setNationalIdentitiy("Turkey");

        CustomerManager customerManager=new CustomerManager(customer);
        //customerManager.Save();

        customer.setId(1);
        customer.setCity("Bursa");
        */
        Company company = new Company();
        company.setTaxNumber("11457896");
        company.setCompanyName("Samsung");
        company.setId(100);

        //CustomerManager customerManager=new CustomerManager(company);

        //customerManager.Save();
        //System.out.println(company.getTaxNumber());

        CustomerManager customerManager = new CustomerManager(company);
        //customerManager.giveCredit();

        // Interfacelerin amaci iflerden kurtulmak yani bagimlilikdan kurtulmaktir.

    }
}
