package com.coderscampus.assignment6;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TeslaSales {

	Locale ukLocale = Locale.UK;

	private YearMonth yrmth;

	private Integer sales;

	public TeslaSales(String yrmth, String sales) {
		this.yrmth = YearMonth.parse(yrmth, DateTimeFormatter.ofPattern("MMM-yy"));
		this.sales = Integer.parseInt(sales);
	}

	public YearMonth getDate() {
		return yrmth;
	}

	public void setDate(YearMonth date) {
		this.yrmth = date;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return "TeslaSales [date=" + yrmth + ", sales=" + sales + "]";
	}
}
