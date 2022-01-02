#This Python program performs binary search on an array sorted in the ascending order

def binsearch(L,ele,low=0,high=0):
    if high==0:
        high=len(L)
    mid=(low+high)//2
    if L[mid]==ele:
        return True
    elif L[mid]>ele:
        return binsearch(L,ele,low,mid-1)
    elif L[mid]<ele:
        return binsearch(L,ele,mid+1,high)
