# ApplesProject
In this project my teacher asked for specific criteria in order to have a user type in information to determine how much apples and a teacher's "take home choice" from a field trip costs. We are assuming that the input is valid and are not doing any type of data validation.
Programming Project 1: Chapter 2, 3 and 4:
A classroom of elementary students is on a field trip to an apple orchard. All students collect apples. At
the end of the trip, the teacher wants to divide the apples evenly between the students.


The price structure is as follows:
• Between 10-50 total apples: $10
• Between 50-100 total apples $15
• Between 100-150 total apples $20
• Between 150-200 total apples $30
200 is the max number of apples (I will test with valid numbers)

At the end of the trip, the teacher can order one item for himself/herself. They can choose from Apple
Cider, Apple Cobbler or Apple Pie.
The orchard makes the pie, cider and cobbler on Sunday. They want to get rid of all of it before the end
of the week. Therefore, if the purchase is on a Monday, Tuesday, Wednesday it is full price. If the
purchase is on a Thursday or Friday it will be $2 off. If the purchase happens to be on a Saturday or
Sunday, the items are $3 off. Regular prices: Apple Pie - $10.00 Apple Cobbler - $15.00, Gallon of Apple
Cider - $8.00.
The teacher does not have to order an extra item. There is a seven percent tax added to the total
purchase.

Program Flow:
Prompt the teacher for the following:
• number of apples collected
• day of the week
• total number of students
• the teacher’s last name
• the teacher’s salutation (Ms, Mrs., Mr, etc)

Display how many apples each student will receive and how many are left over for the teacher Display
the price of the apples collected. Use the name in the prompt:
(NOTE: When the teacher enters string input for day of week, last name, salutation – allow them to
ignore upper/lower case. When you display the result it should look similar to the output shown here:
Mrs. Smith, you have 3 apples per student with 4 left over for you.

Next show a small menu of items that the teacher can order for herself/himself that shows choices and
prices (Apple Pie, Apple Cobbler, Apple Cider), the teacher buy only ONE item can answer “None” also.
Apple Pie - $10.00 Apple Cobbler - $15.00 Gallon of Apple Cider - $8.00
Prompt the teach to enter her/his choice of “extra item”.
(NOTE: the program should not ask for the teacher to enter choice 1, 2, or 3, it expect the teacher to
enter the strings “Apple Pie”, “Apple Cobbler” or “Apple Cider” - You should expect correct spelling, but
should allow them to enter in all upper, all lower or any combination of upper and lower case letters.
You should also allow them to enter preceding or trailing spaces, but not more than one space between
the words, e.g. apple cider will only have one space between the two words.)

Display the price of the menu item (be sure to take out any discounts) if there is one and indicate it’s on
sale, example output:
Great Choice, Mrs. Smith - Apple Cobbler is on sale today, Thursday, for $12.00!
Display the total price of sale (apple collection charge, any additional item purchased, apply 7% sales
tax)
Your total today (collection plus teacher item) : $48.00

Requirements
Make proper use of the following:
• data types (double, int, String, etc)
• a constant
• if/else control statements
• at least one switch statement
• various String functions (equals, trim, toUpperCase, substring, etc)
Format your display dollar amounts to show only two decimal places (you may need to do some internet
research for this OR you can convert your value to string for display purposes and then use string
functions for this)

You can assume correct data entry as described. If at any time you receive invalid input you can exit
the program with System.exit(0). However, I will test with valid input only as true data validation
generally uses loops which we have not covered yet.

Critera Points Total
General Rubric guide lines
• • Comments
• • Academic integrity
• • Indentation
• • Naming conventions
• • Overall good code that
applies the concepts from the chapter
10
Program Accuracy
• • Program functions as intended by the
assignment
• • Program contains no
errors: syntax, logic, runtime
50
Program has required elements:
Make proper use of the following:
• data types (double, int, String, etc)
• a constant
• if/else control statements
• at least one switch statement
• various String functions (equals, trim, toUpperCase, substring, etc)
40
3100
