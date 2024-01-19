package com.test1;

public class DataLineage {
	private Integer flowId;
	private String dataSource;
	private String flowPoint;
	private String transformation;
	private String flowTime;
	private String difference;
	private String beforeSnapshot;
	private String afterSnapshot;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataLineage() {

	}

	public DataLineage(Integer flowId, String dataSource, String flowPoint, String transformation, String flowTime,
			String difference, String beforeSnapshot, String afterSnapshot, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.flowId = flowId;
		this.dataSource = dataSource;
		this.flowPoint = flowPoint;
		this.transformation = transformation;
		this.flowTime = flowTime;
		this.difference = difference;
		this.beforeSnapshot = beforeSnapshot;
		this.afterSnapshot = afterSnapshot;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getFlowId() {
		return flowId;
	}

	public void setFlowId(Integer flowId) {
		this.flowId = flowId;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getFlowPoint() {
		return flowPoint;
	}

	public void setFlowPoint(String flowPoint) {
		this.flowPoint = flowPoint;
	}

	public String getTransformation() {
		return transformation;
	}

	public void setTransformation(String transformation) {
		this.transformation = transformation;
	}

	public String getFlowTime() {
		return flowTime;
	}

	public void setFlowTime(String flowTime) {
		this.flowTime = flowTime;
	}

	public String getDifference() {
		return difference;
	}

	public void setDifference(String difference) {
		this.difference = difference;
	}

	public String getBeforeSnapshot() {
		return beforeSnapshot;
	}

	public void setBeforeSnapshot(String beforeSnapshot) {
		this.beforeSnapshot = beforeSnapshot;
	}

	public String getAfterSnapshot() {
		return afterSnapshot;
	}

	public void setAfterSnapshot(String afterSnapshot) {
		this.afterSnapshot = afterSnapshot;
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
