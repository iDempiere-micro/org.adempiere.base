package org.adempiere.process;

import org.compiere.impl.MAttachment;
import org.compiere.impl.MShipperLabels;

public interface IPrintShippingLabel {

	public String printToLabelPrinter(MAttachment attachment, MShipperLabels labelType) throws Exception;
	
	public String printImageLabel(MAttachment attachment, MShipperLabels labelType, String title) throws Exception;
	
}