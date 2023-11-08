package test.mypac;

public class PostDto {
	
		private int num;
		private String author;
		private String title;

		public PostDto() {}

		public PostDto(int num, String author, String title) {
			super();
			this.num = num;
			this.author = author;
			this.title = title;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

	
		
	}

