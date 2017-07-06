

public class Ex05 {
	
	interface Show {
		void show(Integer num);
	}
	
	class A implements Show{

		@Override
		public void show(Integer num) {
			String str = String.valueOf(num);
			int result = Integer.parseInt(str.substring(5, 6));
			
			if(result > 10){
				result = result % 10;
			}
			System.out.println(result);
		}
		
	}
	
	class B extends A{
		@Override
		public void show(Integer num) {
			super.show(num + 1000);
		}
	}
	
	public class Ex5 {
		
		public void execute(){
			int num = 169978;
			Show s = new B();
			s.show(num);
		}
		
	}
	

}
