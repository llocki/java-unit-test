@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	 // Инициализируй поля класса в конструкторе
      this.age  = age;
      this.result = result;
  }

   // Пометь метод аннотацией для параметров
      @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
		 // Заполни массив тестовыми данными и ожидаемым результатом
        {17, false},
        {18, true},
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	 // Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Возраст пользователя должен быть больше 18", true, isAdult);
	}
    
    
      @Parameterized.Parameters
  public static Object[][] getTextData1() {
	return new Object[][] {
		 // Заполни массив тестовыми данными и ожидаемым результатом
        {20, false},
        {21, true},
    };
  }
    
    @Test
  public void checkIsAdultWhenAgeThenResult1() {
	Program program = new Program();
	 // Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(age);
