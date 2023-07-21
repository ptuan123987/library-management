package com.app.library.model;

public class Author {
   private int au_id;
	    private String au_fullname;
	    private String au_introduce;
	    private String au_image;



	    public Author(int au_id, String au_fullname, String au_introduce, String au_image) {
			super();
			this.au_id = au_id;
			this.au_fullname = au_fullname;
			this.au_introduce = au_introduce;
			this.au_image = au_image;
		}
	    

		public int getAu_id() {
	        return au_id;
	    }

	    public void setAu_id(int au_id) {
	        this.au_id = au_id;
	    }

	    public String getAu_fullname() {
	        return au_fullname;
	    }

	    public void setAu_fullname(String au_fullname) {
	        this.au_fullname = au_fullname;
	    }

	    public String getAu_introduce() {
	        return au_introduce;
	    }

	    public void setAu_introduce(String au_introduce) {
	        this.au_introduce = au_introduce;
	    }

	    public String getAu_image() {
	        return au_image;
	    }

	    public void setAu_image(String au_image) {
	        this.au_image = au_image;
	    }
}
