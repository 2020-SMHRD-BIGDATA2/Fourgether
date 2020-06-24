package FourUI;

public class FCVO {
	String code;
	String name;
	String type;
	String max_time;
	String sum_people;
	String ms_sq;
	String img_url;
	String home_url;
	String fee_yn;
	String start;
	String end;

	public FCVO(String code, String name, String type, String max_time, String sum_people, String ms_sq, String img_url,
			String home_url, String fee_yn, String start, String end) {
		this.code = code;
		this.name = name;
		this.type = type;
		this.max_time = max_time;
		this.sum_people = sum_people;
		this.ms_sq = ms_sq;
		this.img_url = img_url;
		this.home_url = home_url;
		this.fee_yn = fee_yn;
		this.start = start;
		this.end = end;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMax_time() {
		return max_time;
	}

	public void setMax_time(String max_time) {
		this.max_time = max_time;
	}

	public String getSum_people() {
		return sum_people;
	}

	public void setSum_people(String sum_people) {
		this.sum_people = sum_people;
	}

	public String getMs_sq() {
		return ms_sq;
	}

	public void setMs_sq(String ms_sq) {
		this.ms_sq = ms_sq;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public String getHome_url() {
		return home_url;
	}

	public void setHome_url(String home_url) {
		this.home_url = home_url;
	}

	public String getFee_yn() {
		return fee_yn;
	}

	public void setFee_yn(String fee_yn) {
		this.fee_yn = fee_yn;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

}
