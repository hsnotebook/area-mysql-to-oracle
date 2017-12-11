package org.hsnotebook.demo.oracle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "area")
public class OracleArea {
	
	@Id
	private Integer code;
	
	private String name;
	
	@Column(name = "administrative_level")
	private Integer administrativeLevel;
	
	@Column(name = "parent_code")
	private Integer parentCode;
	
	private Double latitude;
	private Double longitude;
	
	@Column(name = "map_level")
	private Integer mapLevel;
	
	private Integer sort;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAdministrativeLevel() {
		return administrativeLevel;
	}

	public void setAdministrativeLevel(Integer administrativeLevel) {
		this.administrativeLevel = administrativeLevel;
	}

	public Integer getParentCode() {
		return parentCode;
	}

	public void setParentCode(Integer parentCode) {
		this.parentCode = parentCode;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getMapLevel() {
		return mapLevel;
	}

	public void setMapLevel(Integer mapLevel) {
		this.mapLevel = mapLevel;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
}
