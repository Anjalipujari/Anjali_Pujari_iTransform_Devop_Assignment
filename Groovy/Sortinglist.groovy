package Assignment

class Course{
	
	 String name
	 int days
	
	def getvalues( String n, int i)
	{
		def name = n
		def days = i
		def len = [name : n, days : i]
	 
	}
	

	static void main(args)
	{
		Course first = new Course()
		Course second = new Course()
		Course third = new Course()
		Course fourth = new Course()
		
		def f =[first.getvalues("Anjali", 10),second.getvalues("Anagha", 20),
			third.getvalues("Payal", 20),fourth.getvalues("Sushrut", 25)]
		
		def sorted = f.sort({a, b -> b["days"] <=> a["days"] ?: a["name"] <=> b["name"]})
		sorted.each { println it}
	}
}
		
		
		
				
			
		
	
