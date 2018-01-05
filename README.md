<ol>План:
<li>Архитектура</li>
<li>Поведение системы</li>
<li>Implimentation</li>
<li>UI/Swing</li>
<li>Сетевая игра</li></ol>

<ol>КРЕСТИКИ НОЛИКИ
<li>Поле 3 на 3</li>
<li>Фишки: "Х" - "О"</li>
<li>Условие выигрыша - 8 комбинаций.</li>
<li>Учет ходов.</li></ol>

```java
public class XOField {private String winCombination = "123,456,789,147,258,369,159,357";

public String getWinCombination() {
	return winCombination;
}
}

public class App {
	
	public static void main(String[] args) {
	
		String first = "123";
		String second = "169";
		
		System.out.println("Do you win?");
		System.out.println("Ansver: " + isWin(first));
		System.out.println("And now?");
		System.out.println("Ansver: " + isWin(second));
		
	}

	private static boolean isWin(String combination) {
		XOField field = new XOField();
		boolean isWin = field.getWinCombination().contains(combination);
		return isWin;
	}
