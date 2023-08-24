package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) throws IOException {

		File file = new File("/Users/nag/Downloads/WFS_Daywise_toc_aug_sep_2023_V3.xlsx");

		FileInputStream fis = new FileInputStream(file);
		byte[] data = new byte[(int) file.length()];
		fis.read(data);
		fis.close();

		FileOutputStream fos = new FileOutputStream("/Users/nag/Downloads/WFS_Daywise_toc_aug_sep_2023_V3_new.xlsx");
		fos.write(data);
		fos.flush();
		fos.close();

	}

}
