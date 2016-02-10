package com.micompaia.wow.GsonMonturas;

/**
 * Created by 45722053p on 15/01/16.
 */
import java.util.HashMap;
import java.util.Map;

public class Mount {

    private String name;
    private Integer spellId;
    private Integer creatureId;
    private Integer itemId;
    private Integer qualityId;
    private String icon;
    private Boolean isGround;
    private Boolean isFlying;
    private Boolean isAquatic;
    private Boolean isJumping;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The spellId
     */
    public Integer getSpellId() {
        return spellId;
    }

    /**
     *
     * @param spellId
     * The spellId
     */
    public void setSpellId(Integer spellId) {
        this.spellId = spellId;
    }

    /**
     *
     * @return
     * The creatureId
     */
    public Integer getCreatureId() {
        return creatureId;
    }

    /**
     *
     * @param creatureId
     * The creatureId
     */
    public void setCreatureId(Integer creatureId) {
        this.creatureId = creatureId;
    }

    /**
     *
     * @return
     * The itemId
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     *
     * @param itemId
     * The itemId
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     *
     * @return
     * The qualityId
     */
    public Integer getQualityId() {
        return qualityId;
    }

    /**
     *
     * @param qualityId
     * The qualityId
     */
    public void setQualityId(Integer qualityId) {
        this.qualityId = qualityId;
    }

    /**
     *
     * @return
     * The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     *
     * @param icon
     * The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     *
     * @return
     * The isGround
     */
    public Boolean getIsGround() {
        return isGround;
    }

    /**
     *
     * @param isGround
     * The isGround
     */
    public void setIsGround(Boolean isGround) {
        this.isGround = isGround;
    }

    /**
     *
     * @return
     * The isFlying
     */
    public Boolean getIsFlying() {
        return isFlying;
    }

    /**
     *
     * @param isFlying
     * The isFlying
     */
    public void setIsFlying(Boolean isFlying) {
        this.isFlying = isFlying;
    }

    /**
     *
     * @return
     * The isAquatic
     */
    public Boolean getIsAquatic() {
        return isAquatic;
    }

    /**
     *
     * @param isAquatic
     * The isAquatic
     */
    public void setIsAquatic(Boolean isAquatic) {
        this.isAquatic = isAquatic;
    }

    /**
     *
     * @return
     * The isJumping
     */
    public Boolean getIsJumping() {
        return isJumping;
    }

    /**
     *
     * @param isJumping
     * The isJumping
     */
    public void setIsJumping(Boolean isJumping) {
        this.isJumping = isJumping;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}