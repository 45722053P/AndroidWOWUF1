package com.micompaia.wow.GsonLogros;

/**
 * Created by 45722053p on 15/01/16.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {

    private List<Achievement> achievements = new ArrayList<Achievement>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The achievements
     */
    public List<Achievement> getAchievements() {
        return achievements;
    }

    /**
     * @param achievements The achievements
     */
    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}