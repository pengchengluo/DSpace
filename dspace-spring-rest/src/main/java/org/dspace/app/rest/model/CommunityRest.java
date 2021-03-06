/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.app.rest.model;

/**
 * The Community REST Resource
 * 
 * @author Andrea Bollini (andrea.bollini at 4science.it)
 *
 */
public class CommunityRest extends DSpaceObjectRest {
	public static final String NAME = "community";
	public static final String CATEGORY = RestModel.CORE;
	
	@Override
	public String getCategory() {
		return CATEGORY;
	}
	
	@Override
	public String getType() {
		return NAME;
	}

}
