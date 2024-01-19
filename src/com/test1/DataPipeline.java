package com.test1;

public class DataPipeline {
	private Integer pipelineCode;
	private String stageCode;
	private boolean exitAfterFailure;
	private Integer stageCount;
	private String fowChange;
	private String scriptName;
	private Integer scriptTypeCode;
	private Integer executionTimeInMillis;
	private String autoCancelForLongExec;
	private Integer maxExecDuration;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataPipeline() {

	}

	public DataPipeline(Integer pipelineCode, String stageCode, boolean exitAfterFailure, Integer stageCount,
			String fowChange, String scriptName, Integer scriptTypeCode, Integer executionTimeInMillis,
			String autoCancelForLongExec, Integer maxExecDuration, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.pipelineCode = pipelineCode;
		this.stageCode = stageCode;
		this.exitAfterFailure = exitAfterFailure;
		this.stageCount = stageCount;
		this.fowChange = fowChange;
		this.scriptName = scriptName;
		this.scriptTypeCode = scriptTypeCode;
		this.executionTimeInMillis = executionTimeInMillis;
		this.autoCancelForLongExec = autoCancelForLongExec;
		this.maxExecDuration = maxExecDuration;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getPipelineCode() {
		return pipelineCode;
	}

	public void setPipelineCode(Integer pipelineCode) {
		this.pipelineCode = pipelineCode;
	}

	public String getStageCode() {
		return stageCode;
	}

	public void setStageCode(String stageCode) {
		this.stageCode = stageCode;
	}

	public boolean isExitAfterFailure() {
		return exitAfterFailure;
	}

	public void setExitAfterFailure(boolean exitAfterFailure) {
		this.exitAfterFailure = exitAfterFailure;
	}

	public Integer getStageCount() {
		return stageCount;
	}

	public void setStageCount(Integer stageCount) {
		this.stageCount = stageCount;
	}

	public String getFowChange() {
		return fowChange;
	}

	public void setFowChange(String fowChange) {
		this.fowChange = fowChange;
	}

	public String getScriptName() {
		return scriptName;
	}

	public void setScriptName(String scriptName) {
		this.scriptName = scriptName;
	}

	public Integer getScriptTypeCode() {
		return scriptTypeCode;
	}

	public void setScriptTypeCode(Integer scriptTypeCode) {
		this.scriptTypeCode = scriptTypeCode;
	}

	public Integer getExecutionTimeInMillis() {
		return executionTimeInMillis;
	}

	public void setExecutionTimeInMillis(Integer executionTimeInMillis) {
		this.executionTimeInMillis = executionTimeInMillis;
	}

	public String getAutoCancelForLongExec() {
		return autoCancelForLongExec;
	}

	public void setAutoCancelForLongExec(String autoCancelForLongExec) {
		this.autoCancelForLongExec = autoCancelForLongExec;
	}

	public Integer getMaxExecDuration() {
		return maxExecDuration;
	}

	public void setMaxExecDuration(Integer maxExecDuration) {
		this.maxExecDuration = maxExecDuration;
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
