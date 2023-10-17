package hw6t1;

import java.math.BigDecimal;

//1. Описати клас Product
//Поля:
//- Назва товару
//- артикул (код товару)
//- ціна
//- опис товару
//- наявність (є чи немає)
//Методи:
//- геттери
//- сеттери

//Створили класс
public class Product {
    String name;
    int article;
    BigDecimal cost;
    String description;
    boolean availability;


//Геттер назва
public String getName() {
return this.name;
}
//Сеттер назва
public void setName(String name) {
this.name = name;
}

//Геттер артикул
public int getArticle() {
return this.article;
}
//Сеттер артикул
public void setArticle(int article) {
this.article = article;
}

//Геттер ціна
public BigDecimal getCost() {
return this.cost;
}
//Cеттер ціна
public void setCost(BigDecimal cost){
this.cost = cost;
}

//Геттер опис
public String getDescription() {
return this.description;
}
//Сеттер опис
public void setDescription(String description) {
this.description = description;
}

//Геттер доступність
public String getAvailabilityStatus(){
return this.availability ? "Yes" : "No";
}
//Сеттер доступність
public void setAvailability(boolean availability){
this.availability = availability;
}

}
