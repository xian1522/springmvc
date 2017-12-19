package springmvc.web.uploadfile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/fileupload")
public class FileUploadController {
	
	@RequestMapping("/fileupload")
	public String fileupload(){
		return "/fileupload/fileupload";
	}
	
	@RequestMapping(value="/processUpload",method=RequestMethod.POST)
	public String processUpload(@RequestParam MultipartFile file,Model model){
		model.addAttribute("filename", file.getOriginalFilename());
		try {
			InputStream inputStream = file.getInputStream();
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] array = new byte[1024];
			int length;
			while((length = inputStream.read(array))!=-1){
				out.write(array,0,length);
			}
			String content = out.toString("utf-8");
			model.addAttribute("content", content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "fileupload/fileupload";
	}
}
