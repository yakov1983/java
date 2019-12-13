package com.company;

public class Bankomat implements BancomatImpl {

    private Card[] _cards;          //массив  _ - признак приватность
    private Card _userCard;   // нужно для записи запомненной карточки

    public Bankomat() {
        this._cards = new Card[] {  // создаем базу данных карточек
                new Card("1234567", "1234", 12.9f),
                new Card("1234568", "1235", 0),
                new Card("1234569", "1236", 100),
                new Card("1234560", "1237", 15.3f),
        };
    }

    public boolean checkPin(String cardId, String pin) {

        int i = 0;

        for (; i < this._cards.length; i++) {
            if (this._cards[i].ID.equals(cardId)) {  // эта функция сравнивает
                this._userCard = this._cards[i];
                break;
            }
        }
        //проверяем пин-код
        // null - нулевая ссылка, т.е. никуда не указывает
        if (this._userCard == null) { // вместо (found == false) записать   (!found) ! логическое не
            System.out.println("неверный ID карточки");
            return false;
        }
        if (this._cards[i].PIN.equals(pin)) {
            return true;
        }
        return false;

        // можно по другому return this._cards[i].PIN == pin
    }

    public float getBalance() {
        return this._userCard.money;
    }
    public void getCash(float cash) {
        if (cash > this._userCard.money) {
            System.out.println("недостаточно средств");
        } else {
            this._userCard.money -= cash;
        }
    }
    public void addCash(float cash) {
        this._userCard.money += cash;
    }
    public void reject() {
        this._userCard = null; // обнуление текущей карточки
    }

    class Card {           // внутри данного класса , т.к. негде больше не используется
        String ID;
        String PIN;
        float money;

        public Card(String id, String pin, float money) {
            this.ID = id;
            this.PIN = pin;
            this.money = money;
        }
    }
}
