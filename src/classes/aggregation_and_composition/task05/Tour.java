package classes.aggregation_and_composition.task05;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа 
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта, 
 * питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Tour {
    private int number;
    private String country;
    private String city;
    private String type;
    private String transport;
    private String price; // стоимость транспорта + стоимость услуг туроператора

    public Tour() {
	super();
    }

    public Tour(int number, String country, String city, String type, String transport, String price) {
	super();
	this.number = number;
	this.country = country;
	this.city = city;
	this.type = type;
	this.transport = transport;
	this.price = price;
    }

    public int getNumber() {
	return number;
    }

    public void setNumber(int number) {
	this.number = number;
    }

    public String getCountry() {
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    public String getTransport() {
	return transport;
    }

    public void setTransport(String transport) {
	this.transport = transport;
    }

    public String getPrice() {
	return price;
    }

    public void setPrice(String price) {
	this.price = price;
    }

    @Override
    public String toString() {
	return "Путевка № " + number + ": " + country + ", " + city + ", тип: " + type + ", транспорт: " + transport + ", стоимость: " + price + " руб.";
    }
}