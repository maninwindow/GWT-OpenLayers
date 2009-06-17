package org.gwtopenmaps.openlayers.client.popup;

import org.gwtopenmaps.openlayers.client.LonLat;
import org.gwtopenmaps.openlayers.client.OpenLayersObjectWrapper;
import org.gwtopenmaps.openlayers.client.Size;
import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 * 
 * @author Erdem Gunay
 *
 */
public class AnchoredBubble extends Popup {

	protected AnchoredBubble(JSObject element) {
		super(element);
	}

	public AnchoredBubble(String id, LonLat lonlat, Size size, String html, OpenLayersObjectWrapper anchor, boolean closeBox) {
		this(AnchoredBubbleImpl.create(id, 
				lonlat.getJSObject(),
				size.getJSObject(),
				html,
				anchor.getJSObject(), 
				closeBox));
	}
	
}