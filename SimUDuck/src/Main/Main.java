package Main;

import DuckBehavior.FlyRocketPowered;
import Ducks.Duck;
import Ducks.MallardDuck;
import Ducks.ModelDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard=new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model=new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}