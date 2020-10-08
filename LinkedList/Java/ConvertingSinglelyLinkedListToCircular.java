// Program for converting singly linked list into circular linked list. 
class ConvertingSinglelyLinkedListToCircular 
{ 
  
/*Linked list node */
static class Node  
{ 
    int data; 
    Node next; 
}; 
  
// Function that convert  
// singly linked list into 
// circular linked list. 
static Node circular(Node head) 
{ 
    // declare a node variable  
    // start and assign head  
    // node into start node. 
    Node start = head; 
  
    // check that while head.next 
    // not equal to null then head  
    // points to next node. 
    while (head.next != null) 
        head = head.next; 
          
    // if head.next points to null  
    // then start assign to the  
    // head.next node. 
    head.next = start; 
    return start; 
} 
  
static Node push(Node head, int data) 
{ 
    // Allocate dynamic memory  
    // for newNode. 
    Node newNode = new Node(); 
  
    // Assign the data into newNode. 
    newNode.data = data; 
  
    // newNode.next assign the  
    // address of head node. 
    newNode.next = (head); 
  
    // newNode become the headNode. 
    (head) = newNode; 
      
    return head; 
} 
  
// Function that display the elements  
// of circular linked list. 
static void displayList( Node node) 
{ 
    Node start = node; 
  
    while (node.next != start) 
    { 
        System.out.print(" "+ node.data); 
        node = node.next; 
    } 
      
    // Display the last node of   
    // circular linked list. 
    System.out.print(" " + node.data); 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    // Start with empty list 
    Node head = null; 
  
    // Using push() function to  
    // convert singly linked list 
    // 17.22.13.14.15 
    head = push(head, 15); 
    head = push(head, 14); 
    head = push(head, 13); 
    head = push(head, 22); 
    head = push(head, 17); 
  
    // Call the circular_list function  
    // that converst singly linked  
    // list to circular linked list. 
    circular(head); 
  
    System.out.print("Display list: \n"); 
    displayList(head); 
} 
} 
  