package com.wyc.facade_model;

/**
 * 外观模式:
 * 不要返回子系统的组件给客户端
 * 外观目的是提供一个高层次的接口
 */
public class PersonManage2 {
    Account account;
    Address address;
    CreditCard creditCard;

    public PersonManage2(Account account, Address address, CreditCard creditCard) {
        this.account = account;
        this.address = address;
        this.creditCard = creditCard;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public static boolean isValid(PersonManage2 person){
        Account account=person.getAccount();
        Address addressobj=person.getAddress();
        CreditCard creditCard=person.getCreditCard();
        boolean flag=false;
        if (account.isValid()&&addressobj.isValid()&&creditCard.isValid()){
            System.out.println("用户信息验证通过");
            flag=true;
        }else{
            System.out.println("用户信息验证通过");
            flag=false;
        }
        return flag;
    }
    public static boolean save(PersonManage2 person){
        Account account=person.getAccount();
        Address addressobj=person.getAddress();
        CreditCard creditCard=person.getCreditCard(); boolean flag=false;
        if (account.save()&&addressobj.save()&&creditCard.save()){
            System.out.println("用户信息保存成功");
            flag=true;
        }else{
            System.out.println("用户信息保存失败");
            flag=false;
        }
        return flag;
    }

    /**
     * 调用接口
     * @param firstName
     * @param lastName
     * @param address
     * @param city
     * @param state
     * @param cardType
     * @param cardNumber
     * @param cardExpDate
     */
    public static void run(String firstName, String lastName, String address, String city, String state, String cardType, String cardNumber, String cardExpDate) {
        Account account=new Account(firstName, lastName);
        Address address1=new Address(address, city, state);
        CreditCard creditCard=new CreditCard(cardType, cardNumber, cardExpDate);
        PersonManage2 person=new PersonManage2(account, address1, creditCard);
        if (isValid(person)) {
            save(person);
        }
    }

    public static void main(String[] args) {
        run("hello", "hi", "china", "wuhan", "east", "ic", "888888", "20991231");
    }
}
