public class insertNode{
	public Node head = null;
	insertNode(){
		head = null;
	}
	public static void main(String args[]){
	}

	public static void insert(Node _new){
		Node pCur = head;
		if(head == null){
			head = _new;
			head.next = head;
		}
		else if(head.data >= _new.data){
			while(pCur.next != head){
				pCur = pCur.next;
			}
			pCur.next = _new;
			_new.next = head;
			head = _new;
		}
		else{
			while(pCur.next != head){
				if(pCur.next > _new.Next){
					break;
				}
				pCur = pCur.next;
			}
			_new.next = pCur.next;
			_pCur.next = _new.next;
		}
	}
}
