public class SimpleList {
    Node head;
    Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next= head;
        head = newNode;
    }
    public void addLast(int data){
    Node newNode = new Node(data);
    if(head!=null){
        Node p =head;
        while(p.next!=null) p = p.next;
        p.next=newNode;
    }
    else{
        head = newNode;
    }

    } // No tail Field
    public void addLast2(int data){
      Node newNode = new Node(data);
      if(head == null){
          head = tail = new Node(data);
      }
      else{
          tail.next = new Node(data);
          tail=tail.next;
      }
    }
    public void removeFirst(){
        Node p = head;
        head = head.next;
        p.next=null;
    }
    public String toString() {
        String v="";
        for (Node p=head; p!=null; p=p.next){
            if(v.length()>0) v+="->";
            v+=p.data; }
        return v;  }
}
