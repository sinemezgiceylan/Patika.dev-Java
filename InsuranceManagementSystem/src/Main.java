import InsuranceManagementSystem.InvalidAuthenticationException;

public class Main {
    public static void main(String[] args) throws InvalidAuthenticationException {

        AccountManager accountManager = new AccountManager();


        User user1 = new User("Patika", "Dev", "patika@gmail.com", "123", "Developer", 25);
        user1.getInsurances().add(new TravelInsurance(50000));

        AddressManager addressManager = new AddressManager(user1);
        addressManager.addAddress((new HomeAddress("Türkiye","Ankara","Çankaya", "A","B")));


        Account indAcc1 = new IndividualAccount(user1);
        accountManager.getDataList().add(indAcc1);

        accountManager.login("patika@gmail.com", "123");
    }
}