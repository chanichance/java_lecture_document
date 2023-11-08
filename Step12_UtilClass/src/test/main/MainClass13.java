package test.main;

import java.util.HashSet;
import java.util.Set;

public class MainClass13 {
	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		
		Set<Integer> set2=new HashSet<>();
		set2.add(30);
		set2.add(40);
		set2.add(50);
		
		//set1과 set2의 교집합 구하기 (Intersection 이 교집합의 Set 가 된다.)
		Set<Integer> Intersection=new HashSet<>(set1);
		Intersection.retainAll(set2);
		
		//set1과 set2의 합집합 구하기
		Set<Integer> union=new HashSet<>(set1);
		union.addAll(set2);
		
		//set1과 set2의 차집합 (set1 - set2)구하기
		Set<Integer> difference=new HashSet<>(set1);
		difference.removeAll(set2);
		
	}
}
