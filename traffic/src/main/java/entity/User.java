package entity;
public class User {
    private int id;//�û����
    private String nickName;//�û��ǳ�
    private String name;//�û�����
    private String phone;//�û��ֻ���
    private String birthday;//�û�����
    private String email;//�û�����
    private int liveCity;//��ס���б��
    private String address;//��ϸ��ַ
    private String married;//�������
    private String job;//ְҵ
    private String education;//ѧ��
    private String password;//����
    private String passQuestion;//�ܱ�����
    private String personalId;//֤������
    private String paperType;//֤������
    private String sex;
    
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getLiveCity() {
		return liveCity;
	}
	public void setLiveCity(int liveCity) {
		this.liveCity = liveCity;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMarried() {
		return married;
	}
	public void setMarried(String married) {
		this.married = married;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassQuestion() {
		return passQuestion;
	}
	public void setPassQuestion(String passQuestion) {
		this.passQuestion = passQuestion;
	}
	public String getPersonalId() {
		return personalId;
	}
	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}
	public String getPaperType() {
		return paperType;
	}
	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}
	@Override
	public String toString() {
		return "User [nickName=" + nickName + ", name=" + name + ", phone=" + phone + ", birthday=" + birthday
				+ ", email=" + email + ", liveCity=" + liveCity + ", address=" + address + ", married=" + married
				+ ", job=" + job + ", education=" + education + ", password=" + password + ", passQuestion="
				+ passQuestion + ", personalId=" + personalId + ", paperType=" + paperType + ", sex=" + sex + "]";
	}
	

	
    
}
