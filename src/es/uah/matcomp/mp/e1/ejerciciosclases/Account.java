package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        balance = 0;//valor pretederminado porque no aparece
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        this.balance=balance+amount;
        return balance;
    }
    public int debit(int amount){

    }
}

