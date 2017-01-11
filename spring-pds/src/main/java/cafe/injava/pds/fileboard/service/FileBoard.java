package cafe.injava.pds.fileboard.service;

public class FileBoard {
	private String title;
	private String auth;
	private String fileName;
	private String filePath;
	private String extention;
	
	@Override
	public String toString() {
		return "FileBoard [title=" + title + ", auth=" + auth + ", fileName=" + fileName + ", filePath=" + filePath
				+ ", extention=" + extention + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getExtention() {
		return extention;
	}
	public void setExtention(String extention) {
		this.extention = extention;
	}
	
}
