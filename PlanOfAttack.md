# Plan of Attack

## Issues

* There is so much to do in this problem! It is difficult to think about it all at once.
* It can be tedious to manipulate ArrayLists directly.
* We might break our code as we address edge cases since everything is so closely coupled.
* If writing to an output file fails, the work we have done for reading is void.
* It is difficult to write tests! Yes, I know they are not required for this lab... but they are super useful...
* Feedback is slow - I have to read in a file and print stuff to the screen in order to figure out what is going wrong!

## What is Our Analyzer Class Doing?

* Reading data from a CSV file, row by row
* Parsing the data and putting it into an array (or a list of arrays)
* Selecting specific "important" cells in each array
* Summing up / counting certain cells
* Writing data to an output file

Why are we doing this all in the same class? That is a massive violation of SRP!

## Strategy

### How Might We Break Up Our Program?

Raw Data -> Java Objects (Deserialization)

Java Objects -> Data We Care About

Data We Care About -> File (Serialization)

## How Might We Think About This

* It is better to solve lots of little problems rather than one big problem!
* I thought about this problem from the ground up.
* Start with a `Cheese` class and work my way up from there.
