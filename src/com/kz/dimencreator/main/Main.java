package com.kz.dimencreator.main;

import com.kz.dimencreator.app.Constants;
import com.kz.dimencreator.util.KDimens;

public class Main {
	public static void main(String[] args) {
		KDimens.createDimens(Constants.DPI_MDPI);
		KDimens.createDimens(Constants.DPI_HIGH);
		KDimens.createDimens(Constants.DPI_XHIGH);
		KDimens.createDimens(Constants.DPI_XXHIGH);

		
	}
	
}
