package com.xiaocq.domain
{
	[RemoteClass(alias="com.xiaocq.domain.User")]
	public class User
	{
		[Bindable]
		public var id : int;
		
		[Bindable]
		public var username : String;
		
		[Bindable]
		public var password : String;
		
		[Bindable]
		public var userType : String;
		
		[Bindable]
		public var registerDate : Date;
		
		[Bindable]
		public var lastLoginDate : Date;
		
		public function User()
		{
		}
	}
}