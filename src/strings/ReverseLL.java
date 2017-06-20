package strings;
public class ReverseLL {
    Node start;
    ReverseLL()
    {
        start=null;
    }
    class Node
    {
        Node next;
        int data;

        Node(int newData)
        {
            next=null;
            data=newData;
        }
        public void setData(int newData)
        {
            data=newData;
        }
        public int getData()
        {
            return data;
        }
        public void setNext(Node n)
        {
            next=n;
        }
        public Node getNext()
        {
            return next;
        }

    }
    public void insert(int newData)
    {
        Node p=new Node(newData);
        if(start==null)
        {
            start=p;
        }
        else
        {
            Node temp=start;
            while(temp.getNext()!=null)
            {
                temp=temp.getNext();
            }
            temp.setNext(p);
        }
    }

    public void reverse()
    {
        Node temp=start;
        Node previous=null;
        Node previous1=null;
        while(temp.getNext()!=null)
        {
            if(temp==start)
            {
                previous=temp;
                temp=temp.getNext();
                previous.setNext(null);
            }
            else
            {
                previous1=temp;
                temp=temp.getNext();
                previous1.setNext(previous);
                previous=previous1;
            }
        }
        temp.setNext(previous);
        start=temp;
    }
    public void display() {
        int count = 0;

        if(start == null) {
            System.out.println("\n List is empty !!");
        } else {
            Node temp = start;

            while(temp.getNext() != null) {
                System.out.println("count("+count+") , node value="+temp.getData());
                count++;
                temp = temp.getNext();
            }
            System.out.println("count("+count+") , node value="+temp.getData());
        }
    }
    public static void main(String args[])
    {
        ReverseLL ll=new ReverseLL();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.insert(7);
        ll.insert(8);
        ll.display();
        System.out.println();
        ll.reverse();
        ll.display();
    }
}