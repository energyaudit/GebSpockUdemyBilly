package Groovy.Udemy.collections.maps

def map = [:]
println map
println map.getClass().getName()

def person = [first:"Dan",last:"Vega",email:"danvega@gmail.com"]
println person
println person.first

person.twitter = "@therealdanvega"
println person

def twitter1=[username:"@therealdanvega",'email address':"danvega@gmail.com"]
println "normally key no need quote but if there is space between word ,must add single quote"+twitter1

def emailKey = "EmailAddress"
def twitter = [username:"@therealdanvega",(emailKey):"danvega@gmail.com"]
println "if variable as key ,it must quoted by ()"+twitter1
println person.size()
println person.sort()

// looping through person
for( entry in person ) {
    println entry
}

for( key in person.keySet() ) {
    println "$key:${person[key]}"
}

// each | eachWithIndex