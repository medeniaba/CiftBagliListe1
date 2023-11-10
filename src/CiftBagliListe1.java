class Node {
	int data ; 
	Node next,prev ;
	
	Node ( int data ){
		this.data = data ; 
		next = null ; 
		prev = null ; 
				
	}
	
}
public class CiftBagliListe1 {
	

	Node head ; 
	Node tail ; 
	
	public CiftBagliListe1() {
		
		head = null ; 
	    tail = null ; 
		
	}
	
	public void BasaEkle ( Node eleman ) {
		
		if (tail == null ) {
			
			head = eleman ; 
			tail = eleman ; 
			
		}
		
		else {
			
			eleman.next = head ; 
			head.prev = eleman ; 
			head = eleman ; 
		}
		
	}
	
	public void SonaEkle ( Node eleman ) {
		if ( head == null ) {
			
			head = eleman ; 
			tail = eleman ; 
		}
		
		else {
			
			tail.next = eleman ; 
			eleman.prev = tail ; 
			tail = eleman ; 
		}
		
		
	}
	
	
	// sınav sorusu 
	
	public void ArayaEkle ( Node eleman , Node once ) {
		
		eleman.next = once.next ; 
		eleman.prev = once ; 
		once.next.prev = eleman ; 
		once.next = eleman ; 
		
		
		
	}
	
	public void BastanSil () {
		 
     
		if (head == null) {
		      tail = null ; 
		 System.out.println("liste boş ");
		 }

		   
		
		    if (head.next == null) {
		      head = null;
		      tail = null ; 
		      
		    }
		    else {

		    head = head.next;
		    head.prev = null;
		    
		    }		  }
	 
	
	
	
	
	public void SondanSil () {
	
		
		if ( head == null ) {
			
		 
		  tail  = null ; 
		  System.out.println("listede silinecek eleman kalmadı");
			
		}

		else {
			
			Node temp = head  ; 
			Node tempdenOnce = head ; 
			while ( temp.next != null ) {
				tempdenOnce = temp ; 
				temp = temp.next ; 
				
				
			}
			tempdenOnce.next = null ;
			tail = tempdenOnce ; 
			temp.prev = null ; 
			
	     
		
		}
		
		
	}
	
	
	public void ListeOrtasıSil (Node Ortaeleman) {
		
		Ortaeleman.next.prev = Ortaeleman.prev ; 
		Ortaeleman.prev.next = Ortaeleman.next ; 
		
	}
	
	void Yazdır (Node head ) {
		
		Node temp = head ; 
		
		if (head == null ) {
			
			System.out.println("liste boş ");
			
		}
		
		else {
			
			while ( temp != null  ) {
				
				System.out.print(temp.data + " --> " + " ");
				temp = temp.next ; 
			}
			
			
		}
		
	}
	
	

	public static void main(String[] args) {
		CiftBagliListe1 list = new CiftBagliListe1 ();
		
		Node elemanbir = new Node (5); 
		Node elemaniki = new Node (6);
        Node elemanuc  = new Node (7);  
	    Node elemandort = new Node(9); 
	    Node elemanbes = new Node (8);

	    list.BasaEkle(elemanbir);
		list.SonaEkle(elemaniki);
		list.SonaEkle(elemanuc);
        list.SonaEkle(elemandort);
        list.ArayaEkle(elemanbes,elemanuc);  
        list.ListeOrtasıSil(elemanuc);

       list.BastanSil();
        
     list.Yazdır(elemanbir);
    
		
	
		

	}

}
	


