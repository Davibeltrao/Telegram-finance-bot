package database.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Carteira {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String company;
	private String market_share;
	private BigDecimal stock_price;
	private Integer nota;
	private BigDecimal money_amount_owned;
	private double ideal_percentage;
	private double actual_percentage;
	private BigDecimal money_amount_desired;
	private BigDecimal money_amount_diff;
	private Integer stock_quantity_needed;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMarket_share() {
		return market_share;
	}
	public void setMarket_share(String market_share) {
		this.market_share = market_share;
	}
	public BigDecimal getStock_price() {
		return stock_price;
	}
	public void setStock_price(BigDecimal stock_price) {
		this.stock_price = stock_price;
	}
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	public BigDecimal getMoney_amount_owned() {
		return money_amount_owned;
	}
	public void setMoney_amount_owned(BigDecimal money_amount_owned) {
		this.money_amount_owned = money_amount_owned;
	}
	public double getIdeal_percentage() {
		return ideal_percentage;
	}
	public void setIdeal_percentage(double ideal_percentage) {
		this.ideal_percentage = ideal_percentage;
	}
	public double getActual_percentage() {
		return actual_percentage;
	}
	public void setActual_percentage(double actual_percentage) {
		this.actual_percentage = actual_percentage;
	}
	public BigDecimal getMoney_amount_desired() {
		return money_amount_desired;
	}
	public void setMoney_amount_desired(BigDecimal money_amount_desired) {
		this.money_amount_desired = money_amount_desired;
	}
	public BigDecimal getMoney_amount_diff() {
		return money_amount_diff;
	}
	public void setMoney_amount_diff(BigDecimal money_amount_diff) {
		this.money_amount_diff = money_amount_diff;
	}
	public Integer getStock_quantity_needed() {
		return stock_quantity_needed;
	}
	public void setStock_quantity_needed(Integer stock_quantity_needed) {
		this.stock_quantity_needed = stock_quantity_needed;
	}
}
