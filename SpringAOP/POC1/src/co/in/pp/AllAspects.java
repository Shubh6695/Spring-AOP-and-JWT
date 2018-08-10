package co.in.pp;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AllAspects {

@Pointcut("execution(* co.in.pp.BookImpl*.*(..))")	
public void businessMethods()
{
	
	System.out.println("PointCut :- ");
	
}

@Before("businessMethods()")
public void before()
{
	
	System.out.println("Before :- Picking up th book");
	
}

@After("businessMethods()")
public void after()
{
	
	System.out.println("After :- Done reading the book");
}

@AfterReturning("businessMethods()")
public void afterReturning()
{
	
	System.out.println("After Returning :- It was a good book");
}


@AfterThrowing("businessMethods()")
public void afterThrowing()
{
	
	System.out.println("After Throwing :- Boo! we Want our money back!");
}


@Around("businessMethods()")
public void around()
{
	
	System.out.println("Around :- looking around the book");
}
	
}
