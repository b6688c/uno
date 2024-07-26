package cc.allio.uno.core.datastructure.tree;

/**
 * 优先访问枝干
 *
 * @author j.x
 * @date 2023/4/27 09:13
 * @since 1.1.4
 */
public class NoneTraversalMode implements TraversalMethod {

    @Override
    public <T extends TraversalElement<T>> void doTraversal(T e, Visitor<T> visitor) {
        e.doAccept(visitor);
        e.getChildren().forEach(c -> c.accept(visitor, Traversal.NONE));
    }

    @Override
    public String getMode() {
        return Traversal.NONE.getValue();
    }
}
