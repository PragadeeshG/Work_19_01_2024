package com.test1;

public class GraphAsService {
	private Integer serviceCode;
	private String graphName;
	private String nodeCount;
	private String nodeNames;
	private String propertiesName;
	private Integer propCount;
	private String propType;
	private String references;
	private String refLinkProvided;
	private Integer referenceDuration;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public GraphAsService() {

	}

	public GraphAsService(Integer serviceCode, String graphName, String nodeCount, String nodeNames,
			String propertiesName, Integer propCount, String propType, String references, String refLinkProvided,
			Integer referenceDuration, String creationDate, String modifiedDate, String entityState) {
		super();
		this.serviceCode = serviceCode;
		this.graphName = graphName;
		this.nodeCount = nodeCount;
		this.nodeNames = nodeNames;
		this.propertiesName = propertiesName;
		this.propCount = propCount;
		this.propType = propType;
		this.references = references;
		this.refLinkProvided = refLinkProvided;
		this.referenceDuration = referenceDuration;
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

	public String getGraphName() {
		return graphName;
	}

	public void setGraphName(String graphName) {
		this.graphName = graphName;
	}

	public String getNodeCount() {
		return nodeCount;
	}

	public void setNodeCount(String nodeCount) {
		this.nodeCount = nodeCount;
	}

	public String getNodeNames() {
		return nodeNames;
	}

	public void setNodeNames(String nodeNames) {
		this.nodeNames = nodeNames;
	}

	public String getPropertiesName() {
		return propertiesName;
	}

	public void setPropertiesName(String propertiesName) {
		this.propertiesName = propertiesName;
	}

	public Integer getPropCount() {
		return propCount;
	}

	public void setPropCount(Integer propCount) {
		this.propCount = propCount;
	}

	public String getPropType() {
		return propType;
	}

	public void setPropType(String propType) {
		this.propType = propType;
	}

	public String getReferences() {
		return references;
	}

	public void setReferences(String references) {
		this.references = references;
	}

	public String getRefLinkProvided() {
		return refLinkProvided;
	}

	public void setRefLinkProvided(String refLinkProvided) {
		this.refLinkProvided = refLinkProvided;
	}

	public Integer getReferenceDuration() {
		return referenceDuration;
	}

	public void setReferenceDuration(Integer referenceDuration) {
		this.referenceDuration = referenceDuration;
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
