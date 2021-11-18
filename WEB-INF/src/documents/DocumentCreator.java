package documents;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class DocumentCreator {
	public void createDocument() throws IOException {
		XWPFDocument document = new XWPFDocument();
		
		XWPFParagraph title = document.createParagraph();
		title.setAlignment(ParagraphAlignment.CENTER);
		
		XWPFRun titleRun = title.createRun();
		titleRun.setText("Build Your REST API with Spring");
		titleRun.setColor("009933");
		titleRun.setBold(true);
		titleRun.setFontFamily("Courier");
		titleRun.setFontSize(20);
		
		XWPFParagraph subTitle = document.createParagraph();
		XWPFRun subTitleRun = subTitle.createRun();
		subTitleRun.setText("from HTTP fundamentals to API Mastery");
		subTitleRun.setColor("00CC44");
		subTitleRun.setFontFamily("Courier");
		subTitleRun.setFontSize(16);
		subTitleRun.setTextPosition(20);
		subTitleRun.setUnderline(UnderlinePatterns.DOT_DOT_DASH);
		
		XWPFParagraph para1 = document.createParagraph();
		para1.setAlignment(ParagraphAlignment.BOTH);
		String string1 = convertTextFileToString("fileName.txt");
		XWPFRun para1Run = para1.createRun();
		para1Run.setText(string1);
		
		FileOutputStream out = new FileOutputStream("DocumentName.docx");
		document.write(out);
		out.close();
		document.close();
	}
	
	public String convertTextFileToString(String fileName) {
	    try (Stream<String> stream 
	      = Files.lines(Paths.get(ClassLoader.getSystemResource(fileName).toURI()))) {

	        return stream.collect(Collectors.joining(" "));
	    } catch (IOException | URISyntaxException e) {
	        return null;
	    }
	}
}
