package com.test1;

public class NeoService {
	private Integer serviceCode;
	private String onPermService;
	private String cloudData;
	private String relationship;
	private Integer selfHosted;
	private Integer securityReq;
	private Integer connectedData;
	private String schemaFree;
	private String graphscale;
	private Integer shardsCount;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public NeoService() {

	}

	public NeoService(Integer serviceCode, String onPermService, String cloudData, String relationship,
			Integer selfHosted, Integer securityReq, Integer connectedData, String schemaFree, String graphscale,
			Integer shardsCount, String creationDate, String modifiedDate, String entityState) {
		super();
		this.serviceCode = serviceCode;
		this.onPermService = onPermService;
		this.cloudData = cloudData;
		this.relationship = relationship;
		this.selfHosted = selfHosted;
		this.securityReq = securityReq;
		this.connectedData = connectedData;
		this.schemaFree = schemaFree;
		this.graphscale = graphscale;
		this.shardsCount = shardsCount;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(Integer serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getOnPermService() {
		return onPermService;
	}

	public void setOnPermService(String onPermService) {
		this.onPermService = onPermService;
	}

	public String getCloudData() {
		return cloudData;
	}

	public void setCloudData(String cloudData) {
		this.cloudData = cloudData;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public Integer getSelfHosted() {
		return selfHosted;
	}

	public void setSelfHosted(Integer selfHosted) {
		this.selfHosted = selfHosted;
	}

	public Integer getSecurityReq() {
		return securityReq;
	}

	public void setSecurityReq(Integer securityReq) {
		this.securityReq = securityReq;
	}

	public Integer getConnectedData() {
		return connectedData;
	}

	public void setConnectedData(Integer connectedData) {
		this.connectedData = connectedData;
	}

	public String getSchemaFree() {
		return schemaFree;
	}

	public void setSchemaFree(String schemaFree) {
		this.schemaFree = schemaFree;
	}

	public String getGraphscale() {
		return graphscale;
	}

	public void setGraphscale(String graphscale) {
		this.graphscale = graphscale;
	}

	public Integer getShardsCount() {
		return shardsCount;
	}

	public void setShardsCount(Integer shardsCount) {
		this.shardsCount = shardsCount;
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
