cases = int(input())
outputs = []
array2D = []
for i in range(0, cases):
    inputs = input().split()
    rows = int(inputs[0]) - 1
    cols = int(inputs[1])
    for j in range(0, rows):
        array2D.append(input())
    targets = 0
    for j in range(0, cols):
        for k in range(rows-1, -1, -1):
            if(array2D[k][j] == '#'):
                break
            elif(array2D[k][j] == 'X'):
                targets += 1
            else:
                continue
    outputs.append(targets)
    array2D.clear()
if(cases == 0):
    print(0)
else:
    for i in range(0, cases):
        print(outputs[i])