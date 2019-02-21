package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		int intMoney = money.amount;
		return new Money(amount + intMoney);
	}

	public Money minus(Money money) {
		int intMoney = money.amount;
		return new Money(amount - intMoney);
	}

	public Money multiply(Money money) {
		int intMoney = money.amount;
		return new Money(amount * intMoney);
	}

	public Money devide(Money money) {
		int intMoney = money.amount;
		return new Money(amount / intMoney);
	}

	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		if(amount == money.amount) {
			return true;
		}
		return false;
	}
}