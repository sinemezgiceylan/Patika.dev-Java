public abstract class Account {

    private User user;

    public final void showUserInfo() {
        System.out.println("Müşteri Bilgileri");
        System.out.println("Ad : "+user.getName());
        System.out.println("Soyad : "+user.getSurname());
        System.out.println("Email : "+ user.getEmail());
        System.out.println("Yaş : "+user.getAge());
        System.out.println("Meslek : "+user.getJob());
        System.out.println();
        System.out.println("Adres Listesi");
        for(int i = 0; i< user.getAddressList().size() ; i++) {
            System.out.print((i+1)+". adres : ");
            System.out.print(user.getAddressList().get(i).getNeighborhood()+", "+user.getAddressList().get(i).getStreet()
                    +", "+user.getAddressList().get(i).getTown()+", "+user.getAddressList().get(i).getCity()+ ", "+user.getAddressList().get(i).getCountry()+"\n");
        }
        System.out.println("---------------------------------------------");

        System.out.println("\nSigorta Listesi");
        for(Insurance s : user.getInsurances()) {
            System.out.println("Sigorta Türü : "+s.getClass().getSimpleName());
            System.out.println("Sigorta Ücreti : "+s.calculate());
            System.out.println("Başlangıç Tarihi : "+s.getStartDate());
            System.out.println("Bitiş Tarihi : "+s.getFinishDate());
            System.out.println();
        }


    }

    public Account(User user) {
        super();
        this.user = user;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
