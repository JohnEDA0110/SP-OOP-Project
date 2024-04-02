SINGAPORE POLYTECHNIC


School of Electrical & Electronic Engineering


![image](https://github.com/JohnEDA0110/SP-OOP-Project/assets/102972166/e6897b84-9ff7-412e-8a39-2e893379bfbc)

 



                         		Diploma in Computer Engineering



Locat-E


John Emerich De Leon Andaya
Admin No.: 1617603
DCPE/FT/3A/21
 
1.	Objectives

The name of this project is called Locat-E.

The target users are people who plan to participate in events overseas as they may not have planned on having extra time to spend and therefore did not research on what places of attraction or foods to try in the country they are in. Some people who go overseas for events may have extra time in their hands, be it before or after the event itself. 

With Locat-E, those who have extra time can use this to check what the country they’re in has to offer. It shows local foods, landmarks and attractions in the country. Since staying a while longer in the foreign country may not be part of their original plan, they will most likely have to spend some money. Locat-E can help with that too as there is a currency conversion feature that will allow them to estimate how much they would need.


2.	Features

There are two main features to this app, Locat-E. The first feature has would be the so-called view function. This is where users of the app will be able to view what the country has in store for tourist. It will show them landmarks to visit in the country and its address. It will also provide information about the local delicacies of the country. This will allow the user to plan their remaining time in the country by knowing the places they can visit and foods to eat.

The second feature to this app is the currency conversion function. This function shows the exchange rate of their own currency to the currency of the country they are in. This will allow the user to have a rough estimate of how much they will be spending, if they are going to, while enjoying their stay in the country.
















3.	User Guide

Locat-E is an app that will provide information on foreign countries such as its landmarks, local delicacies and its currency exchange rates.

Users will have to copy the whole file to their Eclipse workspace to run the program.


i.	Main Menu

The main menu will have 2 buttons. “Countries” and “Currency Conversion”.
![image](https://github.com/JohnEDA0110/SP-OOP-Project/assets/102972166/628024aa-8d5b-406a-93b9-e88929d1fc75)

Selecting the button “Countries” will bring you to a page that will prompt you to select a country. Selecting “Currency Conversion” will bring you to a page that shows the conversion rates.


ii.	Countries

Selecting the button “Countries” will bring you to a page that will prompt you to select a country.
![image](https://github.com/JohnEDA0110/SP-OOP-Project/assets/102972166/b1b0eef8-c616-4173-8fc1-124b044396e4)

Select any country in those provided to view information about the country’s landmarks or food.

iii.	Country

After selecting a country, you will be shown the landmarks or food the country has in store for you.
(For now, let’s click “France”.)
![image](https://github.com/JohnEDA0110/SP-OOP-Project/assets/102972166/7f9b555d-45e7-4f3d-aac9-3aa5969730ca)
 
As shown, the landmarks of the country are shown along with its address and a brief description of the landmark.
There is also a button below, “Food”.
 ![image](https://github.com/JohnEDA0110/SP-OOP-Project/assets/102972166/0a4d4187-6d7c-4415-867d-e0248cf50c06)

Clicking on the “Food” button will show the local delicacies of the country as well as a brief description of the food.
iv.	Currency Conversion

Selecting “Currency Conversion” will bring you to a page that allows you to check the conversion rates of the currency.
 ![image](https://github.com/JohnEDA0110/SP-OOP-Project/assets/102972166/e6fc0d2a-7519-45b6-bcd9-0bc125b9aa55)

The default currency for both “Convert” and “to” is French Euro.
To change the currency type, simply click on the arrow and select the currency you wish to use and convert to as shown below.
 ![image](https://github.com/JohnEDA0110/SP-OOP-Project/assets/102972166/c183bca5-b9b6-4301-bac6-22ce4c3c84c7)
![image](https://github.com/JohnEDA0110/SP-OOP-Project/assets/102972166/98a68aee-19bc-4bf1-af12-a1355cda99f6)

(For now, let’s go with Singapore Dollar to Philippine Peso.)
 ![image](https://github.com/JohnEDA0110/SP-OOP-Project/assets/102972166/f19adfaa-fd3b-4a0e-a387-cf7b4968a35c)

To start, simply type any amount you want in the text box “Amount” as shown below.
 ![image](https://github.com/JohnEDA0110/SP-OOP-Project/assets/102972166/35ab8c65-da5e-4dfe-bf68-0be3aaf34928)

After placing amount, press the button “Convert!” to convert the currency to another and the results will be shown below as shown in the diagram below.
 ![image](https://github.com/JohnEDA0110/SP-OOP-Project/assets/102972166/1741130e-bada-4c4f-b4d2-ddc77c46ec27)



v.	Returning to previous page or exiting the program

To return to a previous page, you simply have to click the “X” button at the top right corner, and it will bring you to the previous page. However, clicking the “X” button when at the main page will close and terminate the program as there are no pages before the Main Menu.
4.	Source Code Class Hierarchy Diagram

There are 16 classes in my program.
•	Converter
•	ConverterTextField
•	ConvertionPage
•	Countries
•	CurrencyRates
•	France
•	FranceFood
•	Japan
•	JapanFood
•	Korea
•	KoreaFood
•	Main
•	Philippines
•	PhilippinesFood
•	Singapore
•	SingaporeFood

5.	Extras
Converter function is coded in CurrencyRates. Using an API requires payment so I had to hard code it a bit.

