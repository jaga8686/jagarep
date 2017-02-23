
public class Pet {
	public String id;
	public String name;

	public Pet(String id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int id() {
		// TODO Auto-generated method stub
		return Integer.parseInt(id);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id:"+id+" Name:"+name;
	}
}