class node
{
int data;
node next;
}

class LLtest
{
node head;
node curr;

	void insert(int d)
	{
	node temp=new node();
	temp.data=d;
	if (head==null)
		{
		head=temp;
		}
	else{
		curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=temp;
		}
	}

	void show()
	{
	curr=head;
	while(curr!=null)
		{
		System.out.println(curr.data);
		curr=curr.next;
		}
	}
}

class LL
{
	public static void main(String[] args)
	{
		LLtest l =new LLtest();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.show();

	}
}
