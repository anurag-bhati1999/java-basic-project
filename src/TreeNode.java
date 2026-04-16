
import java.util.*;

public class TreeNode {

    TreeNode parent = null;
    List<TreeNode> children = new ArrayList<>();

    public synchronized void addChildOnly(TreeNode child) {
        if (!this.children.contains(child)) {
            this.children.add(child);
        }
    }

    public synchronized void addParentOnly(TreeNode parent) {
        this.parent = parent;
    }

    public synchronized void setParent(TreeNode parent) {
        System.out.println("Thread " + Thread.currentThread().getName() + " is taking lock on child");
        this.addParentOnly(parent);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        parent.addChildOnly(this);
        System.out.println("Thread " + Thread.currentThread().getName() + " existing");
    }

    public synchronized void setChild(TreeNode child) {
        System.out.println("Thread " + Thread.currentThread().getName() + " is taking lock on parent");

        this.addChildOnly(child);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        child.addParentOnly(this);

        System.out.println("Thread " + Thread.currentThread().getName() + " existing");
    }

}
