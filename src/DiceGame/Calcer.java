/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiceGame;

/**
 *
 * @Nikolin #Majmari
 */
class Calcer {
	public static int  pOne(int [] k) {
		int result=0;
		if(k.length!=5)
			return -1;
		
		for(int i=0;i<k.length;i++)
			if(k[i]==1)
			result +=k[i];
		return result;
	}
    public static int  pTwo(int [] k) {
		int result=0;
		if(k.length!=5)
			return -1;
		for(int i=0;i<k.length;i++)
			if(k[i]==2)
			result +=k[i];
		return result;
	}
    public static int  pThree(int [] k) {
		int result=0;
		if(k.length!=5)
			return -1;
		for(int i=0;i<k.length;i++)
			if(k[i]==3)
			result +=k[i];
		return result;
	}
	public static int  pFour(int [] k) {
		int result=0;
		if(k.length!=5)
			return -1;
		for(int i=0;i<k.length;i++)
			if(k[i]==4)
			result +=k[i];
		return result;
	}
	public static int  pFive(int [] k) {
		int result=0;
		if(k.length!=5)
			return -1;
		for(int i=0;i<k.length;i++)
			if(k[i]==5)
			result +=k[i];
		return result;
	}
	public static int  pSix(int [] k) {
		int result=0;
		if(k.length!=5)
			return -1;
		for(int i=0;i<k.length;i++)
			if(k[i]==6)
			result +=k[i];
		return result;
	}
	public static int  pThreeOfOne(int [] k ) {
		if(k.length!=5)
			return -1;
		int values[ ] = new int[5];
	    for(int i=0;i<5;i++)
	    	values[i]= k[i];
	    sort(values);
	    int cons=1;
	    int value = 0;
	    for(int i=0;i<4;i++) {
	    	if(values[i]==values[i+1]) {
	    		cons++;
	    		if(value == 0)
	    			value= 2* values[i];
	    		else
	    			value+=values[i];
	    	}
	    	else {
	    		if(cons==3)
	    			return value;
	    		cons = 1;
	    		value = 0;
	    		}
	    }
	    if(cons == 3)
	    	return value;
	    return 0;
	}
	public static int  pFourOfOne(int [] k ) {
		if(k.length!=5)
			return -1;
		int values[ ] = new int[5];
	    for(int i=0;i<5;i++)
	    	values[i]= k[i];
	    for(int i=0;i<4;i++) {
	    	for(int j=i;j<5;j++)
	    		if(values[i]>values[j])
	    		{
	    			int temp = values[i];
	    			values[i] = values[j];
	    			values[j] = temp;
	    		}
	    }
	    int cons=1;
	    int value = 0;
	    for(int i=0;i<4;i++) {
	    	if(values[i]==values[i+1]) {
	    		cons++;
	    		if(value == 0)
	    			value= 2* values[i];
	    		else
	    			value+=values[i];
	    	}
	    	else {
	    		if(cons==4)
	    			return value;
	    		cons = 1;
	    		value = 0;
	    		}
	    }
	    if(cons == 4)
	    	return value;
	    return 0;
	}
	public static void sort(int []a) {
		for(int i=0;i<a.length-1;i++) {
			int max= a[i];
			int key = i;
			for(int j = i+1;j<a.length;j++) {
				if(max>a[j]) {
					max=a[j];
					key=j;
				}
			}
			if(i!=key) {
				int temp=a[key];
				a[key]=a[i];
				a[i]= temp;
			}
		}
	}
	public static int  pFullHouse(int [] k) {
		if(k.length!=5)
			return -1;
		int values[ ] = new int[5];
	    for(int i=0;i<5;i++)
	    	values[i]= k[i];
	   sort(values);
      for(int i=0;i<5;i++) {
    	  System.out.println(values[i]);
      }
	   if(values[0]==values[1])
		if((values[2]==values[3])&&(values[3]==values[4]))
			return 25;
		else if((values[1]==values[2])&&(values[3]==values[4]))
				return 25;
		return 0;
	}
	public static int pFourQ(int [] k) {
		if(k.length!=5)
			return -1;
		int values[ ] = new int[5];
	    for(int i=0;i<5;i++)
	    	values[i]= k[i];
	    for(int i=0;i<4;i++) {
	    	for(int j=i;j<5;j++)
	    		if(values[i]>values[j])
	    		{
	    			int temp = values[i];
	    			values[i] = values[j];
	    			values[j] = temp;
	    		}
	    }
	    int Q = 1;
	    for(int i=0;i<4;i++) {
	    	if(values[i+1]-values[i]==1)
	    		Q++;
	    	else
	    		Q=1;
	    	if(Q==4)
	    		return 30;
	    }
		return 0;
	}
	public static int pFiveQ(int [] k) {
		if(k.length!=5)
			return -1;
		int values[ ] = new int[5];
	    for(int i=0;i<5;i++)
	    	values[i]= k[i];
	    for(int i=0;i<4;i++) {
	    	for(int j=i;j<5;j++)
	    		if(values[i]>values[j])
	    		{
	    			int temp = values[i];
	    			values[i] = values[j];
	    			values[j] = temp;
	    		}
	    }
	    int Q = 1;
	    for(int i=0;i<4;i++) {
	    	if(values[i+1]-values[i]==1)
	    		Q++;
	    	else
	    		return 0;
	    	if(Q==5)
	    		return 30;
	    }
		return 0;
	}
	public static int pAllSame(int []k) {
		if(k.length!=5 )
			return -1;
		for(int i=0;i<k.length-1;i++) {
			if(k[i]!=k[i+1])
				return 0;
		}
		return 50;
	}
	public static int pEvryCase(int []k) {
		if(k.length!=5)
			return -1;
		int value=0;
		for(int i=0;i<k.length;i++)
			value+=k[i];
		return value;
	}
}
