class Client extends Person{
    double balance;
    Client(){
        super(0,"","", "", "");
    }
    Client(int age, String firstName, String lastName, String birthdayDate, String birthdayPlace){
        super(age, firstName, lastName, birthdayDate, birthdayPlace);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
