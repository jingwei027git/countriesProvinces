import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("serial")
@Setter
@Getter
@ToString
public class CountryData extends BaseData {
	private Name name;
	private List<String> tld;
	private String cca2;
	private String ccn3;
	private String cca3;
	private String cioc;
	private List<String> currency;
	private List<String> callingCode;
	private String capital;
	private List<String> altSpellings;
	private String region;
	private String subregion;
	private Map<String, String> languages;
	private Map<String, NameObject> translations;
	private List<BigDecimal> latlng;
	private String demonym;
	private boolean landlocked;
	private List<String> borders;
	private BigDecimal area;
}
