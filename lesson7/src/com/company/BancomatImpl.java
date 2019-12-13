package com.company;

public interface BancomatImpl {
    boolean checkPin(String cardId, String pin);  // ввести пин
    float getBalance();   // количество оставшихся денег
    void getCash(float cash); // получить денег
    void addCash(float cash);// пополнить баланс
    void reject();// если ошиблись с вводом пина , то возвращать карточку

}
