// Q : https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1/?track=sp-linked-list&batchId=152

class GfG
{
    // Function to remove duplicates from the given linked list
    Node removeDuplicates(Node head)
    {
         Node curr = head;
         Node prev = head;
         HashSet<Integer> hs = new HashSet<Integer>();
         
         while(curr!=null)
         {
             while(hs.contains(curr.data))
             {
                 curr = curr.next;
                 if(curr==null)
                 {
                     prev.next = null;
                     return head;
                 }
             }
             
             hs.add(curr.data);
             if(curr!=head)
             {
                prev.next = curr;
             }
             prev = curr;
             curr = curr.next;
         }
         
         return head;
    }
}
