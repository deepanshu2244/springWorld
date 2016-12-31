package com.local.spring.bean;

public class UnitedArabEmirates {

	private String locationid;
	private String areaCode;
	private String pointName;
	private BusDetails busDetails;

	/**
	 * @return the locationid
	 */
	public String getLocationid() {
		return locationid;
	}

	/**
	 * @param locationid
	 *            the locationid to set
	 */
	public void setLocationid(String locationid) {
		this.locationid = locationid;
	}

	/**
	 * @return the areaCode
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * @param areaCode
	 *            the areaCode to set
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	/**
	 * @return the pointName
	 */
	public String getPointName() {
		return pointName;
	}

	/**
	 * @param pointName
	 *            the pointName to set
	 */
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	/**
	 * @return the busDetails
	 */
	public BusDetails getBusDetails() {
		return busDetails;
	}

	/**
	 * @param busDetails
	 *            the busDetails to set
	 */
	public void setBusDetails(BusDetails busDetails) {
		this.busDetails = busDetails;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UnitedArabEmirates [locationid=" + locationid + ", areaCode=" + areaCode + ", pointName=" + pointName
				+ ", busDetails=" + busDetails + "]";
	}

}
