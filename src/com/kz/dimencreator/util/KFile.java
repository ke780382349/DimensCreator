package com.kz.dimencreator.util;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import com.kz.dimencreator.app.Constants;

public class KFile {

	public static void create(String path) {
		path = Constants.SAVE_PATH + path;
		File file = new File(getPath(path));
		try {
			if (!file.exists()) {
				file.mkdirs();
			}
			file = new File(path);
			if (!file.exists()) {
				file.createNewFile();
			} else {
				file.delete();
				file.createNewFile();
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

	public static void write(String path, double scale) {
		StringBuffer sb = new StringBuffer();
		path = Constants.SAVE_PATH + path;
		File file = new File(path);
		if (!file.exists()) {
			KLog.i("²»´æÔÚ");
			return;
		}
		BufferedWriter bw = null;
		try {
			OutputStream os = new FileOutputStream(file);
			bw = new BufferedWriter(new OutputStreamWriter(os));
			sb.append("<resources>").append("\r\n");
			for (int i = 1; i <= 500; i++) {
				if (i % 2 == 0) {
					sb.append("\t<dimen name='px" + i + "'>" + (int) ((i / scale) + 0.5f) + "dp</dimen>")
							.append("\r\n");
				}
				sb.append("\t<dimen name='sp" + i + "'>" + (int) ((i / scale) + 0.5f) + "sp</dimen>").append("\r\n");
			}
			sb.append("</resources>");
			String content = sb.toString().replaceAll("'", String.valueOf('"'));
			bw.write(content);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeStream(bw);
		}
	}

	public static void closeStream(Closeable closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static String getPath(String path) {
		int i = path.lastIndexOf('/');
		return path.substring(0, i);
	}

}
