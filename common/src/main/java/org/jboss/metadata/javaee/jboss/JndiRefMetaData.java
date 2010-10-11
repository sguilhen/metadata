/*
 * JBoss, Home of Professional Open Source
 * Copyright 2006, JBoss Inc., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.metadata.javaee.jboss;

import org.jboss.metadata.javaee.support.ResourceInjectionMetaDataWithDescriptions;

import javax.xml.bind.annotation.XmlType;

/**
 * JndiRefMetaData.
 *
 * @author <a href="adrian@jboss.com">Adrian Brock</a>
 * @version $Revision: 1.1 $
 */
@XmlType(name = "jndi-refType", propOrder = { "descriptions", "jndiRefName", "jndiName", "mappedName", "injectionTargets",
        "lookupName", "ignoreDependency" })
public class JndiRefMetaData extends ResourceInjectionMetaDataWithDescriptions {
    /** The serialVersionUID */
    private static final long serialVersionUID = 6572104852686049731L;

    /**
     * Get the jndiRefName.
     *
     * @return the jndiRefName.
     */
    public String getJndiRefName() {
        return getName();
    }

    /**
     * Set the jndiRefName.
     *
     * @param jndiRefName the jndiRefName.
     * @throws IllegalArgumentException for a null jndiRefName
     */
    public void setJndiRefName(String jndiRefName) {
        setName(jndiRefName);
    }
}