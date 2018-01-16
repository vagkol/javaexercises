public class Singer {
	//Instance Variables
		static Singer si[] = new Singer [10];
		private static int sicount = 0;
		private String name;
		private int id;

		public Singer(String name) {
			this.name = name;
			si[sicount]=this;
			this.id = ++sicount;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public int getId() {
			return id;
		}

		public String toString() {
			return "- Singer [ name = " + name + ", id = " + id + " ]";
		}





}
