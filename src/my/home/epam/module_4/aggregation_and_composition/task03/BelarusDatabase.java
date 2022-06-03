package my.home.epam.module_4.aggregation_and_composition.task03;

/*
 * Задача 3. Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class BelarusDatabase {

    // Брестская область
    private static City brest = new City("Брест", 146.1, false, true);
    private static City baranovichi = new City("Барановичи", 84.96, false, false);
    private static City beryoza = new City("Берёза", 150.0, false, false);
    private static City gantsevichi = new City("Ганцевичи", 75.8, false, false);
    private static City drogichin = new City("Дрогичин", 11.0, false, false);

    private static District brestDistrict = new District("Брестский район", 1545, brest);
    private static District baranovichiDistrict = new District("Барановичский район", 2170, baranovichi);
    private static District beryozaDistrict = new District("Берёзовский район", 1413, beryoza);
    private static District gantsevichiDistrict = new District("Ганцевичский район", 1710, gantsevichi);
    private static District drogichinDistrict = new District("Дрогичинский район", 1855, drogichin);

    private static Region brestRegion = new Region("Брестская область", 32786.44,
	    new District[] { brestDistrict, baranovichiDistrict, beryozaDistrict, gantsevichiDistrict, drogichinDistrict });

    // Витебская область
    private static City vitebsk = new City("Витебск", 124.5, false, true);
    private static City beshenkovichi = new City("Бешенковичи", 12.8, false, false);
    private static City bratslav = new City("Браслав", 9.24, false, false);
    private static City verkhnedvinsk = new City("Верхнедвинск", 6.1, false, false);
    private static City glubokoye = new City("Глубокое", 1.2, false, false);

    private static District vitebskDistrict = new District("Витебский район", 2737, vitebsk);
    private static District beshenkovichiDistrict = new District("Бешенковичский район", 1250, beshenkovichi);
    private static District bratslavDistrict = new District("Браславский район", 2270, bratslav);
    private static District verkhnedvinskDistrict = new District("Верхнедвинский район", 2141, verkhnedvinsk);
    private static District glubokoyeDistrict = new District("Глубокский район", 1760, glubokoye);

    private static Region vitebskRegion = new Region("Витебская область", 40051.34,
	    new District[] { vitebskDistrict, beshenkovichiDistrict, bratslavDistrict, verkhnedvinskDistrict, glubokoyeDistrict });

    // Гомельская область
    private static City gomel = new City("Гомель", 139.8, false, true);
    private static City bragin = new City("Брагин", 4.9, false, false);
    private static City budakoshelevo = new City("Буда-Кошелёво", 7.0, false, false);
    private static City vetka = new City("Ветка", 8.9, false, false);
    private static City dobrush = new City("Добруш", 19.5, false, false);

    private static District gomelDistrict = new District("Гомельский район", 1951, gomel);
    private static District braginDistrict = new District("Брагинский район", 1960, bragin);
    private static District budakoshelevoDistrict = new District("Буда-Кошелёвский район", 1594, budakoshelevo);
    private static District vetkaDistrict = new District("Ветковский район", 1559, vetka);
    private static District dobrushDistrict = new District("Добрушский район", 1453, dobrush);

    private static Region gomelRegion = new Region("Гомельская область", 40371.36,
	    new District[] { gomelDistrict, braginDistrict, budakoshelevoDistrict, vetkaDistrict, dobrushDistrict });

    // Гродненская область
    private static City grodno = new City("Гродно", 142.1, false, true);
    private static City bolshayaBerestovitsa = new City("Большая Берестовица", 0.74, false, false);
    private static City volkovysk = new City("Волковыск", 29.0, false, false);
    private static City voronovo = new City("Вороново", 1.5, false, false);
    private static City dyatlovo = new City("Дятлово", 1.5, false, false);

    private static District grodnoDistrict = new District("Гродненский район", 2594, grodno);
    private static District berestovitsaDistrict = new District("Берестовицкий район", 743.6, bolshayaBerestovitsa);
    private static District volkovyskDistrict = new District("Волковысский район", 1193, volkovysk);
    private static District voronovoDistrict = new District("Вороновский район", 1418, voronovo);
    private static District dyatlovoDistrict = new District("Дятловский район", 1544, dyatlovo);

    private static Region grodnoRegion = new Region("Гродненская область", 25126.98,
	    new District[] { grodnoDistrict, berestovitsaDistrict, volkovyskDistrict, voronovoDistrict, dyatlovoDistrict });

    // Минская область
    private static City minsk = new City("Минск", 353.0, true, true);
    private static City borisov = new City("Борисов", 45.97, false, false);
    private static City vileyka = new City("Вилейка", 12.8, false, false);
    private static City volozhin = new City("Вороново", 1.5, false, false);
    private static City dzerzhinsk = new City("Дятлово", 1.5, false, false);

    private static District minskDistrict = new District("Минский район", 1943, minsk);
    private static District borisovDistrict = new District("Борисовский район", 1988, borisov);
    private static District vileykaDistrict = new District("Вилейский район", 2454, vileyka);
    private static District volozhinDistrict = new District("Воложинский район", 1917, volozhin);
    private static District dzerzhinskDistrict = new District("Дзержинский район", 3610, dzerzhinsk);

    private static Region minskRegion = new Region("Минская область", 39849.00 + 353.00,
	    new District[] { minskDistrict, borisovDistrict, vileykaDistrict, volozhinDistrict, dzerzhinskDistrict });

    // Могилёвская область
    private static City mogilev = new City("Могилёв", 118.5, false, true);
    private static City belynichi = new City("Белыничи", 52.74, false, false);
    private static City bobruysk = new City("Бобруйск", 32.02, false, false);
    private static City bykhov = new City("Быхов", 18.5, false, false);
    private static City glusk = new City("Глуск", 22.4, false, false);

    private static District mogilevDistrict = new District("Минский район", 1943, mogilev);
    private static District belynichiDistrict = new District("Борисовский район", 2988, belynichi);
    private static District bobruyskDistrict = new District("Вилейский район", 2454, bobruysk);
    private static District bykhovDistrict = new District("Воложинский район", 1917, bykhov);
    private static District gluskDistrict = new District("Дзержинский район", 3610, glusk);

    private static Region mogilevRegion = new Region("Могилёвская область", 29067.62,
	    new District[] { mogilevDistrict, belynichiDistrict, bobruyskDistrict, bykhovDistrict, gluskDistrict });

    // Области Республики Беларусь
    private static Region[] regionsOfBelarus = new Region[] { brestRegion, vitebskRegion, gomelRegion, grodnoRegion, minskRegion, mogilevRegion };

    public Region[] getRegionsOfBelarus() {
	return regionsOfBelarus;
    }
}