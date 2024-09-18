package Interface;

interface searchable {
	boolean search(String keyword);
}

class Document implements searchable {

	private String word;

	public Document(String word) {
		super();
		this.word = word;
	}

	@Override
	public boolean search(String keyword) {
		return word.contains(keyword);
	}
}

class Webpage implements searchable {
	private String WebURL;

	public Webpage(String URL) {
		super();
		this.WebURL = URL;
	}

	@Override
	public boolean search(String keyword) {
		return WebURL.contains(keyword);
	}
}

public class SearchableInterfaceEx2 {

	public static void main(String[] args) {
		Webpage wp = new Webpage("www.google.com");
		Document d1 = new Document("java tutuorial pdf");

		System.out.println(wp.search("comm"));
		System.out.println(d1.search("pdf"));

	}

}
