import java.util.*;

public class Bear{
  
  private String name;
  private ArrayList<Salmon> bellySalmon; //it is a reference class, it is like the array in Ruby
  private ArrayList<Human> bellyHuman; 
  public Bear(String name){
    this.name = name;
    //this.belly = new Salmon[5];
    this.bellySalmon = new ArrayList<Salmon>(); //generics
    this.bellyHuman = new ArrayList<Human>(); //generics
  }

  public String getName(){
    return this.name;
  }

  public int foodCount(){
    // int count = 0;
    // for(Salmon salmon : belly){
    //   if(salmon != null){
    //     count++;
    //   }
    // }
    // return count;
    return bellySalmon.size() + bellyHuman.size();
  }

  public void eat(Salmon salmon){
   //if(bellyFull()) return;
   // int foodCount = foodCount();
   // belly[foodCount] = salmon;
    bellySalmon.add(salmon);
 }

//OVERLOADING : same method with different parameter but has to return the same type

  public void eat(Human human){
    bellyHuman.add(human);
  }

 // public boolean bellyFull(){
 //   return foodCount() == belly.length; //belly.length is a property of belly it is not a method because belly was an array before not an array list so it wasn't a class
 // }

 public void sleep(){
   // for(int i = 0; i < belly.length; i++){
   //   belly[i] = null;
   // }
  bellySalmon.clear();
  bellyHuman.clear();
 }

}
