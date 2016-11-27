package pracaDomowa1;


import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void shouldCorrectlyCalculateField() {
        //given
        Rectangle rectangle = new Rectangle(1,1);
        int expectedField = 1;
        //when
        int resultField = rectangle.field();
        //then
        Assertions.assertThat(resultField).isEqualTo(expectedField);
    }

    @Test
    public void shouldCorrectlyCalculatePerimeter() {
        //given
        Rectangle rectangle = new Rectangle(1, 1);
        int expectedPerimeter = 4;
        //when
        int resultPerimeter = rectangle.perimeter();
        //then
        Assertions.assertThat(resultPerimeter).isEqualTo(expectedPerimeter);
    }
}
