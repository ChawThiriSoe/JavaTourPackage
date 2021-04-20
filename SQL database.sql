/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.0.45-community-nt : Database - tourpackagedb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tourpackagedb` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `tourpackagedb`;

/*Table structure for table `bookingtb` */

DROP TABLE IF EXISTS `bookingtb`;

CREATE TABLE `bookingtb` (
  `bid` int(5) NOT NULL,
  `bdate` text,
  `nofpe` int(5) default NULL,
  `amount` double default NULL,
  `cname` text,
  `pgid` int(5) default NULL,
  PRIMARY KEY  (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bookingtb` */

insert  into `bookingtb`(`bid`,`bdate`,`nofpe`,`amount`,`cname`,`pgid`) values (1,'1.3.2018',5,185000,'U Mya Hlaing',4),(2,'1.3.2019',3,108000,'U Tin Maung',8),(3,'5.3.2019',8,1520000,'Daw May Myat',3),(4,'6.3.2019',6,1110000,'Ma July Moe',15),(5,'6.3.2019',5,725000,'Mg Kyaung Hla',2),(6,'7.3.2019',1,39000,'Mg Soe Soe Aung',13),(7,'8.3.2019',6,1140000,'Daw Than Than Thu',3),(8,'10.3.2019',2,360000,'Daw Ni Ni Aung',6),(9,'10.3.2019',5,600000,'U Kyaw Kyaw Soe',5),(10,'10.3.2019',2,570000,'Daw Mya Aye Moe',1),(11,'10.3.2019',7,252000,'Na Win Thinda Soe',8),(12,'10.3.2019',4,1015000,'U Aung Aung Soe',11),(13,'10.3.2019',3,105000,'U Thein Aung Hla',7),(14,'11.3.2019',1,36000,'U Myat Khine Hla',9),(15,'12.3.2019',5,825000,'Ma Aye Yati Khine',14),(16,'22.3.2019',2,93600,'chaw thiri soe',9);

/*Table structure for table `customertb` */

DROP TABLE IF EXISTS `customertb`;

CREATE TABLE `customertb` (
  `cid` int(5) NOT NULL,
  `cname` text,
  `cdob` text,
  `cphno` text,
  `cemail` text,
  `cgender` text,
  `caddress` text,
  `cnrc` text,
  `cpwd` text,
  PRIMARY KEY  (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customertb` */

insert  into `customertb`(`cid`,`cname`,`cdob`,`cphno`,`cemail`,`cgender`,`caddress`,`cnrc`,`cpwd`) values (1,'U Mya Hlaing','12.2.1960','09250098764','myahlaing@gmail.com','Male','Dagon','12/LaMaNa(N)123964','asd123'),(2,'U Tin Maung','3.4.1977','09798753146','tinmaung09@gmail.com','Male','Tamwe','12/TaMaNa(N)853235','asdfgh'),(3,'Daw May Myat','5.10.1969','09797535813','maymyat234@gmail.com','Female','Minglar Taung Nyunt','12/MaGaTa(N)523755','asd123!'),(4,'Ma July Moe','4.12.1996','09443089752','julymoe083@gmail.com','Female','Dagon','12/LaMaNa(N)749345','asd123'),(5,'Mg Kyaung Hla','12.3.1990','09250480048','kyaunghla324@gmail.com','Male','Minglar Taung Nyunt','12/MaGaTa(N)742895','asdfgh\r\n\r\n'),(6,'Mg Soe Soe Aung','9.10.1998','09443875482','soe22aung@gmail.com','Male','Tamwe','12/TaMaNa(N)073525','asd123!'),(7,'Daw Than Than Thu','6.5.1965','09797557358','thanthantun87@gmail.com','Female','Minglar Taung Nyunt','12/MaGaTa(N)700234','asd123'),(8,'Daw Ni Ni Aung','12.12.1978','09898364783','niaung225@gmail.com','Female','Minglar Taung Nyunt','12/MaGaTa(N)534100','asdfgh'),(9,'U Kyaw Kyaw Soe','11.9.1975','09979855732','kyawkyawsoe@gmail.com','Male','Dagon','12/LaMaNa(N)436157','asd123!'),(10,'Daw Mya Aye Moe','28.8.1988','09797352734','ayemoeaye@gmail.com','Female','Tamwe','12/TaMaNa(N)358245','asd123'),(11,'Ma Win Thinda Soe','31.1.1999','09796356274','winthindasoe923@gmail.com','Female','Tamwe','12/TaMaNa(N)358432','asdfgh'),(12,'U Aung Aung Soe','27.5.1986','09793645732','aung231soe@gmail.com','Male','Minglar Taung Nyunt','12/MaGaTa(N)792847','asd123!'),(13,'U Thein Aung Hla','11.11.1966','09793645325','theinaunghla@gmail.com','Male','Tamwe','12/TaMaNa(N)856821','asd123'),(14,'U Myat Khine Hla','12.8.1969','09798695734','khinehlamyat@gmail.com','Male','Minglar Taung Nyunt','12/MaGaTa(N)952695','asdfgh'),(15,'Ma Aye Yati Khine','31.7.1998','09794874552','khineyetiaye@gmail.com','Female','Minglar Taung Nyunt','12/MaGaTa(N)792158','asd123!'),(16,'Chaw Thiri Soe','1.2.2001','09799586616','chawthirisoe@gmail.com','Female','mingalr taung nyunt','12/MAGATA(N)199222','asd123');

/*Table structure for table `informationtb` */

DROP TABLE IF EXISTS `informationtb`;

CREATE TABLE `informationtb` (
  `infoid` int(5) NOT NULL,
  `cname` text,
  `nofpe` int(10) default NULL,
  `pgname` text,
  `amount` int(20) default NULL,
  `description` longblob,
  PRIMARY KEY  (`infoid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `informationtb` */

insert  into `informationtb`(`infoid`,`cname`,`nofpe`,`pgname`,`amount`,`description`) values (1,'U Mya Hlaing',5,'Day trip to Kayin',185000,'March (20) \r\nDay return \r\nKayin-Kyaung Ka Lat-CotCon Cave-Ba Yint Nye Cave-Beauty of Zwe Ka Pin \r\nTour Grade Fully A/C Express \r\nFull meal with water, drinks, snow, toothbrush'),(2,'U Tin Maung',3,'Day trip in May',108000,'May (4/11/18) \r\nDay return \r\nLeave at 8p.m. of May (3/10/17) \r\nHpa An-Sandan Cave-Chit Thu Myaing Park-Cotcon Cave \r\nHiger Express\r\nFull meals, water, snow tower, tooth brush, hat and medicine'),(3,'Daw May Myat',8,'Travel to Kayar',1520000,'March (20 to 24) \r\n4 Days & 3 Nights \r\nLeave from the night of 20 and comeback at 24 morning  \r\nTravel with Scania Express \r\n3 Stars Hotel \r\nServe with full meals, water, snow tower, tooth brush, hat and medicine \r\nTogether with Tour giude along the tour '),(4,'Ma July Moe',6,'Travel to Pintaya',1110000,'March (20 to 24) \r\n4 Nights & 5 Days \r\nLoiKaw-HteSaeKhar waterfall-TaungKyi-Inlay-KaLaw-Pintaya\r\nTravel with Scania Express \r\n3 Stars Hotel \r\nFull meals, water, snow tower, tooth brush, hat and medicine'),(5,'Mg Kyaung Hla',5,'Travel to Ruby land',725000,'March (20 to 24) \r\n3 Nights & 4 Days \r\nLeave at the night of March(20) and come back at the morning of March(24) \r\nTravel with Scania Express \r\n3 Stars Hotel \r\nServe which full meals, water, snow tower, tooth brush, hat and medicine \r\nTogether with Tour giude along the tour '),(6,'chaw thiri soe',2,'Day trip in May',93600,'May (4/11/18) \r\nDay return \r\nLeave at 8p.m. of May(3/10/17) \r\nHpa An-Kyone Htaw Waterfall-Cotcon Cave-BaYintNye Cave \r\nHiger Express\r\nFull meals, water, snow tower, tooth brush, hat and medicine');

/*Table structure for table `operatortb` */

DROP TABLE IF EXISTS `operatortb`;

CREATE TABLE `operatortb` (
  `oid` int(5) NOT NULL,
  `oname` text,
  `odob` text,
  `ogender` text,
  `ophno` text,
  `onrc` text,
  `oaddress` text,
  `opwd` text,
  PRIMARY KEY  (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `operatortb` */

insert  into `operatortb`(`oid`,`oname`,`odob`,`ogender`,`ophno`,`onrc`,`oaddress`,`opwd`) values (1,'Mg Way Phyo Oo','12.4.1998','Male','09754678543','12/TaMaNa(N)234876','Insein','asd123'),(2,'Ma May San','21.5.1996','Female','09250376484','12/MaGaTa(N)395714','Minglar Taung Nyunt','asdfgh'),(3,'Ma Taw Ta Moe','28.9.1995','Female','09250862634','12/TaMaNa(N)876424','Tawme','asd123!'),(4,'Ma Thi Thi Oo','3.5.1990','Female','09797563842','12/MaGaTa(N)577324','Minglar Taung Nyunt','asd123'),(5,'Mg Ko Ko Lat','31.1.1990','Male','09793747532','12/TaMaNa(N)345805','Tawme','asdfgh'),(6,'Mg Htoo Naw','3.5.1993','Male','09793677423','12/TaMaNa(N)249765','Insein','asd123!'),(7,'Ma Shwe Ei Lwin','8.10.1989','Female','09796737453','12/TaMaNa(N)465424','Tawme','asd123'),(8,'Ma Thin Thin Khine','4.12.1986','Female','09797378894','12/MaGaTa(N)456735','Minglar Taung Nyunt','asdfgh'),(9,'Ma Kyi Sin Thint','13.9.1999','Female','09792747953','12/TaMaNa(N)098746','Insein','asd123!'),(10,'Mg Sain Win Ning','30.6.1996','Male','09792342452','12/TaMaNa(N)456665','Tawme','asd123'),(11,'Ma Khin Zar Aung','18.8.1998','Female','09797456789','12/TaMaNa(N)876512','Tawme','asdfgh'),(12,'Mg Kyaw Soe Moe','9.8.1995','Male','09798754242','12/TaMaNa(N)098123','Insein','asd123!'),(13,'Ma Myint Myint Aye','3.7.1998','Female','09793456732','12/TaMaNa(N)987634','Tawme','asd123'),(14,'Ma Mo Mo Sein','3.7.1997','Female','09797123456','12/MaGaTa(N)479422','Minglar Taung Nyunt','asd123!'),(15,'Mg Hla Thu','12.12.1989','Male','09794567874','12/MaGaTa(N)567343','Minglar Taung Nyunt','asdfgh');

/*Table structure for table `packagetb` */

DROP TABLE IF EXISTS `packagetb`;

CREATE TABLE `packagetb` (
  `pgid` int(5) NOT NULL,
  `pgname` text,
  `pgdate` text,
  `type` text,
  `description` text,
  `price` int(11) default NULL,
  `promotion` text,
  PRIMARY KEY  (`pgid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `packagetb` */

insert  into `packagetb`(`pgid`,`pgname`,`pgdate`,`type`,`description`,`price`,`promotion`) values (1,'Travel to Ngwe Saung','13.4.2019','Premium Package','April (13 & 14) \r\n2 Nights and 3 days \r\nYangon to Ngwe Saung \r\nTravel with Bus Express \r\nFull Meal at Hotel \r\nServe with skilled Driver and tour guide \r\nGrand Ngwe Saung Hotel (4 Stars Hotel) ',285000,'1 free for 4 tickets'),(2,'Travel to Ruby land','20.3.2019','Premium Package','March (20 to 24) \r\n3 Nights & 4 Days \r\nLeave at the night of March(20) and come back at the morning of March(24) \r\nTravel with Scania Express \r\n3 Stars Hotel \r\nServe which full meals, water, snow tower, tooth brush, hat and medicine \r\nTogether with Tour giude along the tour ',145000,'1 free for 5 tickets'),(3,'Travel to Kayar','13.4.2019','Premium Package','March (20 to 24) \r\n4 Days & 3 Nights \r\nLeave from the night of 20 and comeback at 24 morning  \r\nTravel with Scania Express \r\n3 Stars Hotel \r\nServe with full meals, water, snow tower, tooth brush, hat and medicine \r\nTogether with Tour giude along the tour ',190000,'1 free for 4 tickets'),(4,'Day trip to Kayin','20.3.2019','Standard Package','March (20) \r\nDay return \r\nKayin-Kyaung Ka Lat-CotCon Cave-Ba Yint Nye Cave-Beauty of Zwe Ka Pin \r\nTour Grade Fully A/C Express \r\nFull meal with water, drinks, snow, toothbrush',37000,'1 free for 10 tickets'),(5,'Travel to Bagan','27.3.2019','Premium Package','March (27 to 30) \r\n3 Nights & 4 Days \r\nBagan-Nyaung Oo-Popa Mountain \r\nTravel with Scania Express \r\n3 Stars Hotel\r\nAll costs for cars to the Mountain and boats \r\nFull meals, water, snow tower, tooth brush, hat and medicine ',120000,'1 free for 4 tickets'),(6,'Travel in Thingyan Holidays','13.4.2019','Standard Package','April (13 to 17) \r\n4 Nights & 5 Days \r\nTravel with Scania Express \r\n3 Stars Hotel \r\nFull meals, water, snow tower, tooth brush, hat and medicine \r\nGo out to the water festival for 1 Day',180000,'1 free for 5 tickets'),(7,'Day trip to Yamanya Country','27.3.2019','Standard Package','March (27) \nLeave at 9 p.m. of 26.3.2019 \nMawLaMyine-KyiteKaMi-Satse-WinSeinTawYa \nTour Grade Air Con Express \nMidnight snacks, Breakfast, lunch, dinner \nWater, drinks, snow tower, tooth brush and hat ',35000,'1 free for 10 tickets'),(8,'Day trip in May','4.5.2019','Standard Package','May (4/11/18) \r\nDay return \r\nLeave at 8p.m. of May (3/10/17) \r\nHpa An-Sandan Cave-Chit Thu Myaing Park-Cotcon Cave \r\nHiger Express\r\nFull meals, water, snow tower, tooth brush, hat and medicine',36000,'1 free for 12 tickets'),(9,'Day trip in May','4.5.2019','Standard Package','May (4/11/18) \r\nDay return \r\nLeave at 8p.m. of May(3/10/17) \r\nHpa An-Kyone Htaw Waterfall-Cotcon Cave-BaYintNye Cave \r\nHiger Express\r\nFull meals, water, snow tower, tooth brush, hat and medicine',36000,'1 free for 10 tickets'),(10,'Travel in May','17.5.2019','Premium Package','May (17 to 19) \r\n3 Nights & 4 Days \r\nMandalay-PyanOoLwin-7 Miles ChaungTha \r\nScaina/Yutone/Higer Express \r\n4 Stars Hotel \r\nFull meals, water, snow tower, tooth brush, hat and medicine \r\nAll costs for cars to the Mountain and boats \r\nTour Guide and many services',150000,'1 free for 5 tickets'),(11,'Go to Mandalar','13.4.2019','Premium Package','April (13 to 17) \r\n4 Nights & 5 Days \r\nMoGok - Mandalar Land\r\nFamous Pagodas and monasteries \r\nNight Markets and waterfall \r\nSeeing sunset with Mandalay Moat \r\nTravel with Scania Express \r\n3 Stars Hotel \r\nFull meals, water, snow tower, tooth brush, hat and medicine',145000,'1 free for 5 tickets'),(12,'Let\'s go flower land','27.3.2019','Premium Package','March (27 to 31) \r\n4 Nights & 5 Days \r\nFlower Country-Mandalar Land-Dedot Blue Lake-MinKgon \r\nTravel with Scania Express \r\n3 Stars Hotel \r\nFull meals, water, snow tower, tooth brush, hat and medicine',150000,'1 free for 5 tickets'),(13,'Day trip at Armed Forces Day','27.3.2019','Standard Package','March (27) \r\nDay return \r\nTaung Ngu Elephant Camp-NawBu Forest-ThinTaungKyi \r\nHiger Express \r\nFull meals, water, snow tower, tooth brush, hat and medicine',39000,'1 free for 10 tickets'),(14,'Travel to Inlay Lake','27.3.2019','Premium Package','March (27 to 30) \r\n3 Nights & 4 Days \r\nTaungKyi-Inlay-KaLaw-PinTaYa-MyoTawKitKu-ThantSan \r\nTravel with Scania Express \r\n3 Stars Hotel \r\nFull meals, water, snow tower, tooth brush, hat and medicine',165000,'1 free for 5 tickets'),(15,'Travel to Pintaya','20.3.2017','Standard Package','March (20 to 24) \r\n4 Nights & 5 Days \r\nLoiKaw-HteSaeKhar waterfall-TaungKyi-Inlay-KaLaw-Pintaya\r\nTravel with Scania Express \r\n3 Stars Hotel \r\nFull meals, water, snow tower, tooth brush, hat and medicine',185000,'1 free for 5 tickets');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
