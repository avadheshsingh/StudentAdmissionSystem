# StudentAdmissionSystem
This is a portal for automation of student admission system.

SOFTWARE REQUIRED :-
                     1):- Netbeans 8.0 for windows
                     2):-jdk -8 64 bit for windows
                     3):-Oracle 10 g for windows
How to run student Admission System??
•	Open Netbeans.exe file and install it.
•	Install oracle.exe file.
•	Now create  a new user with  in oracle database
                       Name = "sem_v" 
                       Password = "avadhesh"
•	Now create four tables by running sql command given in *.sql file.
                     COURSES =COURSES.sql
                     IMG= IMG.sql
                     PAYMENT=PAYMENT.sql
                     STUDENT DETAILS= my.sql
•	Now open the services tab and choose databases and right click jdbc:oracle:thin:@localhost:1521:XE [system on SYSTEM] and select connect.
•	After it test the connection .
If ok;
     Import the web project  "StudentAdmissionSystem ". 
•	Run the Project.
