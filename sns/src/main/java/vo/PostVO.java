package vo;

public class PostVO {
	private int no; //글번호
	private int re_no; //리포스트 번호
	private String cont; //글 내용
	private int view; //조회수
	private int loveCnt; //좋아요 수
	private String[] filename; //첨부 파일
	
	//getter
	public int getNo() {
		return no;
	}
	public int getRe_no() {
		return re_no;
	}
	public String getCont() {
		return cont;
	}
	public int getView() {
		return view;
	}
	public int getLoveCnt() {
		return loveCnt;
	}
	public String[] getFilename() {
		return filename;
	}
	
	//setter
	public void setNo(int no) {
		this.no = no;
	}
	public void setRe_no(int re_no) {
		this.re_no = re_no;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	public void setView(int view) {
		this.view = view;
	}
	public void setLoveCnt(int loveCnt) {
		this.loveCnt = loveCnt;
	}
	public void setFilename(String[] filename) {
		this.filename = filename;
	}
}
