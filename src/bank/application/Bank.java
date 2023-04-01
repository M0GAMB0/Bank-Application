package bank.application;

public abstract class Bank {
    abstract void readData();
    abstract void writeData();
    void run(){
        System.out.println("Running");
    }
}
class Admin extends Bank{

    @Override
    void readData() {

    }

    @Override
    void writeData() {

    }
}
