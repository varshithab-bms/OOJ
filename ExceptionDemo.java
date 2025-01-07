import java.util.Scanner;
class Father{
	int FatherAge;
	
	public Father(int FatherAge) throws WrongAgeException{
	if(FatherAge<=0){
	throw new WrongAgeException("Invalid age:age cannot be zero");
			}
		this.FatherAge = FatherAge;
		}
	}
class Son extends Father{
	 int SonAge;
		
	public Son(int FatherAge,int SonAge) throws WrongAgeException
	{
		super(FatherAge);
		if(SonAge<=0){
	throw new WrongAgeException("Invalid age:age cannot be zero");
			}
		this.SonAge = SonAge;
	}
	public void compute() throws WrongAgeException{
		if(this.FatherAge<=this.SonAge){
			throw new WrongAgeException("Invalid age:Father's age cannot be less than son's age");
			}
		}
	}
public class ExceptionDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("enter father's age:");
			int a = sc.nextInt();
			Father f1 = new Father(a);
			System.out.println("enter son's age:");
			int b = sc.nextInt();
			Son s1  = new Son(a,b);
			s1.compute();
			System.out.println("execution sucessfull");
			}catch(WrongAgeException e){
			System.out.println("Exception:"+e);
			}
		}
	}
