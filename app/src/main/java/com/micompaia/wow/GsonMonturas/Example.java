package com.micompaia.wow.GsonMonturas;

/**
 * Created by 45722053p on 15/01/16.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Example {

    private List<Mount> mounts = new ArrayList<Mount>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The mounts
     */
    public List<Mount> getMounts() {
        return mounts;
    }

    /**
     *
     * @param mounts
     * The mounts
     */
    public void setMounts(List<Mount> mounts) {
        this.mounts = mounts;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
