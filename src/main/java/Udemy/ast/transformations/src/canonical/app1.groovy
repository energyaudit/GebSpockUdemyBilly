package Groovy.Udemy.ast.transformations.src.canonical

import groovy.transform.Canonical

@Canonical
class Person {

    String first
    String last
    String email

}
Person p1 = new Person("Dan","Vega","danvega@gmail.com")
Person p2 = new Person("Dan","Vega","danvega@gmail.com")

assert p1 == p2
println p1.toString()