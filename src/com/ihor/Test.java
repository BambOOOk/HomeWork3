package com.ihor;

public class Test {

    public static void main(String[] args) {
	// write your code here
        Person[] f;
        f = new Person[5];

        f[0] = new Student("Bill",23,"M");
        f[ 1 ] = new Teacher ( "Bob", 24, "m", "el", 2300 );
        f[2] = new CollegeStudent ( "bon",24,"g",1998,"hbhb");
        f[3] = new Person ( "vfv",25,"45" );
        f[4] = new Teacher ( "frr",54,"W","Math",40000 ) ;

        for (Person k:f) {

            System.out.println (k);

        }


    }
}
