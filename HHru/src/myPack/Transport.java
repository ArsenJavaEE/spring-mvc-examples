package myPack;

public class Transport {
	String name;
	String type;
	String color;
	int enginePower;
	int maxSpeed;
	int numberOfWheels;

	public void move() {
		System.out.println("Название трансорта: " + name);
		System.out.println("Тип транспорта: " + type);
		System.out.println("Максимальная скорость: " + maxSpeed);

	};
}
