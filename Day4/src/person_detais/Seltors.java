package person_detais;

abstract class Mumbai_rules
{
	abstract void speedlimits();
	abstract void helmet();
	abstract void mirror();
	
}
   class Seltors extends Mumbai_rules 
	 {
			void mirror()
			{
				System.out.println("two mirror required");
			}
			void helmet(){
				System.out.println("helmet id compulsory");
			}
			void speedlimist(){
				System.out.println("speed should not be more than 60km");
			}
			public static void main(String[] args) {
				Seltors obj=new Seltors();
				obj.helmet();
				obj.mirror();
				obj.speedlimist();
			}
			@Override
			void speedlimits() {
				// TODO Auto-generated method stub
				
			}
			
		}
