public class Test {

    public static void main(String[] args) {


        Account account1 = new Account();

        //Account account2 = new Account("123456", 1000.0, "Direncan Gider","direncan@hotmail.com", "5551112233");

        //account2.depositMoney(500.0);

        //account2.withdrawalls(700.0);

        //account2.withdrawalls(2000.0);

        //System.out.println(account1.getEmail());

        Account account3 = new Account("Direncan", "mail@example.com", "1234321");

        //System.out.println(account3.getAccountNo());
        //System.out.println(account3.getName());
        //System.out.println(account3.getBalance());

        account3.showInformations(); //This line was the last line we write.



    }

}
