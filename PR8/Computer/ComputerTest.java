package Computer;


import java.util.ArrayList;
import java.util.Arrays;

public class ComputerTest {
    public static void main(String[] args) {

        ArrayList<Keyboard> keyboards = new ArrayList<>();
        keyboards.add(new Keyboard(1543,"Цветная"));
        keyboards.add(new Keyboard(6666,"Игровая"));


        ArrayList<Screen> screens = new ArrayList<>();
        screens.add(new Screen(6909,"чёрно-белый"));
        screens.add(new Screen(999999,"плоский"));


        ArrayList<Mouse> mouses = new ArrayList<>();
        mouses.add(new Mouse(54,"с колесиком"));
        mouses.add(new Mouse(3242,"без колесика"));



        Computer comp = new Computer(
                new CPU(true,"Intel",1567),
                new Bus(true,"красивая"),
                new RAM(2048),
                new SSD(512),
                keyboards,
                screens,
                mouses
        );

        comp.getCpu().print();
        comp.getCpu().isExist();
        comp.getScreens().get(0).print();
        System.out.println();
        comp.print();

    }
}