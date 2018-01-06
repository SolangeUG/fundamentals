# The Stack ADT

A **stack** is a collection of objects that are inserted and removed according to the **last-in, first-out (LIFO)** 
principle. Stacks are the simples of all data structures, yet they are also among the most important, as they are used in 
a host of different applications, and as a tool for many more sophisticated data structures and algorithms.

Formally, a stack is an abstract data type that supports the following two update methods :

|   Method      |   Description   |
|--------------:|-----------------|
| `push(e)`     |   Adds element `e` to the top of the stack. |
| `pop()`       |   Removes and returns the top element from the stack (or `null` if the stack is empty). |

Additionally, a stack supports the following accessor methods for convenience :  

|   Method      |   Description   |
|--------------:|-----------------|
| `top()`       |   Returns the top element of the stack, without removing it (or `null` if the stack is empty). |
| `size()`      |   Returns the number of elements in the stack. |
| `isEmpty()`   |   Returns a boolean indicating whether the stack is empty. |

## Examples of application

Internet web browsers store the addresses of recently visited sites on a stack. Each time a user visits a new site, that 
site is "pushed" onto the stack of addresses. The browser then allows the user to "pop" back to previously visited sites 
using the "back" button.

Text editors usually provide an "undo" mechanism that cancels recent editing operations and reverts to former states of
a document. This undo operation can be accomplished by keeping text changes in a stack.