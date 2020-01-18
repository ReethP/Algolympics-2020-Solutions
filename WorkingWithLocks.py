k = int(input())
l = int(input())

locks = [[2], [1,3], [2,4], [3,5], [4]]

if l in locks[k-1]:
	print("GOOD LUCK AGENT P")
else:
	print("CURSE YOU")