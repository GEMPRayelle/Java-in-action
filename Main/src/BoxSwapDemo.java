package Main.src;

class Box<T>{
    private T ob;
    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}

abstract class Eatable{
    public abstract void eat();
}

public class BoxSwapDemo {
    public static <T extends Number> void swapBox1(Box<T> box1, Box<T> box2){
        Box<T> temp = new Box<>();
        temp.set(box1.get());
        box1.set(box2.get());
        box2.set(temp.get());
    }

    public static <T> void swapBox2(Box<T> box1, Box<T> box2){
        Box<T> temp = new Box<>();
        temp.set(box1.get());
        box1.set(box2.get());
        box2.set(temp.get());
    }
        
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.set(99);
        Box<Integer> box2 = new Box<>();
        box2.set(55);
        
        Box<String> box3 = new Box<>();
        box3.set("Hello");
        Box<String> box4 = new Box<>();
        box4.set("World");

        Box<Eatable> box5 = new Box<>();
        

        System.out.println(box1.get() + " & " + box2.get());
        swapBox1(box1, box2);
        System.out.println(box1.get() + " & " + box2.get());

        System.out.println(box3.get() + " & " + box4.get());
        swapBox2(box3, box4);
        System.out.println(box3.get() + " & " + box4.get());
    }
    
}
