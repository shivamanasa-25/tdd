package com.epam.TDD_DEMO;

public class RemoveTest{
	public String remove(String s) {
		int l=s.length();
		String r="";
		if(l>0 && s.charAt(0)!='A') r+=s.charAt(0);
		if(l>1)
		{
			if(s.charAt(1)!='A') r+=s.charAt(1);
		}
		if(l>2)
		{
			for(int i=2;i<l;i++) r+=s.charAt(i);
		}
		return r;
	}
}
