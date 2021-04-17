package overriding;

public class BaseKrediManager {
	
	
	// ben aksini belirtmediğim sürece metotlar overrridable
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
	
	// ezilmesini engellemek için ise=> final key word u kullanıyoruz
	public final double hesapla2(double tutar) {
		return tutar * 1.18;
	}
	
}
