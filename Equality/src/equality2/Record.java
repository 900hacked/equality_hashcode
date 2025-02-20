package equality2;

import java.util.Objects;

public class Record {

	
	private String name;
	
	private int age;
	
	private String residence;

	public Record(String name, int age, String residence) {
		
		this.name = name;
		age = age;
		this.residence = residence;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		age = age;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
//			Record rec = new Record("Josh", 18, "Bunga");
//		User cord = new Record("John", 18, "Bunga");
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Record other = (Record) obj;
		return  other.age == age;
	}
	
	
	
	
}
