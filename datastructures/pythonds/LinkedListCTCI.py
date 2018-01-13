class Node:
	"""Node Class"""
	def __init__(self, data):
		self.data = data
		self.next = None
	def append(self, data):
		end_node = Node(data)
		curr = self
		while curr.next != None:
			curr = curr.next
		curr.next = end_node
	def print(self):
		rv = ""
		while self != None:
			rv += str(self.data) + "-"
			self = self.next
		print(rv)
	def delete(self, data):
		head = self
		curr = self
		while curr.next != None:
			if curr.next.data == data:
				curr.next = curr.next.next
				return head
			curr = curr.next
		return head

	def remove_duplicates(self):
		memo = {}
		head = self
		curr = self

		while curr != None and curr.next != None:
			if curr.next.data in memo.keys():
				while curr.next != None and curr.next.data in memo.keys():
					curr.next = curr.next.next
			else:
				memo[curr.next.data] = 1
			curr = curr.next
		return head

def test():
	n = Node(1)
	n.append(10)
	n.append(5)
	n.append(10)
	n.append(5)
	n.print()
	n.remove_duplicates()
	n.print()