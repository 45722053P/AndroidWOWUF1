package com.micompaia.wow.GsonRaza;

/**
 * Created by 45722053p on 11/01/16.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Example {

        private List<Race> races = new ArrayList<Race>();
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The races
         */
        public List<Race> getRaces() {
            return races;
        }

        /**
         *
         * @param races
         * The races
         */
        public void setRaces(List<Race> races) {
            this.races = races;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }
