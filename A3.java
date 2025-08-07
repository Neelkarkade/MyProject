package LamdaExpresion;
@FunctionalInterface
public interface A3 {
public int test1();
default void test2() {
	System.out.println(2);
}
}
