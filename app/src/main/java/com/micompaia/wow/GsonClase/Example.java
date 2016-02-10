package com.micompaia.wow.GsonClase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 45722053p on 13/01/16.
 */
public class Example {

        private List<Class> classes = new ArrayList<Class>();
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The classes
         */
        public List<Class> getClasses() {
            return classes;
        }

        /**
         *
         * @param classes
         * The classes
         */
        public void setClasses(List<Class> classes) {
            this.classes = classes;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }


}
