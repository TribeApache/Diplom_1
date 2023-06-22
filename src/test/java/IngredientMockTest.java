import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientMockTest {

    @Test
    public void testGetPrice() {
        Ingredient ingredient = Mockito.mock(Ingredient.class);
        Mockito.when(ingredient.getPrice()).thenReturn(2.5f);

        float expectedPrice = 2.5f;
        float actualPrice = ingredient.getPrice();

        Assert.assertEquals(expectedPrice, actualPrice, 0.01f);
    }

    @Test
    public void testGetName() {
        Ingredient ingredient = Mockito.mock(Ingredient.class);
        Mockito.when(ingredient.getName()).thenReturn("Tomato Sauce");

        String expectedName = "Tomato Sauce";
        String actualName = ingredient.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetType() {
        Ingredient ingredient = Mockito.mock(Ingredient.class);
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.SAUCE);

        IngredientType expectedType = IngredientType.SAUCE;
        IngredientType actualType = ingredient.getType();

        Assert.assertEquals(expectedType, actualType);
    }
}

