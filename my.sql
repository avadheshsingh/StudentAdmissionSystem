
CREATE TABLE  "STUDENTDETAILS" 
   (	"USERID" NUMBER NOT NULL ENABLE, 
	"PASSWORD" VARCHAR2(40) NOT NULL ENABLE, 
	"FIRST_NAME" VARCHAR2(40), 
	"LAST_NAME" VARCHAR2(40), 
	"GENDER" VARCHAR2(40), 
	"DOB" VARCHAR2(40), 
	"BRANCH" VARCHAR2(40), 
	"FATHER_NAME" VARCHAR2(60), 
	"MOTHER_NAME" VARCHAR2(60), 
	"EMAIL" VARCHAR2(40), 
	"MOBILE_NO" NUMBER, 
	"PERMANENT_ADDRESS" VARCHAR2(400), 
	"TEMPORARY_ADDRESS" VARCHAR2(400), 
	"DEGREE" VARCHAR2(400), 
	"SSN" VARCHAR2(400), 
	"EXAMTYPE" VARCHAR2(400), 
	"SEM" VARCHAR2(4000), 
	"YEAR" VARCHAR2(400), 
	"RELIGION" VARCHAR2(400), 
	"CATEGORY" VARCHAR2(400), 
	 PRIMARY KEY ("USERID") ENABLE
   )
/
