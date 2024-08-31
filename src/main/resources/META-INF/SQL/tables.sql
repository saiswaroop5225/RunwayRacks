-- User Master Table.
CREATE TABLE User_ (
    userId BIGINT AUTO_INCREMENT PRIMARY KEY,
  	createDate datetime(6) DEFAULT NULL,
  	modifiedDate datetime(6) DEFAULT NULL,
    password_ varchar(250) DEFAULT NULL,
    passwordEncrypted tinyint DEFAULT NULL,
    passwordModifiedDate datetime(6) DEFAULT NULL,
    graceLoginCount BIGINT DEFAULT NULL,
    screenName varchar(250) DEFAULT NULL,
  	emailAddress varchar(254) DEFAULT NULL,
  	phoneNumber varchar(254) DEFAULT NULL,
  	facebookId bigint DEFAULT NULL,
  	googleUserId varchar(250) DEFAULT NULL,
  	ldapServerId bigint DEFAULT NULL,
  	openId varchar(1024) DEFAULT NULL,
  	portraitId bigint DEFAULT NULL,
  	fullName varchar(250) DEFAULT NULL,
  	firstName varchar(250) DEFAULT NULL,
  	middleName varchar(250) DEFAULT NULL,
  	lastName varchar(250) DEFAULT NULL,
  	jobTitle varchar(100) DEFAULT NULL,
    loginDate datetime(6) DEFAULT NULL,
  	loginIP varchar(250) DEFAULT NULL,
  	lastLoginDate datetime(6) DEFAULT NULL,
  	lastLoginIP varchar(250) DEFAULT NULL,
  	lastFailedLoginDate datetime(6) DEFAULT NULL,
  	failedLoginAttempts int DEFAULT NULL,
  	lockout tinyint DEFAULT NULL,
  	lockoutDate datetime(6) DEFAULT NULL,
  	agreedToTermsOfUse tinyint DEFAULT NULL,
  	emailAddressVerified tinyint DEFAULT NULL,
  	status int DEFAULT NULL,
  	statusValue varchar(250) DEFAULT NULL,
  	type_ int DEFAULT NULL
    );

 -- contuer to maintain the primary key

CREATE TABLE counter (
  	className varchar(250) DEFAULT NULL,
  	currentId BIGINT DEFAULT NULL
    );