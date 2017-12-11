package org.hsnotebook.demo.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sys_area")
public class MySqlArea {
	
	@Id
	private String id;
	
	@Column(name = "parent_id")
	private String parentId;
	@Column(name = "parent_ids")
	private String parentIds;
	private String name;
	private int sort;
	private String code;

	private Double longitude;
	
	@Column(name = "dimension")
	private Double latitude;
	
	@Column(name = "layer")
	private int mapLevel;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentIds() {
		return parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public int getMapLevel() {
		return mapLevel;
	}

	public void setMapLevel(int mapLevel) {
		this.mapLevel = mapLevel;
	}
	
}
