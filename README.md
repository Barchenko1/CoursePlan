<ul>План:</ul>
<ol>Архитектура</ol>
<ol>Поведение системы</ol>
<ol>Implimentation</ol>
<ol>UI/Swing</ol>
<ol>Сетевая игра</ol>
КРЕСТИКИ НОЛИКИ

Поле 3 на 3
Фишки: "Х" - "О"
Условие выигрыша - 8 комбинаций.
Учет ходов.
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
