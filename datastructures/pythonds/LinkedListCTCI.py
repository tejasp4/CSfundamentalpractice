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

	def find_kth_last(self, k):
		# first get length of the linkedlist
		length = 0
		len_head = self
		while len_head != None:
			length += 1
			len_head = len_head.next
		# then find kth last element
		i = 1
		head = self
		while i < (length - k + 1):
			head = head.next
			i += 1
		return head.data

	def sum_lists(node_one, node_two, carry=0):
		head_one = node_one
		while head_one != None:
			if head_one.data + head_two.data >= 10:
				return Node((head_one.data + head_two.data) % 10 + carry) + sum_lists(head_one.next, head_two.next, head_one.data + head_two.data // 10)




def test_remove_dups():
	n = Node(1)
	n.append(10)
	n.append(5)
	n.append(10)
	n.append(5)
	n.print()
	n.remove_duplicates()
	n.print()

def test_find_kth_last():
	n = Node(1)
	n.append(10)
	n.append(5)
	n.append(10)
	n.append(5)
	n.print()
	print(n.find_kth_last(2))


