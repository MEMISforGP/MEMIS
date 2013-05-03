package com.xiaocq.domain
{
	[RemoteClass(alias="com.xiaocq.domain.TwoAttributes")]
	public class TwoAttributes
	{
		
		[Bindable]
		public var id : int;
		
		[Bindable]
		public var name : String;
		
		public function TwoAttributes()
		{
		}
	}
}