
#this file is to practice different types of time complexities

#say we are creating a function to find the length of an array

def len_linear(array):
  #this function takes in an array and traverses through each possible item to figure out the length
  len = 0
  for i in array:
    len += 1
  return len
def len_constant(array):
  #this function takes in an array and finds the last index, then adds one to it to find overall length, allowing us to avoid traversing it
  len = 0
  if array = "":
    return len
  else:
    len = array.rindex(array[-1]) +1
  return len
