/**
 * 
 */
package org.gwtopenmaps.openlayers.client.event;

import org.gwtopenmaps.openlayers.client.Map;
import org.gwtopenmaps.openlayers.client.layer.Layer;
import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 * @author Edwin Commandeur - Atlis EJS
 *
 */
public interface MapBaseLayerChangedListener extends EventListener {

    class MapBaseLayerChangedEvent extends EventObject {

        public MapBaseLayerChangedEvent(JSObject eventObject) {
            super(eventObject);
        }
        
        public Layer getLayer(){
            return super.getLayer();
        }
    }
    
    public void onBaseLayerChanged(Map source, MapBaseLayerChangedEvent eventObject);
}