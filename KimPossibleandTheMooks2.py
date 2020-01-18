def rightMost0(binNumberList,last):
	for i in range(last,-1,-1):
		if(binaryNumberList[i] == "0"):
			return i

def leftMost1(binNumberList,first,iterations):
	for i in range(first,iterations-1):
		if(binaryNumberList[i] == "1"):
			return i

userInput = list(map(int,input().split()))
iterations = userInput[0]
swaps = userInput[1]
binaryNumberList = []

for k in range(0,iterations):
	userInput = input()
	if(userInput == "MOOK"):
		binaryNumberList.insert(0,"1")
	else:
		binaryNumberList.insert(0,"0")

start0 = iterations-1
start1 = 0
while(swaps!=0):
	rightmost0 = rightMost0(binaryNumberList,start0)
	leftmost1 = leftMost1(binaryNumberList,start1,iterations)
	start0 = rightmost0
	start1 = leftmost1
	if(rightmost0 > leftmost1):
		binaryNumberList[rightmost0] = "1"
		binaryNumberList[leftmost1] = "0"
		swaps-=1
	else:
		break

binaryNumber = "".join(binaryNumberList)
print(int(binaryNumber,2))