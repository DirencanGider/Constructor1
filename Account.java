public class Account {

    //We will create Account class' features first.

    private String accountNo;
    private double balance; //Bakiye(TR)
    private String name;

    private String email;

    private String phoneNo;


    //Fourth step

    public Account () {

        //System.out.println("Constructor that we made"); //Fifth step

        /*
        this.accountNo = "No information";
        this.balance = 0.0;
        this.name = "No information";
        this.email = "No information";
        this.phoneNo ="No information";
        */

        this("No information", 0.0, "No information", "No information", "No information");

    }

    public Account(String name, String email, String phoneNo){

        /*
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;

        this.balance = 0.0;
        this.accountNo = "No information";
        */

        this("No information", 0.0,name , email, phoneNo);

    }

    //Sixth step.

    public Account(String accountNo, double balance, String name, String email, String phoneNo) {

        this.accountNo = accountNo;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;

    }

    //Third step

    public void depositMoney (double amount) { //Para yatirma islemi metodu yazdik. (TR)

        balance += amount;

        System.out.println("Your New Balance: " + balance);

    }

    //Fourth step

    public void withdrawalls (double amount) { //Para cekme islemi metodu yazdik. (TR)

        if (amount > 1500) {
            System.out.println("The limit of withdrawals cannot be over 1500...");
        }
        if (balance - amount < 0) {
            System.out.println("There is no enough money in your balance. Your balance: " + balance);
        }
        else {
            balance -= amount;
            System.out.println("Your New Balance: " + balance);
        }

    }


    //Last step in lesson.

    public void showInformations () {

        System.out.println("Account No: " + this.accountNo);
        System.out.println("Balance: " + this.balance);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Phone Number: " + this.phoneNo);


    }


    //Second step. We use Generate feature and created all getter and setter methods automatically.

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }


}
