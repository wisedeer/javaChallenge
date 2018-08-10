package passwordReset;

public class UserInfoReply {
	
    public UserInfoReply(long id, String validityString) {
        this.id = id;
        this.validityString = validityString;
    }
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getValidityString() {
		return validityString;
	}
	public void setValidityString(String validityString) {
		this.validityString = validityString;
	}
	private long id;
	private String validityString;
}
