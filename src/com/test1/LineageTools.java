package com.test1;

public class LineageTools {
	private Integer systemId;
	private Integer frameworkId;
	private String frameworkName;
	private String maxLoad;
	private String maxCapacity;
	private String openSource;
	private boolean inHouseDev;
	private String devSupport;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public LineageTools() {

	}

	public LineageTools(Integer systemId, Integer frameworkId, String frameworkName, String maxLoad, String maxCapacity,
			String openSource, boolean inHouseDev, String devSupport, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.systemId = systemId;
		this.frameworkId = frameworkId;
		this.frameworkName = frameworkName;
		this.maxLoad = maxLoad;
		this.maxCapacity = maxCapacity;
		this.openSource = openSource;
		this.inHouseDev = inHouseDev;
		this.devSupport = devSupport;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getSystemId() {
		return systemId;
	}

	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}

	public Integer getFrameworkId() {
		return frameworkId;
	}

	public void setFrameworkId(Integer frameworkId) {
		this.frameworkId = frameworkId;
	}

	public String getFrameworkName() {
		return frameworkName;
	}

	public void setFrameworkName(String frameworkName) {
		this.frameworkName = frameworkName;
	}

	public String getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(String maxLoad) {
		this.maxLoad = maxLoad;
	}

	public String getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(String maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public String getOpenSource() {
		return openSource;
	}

	public void setOpenSource(String openSource) {
		this.openSource = openSource;
	}

	public boolean isInHouseDev() {
		return inHouseDev;
	}

	public void setInHouseDev(boolean inHouseDev) {
		this.inHouseDev = inHouseDev;
	}

	public String getDevSupport() {
		return devSupport;
	}

	public void setDevSupport(String devSupport) {
		this.devSupport = devSupport;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
