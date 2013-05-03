package com.xiaocq.domain
{
	[RemoteClass(alias="com.xiaocq.domain.Student")]
	public class Student
	{
		[Bindable]
		public var stuId : int;
		
		[Bindable]
		public var stuNum : String;
		
		[Bindable]
		public var realName : String;
		
		[Bindable]
		public var grade : int;
		
		[Bindable]
		public var department : int;
		
		[Bindable]
		public var major : int;
		
		[Bindable]
		public var personalResumePath : String;
		
		public function Student()
		{
		}
	}
}