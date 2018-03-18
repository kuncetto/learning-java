public class Screen {
    public static void main(String[] args) {

        Sprite cat = new Sprite();
        cat.name = "Scratch";

        cat.goTo(0,0); // x: 0 y: 0
        cat.setSize(100); // size: 100
        cat.show(); // visible: true
        cat.print();

        cat.move(100); // x: 100 y: 0
        cat.print();

        cat.say("Hello, world!");
        cat.playSound("Meow!");

        cat.hide(); // visible: false
        cat.goTo(-100, 75); // x: -100 y: 75
        cat.changeSizeBy(20); // size: 120
        cat.print();

    }
}
