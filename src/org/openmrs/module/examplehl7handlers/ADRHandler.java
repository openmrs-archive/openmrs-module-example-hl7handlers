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

import ca.uhn.hl7v2.app.Application;
import ca.uhn.hl7v2.app.ApplicationException;
import ca.uhn.hl7v2.model.Message;

/**
 * Demonstrates adding in a new handler into openmrs
 * 
 * @see HL7InQueueProcessor
 */
public class ADRHandler implements Application {
	
	private Log log = LogFactory.getLog(ADRHandler.class);
	
	/**
	 * Check for ADR* messages because we've mapped this handler to both ADR_A19 and ADR_A20
	 * messages
	 * 
	 * @return true if an ADR type of message
	 */
	public boolean canProcess(Message message) {
		return message != null && message.getName().startsWith("ADR_");
	}
	
	/**
	 * Processes an ORU R01 event message
	 */
	public Message processMessage(Message message) throws ApplicationException {
		// example ADR_A19 message: "MSH|^~\\&|CommServer||KIS||200811111017||ADR^A19||P|2.2\rMSA|AA\rQRD|200811111016|R|I|Q1004|||1^RD|10000437363|DEM\rPID|||10000437363|508003|Bauer^Fritz^^^||19631101|M|||Mercedesstr 12^^Bergheim^^68123^D|||||M|\rNK1|1|Bauer^Karin|Ehefrau\rPV1||S|CHI1^2W^1^CHI|R||||20 56 344^Antonius^ Markus^^^Dr.med.^^^Königstr. 112^69939^Haarheim/M.\r^06146^61011|20 56 344^Antonius^Markus^^^Dr.med.^^^Königstr. 112^69939^Haarheim/M.^06146^\r61011|N|||||||||9800703||K|||||||||||||||||||||||200311110928\rDG1|3||087.9^087.9 Borreliose^I9|||EL|||||||||3\rPR1|1||1-502.6^1-502.6 Biopsie durch Inzision am Unterschenkel^ICPM||20031107|P\rIN1|1|0||NAK|Innenstr. 52 ^^Hannover^^30014||||||||207714 ||10035|Bauer^Fritz||19631101|\rMercedesstr 12^^Bergheim^^68123"
		
		log.debug("Processing ADR message: " + message.getName());
		
		throw new ApplicationException("In ADR A19 parser");
	}
	
}
