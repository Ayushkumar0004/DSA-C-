import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
};
public class RecursionLL 
{
    public Node CreateLL(int arr[], int index, int size)
    {
        if(index == size)
        {
            return null;
        }
        Node temp;
        temp = new Node(arr[index]);
        temp.next = CreateLL(arr, index+1, size);
        return temp;
    }
    public static void main(String[] args) 
    {    
        int arr[] = {1, 2, 3, 4, 5};
        RecursionLL o1 = new RecursionLL();
        Node head = o1.CreateLL(arr, 0, arr.length);
        display(head);
    }
    public static void display(Node head)
    {
        while(head  != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }
}

