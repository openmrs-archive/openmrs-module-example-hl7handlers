/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.examplehl7handlers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.hl7.HL7InQueueProcessor;
import org.openmrs.hl7.handler.ORUR01Handler;

import ca.uhn.hl7v2.app.ApplicationException;
import ca.uhn.hl7v2.model.Message;

/**
 * Demonstrates adding in a new handler into openmrs
 * 
 * @see HL7InQueueProcessor
 */
public class AlternateORUR01Handler extends ORUR01Handler {
	
	private Log log = LogFactory.getLog(AlternateORUR01Handler.class);
	
	/**
	 * Processes an ORU R01 event message
	 */
	public Message processMessage(Message message) throws ApplicationException {
		log.debug("In module processing ORU message: " + message.getName());
		
		throw new ApplicationException("In alternate oru r01 parser");
	}
	
}
