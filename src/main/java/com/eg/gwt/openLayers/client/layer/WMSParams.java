package com.eg.gwt.openLayers.client.layer;

import com.eg.gwt.openLayers.client.Bounds;
import com.eg.gwt.openLayers.client.Options;

/**
 * 
 * @author Erdem Gunay
 *
 */
public class WMSParams extends Options {

	public WMSParams() {
		
	}
	
	public void setLayers(String layers) {
		setAttribute("layers", layers);
	}
	public String getLayers() {
		return getAttribute("layers");
	}
	
	public void setStyles(String styles) {
		setAttribute("styles", styles);
	}
	public String getStyles() {
		return getAttribute("styles");
	}
	
	public void setFormat(String styles) {
		setAttribute("format", styles);
	}
	public String getFormat() {
		return getAttribute("format");
	}
	
	public void setMaxExtent(Bounds bounds) {
		setAttribute("maxExtent", bounds.getJSObject());
	}
	public Bounds getMaxExtent() {
		return Bounds.narrowToBounds(getAttributeAsJSObject("maxExtent"));
	}
}
