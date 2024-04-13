package org.lshq.components.data.enums;

/**
 * 场景编码
 *
 * @author zhh
 * @date 2024-04-13
 * <p>
 * {@link ,}
 */
public enum BusinessEnum {

	/**
	 * 慢病
	 */
	CHRONIC("CHRONIC", "慢病管理"),
	/**
	 * 基础架构
	 */
	UNDERLYING("UNDERLYING", "基础架构"),


	;

	private String code;
	private String value;

	private BusinessEnum(String code, String value) {
		this.code = code;
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public String getValue() {
		return value;
	}
}
