def list=[]
println list.size()
def list1=new ArrayList<String>()
def list2=[2,3,4,5,1,1,3,4,2,6,1,3,4,5,3]
list.add("Panda")
list <<"listExp"
list.push("PushAddAtEndOnly")
println list

list.putAt(1,"putAtIndex")
println list
println list[2]
println list.get(2)
println list.getAt(0)
//list[-1]==list[list.size()+(negative value)]
println list[-1]
list.push("RemoveMe")

println "Is removing successful? :"
println list.remove("RemoveMe")
list.add("Demo")
list.add("Demoq")
list.add("DemoA")
list.remove(2)
println list
list=list-"Demoq"
println list
println list2.count(4)
println list2.count(3)
println list2.sort()
def list3=[5,6,4,[1,2],4,5,[3,4,5,6,6]]
println list3.flatten()
