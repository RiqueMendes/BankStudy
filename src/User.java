
public class User {
    protected String name;
    protected int agency;
    protected int account;
    protected int password;
    protected double total;
  

public boolean AccountVerify(int x, int y, int z) {

    if (x != agency || y != account || z != password) {
        System.out.println("\nAcesso negado.\n");
        return false;

    } else
        return true;
}
 public void deposit(double deposit){ 
    this.total = total + deposit;

 }

 public void withdraw(double withdraw){
    this.total = total - withdraw;
 }



 //Getters and Setters 
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAgency() {
    return agency;
}
public void setAgency(int agency) {
    this.agency = agency;
}
public int getAccount() {
    return account;
}
public void setAccount(int account) {
    this.account = account;
}
public int getPassword() {
    return password;
}
public void setPassword(int password) {
    this.password = password;
}
public double getTotal() {
    return total;
}
public void setTotal(double total) {
    this.total = total;
}


};