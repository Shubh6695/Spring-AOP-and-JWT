package co.in.pp;

import org.springframework.stereotype.Service;

//@Service
public class BookImpl implements BookInterface
{
	
	public void printBook(String Book)
	{
		System.out.println(Book);
		
	}
	

	public void printErrorBook()
	{
		
		int x=5/0;
	}
	
}
