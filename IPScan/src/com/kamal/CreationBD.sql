use master;
go
CREATE DATABASE Reseau
ON  PRIMARY ( 
  NAME = N'ProjetStage_Data', 

  FILENAME = N'D:\ProjetStage_Data.mdf' , 
  SIZE = 10MB , 
  MAXSIZE = 50MB , 
  FILEGROWTH = 10%)
LOG ON ( 
  NAME = N'ProjetStage_log', 
  FILENAME = N'D:\ProjetStage_log.ldf' , 
  SIZE = 5MB , 
  MAXSIZE = UNLIMITED, 
  FILEGROWTH = 10%);
go