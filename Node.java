public class Node {
  public Object info;
  public Node next;

  //constructors
  Node () {
  }
  Node(Object newInfo) {
    info = newInfo;
  }
  Node(Object newInfo, Node newNext) {
    info = newInfo;
    next = newNext;
  }
}