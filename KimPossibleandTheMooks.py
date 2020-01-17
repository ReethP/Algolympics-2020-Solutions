cases = int(input())
for i in range(0,cases):
	iterations = int(input())
	binaryNumberList = []
	for k in range(0,iterations):
		userInput = input()
		if(userInput == "MOOK"):
			binaryNumberList.insert(0,"1")
		else:
			binaryNumberList.insert(0,"0")
	binaryNumber = "".join(binaryNumberList)
	print(int(binaryNumber,2))