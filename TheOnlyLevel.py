iterations = int(input())
for k in range(0,iterations):
	pair = input().split()
	integer = int(pair[0])
	base = int(pair[1])
	numberlist = []
	digitalroots = []
	for i in range(0,base):
		numberlist.append(i)

	digitalroots.append(0)
	for i in range(1,base):
		digitalroots.append(1+(((integer*i)-1)%(base-1)))

	digitalroots = sorted(digitalroots)

	print(digitalroots)
	print(numberlist)

	if(numberlist!=digitalroots):
		print("NOT COOL")
	else:
		print("COOL")