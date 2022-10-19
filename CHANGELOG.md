# **Changelog**
#### **Versja Stable 1.0** - _pierwsza wersja_


Dodano :
    
1. Moduł ArgsParser pełniący rolę biblioteki do parsowania argumentów. Obecna wersja jest jeszcze w fazie produkcji, dlatego nie powinno się z niej korzystać

   Postęp: 74%
2. Moduł ConsoleColor pełniący funkcję biblioteki do kolorowania tekstu wyświetlanego w konsoli. Obecnie jest ukończony i można z niego kożystać bez problemu

   Postęp: 100% / do rozbudowy
3. Moduł FileUtilities pełniący funkcję biblioteki do abstrakcyjnego używania plików. Bazuje na `java.io.File` i dodaje do niego proste otwieranie, odczytywanie, zapisywanie i zamykanie. Obecnie jest w fazie produkcji jako kod nieukończony, zatem z miejsca ostrzegam o tym, aby nie używać tego modułu i narazie traktować go jako ciekawostke 

   Postęp: 0% 
4. Moduł MapIO pełniący funkcję biblioteki do szybkiego odczytu i zapisu Map. Obecna wersja działa narazie wyłącznie z parametrami mapy `Map<String, String>`. Do zapisu może posłużyć jakikolwiek typ mapy, natomiast podczas wczytywania z pliku będzie to zawsze typ `HashMap <String, String>`. Narazie, jest to biblioteka rozwojowa, z której można korzystać tylko w ograniczonym stopniu, głównie przez fakt, iż jest ona nie dokończona 
 
   Postęp: 10%
5. Moduł NetworkUtilities pełniący funkcję biblioteki do np.: pobierania plików z internetu do wskazanego pliku. Moduł miałby też służyć do pracy w sieci lan/wlan, jednak jest to narazie wersja niedokończona 
 
   Postęp: 0%
6. Moduł PluginManager pełniący funkcję biblioteki do zarządzania pluginam. Moduł posiadał by własny język skryptowy lub korzystał z prostego, zrozumiałego dla ludzi, gotowego języka (np. tak jak xml tylko zrozumiałego dla każdego)

   Postęp: 0% / Nie rozpoczęto pracy
7. Moduł SafeValut pełniący funkcję biblioteki do zabezpieczania ważnych danych w ramach zapisu w miejscu lokalizacji aplikacji

   Postęp: 4%
8. Moduł TextSearchEngine pełniący funkcję biblioteki do dokładnego i dość szybkiego wyszukiwania w plikach i tekstach na podstawie fraz

    Postęp: 1%
9. Moduł UserGarbageColector pełniący funkcję Garbage Collectora. Służy głównie do zamykania lub próby zwolnienia pamięci na podstawie systemu Triggerowania każdej klasy implementującej oraz dodanej do systemu przez kod `GarbageCollectorClass.getInstance().addObject(this);` gdzie `this` to klasa implementująca `GarbageCollectorObject`

    Postęp: 89%
