package org.gwtopenmaps.openlayers.client.layer;

import org.gwtopenmaps.openlayers.client.Bounds;
import org.gwtopenmaps.openlayers.client.Marker;
import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 * 
 * @author Erdem Gunay
 * @author Wayne Fang - Refractions Research
 * @author Aaron Novstrup - Stottler Henke Associates, Inc.
 *
 */
public class Markers extends Layer {

	protected Markers(JSObject element) {
		super(element);
	}

	public Markers(String name) {
		this (MarkersImpl.create(name));
	}
	
	public void addMarker(Marker marker) {
		MarkersImpl.addMarker(getJSObject(), marker.getJSObject());
	}
	
	public void removeMarker(Marker marker) {
		MarkersImpl.removeMarker(getJSObject(), marker.getJSObject());
	}
	
	public Bounds getDataExtent() {
	   return Bounds.narrowToBounds(MarkersImpl.getDataExtent(getJSObject()));
	}
	
	public void destroy() {
		MarkersImpl.destroy(getJSObject());
	}
}