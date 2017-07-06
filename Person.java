package com.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class Person {

public static void main(String[] args) {
List<Details> orderedlist = getDetails();

System.out.println("\nSorted by Age :");
orderedlist.sort((Details D1, Details D2)->D1.getAge()-D2.getAge());
orderedlist.forEach((emp)->System.out.println(emp));


System.out.println("\nSorted by LastName :");
orderedlist.sort((Details D1, Details D2)->D1.getLastname().compareTo(D2.getLastname()));
orderedlist.forEach((emp)->System.out.println(emp));


System.out.println("\nSorted by FirstName :");
orderedlist.sort((Details D1, Details D2)->D1.getFirstname().compareTo(D2.getFirstname()));
orderedlist.forEach((emp)->System.out.println(emp));


System.out.println("\nSorted by Salary :");
orderedlist.sort((Details D1, Details D2)->D1.getSalary()-D2.getSalary());
orderedlist.forEach((emp)->System.out.println(emp));

}


private static List<Details> getDetails() {

List<Details> result = new ArrayList<Details>();

result.add(new Details("Andy","Zool",6000,40));
result.add(new Details("Brad","Mike",15000,52));
result.add(new Details("Cathie","Brown",6500,29));
result.add(new Details("Peter","Scott",5000,25));
return result;

}

}
