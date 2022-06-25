# ProjectLibrary
Library with ability to perform basic CRUD operations {find book, display all, add, delete}


(1)	There will be a Book Java class with following attributes: id, title, and price.
a.	The id is five digits (integer).
b.	Check id for length: error message.
c.	Check id for data type: error message.
d.	Prompt is redisplayed if there is an error in id entry.
e.	Title must allow for multiple words.
f.	The data type for price is either float or double.
g.	Array is populated only if all above elements are correctly entered.
h.	Confirmation message is displayed.

(2) 	There will be an Inventory Java class which stores and manages a list of Book objects. An ArrayList must be created to hold the various orders.

(3) 	Inventory class will provide the following functionality:
a. Add: Prompts user for book data [five-digit id, multi word title, and price] and adds to the inventory list in array if all entries are correct. If the id does not meet the requirements, an error message will be displayed to the console, and the program will redisplay the prompt for an id. The new book is added to the ArrayList if all requirements are met.
b. Remove. Prompts user for book id, finds the id in the inventory ArrayList and removes it.  A message is displayed with specific information about the book being removed. If the book matching the id is not in the inventory, remove request will fail and an error message will be displayed to the console. The program will redisplay the prompt for a correct id.
c. Find: Prompts user for book id, finds the id in the inventory list and displays all the data for the book (id, title, and price) horizontally. If the book matching the id is not in the inventory, find request will fail and an error message will be displayed to the console. The program will redisplay the prompt for a correct id.
d.	Display: Display all the book information in the inventory list from the ArrayList for each book to the console horizontally for each entry.
