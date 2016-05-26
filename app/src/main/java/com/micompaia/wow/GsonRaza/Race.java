package com.micompaia.wow.GsonRaza;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 45722053p on 11/01/16.
 */

public class Race {

        private Integer id;
        private Integer mask;
        private String side;
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
         * The side
         */
        public String getSide() {
            return side;
        }

        /**
         *
         * @param side
         * The side
         */
        public void setSide(String side) {
            this.side = side;
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
