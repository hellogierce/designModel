package com.wyc.facade_model;

public class PersonManage {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String cardType;
    String cardNumber;
    String cardExpDate;

    public PersonManage(String firstName, String lastName, String address, String city, String state, String cardType, String cardNumber, String cardExpDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardExpDate = cardExpDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpDate() {
        return cardExpDate;
    }

    public void setCardExpDate(String cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    public static boolean isValid(String firstName, String lastName, String address, String city, String state, String cardType, String cardNumber, String cardExpDate) {
        PersonManage person=new PersonManage(firstName, lastName, address, city, state, cardType, cardNumber, cardExpDate);
        Account account=new Account(person.getFirstName(),person.getLastName());
        Address addressobj=new Address(person.getAddress(),person.getCity(),person.getState());
        CreditCard creditCard=new CreditCard(person.getCardType(), person.getCardNumber(), person.getCardExpDate());
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
    public static boolean save(String firstName, String lastName, String address, String city, String state, String cardType, String cardNumber, String cardExpDate) {
        PersonManage person=new PersonManage(firstName, lastName, address, city, state, cardType, cardNumber, cardExpDate);
        Account account=new Account(person.getFirstName(),person.getLastName());
        Address addressobj=new Address(person.getAddress(),person.getCity(),person.getState());
        CreditCard creditCard=new CreditCard(person.getCardType(), person.getCardNumber(), person.getCardExpDate());
        boolean flag=false;
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
        if (isValid(firstName, lastName, address, city, state, cardType, cardNumber, cardExpDate)) {
            save(firstName, lastName, address, city, state, cardType, cardNumber, cardExpDate);
        }
    }

    public static void main(String[] args) {
        run("hello", "hi", "china", "wuhan", "east", "ic", "888888", "20991231");
    }
}
