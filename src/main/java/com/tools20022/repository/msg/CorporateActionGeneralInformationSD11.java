/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code;
import com.tools20022.repository.codeset.DTCCSubEventType2Code;
import com.tools20022.repository.codeset.EventGroup1Code;
import com.tools20022.repository.codeset.ExtendedEventType1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action general
 * information details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11#mmPlaceAndName
 * CorporateActionGeneralInformationSD11.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11#mmEventGroup
 * CorporateActionGeneralInformationSD11.mmEventGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11#mmEventType
 * CorporateActionGeneralInformationSD11.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11#mmSubEventType
 * CorporateActionGeneralInformationSD11.mmSubEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11#mmDTCMandatoryVoluntaryEventType
 * CorporateActionGeneralInformationSD11.mmDTCMandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11#mmDeclaredMandatoryVoluntaryEventType
 * CorporateActionGeneralInformationSD11.mmDeclaredMandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11#mmEDSMessagingEligibilityFlag
 * CorporateActionGeneralInformationSD11.mmEDSMessagingEligibilityFlag}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionGeneralInformationSD11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action general information details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule#forCorporateActionGeneralInformationSD11
 * ConstraintEDSMessagingEligibilityRule.
 * forCorporateActionGeneralInformationSD11}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13
 * CorporateActionGeneralInformationSD13}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationSD7
 * CorporateActionNotificationSD7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionGeneralInformationSD11", propOrder = {"placeAndName", "eventGroup", "eventType", "subEventType", "dTCMandatoryVoluntaryEventType", "declaredMandatoryVoluntaryEventType", "eDSMessagingEligibilityFlag"})
public class CorporateActionGeneralInformationSD11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11
	 * CorporateActionGeneralInformationSD11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmPlaceAndName
	 * CorporateActionGeneralInformationSD13.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionGeneralInformationSD11, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionGeneralInformationSD11, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD11.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD13.mmPlaceAndName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionGeneralInformationSD11 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionGeneralInformationSD11 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "EvtGrp")
	protected EventGroup1Code eventGroup;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventGroup1Code
	 * EventGroup1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11
	 * CorporateActionGeneralInformationSD11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtGrp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DTC processing domain/ category for event types."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Event Group</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmEventGroup
	 * CorporateActionGeneralInformationSD13.mmEventGroup}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionGeneralInformationSD11, Optional<EventGroup1Code>> mmEventGroup = new MMMessageAttribute<CorporateActionGeneralInformationSD11, Optional<EventGroup1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD11.mmObject();
			isDerived = false;
			xmlTag = "EvtGrp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Event Group"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventGroup";
			definition = "DTC processing domain/ category for event types.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD13.mmEventGroup);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EventGroup1Code.mmObject();
		}

		@Override
		public Optional<EventGroup1Code> getValue(CorporateActionGeneralInformationSD11 obj) {
			return obj.getEventGroup();
		}

		@Override
		public void setValue(CorporateActionGeneralInformationSD11 obj, Optional<EventGroup1Code> value) {
			obj.setEventGroup(value.orElse(null));
		}
	};
	@XmlElement(name = "EvtTp")
	protected ExtendedEventType1Code eventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code
	 * ExtendedEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11
	 * CorporateActionGeneralInformationSD11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO code and mapped to OTHR or when two or more distinct events (in DTCC model) use same ISO code and there are no additional data elements that distinguish those two or more events."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Event Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmEventType
	 * CorporateActionGeneralInformationSD13.mmEventType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionGeneralInformationSD11, Optional<ExtendedEventType1Code>> mmEventType = new MMMessageAttribute<CorporateActionGeneralInformationSD11, Optional<ExtendedEventType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD11.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Event Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "DTCC (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO code and mapped to OTHR or when two or more distinct events (in DTCC model) use same ISO code and there are no additional data elements that distinguish those two or more events.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD13.mmEventType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExtendedEventType1Code.mmObject();
		}

		@Override
		public Optional<ExtendedEventType1Code> getValue(CorporateActionGeneralInformationSD11 obj) {
			return obj.getEventType();
		}

		@Override
		public void setValue(CorporateActionGeneralInformationSD11 obj, Optional<ExtendedEventType1Code> value) {
			obj.setEventType(value.orElse(null));
		}
	};
	@XmlElement(name = "SubEvtTp")
	protected DTCCSubEventType2Code subEventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11
	 * CorporateActionGeneralInformationSD11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubEvtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Sub Event Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmSubEventType
	 * CorporateActionGeneralInformationSD13.mmSubEventType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionGeneralInformationSD11, Optional<DTCCSubEventType2Code>> mmSubEventType = new MMMessageAttribute<CorporateActionGeneralInformationSD11, Optional<DTCCSubEventType2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD11.mmObject();
			isDerived = false;
			xmlTag = "SubEvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Sub Event Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubEventType";
			definition = "DTCC (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD13.mmSubEventType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCCSubEventType2Code.mmObject();
		}

		@Override
		public Optional<DTCCSubEventType2Code> getValue(CorporateActionGeneralInformationSD11 obj) {
			return obj.getSubEventType();
		}

		@Override
		public void setValue(CorporateActionGeneralInformationSD11 obj, Optional<DTCCSubEventType2Code> value) {
			obj.setSubEventType(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCMndtryVlntryEvtTp")
	protected CorporateActionMandatoryVoluntary1Code dTCMandatoryVoluntaryEventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code
	 * CorporateActionMandatoryVoluntary1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11
	 * CorporateActionGeneralInformationSD11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCMndtryVlntryEvtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCMandatoryVoluntaryEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the nature of the event with regard to how it is being supported by DTC (The Depository Trust Corporation) the custodian: whether the event is mandatory, voluntary, or mandatory with options and eligible for DTC processing. This classification is necessary for the event types that have additional DTC only options. For an example: a MAND event, where the issuer declared only one option may be eligible for special DTC options (services like Dividend Reinvestment, Foreign Currency Payment, etc) in this case it will be announced as MAND by the issuer and CHOS by DTC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Mandatory/ Voluntary</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmDTCMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformationSD13.mmDTCMandatoryVoluntaryEventType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionGeneralInformationSD11, Optional<CorporateActionMandatoryVoluntary1Code>> mmDTCMandatoryVoluntaryEventType = new MMMessageAttribute<CorporateActionGeneralInformationSD11, Optional<CorporateActionMandatoryVoluntary1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD11.mmObject();
			isDerived = false;
			xmlTag = "DTCMndtryVlntryEvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Mandatory/ Voluntary"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCMandatoryVoluntaryEventType";
			definition = "Specifies the nature of the event with regard to how it is being supported by DTC (The Depository Trust Corporation) the custodian: whether the event is mandatory, voluntary, or mandatory with options and eligible for DTC processing. This classification is necessary for the event types that have additional DTC only options. For an example: a MAND event, where the issuer declared only one option may be eligible for special DTC options (services like Dividend Reinvestment, Foreign Currency Payment, etc) in this case it will be announced as MAND by the issuer and CHOS by DTC.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD13.mmDTCMandatoryVoluntaryEventType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CorporateActionMandatoryVoluntary1Code.mmObject();
		}

		@Override
		public Optional<CorporateActionMandatoryVoluntary1Code> getValue(CorporateActionGeneralInformationSD11 obj) {
			return obj.getDTCMandatoryVoluntaryEventType();
		}

		@Override
		public void setValue(CorporateActionGeneralInformationSD11 obj, Optional<CorporateActionMandatoryVoluntary1Code> value) {
			obj.setDTCMandatoryVoluntaryEventType(value.orElse(null));
		}
	};
	@XmlElement(name = "DclrdMndtryVlntryEvtTp")
	protected CorporateActionMandatoryVoluntary1Code declaredMandatoryVoluntaryEventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionMandatoryVoluntary1Code
	 * CorporateActionMandatoryVoluntary1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11
	 * CorporateActionGeneralInformationSD11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdMndtryVlntryEvtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredMandatoryVoluntaryEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the nature of the event as announced by the agent or issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmDeclaredMandatoryVoluntaryEventType
	 * CorporateActionGeneralInformationSD13.
	 * mmDeclaredMandatoryVoluntaryEventType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionGeneralInformationSD11, Optional<CorporateActionMandatoryVoluntary1Code>> mmDeclaredMandatoryVoluntaryEventType = new MMMessageAttribute<CorporateActionGeneralInformationSD11, Optional<CorporateActionMandatoryVoluntary1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD11.mmObject();
			isDerived = false;
			xmlTag = "DclrdMndtryVlntryEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredMandatoryVoluntaryEventType";
			definition = "Specifies the nature of the event as announced by the agent or issuer.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD13.mmDeclaredMandatoryVoluntaryEventType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CorporateActionMandatoryVoluntary1Code.mmObject();
		}

		@Override
		public Optional<CorporateActionMandatoryVoluntary1Code> getValue(CorporateActionGeneralInformationSD11 obj) {
			return obj.getDeclaredMandatoryVoluntaryEventType();
		}

		@Override
		public void setValue(CorporateActionGeneralInformationSD11 obj, Optional<CorporateActionMandatoryVoluntary1Code> value) {
			obj.setDeclaredMandatoryVoluntaryEventType(value.orElse(null));
		}
	};
	@XmlElement(name = "EDSMsggElgbltyFlg")
	protected YesNoIndicator eDSMessagingEligibilityFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD11
	 * CorporateActionGeneralInformationSD11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EDSMsggElgbltyFlg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingEligibilityFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the event is eligible for EDS (Elective Dividend Services) ISO20022 messaging."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD13#mmEDSMessagingEligibilityFlag
	 * CorporateActionGeneralInformationSD13.mmEDSMessagingEligibilityFlag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionGeneralInformationSD11, Optional<YesNoIndicator>> mmEDSMessagingEligibilityFlag = new MMMessageAttribute<CorporateActionGeneralInformationSD11, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionGeneralInformationSD11.mmObject();
			isDerived = false;
			xmlTag = "EDSMsggElgbltyFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingEligibilityFlag";
			definition = "Indicates whether the event is eligible for EDS (Elective Dividend Services) ISO20022 messaging.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD13.mmEDSMessagingEligibilityFlag);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionGeneralInformationSD11 obj) {
			return obj.getEDSMessagingEligibilityFlag();
		}

		@Override
		public void setValue(CorporateActionGeneralInformationSD11 obj, Optional<YesNoIndicator> value) {
			obj.setEDSMessagingEligibilityFlag(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionGeneralInformationSD11.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionGeneralInformationSD11.mmEventGroup,
						com.tools20022.repository.msg.CorporateActionGeneralInformationSD11.mmEventType, com.tools20022.repository.msg.CorporateActionGeneralInformationSD11.mmSubEventType,
						com.tools20022.repository.msg.CorporateActionGeneralInformationSD11.mmDTCMandatoryVoluntaryEventType, com.tools20022.repository.msg.CorporateActionGeneralInformationSD11.mmDeclaredMandatoryVoluntaryEventType,
						com.tools20022.repository.msg.CorporateActionGeneralInformationSD11.mmEDSMessagingEligibilityFlag);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEDSMessagingEligibilityRule.forCorporateActionGeneralInformationSD11);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionGeneralInformationSD11";
				definition = "Provides additional information regarding corporate action general information details.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD13.mmObject());
				previousVersion_lazy = () -> CorporateActionNotificationSD7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionGeneralInformationSD11 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<EventGroup1Code> getEventGroup() {
		return eventGroup == null ? Optional.empty() : Optional.of(eventGroup);
	}

	public CorporateActionGeneralInformationSD11 setEventGroup(EventGroup1Code eventGroup) {
		this.eventGroup = eventGroup;
		return this;
	}

	public Optional<ExtendedEventType1Code> getEventType() {
		return eventType == null ? Optional.empty() : Optional.of(eventType);
	}

	public CorporateActionGeneralInformationSD11 setEventType(ExtendedEventType1Code eventType) {
		this.eventType = eventType;
		return this;
	}

	public Optional<DTCCSubEventType2Code> getSubEventType() {
		return subEventType == null ? Optional.empty() : Optional.of(subEventType);
	}

	public CorporateActionGeneralInformationSD11 setSubEventType(DTCCSubEventType2Code subEventType) {
		this.subEventType = subEventType;
		return this;
	}

	public Optional<CorporateActionMandatoryVoluntary1Code> getDTCMandatoryVoluntaryEventType() {
		return dTCMandatoryVoluntaryEventType == null ? Optional.empty() : Optional.of(dTCMandatoryVoluntaryEventType);
	}

	public CorporateActionGeneralInformationSD11 setDTCMandatoryVoluntaryEventType(CorporateActionMandatoryVoluntary1Code dTCMandatoryVoluntaryEventType) {
		this.dTCMandatoryVoluntaryEventType = dTCMandatoryVoluntaryEventType;
		return this;
	}

	public Optional<CorporateActionMandatoryVoluntary1Code> getDeclaredMandatoryVoluntaryEventType() {
		return declaredMandatoryVoluntaryEventType == null ? Optional.empty() : Optional.of(declaredMandatoryVoluntaryEventType);
	}

	public CorporateActionGeneralInformationSD11 setDeclaredMandatoryVoluntaryEventType(CorporateActionMandatoryVoluntary1Code declaredMandatoryVoluntaryEventType) {
		this.declaredMandatoryVoluntaryEventType = declaredMandatoryVoluntaryEventType;
		return this;
	}

	public Optional<YesNoIndicator> getEDSMessagingEligibilityFlag() {
		return eDSMessagingEligibilityFlag == null ? Optional.empty() : Optional.of(eDSMessagingEligibilityFlag);
	}

	public CorporateActionGeneralInformationSD11 setEDSMessagingEligibilityFlag(YesNoIndicator eDSMessagingEligibilityFlag) {
		this.eDSMessagingEligibilityFlag = eDSMessagingEligibilityFlag;
		return this;
	}
}