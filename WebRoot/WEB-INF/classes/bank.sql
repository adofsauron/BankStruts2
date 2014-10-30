/*所有的表都存放在bank数据库中*/
create database bank;  /*创建bank数据库*/
use bank;			   /*使用bank数据库*/

﻿/* 用户表 */
CREATE TABLE user(
	id				int				auto_increment,			/*唯一标识*/	
	name			varchar(20)		not null,				/*姓名*/		
	password		varchar(50)		not null,				/*密码*/		
	tel				varchar(11)		not null,				/*电话号码*/
	email			varchar(50)		not null,				/*电子邮箱*/
	
	PRIMARY KEY(id)	
) DEFAULT CHARSET=utf8;


/* 钱表 */
CREATE TABLE account(
	id				int		auto_increment,			/*唯一标识*/	
	userId			int		not null,				/*用户表的唯一标识id, 与用户表 一对一的关系*/		
	money			double	not null,				/*账户余额总数*/		
	
	PRIMARY KEY(id)	
) DEFAULT CHARSET=utf8;


/* 记录表 */
CREATE TABLE record(
	id				int			auto_increment,			/*唯一标识*/	
	accountId		int			not null,				/*钱表的唯一标识id, 一个钱表记录对应多条记录表数据*/		
	time			datetime	not null,				/*钱数变动时的时间*/
	kind			Varchar(20) not null,				/*钱数变动类型，（增，减）*/
	value 			double		not null,				/*单条钱数变动的数目*/
	
	PRIMARY KEY(id)	
) DEFAULT CHARSET=utf8;