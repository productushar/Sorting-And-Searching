#This python program performs bubble sort on any list provided as a parameter to the function

def Bubblesort(lst):
  for i in range(len(lst)-1):
    for j in range(len(lst)-i-1):
      if lst[j]>lst[j+1]:
        temp=lst[j]
        lst[j]=lst[j+1]
        lst[j+1]=temp
  print(lst)
