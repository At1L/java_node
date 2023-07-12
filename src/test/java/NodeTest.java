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

    @Test
    void deleteByIDTest(){
        Node node = new Node("a");
        node.insert("b");
        node.deleteByID("");
        assertEquals(0, node.getChildrenSize());
    }
    @Test
    void deleteByNameTest(){
        Node node = new Node("a");
        node.insert("b");
        node.deleteByName("b");
        assertEquals(0, node.getChildrenSize());
    }
    @Test
    void deleteAllTest(){
        Node node = new Node("a");
        node.insert("b");
        node.insert("c");
        node.deleteAllChildren();
        assertEquals(0, node.getChildrenSize());
    }

    @Test
    void changeNameTest(){
        Node node = new Node("a");
        node.ChangeName("b");
        assertEquals("b", node.getName());
    }

    @Test
    void findSC(){
        Node node = new Node("a");
        node.insert("b");
        node.insert("c");
        node.find("b").insert("d");
        assertEquals("d", node.find("d").getName());
    }

}
