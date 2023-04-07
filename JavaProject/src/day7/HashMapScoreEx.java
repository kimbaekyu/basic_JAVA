package day7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
	public static void main(String[] args) {
		HashMap<String,Integer> javaScore=new HashMap<String, Integer>();
		
		javaScore.put("김1",97);
		javaScore.put("김2",88);
		javaScore.put("김3",98);
		javaScore.put("김4",70);
		javaScore.put("김5",99);
		
		System.out.println("HashMap의 요소개수: "+javaScore.size());
		
		Set<String> keys=javaScore.keySet();
		
		Iterator<String> it=keys.iterator();
		
		while(it.hasNext()) {
			String name=it.next();
			int score=javaScore.get(name);
			System.out.println(name+":"+score);
		}
	}
}
