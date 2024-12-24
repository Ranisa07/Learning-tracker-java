# Java Naming Conventions

## Table of Contents
 - [Class Names](#class-names)
 - [Interface Names](#interface-names)
 - [Method Names](#method-names)
 - [Variable Names](#variable-names)
 - [Constant Names](#constant-names)
 - [Packaege Names](#package-names)
 - [Enum Names](#enum-names)
 - [Annotation Names](#annotation-names)

 ---

 ## Class Names
 - Use *PascalCase* for class names.
 - Class names should be nouns representing objects or concepts.
 - Example:
   
   public class UserAccount{ }

## Interface Names
- Use *PascalCase* for interface names.
- Interface names often represent capabilities and are prefixed with adjectives like Readable, Sortable, etc.
- Example:
  
 public interface Comparable{ }

 ## Method Names
 - Use *camleCase* for method names.
 - Method names should be verbs or verb phrases describing the action performed.
 - Example:

    public void cslculateTotal(){
   }

 ## Variable Names
 - Use *camelCase* for variable names.
 - Variable names should be descriptive and represnt their purpose or value.
 - Example:
   
   int customerAge=25;

## Constant Names
- Use *UPPER_CASE* with underscores for constants.
- Constants should be declared using the static final modifier.
- Example:
  
   public static final double PI=3.141;

## Package Names
- Use *lowercase* letters for package names.
- Avoid using uderscores or capital letters.
- Package names are typically in reverse domain name notation.
- Example:
  
   package com.example.projectname;

 ## Enum Names
 - Use *PascalCase* for enum names.
 - Enum constants are in *UPPER_CASE*.
 - Example:
   
    public enum Day{
    MONDAY,TUESDAY,WEDNESDAY
    }

## Annotation Names
 - Use *PascalCase* for annotation names.
 - Annotations should describe metadata or behaviors.
 - Examole:
   
    public @interface Override{ }

  ---

 # Example Source Code

//Variable naming

String userName="RanisaRout";
final MAX_CONNECTIONS=2;

**Example**
```java
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
'''
```
