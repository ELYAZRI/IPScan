use Reseau
CREATE TABLE Client
(C_num int primary key,
C_ip char(10) NOT NULL,
C_nompc char(10) NOT NULL,
C_mac char(10) NOT NULL)

CREATE TABLE Serveur
(V_num int primary key,
V_ip char(10) NOT NULL,
V_nompc char(10) NOT NULL,
V_mac char(10) NOT NULL)

select * from Serveur