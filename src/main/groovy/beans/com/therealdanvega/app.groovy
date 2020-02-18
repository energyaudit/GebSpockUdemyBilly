package beans.com.therealdanvega

Employee emp = new Employee(first:"Dan",last: "Vega",email: "danvega@gmail.com")
println emp

Employee emp1 = new Employee()
emp1.first = "Dan"

 println emp1.first

DoubleBean db = new DoubleBean()
db.value = 100

println db.value
println db.@value