public class GenericStack {
  private Node top;

  public GenericStack() {
    top = null;
  }

  public boolean isEmpty() {
    retrun (top == null)
  }

  public void push(Object newItem) {
    top = new Node(newItem, top);
  }

  public Object pop() {
    if (isEmpty()) {
      System.out.println("Trying to pop when stack is empty!");
    } else {
      Node temp = top;
      top = top.next;
      retrun temp.info;
    }
  }






  public Object info;
  public GenericStack next;

  //constructors
  GenericStack(){
  }
  GenericStack(Object newInfo) {
    info = newInfo;
  }
  GenericStack(Object newInfo, GenericStack newNext) {
    info = newInfo;
    next = newNext;
  }
}