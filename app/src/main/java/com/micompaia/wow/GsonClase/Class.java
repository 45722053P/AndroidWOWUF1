package com.micompaia.wow.GsonClase;

import java.util.Map;

/**
 * Created by 45722053p on 13/01/16.
 */
import java.util.HashMap;

public class Class {

        private Integer id;
        private Integer mask;
        private String powerType;
        private String name;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    /**

         *
         * @return
         * The id
         */
        public Integer getId() {
            return id;
        }

        /**
         *
         * @param id
         * The id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         *
         * @return
         * The mask
         */
        public Integer getMask() {
            return mask;
        }

        /**
         *
         * @param mask
         * The mask
         */
        public void setMask(Integer mask) {
            this.mask = mask;
        }

        /**
         *
         * @return
         * The powerType
         */
        public String getPowerType() {
            return powerType;
        }

        /**
         *
         * @param powerType
         * The powerType
         */
        public void setPowerType(String powerType) {
            this.powerType = powerType;
        }

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

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

}
