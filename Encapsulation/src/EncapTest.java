
public class EncapTest extends EncapsulationEx{

	public static void main(String[] args) {
		EncapsulationEx  ecd = new EncapsulationEx();
		ecd.setEmpAge(32);
		ecd.setEmpName("mario");
		ecd.setSsn(11222211);
		
		System.out.println("Emplyoee Name:"+ecd.getEmpName());
		System.out.println("Emplyoee Age:"+ecd.getEmpAge());
		System.out.println("Emplyoee ID:"+ecd.getSsn());
	}

}
