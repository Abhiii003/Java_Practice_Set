import java.util.*;
public class Hashmap1 {

	static class MyHashMap<K,V>
	{
		public static final int DEFAULT_CAPACITY=4;
		public static final float DEFAULT_LOAD_FACTOR=0.75f;
		
		public class Node{
			K key;
			V value;
			
			Node(K key,V value)
			{
				this.key=key;
				this.value=value;
			}
		}
			
			public int n;
			public LinkedList<Node>[] buckets;
			
			public int size()
			{
				return n;
			}
			
			//Inititialization of buckets function
			public void initBuckets(int N) //N= capacity/size of buckets array
			{
				buckets=new LinkedList[N];
				
				for(int i=0;i<buckets.length;i++)
				{
					buckets[i]=new LinkedList<>();
				}
			}
			
			//HashFunc func to generate the hash value
			public int HashFunc(K key)
			{
				int hash_value=key.hashCode();		// this hashCode function genrates a value which can be negative. 
				return (Math.abs(hash_value))% buckets.length;  //As we know the indexes cannot be -ve, so we used Math.abs()
			}
			
			//Searches for the key exists already in the LinkedList, If present INDEX is returned otherwise -1.
			public int searchInBucket(LinkedList<Node> bucket,K key)
			{
				for(int i=0;i<bucket.size();i++)
				{
					if(bucket.get(i).key==key)
					{
						return i;
					}
				}
				return -1;
			}
			
			// MyHashMap constructor 
			 MyHashMap()			
			{
				initBuckets(DEFAULT_CAPACITY);		//initBuckets(4)
			}
			 
			 public int capacity()
			 {
				 return buckets.length;
			 }
			 
			 public float load()
			 {
				 return (n*1.0f)/buckets.length;
			 }
			 public void rehash()
			 {
				 LinkedList<Node> oldBuckets[]=buckets;
				 initBuckets(oldBuckets.length*2);
				 n=0;
				 
				 for(var bucket: oldBuckets)
				 {
					 for(var node:bucket)
					 {
						 put(node.key,node.value);
					 }
				 }
			 }
			
			public void put(K key,V value)
			{
				int bi=HashFunc(key);	//bi=BucketIndex
				LinkedList<Node> currBucket=buckets[bi];
				int ei=searchInBucket(currBucket,key);
				
				if(ei==-1)
				{
					Node node=new Node(key,value);
					currBucket.add(node);
					n++;
				}
				else {
					Node currNode=currBucket.get(ei);
					currNode.value=value;
				}
				
				//when n>=(4 x 0.75) => n>=3 rehash function is called.
				if(n>=(buckets.length*DEFAULT_LOAD_FACTOR))
				{
					rehash();
				}
			}
			
			public V get(K key)
			{
				int bi=HashFunc(key);
				LinkedList<Node> currBucket=buckets[bi];
				int ei=searchInBucket(currBucket,key);
				
				if(ei!=-1)
				{
					Node currNode=currBucket.get(ei);
					return currNode.value;
				}
				return null;
			}
			
			public V remove(K key)
			{
				int bi=HashFunc(key);
				LinkedList<Node> currBucket=buckets[bi];
				int ei=searchInBucket(currBucket,key);
				if(ei!=-1)
				{
					Node currNode=currBucket.get(ei);
					V val=currNode.value;
					currBucket.remove(ei);
					n--;
					return val;
				}
				else
				{
					return null;
				}
			}
		
	}
	public static void main(String[] args) {
		MyHashMap<String,Integer> mp=new MyHashMap<>();
		System.out.println("Testing put:");
		mp.put("a", 1);
		mp.put("b", 2);
		mp.put("c", 30);
		System.out.println("Testing size: "+mp.size());
		
		//Testing get
		System.out.println(mp.get("a"));
		System.out.println(mp.get("b"));
		System.out.println(mp.get("c"));

		System.out.println(mp.remove("c"));
		System.out.println(mp.remove("c"));
		System.out.println("Testing size: "+mp.size());

		System.out.println("Capacity is: "+mp.capacity());
		System.out.println("Load factor is: "+mp.load());
	}

}
