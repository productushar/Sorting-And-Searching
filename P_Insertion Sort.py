#This python program performs insertion sort on any list provided as a parameter to the function

def Insertionsort(lst):
  for i in range(1,len(lst)):
    value=lst[i]
    j=i-1
    while j>=0 and value<lst[j]:
      lst[j+1]=lst[j]
      j=j-1
    lst[j+1]=value
  print(lst)
