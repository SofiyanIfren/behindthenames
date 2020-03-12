package getthenames;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import behindthenames.Launcher;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class AfricanNames {
	
	public void getAfricanNamesPage1 () {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
                .url("https://www.behindthename.com/names/usage/african")
                .build();
		try {
			Response response = client.newCall(request).execute();
			String htmlPage = response.body().string();
			System.out.println(htmlPage);
			Document doc = Jsoup.parseBodyFragment(htmlPage);
			List<Element> elements = doc.getElementsByClass("browsename"); 
			for (Element el : elements) {
				System.err.print(el.getElementsByClass("listname").text() + " - "); // gets the name
				System.err.print(el.getElementsByClass("listgender").text() + " - "); // gets the sex
				String[] usages = el.getElementsByClass("listusage").text().split(",");
				for (String usage : usages) {
					System.err.print(usage + " - "); // gets the usage
				}
				System.out.println(Launcher.africanOccurences);
				//System.out.println(el.text()); // gets the signifation (text to parse)
				Launcher.africanOccurences += 1;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void getAfricanNamesPage2 () {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
                .url("https://www.behindthename.com/names/usage/african/2")
                .build();
		try {
			Response response = client.newCall(request).execute();
			String htmlPage = response.body().string();
			System.out.println(htmlPage);
			Document doc = Jsoup.parseBodyFragment(htmlPage);
			List<Element> elements = doc.getElementsByClass("browsename"); 
			for (Element el : elements) {
				System.err.print(el.getElementsByClass("listname").text() + " - "); // gets the name
				System.err.print(el.getElementsByClass("listgender").text() + " - "); // gets the sex
				String[] usages = el.getElementsByClass("listusage").text().split(",");
				for (String usage : usages) {
					System.err.print(usage + " - "); // gets the usage
				}
				System.out.println(Launcher.africanOccurences);
				//System.out.println(el.text()); // gets the signifation (text to parse)
				Launcher.africanOccurences += 1;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
