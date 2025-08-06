package BuildingMethodWhenTheWrittenTypeIsInt;

public interface A {
public static void main(String[] args) {// If you make a variable final the re initialization is not allowed
	final int x = 10;
	x = 10;// Error
}
}
