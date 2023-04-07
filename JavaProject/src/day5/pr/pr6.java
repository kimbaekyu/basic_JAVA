package day5.pr;
abstract class PairMap {
	   protected String KeyArray[]; // key 들을 저장하는 배열
	   protected String valueArray[]; // value 들을 저장하는 배열
	   abstract String get(String key); // key 값을 가진 value 리턴, 없으면 null 리턴
	   abstract void put(String key, String value); // key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정
	   abstract String delete(String key); // key 값을 가진 아이템 (value와 함꼐) 삭제, 삭제된 value 값 리턴
	   abstract int length(); // 현재 저장된 아이템의 개수 리턴
	}

class Dictionary extends PairMap{
	private int next=0;
	public Dictionary(int n) {
		KeyArray=new String[n];
		valueArray=new String[n];
		this.next=0;
	}
	
	
	
	// key 값을 가진 value 리턴, 없으면 null 리턴
	   String get(String key) {
		   
		   String word="Null";
		   for(int j=0;j<KeyArray.length;j++) {
			   if(key.equals(KeyArray[j])) {
				   word=valueArray[j];
				   break;
			   }	     
		   }
		   //System.out.println("get: "+word);
		   return word;
		   
	   }
	 // key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정
	   void put(String key, String value) {
		  for(int i=0;i<KeyArray.length;i++) {
			  if(key.equals(KeyArray[i])) {
				  KeyArray[i] = key;
		          valueArray[i] = value;
		          return;
			  }
		  }
		  KeyArray[next] = key;
	      valueArray[next] = value;
	      next++; 
		   
	   }
	   
	// key 값을 가진 아이템 (value와 함꼐) 삭제, 삭제된 value 값 리턴
	   String delete(String key) {
		   int num=0;String word="";
		   for(String k:KeyArray) {
			    if(k==key) {
				    word=valueArray[num];
				    valueArray[num]=null;
				    KeyArray[num]=null;
			    	break;
			   }
			   num++;
		   }
		   return word; 
	   } 
	// 현재 저장된 아이템의 개수 리턴
	   int length() {
		   return next;
	   }
}
public class pr6 {
	//class pr6->class DictionaryApp
	public static void main(String[] args) {
		   Dictionary dic = new Dictionary(10);
		   dic.put("황기태", "자바");
		   dic.put("이재문", "파이선");
		   dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정
		   System.out.println("이재문의 값은 "+dic.get("이재문"));
		   System.out.println("황기태의 값은 "+dic.get("황기태"));
		   dic.delete("황기태"); // 황기태 아이템 삭제
		   System.out.println("황기태의 값은 "+dic.get("황기태")); //삭제된 아이템 접근
		   System.out.println("배열의 길이: "+dic.length());
		}

	
		   
	    
}
