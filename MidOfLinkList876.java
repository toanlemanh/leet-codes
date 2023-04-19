package leetcode;

import java.util.ArrayList;

public class MidOfLinkList876 {
    public ListNode middleNode(ListNode head){
//     Using an array to store
        ArrayList<ListNode> array = new ArrayList<ListNode>();

        while ( head != null ){
            array.add( head );
            head = head.next;
        }

        return array.get( array.size()/2 );



//      Using additional pointer to keep track the list , each middle pointer rise 1 every 2-step of end pointer

// ex:   1 --> middle is 1 ,end is null
//       1 2 --> middle is still 1, end is null
//       1 2 3 --> middle is up to 2, end is null
//       1 2 3 4 --> middle is still 2, end is null
//        => The pattern is end gets 2 steps at once then middle get a step

    ListNode end = head; ListNode middle = head;

    while ( end != null && end.next != null ){
         middle = middle.next;
         end = end.next.next;
    }

    return middle;
    }

}
