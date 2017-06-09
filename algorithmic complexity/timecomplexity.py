
#this file is to practice different types of time complexities

#say we are creating a function to find the length of an array
#O(n)
def len_linear(array):
  #this function takes in an array and traverses through each possible item to figure out the length
  len = 0
  for i in array:
    len += 1
  return len
#O(1)
def len_constant(array):
  #this function takes in an array and finds the last index, then adds one to it to find overall length, allowing us to avoid traversing it
  len = 0
  if array = "":
    return len
  else:
    len = array.rindex(array[-1]) +1
  return len
# O(log(n))
def binarysearch(arr, val):
  lowindex = 0
  highindex = len(arr) - 1
  while lowindex <= highindex:
    mid = (highindex + lowindex)/2
    if arr[mid] < val:
      lowindex = mid + 1
    else if arr[mid] > highindex:
      highindex = mid -1
    else:
      return "found a match, index " + str(mid)
