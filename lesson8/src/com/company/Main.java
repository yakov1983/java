package com.company;

public class Main {

    public static void main(String[] args) {
	User user1 = new User();
	user1.setName("Wanya");
	user1.setAge(10);

	User user2 = new User();
	user2.setName("Wanya");
	user2.setAge(-10);
	// User1 != User2 , так как ссылки указывают на разные области памяти

	System.out.println(user1 == user2);  // false , так разные ссылки,  == для обьектов не работает

	System.out.println(user1.equals(user2)); //
	user1.equals(user2);// Сравнивает обьекты разных типов, но нужно переопределить equals

		// hashCode обязательно должно соблюдаться правило , если
		// если x.equals(y) == true , то и
		// x.hashCode() == y.hashCode() == true
		//но это не тождественно правилу,
		// x.hashCode() == y.hashCode() == true, то и
		//x.equals(y) должен возвращать  true
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());

		if (user1.hashCode() == user2.hashCode()) {
			if (user1.equals(user2)) {
				System.out.println("user1 == user2");
			} else  {
				System.out.println("user1 != user2");
			}
		}

		User user3 = user2;

		////x.equals(y) == //y.equals(x)  !ВАЖНО
		System.out.println(user3.equals(user2));
		System.out.println(user3.hashCode());
		System.out.println(user1.getClass());

		System.out.println(user1.toString());

		//// пример работы фабричного класса
		new UserFactory()
				.sigIn("some@mail.ru")
				.sendMessage("Hello")
				.deactivate()
				.sendMessage("how are you?")
				.activate()
				.signOut();
    }
}
