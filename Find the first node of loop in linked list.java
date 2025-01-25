public static Node findFirstNode(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                slow = head;
                while(fast != slow){
                    slow = slow.next;
                    fast = fast.next;
                }
              return slow;  
            }
            
        }
        return new Node(-1);
    }
