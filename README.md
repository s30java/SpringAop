SpringAop
=========

Implementation for Spring AOP using annotations

please un comment appropriate method for call all the aspects required.

Types of Advices

1. Before Advice:- The advice which executed before a joinpoint called before advice. The before advice does not have the ability to interrupt the execution flow proceeding at the joint point unless it throws an exception.

2. After return Advice:- The advice which executed after a jointpoint completed normally, called after advice. For example a method returns without throwing an exception.

3. Around Advice:- Around advice is responsible for choosing whether to proceed to the joinpoint or to shortcut executing by returning their own return value or throwing an exception. It performs the custom behavior before and after method invocation by surrounding a joinpoint.

4. After Throwing Advice:- This advice is executed when a method throws an exception.

5. After (finally) Advice:- The advice is executed when program exits the joinpoints normally or by throwing an exception.


==========================================

Join point

A join point is a point used in Spring AOP framework to represent a method execution. It always point during execution of program or methods or exceptions. It is actually beginning of methods, AOP intercepts at this point to do some other stuff. i.e. beginning of methods doThis(), doExtra(), test(), somethingElse() etc.
Pointcut

In AOP a pointcut is a set of many joinpoints where an advice can execute. When the program execution is reaches to the one of joint point described in pointcut, a chunk of code (known as Advice) associated with that pointcut executed. This provides the extra flexibility to the programmer to merge an additional code, which is executed in already defined point. It is a key concept of AOP, which distinguishes it from older technology offering interception.
Spring supports union, and intersection operation on pointcuts. Union means the method that either pointcut matches. It is more useful pointcut. And Intersection means the method that both pointcuts match. In the above advices around advice is most general type of advice used in AOP.
