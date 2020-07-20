package entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;
    
    private HourContract(){
        
    }

    public HourContract(Date date, Double ValuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = ValuePerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double ValuePerHour) {
        this.valuePerHour = ValuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public double totalValue(){
        return valuePerHour * hours;
    }
}
