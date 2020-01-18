# def consecutiveChecker(a,b):

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



# oneindices = []
# zeroindices = []
# swapped = 0
# for i in range(0,iterations):
# 	if(binaryNumberList[i] == "1"):
# 		oneindices.append(i)
# 		swapped+=1
# 	if(swapped >= swaps):
# 		break

# swapped = 0
# for i in range(iterations-1,-1,-1):
# 	if(binaryNumberList[i] == "0"):
# 		zeroindices.append(i)
# 		swapped+=1
# 	if(swapped >= swaps):
# 		break

for i in range(0,len(oneindices)):
	binaryNumberList[oneindices[i]] = "0"
	binaryNumberList[zeroindices[i]] = "1"


binaryNumber = "".join(binaryNumberList)
print(int(binaryNumber,2))