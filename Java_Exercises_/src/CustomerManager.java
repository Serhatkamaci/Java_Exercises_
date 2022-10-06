public class CustomerManager {
    private Company company;
    //private ICreditManager iCreditManager;
    public CustomerManager(Company company)
    {
        this.company=company;
        //this.iCreditManager=iCreditManager;
        System.out.println("CustomerManager yapilandiricisi olustu.");
    }
    /*
    public void Save()
    {
        System.out.println("Kredi verildi: "+company.getCompanyName());
    }
    */
    public  void giveCredit()
    {
        //iCreditManager.calculate();
        System.out.print("Kredi verildi.");
    }
}
