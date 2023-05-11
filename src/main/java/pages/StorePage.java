package pages;

public class StorePage {

    //findAStore -- //*[@action="/store-locator"]
    // collection of towns //*[@data-e2e="locationList"]/article
    //confirmButton

    public String findStoreInput (String city){
        //Los Angeles, CA, USA
        return city;
    }
    //метод вибір елемента з колекціі міст -- магазин має пару станів, відкрит, закрит,
    //метод клік на кнопку конфірм

    public void selectCity() {

        //колекція  data-e2e="store-warnings"


    }

    public void confirmStore() {

//може вилізти поп ап This store is closed


    }


}
