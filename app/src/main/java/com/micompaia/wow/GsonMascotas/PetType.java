package com.micompaia.wow.GsonMascotas;

/**
 * Created by alex on 14/01/2016.
 */
import java.util.HashMap;
import java.util.Map;

public class PetType {

    private Integer id;
    private String key;
    private String name;
    private Integer typeAbilityId;
    private Integer strongAgainstId;
    private Integer weakAgainstId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key The key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The typeAbilityId
     */
    public Integer getTypeAbilityId() {
        return typeAbilityId;
    }

    /**
     * @param typeAbilityId The typeAbilityId
     */
    public void setTypeAbilityId(Integer typeAbilityId) {
        this.typeAbilityId = typeAbilityId;
    }

    /**
     * @return The strongAgainstId
     */
    public Integer getStrongAgainstId() {
        return strongAgainstId;
    }

    /**
     * @param strongAgainstId The strongAgainstId
     */
    public void setStrongAgainstId(Integer strongAgainstId) {
        this.strongAgainstId = strongAgainstId;
    }

    /**
     * @return The weakAgainstId
     */
    public Integer getWeakAgainstId() {
        return weakAgainstId;
    }

    /**
     * @param weakAgainstId The weakAgainstId
     */
    public void setWeakAgainstId(Integer weakAgainstId) {
        this.weakAgainstId = weakAgainstId;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
