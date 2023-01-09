public class mock {
    
    public static User getUser() {
        User u = new User();

        u.setAccount(1524);
        u.setAgency(1234);
        u.setName("Jhonny");
        u.setPassword(123456);
        u.setTotal(3000);

        return u;
    }
}
