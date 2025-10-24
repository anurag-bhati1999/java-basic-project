
public class Slot {

    int code;
    Item item;

    public Slot(int code) {
        this.code = code;
    }

    public boolean addItem(Item item) {
        if (!this.isEmpty()) {
            return false;
        }
        this.item = item;
        return true;
    }

    public void removeItem(Item item) {
        this.item = null;
    }

    public boolean isEmpty() {
        return this.item == null;
    }
}
