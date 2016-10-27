import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("serial")
@Setter
@Getter
@ToString
public class ProvinceData extends BaseData {
	private Name name;
	private String cca2;
	private String countryCca2;
	private Map<String, NameObject> translations;
}
