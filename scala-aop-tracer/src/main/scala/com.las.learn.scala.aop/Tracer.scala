package com.las.learn.scala.aop

import org.aspectj.lang.annotation._

/** @author: liansheng
  * @Description:
  */

@Aspect
class Tracer {

  @Before("execution(* com.las.learn.scala.aop.Sample.printSample(..))")
  def printSample() {
    println("Printing sample:")
  }
}
