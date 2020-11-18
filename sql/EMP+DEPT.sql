--prompt PL/SQL Developer import file
--prompt Created on 2020年11月18日 by student
--set feedback off
--set define off
--prompt Creating DEPT...
create table DEPT
(
  deptno NUMBER(12) not null,
  dname  VARCHAR2(14),
  loc    VARCHAR2(13)
)
;
alter table DEPT
  add constraint PK_DEPT primary key (DEPTNO);

--prompt Creating EMP...
create table EMP
(
  empno    NUMBER(4) not null,
  ename    VARCHAR2(10),
  job      VARCHAR2(9),
  mgr      NUMBER(4),
  hiredate DATE,
  sal      NUMBER(7,2),
  comm     NUMBER(7,2),
  deptno   NUMBER(2)
)
;
alter table EMP
  add constraint PK_EMP primary key (EMPNO);
alter table EMP
  add constraint FK_DEPTNO foreign key (DEPTNO)
  references DEPT (DEPTNO);

--prompt Loading DEPT...
insert into DEPT (deptno, dname, loc)
values (1, '学术部1', '郑州');
insert into DEPT (deptno, dname, loc)
values (2, '学术部2', '郑州');
insert into DEPT (deptno, dname, loc)
values (88, '财务部2', '郑州颖河路');
insert into DEPT (deptno, dname, loc)
values (55, '就业部', null);
insert into DEPT (deptno, dname, loc)
values (89, '测测测测测测', '郑州');
insert into DEPT (deptno, dname, loc)
values (10, 'ACCOUNTING', 'NEW YORK');
insert into DEPT (deptno, dname, loc)
values (20, '信息部', 'DALLAS');
insert into DEPT (deptno, dname, loc)
values (30, '学术部3', 'CHICAGO');
insert into DEPT (deptno, dname, loc)
values (40, 'OPERATIONS', 'BOSTON');
insert into DEPT (deptno, dname, loc)
values (90, '财务部', null);
commit;
--prompt 10 records loaded
--prompt Loading EMP...
insert into EMP (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (9989, '测测测', null, null, null, null, 1000, 89);
insert into EMP (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (8888, 'admin123', null, null, null, null, 1000, 89);
insert into EMP (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (9990, '李四', null, null, null, null, 2000, 89);
insert into EMP (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (9991, '王五', null, null, null, null, 1000, 90);
insert into EMP (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (9988, 'sino', null, null, null, null, 3000, 90);
commit;
--prompt 5 records loaded
--set feedback on
--set define on
--prompt Done.
