package Udemy.closures

def c = { }

println c.class.name
println c instanceof Closure

Closure c1 = { }

println c1.class.name
println c1 instanceof Closure

def sayHello = { name ->
    println "Hello, $name"
}

sayHello('Dan')

List nums = [1,4,7,4,30,2]
println "each take closure as parameter,and in closure function/method it do sth each time"
nums.each ({ println it
})
nums.each { num ->
    println num
}

// closures are objects & last param

def timesTen(num,closure) {
    closure(num * 10)
}

timesTen(10, { println it })
timesTen(2) { 
    println it }

10.times { 
    println it
}

import java.util.Random

Random rand = new Random()

3.times {
    println rand.nextInt()
}