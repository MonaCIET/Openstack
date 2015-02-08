package org.openstack4j.model.storage.object;

import java.util.Map;

import org.openstack4j.model.ModelEntity;

/**
 * Represents an OpenStack Swift Container which holds Objects
 * 
 * @author Jeremy Unruh
 */
public interface SwiftContainer extends ModelEntity {

    /**
     * The name of the Container
     * 
     * @return the container name
     */
    String getName();
    
    /**
     * The total count of object 
     * 
     * @return total count of object
     */
    int getObjectCount();

    /**
     * The total size of all the objects within this contain in bytes
     * 
     * @return total size in bytes
     */
    long getTotalSize();
    
    /**
     * The metadata for the current container.  NOTE: This is a lazy call to the server and will invoke each time this
     * method is called.
     * @return The metadata for this container
     */
    Map<String, String> getMetadata();
    
    /**
     * The content type of the container
     * 
     * @return the content type
     */
    String getContentType();
    
    /**
     * Hash value of the container
     * 
     * @return the hash value
     */
    String getHash();
    
    /**
     * Last modified date of the container
     * 
     * @return the last modified date
     */
    String getLastModified();
}
