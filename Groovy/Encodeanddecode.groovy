package Assignment
def encoding()
{

//i.Create two strings, one for a username and one for a password
String username = "AnjaliP"
String password = "abc123"

//concatenate username and password
def cat = username.concat(";" + password)

println cat

//converting string to byte array
def array = cat.getBytes()
println array

//Encoding byte array to encoded string using encodebase64
encode = array.encodeBase64()
println encode

return encode
}


def decoding()
{
	def prev=encoding().toString()
	decode = prev.decodeBase64()
	String S = new String(decode)
	println S.split(";")
	
}
decoding()