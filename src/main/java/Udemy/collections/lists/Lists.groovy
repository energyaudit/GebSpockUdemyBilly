package Groovy.Udemy.collections.lists

def nums = [1,2,3,6,7,9,4,5,3,6,8,9]
println nums
println nums.class.name

List nums1 = [1,2,3,6,7,9,4,5,3,6,8,9]
println nums1
println nums1.class.name

List nums2= [1,2,3,6,7,9,4,5,3,6,8,9] as LinkedList
println nums2
println nums2.class.name

// add | remove | get | clear

nums.push(99)
println nums
nums.putAt(0,77)
println "put at (0,77)"+ nums
nums[0] = 78
println nums
nums + 7
println " + 7"+ nums
nums << 66
println "<<66"+nums

nums.pop()
nums.removeAt(0)
def newList = nums - 3
println "-3 will remove all 3 in list"+newList

println nums.getAt(0..3)
nums = []
println "assign to a empty list will cear the list"+nums
// flatten
nums << [3,4,5]
nums << [1,2]
println nums
println "fattern"+nums.flatten()

// equals
def myNumbers = [1,2,3]
def myNumbers2 = [1,2,3]
println myNumbers.equals(myNumbers2)

// findAll
println nums.findAll { it == 4 }
println nums.flatten().findAll { it < 5 }

// getAt(Range)
nums << 66
nums << 67
println nums
nums=nums.flatten()
println nums.size()+"num size"
println nums.getAt(0..5)

// reverse list
println nums.reverse()

// unique
println nums.unique()

// Java Collections List(LinkedList) (Set,SortedSet)
def evens = [10,2,8,4,24,14,2] as Set
println evens
println evens.class.name

def evens1 = [10,2,8,4,24,14,2,6] as SortedSet
println evens1
println evens1.class.name