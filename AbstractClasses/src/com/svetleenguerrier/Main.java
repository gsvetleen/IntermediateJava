package com.svetleenguerrier;

public class Main {

    public static void main(String[] args) {
	 Dog dog = new Dog("Max");
	 dog.breathe();
	 dog.eat();

	 Parrot bird = new Parrot("Blue Parrot");
	 bird.breathe();
	 bird.eat();
	 bird.fly();
	 Penguin penguin = new Penguin("Emperor");
	 penguin.fly();
    }
}
