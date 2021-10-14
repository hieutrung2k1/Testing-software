package Week_6;

public class MathUtil {

	public String transaction(int N, int A, int F) {
		if (N >= A + 50000 + F && A >= 50000 && A <= 5000000 && (F == 1100 || F == 3300)) {
			return "Y";
		}
		return "N";
	}

}
