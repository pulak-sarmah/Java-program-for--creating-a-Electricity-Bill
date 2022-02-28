# Java program for  creating a Electricity Bill

### QUESTION


Develop a Java application to generate Electricity bill. Create a class named ConnectionData with the following members:

Data Members:

Consumer no.   (int type)
Consumer name, (string type)
Previous month reading, (double type)
Current month reading, (double type )
Connection type (i.e domestic or commercial) (string type)

Function members:

void readData() -> to read the connection data from the keyboard
double calcBill() -> to calculate the electric bill based on the tariff rules given below.
Void display()-> to display the bill along with connection data.

Compute the bill amount using the following tariff.

If the type of the connection is domestic, calculate the amount to be paid as follows:
First 100 units - Rs. 1 per unit
101-200 units - Rs. 2.50 per unit
201 -500 units - Rs. 4 per unit
> 501 units - Rs. 6 per unit
If the type of the connection is commercial, calculate the amount to be paid as follows:
First 100 units - Rs. 2 per unit
101-200 units - Rs. 4.50 per unit
201 -500 units - Rs. 6 per unit
> 501 units - Rs. 7 per unit

Now design a class called CalcEBill containing the main() method. From the main method use the above class.

 
