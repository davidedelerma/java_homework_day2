import java.util.*;

public class Bear{
  
  private String name;
  private ArrayList<Edible> belly;
  private HashMap<String, Integer> journal; 
  public Bear(String name){
    this.name = name;
    this.belly = new ArrayList<Edible>(); //generics
    this.journal = new HashMap<String, Integer>();
  }

  public String getName(){
    return this.name;
  }

  public void setValue(HashMap<String, Integer> journal)
    {
      this.journal = journal;
    }

  public HashMap<String, Integer> getValue(){
    return this.journal;
  }

  public int foodCount(){
    return belly.size();
  }

  public void eat(Edible food, String day){
    belly.add(food);
    this.journal.put(day, foodCount());
    setValue(this.journal);
  }

  public void sleep(){
    belly.clear();
  }

  public Edible trowUp(){
    if(foodCount() > 0){
      return belly.remove(0);
    }
    return null;
  }

  public int totalNutritionVal(){
    int totNut = 0;
    for (Edible food : belly){
      totNut += food.nutritionValue();
    }
    return totNut;
  }

}

//INTERFACE: pass on a type ;I can inherit from multiples Interfaces but just from 1 Superclass
// Superclass pass on methods, properties, type
//I can have 1 Superclass but infinites interfaces
//everithying in edible can act in the same way.... polymorfism
