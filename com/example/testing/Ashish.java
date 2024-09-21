package com.example.testing;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;

public class Ashish {
	
	
//	public static boolean isValid(UserDO user) {
//		
//		return user != null ? Boolean.TRUE.equals(user.getIsValid()) : false;
//
////	    try {
////
////	        ;
////
////	    } catch(NullPointerException e) {
////
////	        return false;
////
////	    }
//
//	}
	
	
//	try {
//
//	    saveData();
//
//	} catch (IOException e) {
//
//	        log.error("An I/O exception occurred while saving data.", e.getStackTrace());
//
//
//	} catch(Exception e) {
//        log.error("Other exceptions occurred while saving data.", e.getStackTrace());
//	}
	
	
	
	public static List<String> subdomainVisits(String[] cpdomains) {
	   List<String> ans = new ArrayList<>();
	   
	   HashMap<String, Integer> count = new HashMap<>();
	   for(int i = 0 ; i < cpdomains.length; i ++) {
			// 900 google.mail.com
		   String[] temp = cpdomains[i].split(" ");
		   
		   String[] subDomains = temp[1].split("\\.");
		   
		   StringBuilder sub = new StringBuilder();
		   for(int j = subDomains.length -1 ; j >= 0 ; j --) {
			   // com
			   // mail.com
			   StringBuilder inside = new StringBuilder(subDomains[j]);
			   if(sub.length() == 0) {
				   sub.append(subDomains[j]);
			   } else {
				   inside.append("." + sub);
			   }
			   
			   count.put(inside.toString() , count.getOrDefault(inside.toString(), 0) + Integer.valueOf(temp[0]));
		   }
		}
	   
	   for(Entry<String, Integer> e : count.entrySet()) {
		   ans.add(e.getKey() + " " + e.getValue());
	   }
	   
	   return ans;
	   
	   
	   

	}
	
	
	
	public static void main(String[] args) {
		// cpdomains = 
		// Array of strings
//		String[] cpDomains =  {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
//		List<String> ans = subdomainVisits(cpDomains);
//		for(String x : ans) {
//			System.out.println(x);
//		}
//		
		//Thread t1 = new Thread(new MutilthreadTest());
		//MutilthreadTest t1 = new MutilthreadTest();
		
		// wait() - sleep();
		// notify() - 
		// notifyAll
		
		// 
		Object a1 = new Object();
		Object a2 = new Object();
		//Lock s1 = new R 
		
		Thread t1 = new Thread(() -> {
			  
			System.out.println("Some Operation here");
		});
		//}
			
//		}) {
//			//
//			Sys
//			synronized(a1) {
//				// TODO Auto-generated method stub
//				System.out.print("THis is some operaiton from thread t1");
//				
//				synchronized (a2) {
//				 // 
//				}
//			}
//		};
		
		
//		Thread t2 = new Thread() {
//			synchronized(a2) {
//				// some operation happennhg here
//				
//				synchronized(a1) {
//					// This is other operation //// 
//				}
//				
//			}
//		}
		
		
		
		try {
			//t1.call();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		t1.start();
//		
		
		// "901 mail.com","50 yahoo.com",
		// "900 google.mail.com","5 wiki.org","5 org","1
		// intel.mail.com","951 com"]
		// list of strings
	
	}
}
