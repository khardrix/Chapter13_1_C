/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                   Chapter 13: Problem 1, Part c                                          *****
 *****__________________________________________________________________________________________________________*****
 *****     1.  Implement the Edible interface on page 510 and then the code in listing 13.7 on pages 510-511.   *****
 *****                          Run the TestEdible program and examine the output.                              *****
 *****                                       Next, do the following.                                            *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                  c.  Remove the method howToEat from Apple and compile your code.                        *****
 *****                                                                                                          *****
 *****__________________________________________________________________________________________________________*****
 *****                                            Questions:                                                    *****
 *****                                       What happens and why?                                              *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                                            Answers:                                                      *****
 *****                                         What happens:                                                    *****
 *****                          It does not compile. We get the syntax error:                                   *****
 *****  Error:(164, 1) java: Apple is not abstract and does not override abstract method howToEat() in Edible   *****
 *****                                                                                                          *****
 *****                                              Why:                                                        *****
 *****     The class Apple extends Fruit. Fruit is an abstract class that implements the Edible interface,      *****
 *****   The Edible interface includes the abstract method howToEat(), so any class that implements the Edible  *****
 *****             interface and any class that extends a class that implements the Edible interface,           *****
 *****          must actually implement the howToEat() method. Otherwise, the program will not compile.         *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                               Course Provided Solution (13_1_C):                                         *****
 *****                                       We get the error:                                                  *****
 *****         error: Apple is not abstract and does not override abstract method howToEat() in Edible          *****
 *****             because to implement a Fruit subclass, we must implement all abstract methods,               *****
 *****                                 which in this case is howToEat.                                          *****
 *****       We can avoid this error if we either implement this in Apple or make Apple an abstract class.      *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

public class Chapter13_1_C {

    public static void main(String[] args) {

        Object[] objects = {new Tiger(), new Chicken(), new Apple()};

        for(int i = 0; i < objects.length; i++){
            if(objects[i] instanceof Edible)
                System.out.println(((Edible)objects[i]).howToEat());

            if(objects[i] instanceof Animal)
                System.out.println(((Animal)objects[i]).sound());
        }
    }
}
