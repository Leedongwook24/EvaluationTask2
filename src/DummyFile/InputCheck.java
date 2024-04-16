package DummyFile;

class InputCheck {					
	
	private String str;
	// local 変数と class 変数の名前が同じだったので、エラーが発生しました。
	// 二つの変数を区分しました。
	public InputCheck(String str1) {				
		if(str1 == null) {			
			str1 = "";		
		}
			str=str1;
	}				
					
protected boolean isNumeric()					
{					
	if (this.str == "") {				
		return false;			
	}				
					
	for (int i = 0; i < this.str.length(); i++)				
	{				
		char c = this.str.charAt(i);			
		if (c < '0' || c > '9') {			
			return false;		
		}			
	}				
	return true;				
}					
protected boolean checkSize() {					
	if(this.str.length() <= 10) {				
		if(Math.abs(Integer.parseInt(this.str)) <= 1024*1024*100) {			
			return true;		
		}			
		return false;			
	}				
	else {				
		return false;			
	}				
}					
}					