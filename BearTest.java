import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;

public class BearTest{
  Bear bear;
  Salmon salmon;
  Human human;
  Chicken chicken;

  @Before 
  public void before() {
    bear = new Bear("Baloo");
    salmon = new Salmon(); 
    human = new Human();
    chicken = new Chicken();
  }

  @Test
  public void hasName(){
    assertEquals( "Baloo", bear.getName() ); 
  }

  @Test
  public void bellyStartsEmpty(){
    assertEquals(0, bear.foodCount());
  }

  @Test
  public void canEatSalmon(){
    bear.eat(salmon,"Monday");
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void shouldEmptyBellyAfterSleeping(){
    bear.eat(salmon,"Monday");
    bear.sleep();
    assertEquals(bear.foodCount(), 0);
  }

  @Test
  public void canEatHuman(){
    bear.eat(human,"Monday");
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canEatChicken(){
    bear.eat(chicken,"Monday");
    assertEquals(1,bear.foodCount());
  }

  @Test
  public void canTrowUp(){
    bear.eat(salmon,"Monday");
    Edible food = bear.trowUp(); //we dont't have back a salmon but an edible that doesn't have any method in it
    Salmon original = (Salmon) food; //CASTING: casting an edible into a salmon; now we have a salmon
    assertNotNull(food);
    assertEquals("swimming", original.swim());
  }

  @Test
  public void chickenCanCluck(){
    assertEquals("chicchiricchi",chicken.cluck());
  }

  @Test
  public void checkTotalNutritionValue(){
    bear.eat(salmon, "Monday");
    bear.eat(human, "Tuesday");
    bear.eat(chicken, "Wednesday");
    assertEquals(18, bear.totalNutritionVal());
  }

  @Test
  public void writeDiary(){
    bear.eat(salmon, "Monday");
    bear.eat(human, "Tuesday");
    bear.eat(chicken, "Wednesday");
    HashMap journal = bear.getValue();
    Integer expectation = 3;
    assertEquals(expectation, journal.get("Wednesday"));
  }
}






