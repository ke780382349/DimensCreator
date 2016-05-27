package com.kz.dimencreator.util;

import static com.kz.dimencreator.util.KFile.create;
import static com.kz.dimencreator.util.KFile.write;

import com.kz.dimencreator.app.Constants;

public class KDimens {

	public static void createDimens(int dpi) {
		switch (dpi) {
		case Constants.DPI_LDPI:
			create(Constants.DIMENS_LDPI);
			write(Constants.DIMENS_LDPI, Constants.SCALE_LDPI);
			break;
		case Constants.DPI_MDPI:
			create(Constants.DIMENS_MDPI);
			write(Constants.DIMENS_MDPI, Constants.SCALE_MDPI);
			break;
		case Constants.DPI_HIGH:
			create(Constants.DIMENS_HDPI);
			write(Constants.DIMENS_HDPI, Constants.SCALE_HDPI);
			break;
		case Constants.DPI_XHIGH:
			create(Constants.DIMENS_XHDPI);
			write(Constants.DIMENS_XHDPI, Constants.SCALE_XHDPI);
			break;
		case Constants.DPI_XXHIGH:
			create(Constants.DIMENS_XXHDPI);
			write(Constants.DIMENS_XXHDPI, Constants.SCALE_XXHDPI);
			break;
		default:
			break;
		}
	}
}
