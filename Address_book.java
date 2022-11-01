// UC1- Ability to create a Address Book Service DB
create database Address_Book_Service;

//UC2- Ability to create a Address Book Table with first and last names, address, city, state, zip, phone number and email as its attributes
create table address_book_table(
	    -> First_name varchar(50),
	    -> Last_name varchar(50),
	    -> Address varchar(255),
	    -> City varchar(50),
	    -> State varchar(100),
	    -> Zip int (10),
	    -> Phone_number int(10),
	    -> Email varchar(150)
	    -> );


//UC3- Ability to insert new Contacts to Address Book
insert into address_book_table values 
        -> ('Vikas', 'Bhandekar', 'Gokul Nagar Ganesh Colony', 'Gadchiroli', 'Maharashtra', '442605', '935915372', 'vikasbhandekar2018@gmail.com'),
        -> ('Sanket', 'Bezalwar', 'near stadium', 'Gadchiroli', 'Maharashtra', '442605', '935968042', 'sanketbezalwar777@gmail.com'),
        -> ('Nitin', 'Fulzale', 'Chamorshi', 'Chamorshi', 'Maharashtra', '442627', '935923456', 'nitinfulzale99@gmail.com');
        
        
//UC4- Ability to edit existing contact person using their name
update address_book_table set address='Gokul Nagar ward no. 16' where First_name='Vikas';


//UC5- Ability to delete a person using person's name
delete from address_book_table where First_name='Nitin';


//UC6- Ability to Retrieve Person belonging to a City or State from the Address Book
select First_name, City, State from address_book_employee;


//UC7- Ability to understand the size of address book by City and State
//(Here size indicates the count)
select count(City), count(State) from address_book_table;


//UC8- Ability to retrieve entries sorted alphabetically by Person’s name for a given city
select * from address_book_table order by First_name asc;


//UC9- Ability to identify each Address Book with name and Type. - Here the type could Family, Friends, Profession, etc
//(Alter Address Book to add name and type)



//UC10- Ability to get number of contact persons i.e. count by type



//UC11- Ability to add person to both Friend and Family










