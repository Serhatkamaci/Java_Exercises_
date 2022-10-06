public class Customer {
    public Customer(){
        System.out.println("Customer yapilandiricisi calisti.");
    }
    /*
    private int id;
    private String firstName;
    private String lastName;
    private String nationalIdentitiy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalIdentitiy() {
        return nationalIdentitiy;
    }

    public void setNationalIdentitiy(String nationalIdentitiy) {
        this.nationalIdentitiy = nationalIdentitiy;
    }
    */
    private  int id;
    private  String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
