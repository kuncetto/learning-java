public class Sprite {

    // attributes

    int x;
    int y;
    String name;
    boolean visible;
    int size;

    // methods

    void move(int steps) {
        x += steps;
    }

    void goTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void say(String text) {
        System.out.println("\"" + text + "\"");
    }

    void show() {
        visible = true;
    }

    void hide() {
        visible = false;
    }

    void setSize(int size) {
        this.size = size;
    }

    void changeSizeBy(int delta) {
        this.size += delta;
    }

    void playSound(String sound) {
        System.out.println("\u266A " + sound + " \u266A");
    }

    void print() {
        System.out.println("Sprite");
        System.out.println("Name: " + name);
        System.out.println("Position x: " + x + " y: " + y);
        System.out.println("Size: " + size);
        System.out.println("Visible: " + visible);
        System.out.println();
    }
}
