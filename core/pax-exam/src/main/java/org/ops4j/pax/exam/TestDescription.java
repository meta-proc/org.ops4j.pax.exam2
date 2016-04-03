/*
 * Copyright 2016 Harald Wellmann.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.exam;

import java.io.Serializable;

/**
 * @author hwellmann
 *
 */
public class TestDescription implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String className;
    private String methodName;
    private Integer index;
    
    
    /**
     * 
     */
    public TestDescription(String className) {
        this(className, null, null);
    }
    
    public TestDescription(String className, String methodName) {
        this(className, methodName, null);
    }
    
    public TestDescription(String className, String methodName, Integer index) {
        this.className = className;
        this.methodName = methodName;
        this.index = index;
    }
    
    /**
     * @return the className
     */
    public String getClassName() {
        return className;
    }
    
    /**
     * @return the methodName
     */
    public String getMethodName() {
        return methodName;
    }
    
    /**
     * @return the index
     */
    public Integer getIndex() {
        return index;
    }
    
    

}