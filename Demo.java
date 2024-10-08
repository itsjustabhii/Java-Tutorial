class Computer {
    public void playMusic() {
        System.out.println("Music playing...");
    }

    public String getAPen(int cost) {
        return "Pen";
    }
}

public class Demo {
    public static void main(String a[]) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getAPen(10);
        System.out.println(str);
    }
}