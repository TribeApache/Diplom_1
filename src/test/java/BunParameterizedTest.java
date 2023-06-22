import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

@RunWith(Parameterized.class)
public class BunParameterizedTest {

    private final String name;
    private final float price;

    public BunParameterizedTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] getBunParameters() {
        return new Object[][]{
                {"", 50},
                {"Булочка с чернилами каракатицы", Float.MIN_VALUE},
                {"Вселенская булка Таноса",  -Float.MAX_VALUE},
                {String.format("%25c", ' ').replaceAll(" ", "\\" + "Э")
                        + "то " + String.format("%25c", ' ').replaceAll(" ", "\\" + "о")
                        + "чень дл" + String.format("%25c", ' ').replaceAll(" ", "\\" + "и")
                        + "нная стр" + String.format("%25c", ' ').replaceAll(" ", "\\" + "о")
                        + "ка", Float.MAX_VALUE},
                {"@$%&*()^%$", 0},
                {null, -0.01f}
        };
    }

    @Test
    public void getNameBunParameterizedTest() {
        Bun bun = new Bun(name, price);
        Assert.assertEquals(name, bun.getName());
    }

    @Test
    public void getPriceBunParameterizedTest() {
        Bun bun = new Bun(name, price);
        Assert.assertEquals(price, bun.getPrice(), 0);
    }
}
