package com.local.spring.bean;

public class BusDetails {

	private String agencyName;
	private String busStartTime;
	private String busEndtime;

	/**
	 * @return the agencyName
	 */
	public String getAgencyName() {
		return agencyName;
	}

	/**
	 * @param agencyName
	 *            the agencyName to set
	 */
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	/**
	 * @return the busStartTime
	 */
	public String getBusStartTime() {
		return busStartTime;
	}

	/**
	 * @param busStartTime
	 *            the busStartTime to set
	 */
	public void setBusStartTime(String busStartTime) {
		this.busStartTime = busStartTime;
	}

	/**
	 * @return the busEndtime
	 */
	public String getBusEndtime() {
		return busEndtime;
	}

	/**
	 * @param busEndtime
	 *            the busEndtime to set
	 */
	public void setBusEndtime(String busEndtime) {
		this.busEndtime = busEndtime;
	}

}
