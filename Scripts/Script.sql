DROP DATABASE IF EXISTS ncs_erp_02;
CREATE DATABASE ncs_erp_02;
USE ncs_erp_02;

-- CRATE TABLE --
CREATE TABLE IF NOT EXISTS title(	
	tcode    INT(11)     NOT NULL,
	tname    VARCHAR(10),
	PRIMARY KEY (tcode)
)
	
CREATE TABLE IF NOT EXISTS department (
	dcode    INT(11)    NOT NULL,
	dname    CHAR(10)	NOT NULL,
	floor    INT(11),
 	PRIMARY KEY (dcode));
			
CREATE TABLE IF NOT EXISTS employee (
	eno      INT(11)     NOT NULL,
	ename    VARCHAR(20) NOT NULL,
	salary   INT(11) ,
	dno      INT(11),
	gender 	 TINYINT(1),
	joinDate DATE,
	title  	 INT(11)  ,
	PRIMARY KEY (eno),
	FOREIGN KEY (title) REFERENCES title(tcode),
	FOREIGN KEY (dno) 	REFERENCES department(dcode)
);

-- INSERT SAMPLE VALUSE --
INSERT INTO title VALUES
	(1,"사장"),
	(2,"부장"),
	(3,"과장"),
	(4,"대리"),
	(5,"사원");

INSERT INTO department VALUES
	(1, "마케팅", 10),
	(2, "개발", 9),
	(3, "인사", 6),
	(4, "총무", 7),
	(5, "경영", 4);


INSERT INTO employee VALUES
	(17001,"나사장",5000000,5,1,"2017-03-01",1),
	(17002,"나부장",4000000,1,1,"2017-03-01",2),
	(17003,"너부장",4000000,2,0,"2017-03-01",2),
	(17004,"나과장",3500000,1,1,"2017-03-01",3),
	(17005,"너과장",3500000,2,0,"2017-03-01",3),
	(17006,"나대리",3000000,1,1,"2017-03-01",4),
	(17007,"너대리",3000000,2,0,"2017-03-01",4),
	(17008,"나사원",2500000,1,1,"2017-03-01",5),
	(17009,"그사원",2000000,1,0,"2017-03-01",5),
	(17010,"너사원",2500000,2,1,"2017-03-01",5),
	(17011,"이사원",2000000,3,0,"2017-03-01",5);

	
-- TEST CRUD --
-- eno ename salary dno gender joinDate title 
	
SHOW tables;
SELECT * FROM employee;
SELECT * FROM title;
SELECT * FROM department;

SELECT eno, ename, salary, gender, joinDate, tcode, t.tcode, t.tname, d.dcode, d.dname, d.floor FROM employee e
	JOIN title t ON e.title = t.tcode
	JOIN department d ON e.dno = d.dcode;

INSERT INTO employee VALUES (17012,"TEST",0,5,1,"2017-03-01",1);

UPDATE employee SET 
	eno      = 17013,
	ename    = "TEST2",
	salary   = 999999,
	dno      = 5,
	gender 	 = 1,
	joinDate = "2017-03-01",
	title  	 = 1
WHERE eno = 17012;

DELETE FROM employee WHERE eno = 17013;  
	
