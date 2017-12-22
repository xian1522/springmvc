package springmvc.data.stackoverflow;

import java.util.Date;

public class StackoverflowQuestion {
	private int id;
	private String title;
	private String content;
	private String anwser;
	private String tag;
	private String remark;
	private Date createdate;
	private Date lstmntdate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAnwser() {
		return anwser;
	}
	public void setAnwser(String anwser) {
		this.anwser = anwser;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public Date getLstmntdate() {
		return lstmntdate;
	}
	public void setLstmntdate(Date lstmntdate) {
		this.lstmntdate = lstmntdate;
	}
	
}
