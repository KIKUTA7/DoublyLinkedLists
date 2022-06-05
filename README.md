Doubly linked lists consits of a chain of elements. In contrast to singly linked lists from the lecture, every element has, besides of a reference to the successor (next) additionally a reference to its predecessor (prev). The last element has null as successor, while the first has null as predecessor.

 IntDoubleListElement 2 of 2 tests passing
Realize a class IntDoubleListElement which represents a list element. Realize an appropriate constructor which initializes the attributes private info, public next and public prev.
Addendum: Argue why in this case, public-attributes are reasonable

 IntDoubleList 2 of 2 tests passing
Realize a class IntDoubleList representing a sequence of list elements. For that, it provide a reference to the first (head) and last (tail) element of the list. The list elements should not be visible from the outside!
 getFirst/LastElement 2 of 2 tests passing
Extend the class IntDoubleList by the methods public IntDoubleListElement getFirstElement() and public IntDoubleListElement getLastElement() which return the first and last list elements, respectively.
 append 2 of 2 tests passing
Extend the class IntDoubleList by a method append(int info) which adds a new list element with content info at the end of the current list.
 size 3 of 3 tests passing
Extend the class IntDoubleList by a method int size() which returns the number of elements of a list.
 get 5 of 5 tests passing
Add to the class IntDoubleList a method int get(int pos) which returns the value info of the element at position pos.
 remove 4 of 4 tests passing
Add to the class IntDoubleList a method remove(int pos) which removes the element at position pos from the current list. After removal, your data-structure should again represent a doubly linked list. Hint for get and remove: lists are used exactly when an access via indices is rarely required, since arrays are much more efficient for this kind of access.
 toString 3 of 3 tests passing
Extend the class IntDoubleList with a method public String toString() which returns the values of all elements of the list separated by a comma as a String object. Hint: Concatenation of Strings by means of + is very inefficient when (as is the case for lists) a potentially hugh number of Strings are to be concatenated. For this purpose, there is the class StringBuilder with the methods append (adds something at the currently stored sequence of characters) and toString() (turns the stored sequence of characters into a String object). Use a StringBuilder for this assignment!
 isEqual 9 of 9 tests passing
Extend the class IntDoubleListElement with a method boolean isEqual(IntDoubleListElement other) which returns true when this and other are equivalent and otherwise false. Two list elements are considered as equivalent when they contain the same values. Furthermore, add the method boolean isEqual(IntDoubleList other) to IntDoubleList. Two lists are considered as equivalent, if they contain equivalent elements in the same ordering.
 sum 3 of 3 tests passing
Extend the class IntDoubleList with a method public int sum() which returns the sum of the values of all list elements.
 copy 3 of 3 tests passing
Add to the class IntDoubleList a method public IntDoubleList copy() which returns a new object `IntDoubleList" consisting of copies of all internal list elements.
 search 3 of 3 tests passing
Extend the class IntDoubleList with a method public IntDoubleListElement[] search(int intValue) which searches within the list for elements with value intValue and returns the set of all hits as an array of IntDoubleListElement objects.
*Hint: the tests build onto each other; as long as append does not work properly, virtually all subsequent tests will fail.
