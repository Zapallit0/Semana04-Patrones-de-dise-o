package Ducks;

import DuckBehavior.FlyNoWay;
import DuckBehavior.Quack;
import DuckBehavior.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Squeak();
    }
    @Override
    public String Display() {
        return "Soy un pato de plastico";
    }
}
