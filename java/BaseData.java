package com.softpower.bean.address.raw;

import java.io.Serializable;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("serial")
public abstract class BaseData implements Serializable {
	@ToString
	@Setter
	@Getter
	public static class Name {
		private String common;
		private String official;
		@SerializedName("native")
		private Map<String, NameObject> natives;
	}

	@ToString
	@Setter
	@Getter
	public static class NameObject {
		private String official;
		private String common;
	}
}
