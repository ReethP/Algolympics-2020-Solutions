numMollies = int(input())
MollyLine = list(map(int,input().split()))
totalEi = 0
if(numMollies > 2):
	for i in range(1,numMollies-1):
		totalEi+=MollyLine[i]
print(totalEi)