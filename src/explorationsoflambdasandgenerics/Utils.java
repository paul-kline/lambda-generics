/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorationsoflambdasandgenerics;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Paul
 */
public class Utils {

    /*
    1. write a static method like the one we did in class. call it "repeat" it
    should take 2 parameters, (1) an instance of any type and (2) an int of the
    number of times to repeat said element in an arraylist.
     */
   

    /*
    2. Write a function called indexedOutput that takes an ArrayList of any type
    and RETURNS a two line string where the first line is the index of each
    element.
     */
   

    /*
    3. A few steps for this one. Similar to the modify integer functionality we
    did in class.
    (1) create a single method interface called IntegerModifier with a method
    called modify. I think you know what the types should be.
    (2) Write a function called modifyIntegerXTimes. This function should return
    the integer result and take 3 arguments in this order: the modifying function,
    the number of times to apply it, the starting integer to modify.
    (3) Write a function called modifyIntegerXTimesTester with at least 5 asserts
    an assert statement has the form:
       assert <booleanExp> : "text describing what failed"
    It will throw a runtime error if the expression evaluates to false AND YOU
    HAVE ASSERTIONS TURNED ON. SEE HERE:
    (https://wiki.openoffice.org/wiki/NetBeans_Tips_and_Tricks#Assertions)
    Here is one you can use:
         assert modifyIntegerXTimes(x -> x + 1, 5, -1) == 4 : "+1 modify test failed";
     */
  

    /*
    4. Write a function called checkInvolutence
    (see https://en.wikipedia.org/wiki/Involution_(mathematics))
    In short, an involutive function is its own inverse. aka:
    f(f(x)) == x.
    The simplest example is probably the boolean not function. Applying it twice,
    you always end up with what you started with.
    not(not(x)) == x.

    Now, it's not possible (in the general case) to check all possible inputs,
    but we want to be able to check a lot of them. Let me help illustrate the
    issue. We might have a function like: f(x)=x*0. Well if we test it on zero,
    aka x=0, it looks involutive: 0 == (0*0) * 0. However, when we test it on
    literally anything else, it's not the case. For example, x = 1:
       1 != (1*0) * 0.

    So we want to check many inputs, not just one. But how can we check many
    inputs if we want this involutive checker to have a chance at giving correct
    answers? solution: checkInvolutence will take 2 arguements: (1) The function
    which is being checked (you'll need to create a generic interface for this.
    Hint: are we interested in functions that return a different type than they
    take in?) and (2) a function that generates random instances of said type.

    Here's an example call to checkInvolutence for Integers (note your checkInvolutence
    function must work for any typed function, not just Integers or just numbers!
      checkInvolutence((Integer x) -> x + 0, () -> new Random().nextInt());
    //equals true

    Hint 2: You will need to create an interface for each arguement in
    checkInvolutence.
     */
   

  

}
