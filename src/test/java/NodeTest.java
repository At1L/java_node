import org.example.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {
    @Test
    void createNodeTest(){
        Node node = new Node("a");
        assertNotNull(node, "Node not created");
        assertEquals("a", node.getName());
    }

    @Test
    void insertTest(){
        Node node = new Node("a");
        node.insert("b");
        assertEquals(1, node.getChildrenSize());
    }

    @Test
    void findTest(){
        Node node = new Node("a");
        node.insert("b");
        assertEquals("b", node.find("b").getName());
    }

}
