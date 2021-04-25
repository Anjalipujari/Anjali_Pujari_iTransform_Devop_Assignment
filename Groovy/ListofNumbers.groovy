package Assignment
//2. Create a list of numbers. Add them together. First double each number, then add them up. Compute their average.
def list= [12,14,16,13,4]
for (int i=0; i< list.size(); ++i) {
	list[i]= list[i]*2;
}
println "The double of this list would be: " + list

//Sum of doubled elements in the list

def sum= list.sum()
println "Sum of contents of list lst is "+sum

//Average of elements in the list
def count= list.size()
def avg= sum/count
println "Average of the elements of list is: " +avg
