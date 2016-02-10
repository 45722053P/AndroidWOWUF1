package com.micompaia.wow.GsonMascotas;

/**
 * Created by alex on 14/01/2016.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {

    private List<PetType> petTypes = new ArrayList<PetType>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The petTypes
     */
    public List<PetType> getPetTypes() {
        return petTypes;
    }

    /**
     *
     * @param petTypes
     * The petTypes
     */
    public void setPetTypes(List<PetType> petTypes) {
        this.petTypes = petTypes;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
