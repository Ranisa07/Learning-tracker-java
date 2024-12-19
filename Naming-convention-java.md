# Naming Convention

## General Rules
**Consistency is key**: Follow the same pattern throughout the project.
**Descriptive and concise**: Names should clearly convey their purpose.
**Case style**: Follow the appropriate case style based on the context:
  -'camelCase':For variables and methods in java.
  -'PascalCase':For Class names in java.

## Examples of Naming Conventions

### Variables
-Use camelCase for java:'userName'.

### Constants
-Use all uppercase with underscores:'MAX_CONNECTIONS'.

### Classes
-Use PascalCase:'UserAccount'.

### Functions/Methods
-Use camelCase for java:'calculateTotal()'

# Example Source Code

//Variable naming
String userName="RanisaRout";
final MAX_CONNECTIONS=2;

//Method naming
public int calculateTotal(int price, int quantity){
return price*quantity;
}

//Class naming
public class UserAccount{
private String userName;
private double balance;

public UserAccount(String userName, double balance){
this.userName=userName;
this.balance=balance;
}
public void displayBalance(){
System.out.println("User:"+userName+",Balance:$"+balance);
}
}
