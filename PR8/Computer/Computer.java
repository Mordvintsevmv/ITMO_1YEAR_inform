package Computer;


import java.util.ArrayList;
import java.util.Arrays;

public class Computer {
    private CPU cpu;
    private Bus bus;
    private RAM ram;
    private SSD disk;
    private ArrayList<Keyboard> keyboards;
    private ArrayList<Screen> screens;
    private ArrayList<Mouse> mouses;


    public Computer(CPU cpu, Bus bus, RAM ram, SSD disk, ArrayList<Keyboard> keyboards, ArrayList<Screen> screens, ArrayList<Mouse> mouses) {
        this.cpu = cpu;
        this.bus = bus;
        this.ram = ram;
        this.disk = disk;
        this.keyboards = keyboards;
        this.screens = screens;
        this.mouses = mouses;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public SSD getDisk() {
        return disk;
    }

    public void setDisk(SSD disk) {
        this.disk = disk;
    }

    public ArrayList<Keyboard> getKeyboards() {
        return keyboards;
    }

    public void setKeyboards(ArrayList<Keyboard> keyboards) {
        this.keyboards = keyboards;
    }

    public ArrayList<Screen> getScreens() {
        return screens;
    }

    public void setScreens(ArrayList<Screen> screens) {
        this.screens = screens;
    }

    public ArrayList<Mouse> getMouses() {
        return mouses;
    }

    public void setMouses(ArrayList<Mouse> mouses) {
        this.mouses = mouses;
    }

    public void print() {
        System.out.println("На данном компьютере стоит:\nRAM: ");
        this.ram.print();
        System.out.println("\nSSD: ");
        this.disk.print();
        System.out.println("\nПроцессор: ");
        this.cpu.print();
        System.out.println("\nШина: ");
        this.bus.print();
        System.out.println("Клавиатры: ");
        for (int i = 0; i < this.keyboards.size(); i++) {
            this.keyboards.get(i).print();
        }

        System.out.println("Мышки: ");
        for (int i = 0; i < this.mouses.size(); i++) {
            this.mouses.get(i).print();
        }

        System.out.println("Мониторы: ");
        for (int i = 0; i < this.screens.size(); i++) {
            this.screens.get(i).print();
        }
    }
}

