package ren.draven.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class UploadsAction {

	private File[] image;
	private String[] imageFileName;

	public File[] getImage() {
		return image;
	}

	public void setImage(File[] image) {
		this.image = image;
	}

	public String[] getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String[] imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String execute() throws Exception {
		// images/
		String realpath = ServletActionContext.getServletContext().getRealPath("/images");
		System.out.println(realpath);
		if (image != null) {
			File savedir = new File(realpath);
			if (!savedir.exists())
				savedir.mkdirs();
			for (int i = 0; i < image.length; i++) {
				File savefile = new File(savedir, imageFileName[i]);
				FileUtils.copyFile(image[i], savefile);
			}
			ActionContext.getContext().put("message", "上传成功");
		}
		return "success";
	}
}
