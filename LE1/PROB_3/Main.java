/*********https://www.onlinegdb.com/#_editor_1208127511*********************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//for the 1st case 

    public class Main
{
	public static void main(String[] args) {
		Mother m=new Mother();
		m.show();
		Child ch=new Child();
		ch.show();
		Mother m1=new Mother();
		m1.show();
	}
}

// result                 this generate error when one function is static and the other one is not
//this is mother show 
//this is Child show 
//this is mother show 