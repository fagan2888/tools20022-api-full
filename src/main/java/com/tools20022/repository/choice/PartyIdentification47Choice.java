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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionNotificationV02;
import com.tools20022.repository.area.seev.CorporateActionNotificationV03;
import com.tools20022.repository.area.seev.CorporateActionNotificationV04;
import com.tools20022.repository.area.seev.CorporateActionNotificationV05;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification19;
import com.tools20022.repository.msg.NameAndAddress5;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of identification of a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice#mmAnyBIC
 * PartyIdentification47Choice.mmAnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice#mmProprietaryIdentification
 * PartyIdentification47Choice.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice#mmNameAndAddress
 * PartyIdentification47Choice.mmNameAndAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmIssuerAgent
 * CorporateActionNotificationV02.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmPayingAgent
 * CorporateActionNotificationV02.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmSubPayingAgent
 * CorporateActionNotificationV02.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmRegistrar
 * CorporateActionNotificationV02.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmResellingAgent
 * CorporateActionNotificationV02.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmPhysicalSecuritiesAgent
 * CorporateActionNotificationV02.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmDropAgent
 * CorporateActionNotificationV02.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmSolicitationAgent
 * CorporateActionNotificationV02.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmInformationAgent
 * CorporateActionNotificationV02.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#mmIssuerAgent
 * CorporateActionNotificationV03.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#mmPayingAgent
 * CorporateActionNotificationV03.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#mmSubPayingAgent
 * CorporateActionNotificationV03.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#mmRegistrar
 * CorporateActionNotificationV03.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#mmResellingAgent
 * CorporateActionNotificationV03.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#mmPhysicalSecuritiesAgent
 * CorporateActionNotificationV03.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#mmDropAgent
 * CorporateActionNotificationV03.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#mmSolicitationAgent
 * CorporateActionNotificationV03.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03#mmInformationAgent
 * CorporateActionNotificationV03.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmIssuerAgent
 * CorporateActionNotificationV04.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmPayingAgent
 * CorporateActionNotificationV04.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmSubPayingAgent
 * CorporateActionNotificationV04.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmRegistrar
 * CorporateActionNotificationV04.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmResellingAgent
 * CorporateActionNotificationV04.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmPhysicalSecuritiesAgent
 * CorporateActionNotificationV04.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmDropAgent
 * CorporateActionNotificationV04.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmSolicitationAgent
 * CorporateActionNotificationV04.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04#mmInformationAgent
 * CorporateActionNotificationV04.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmIssuerAgent
 * CorporateActionNotificationV05.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmPayingAgent
 * CorporateActionNotificationV05.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmSubPayingAgent
 * CorporateActionNotificationV05.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmRegistrar
 * CorporateActionNotificationV05.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmResellingAgent
 * CorporateActionNotificationV05.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmPhysicalSecuritiesAgent
 * CorporateActionNotificationV05.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmDropAgent
 * CorporateActionNotificationV05.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmSolicitationAgent
 * CorporateActionNotificationV05.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmInformationAgent
 * CorporateActionNotificationV05.mmInformationAgent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentification47Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of identification of a party."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistencePartyProprietaryIdentificationRule#forPartyIdentification47Choice
 * ConstraintCoexistencePartyProprietaryIdentificationRule.
 * forPartyIdentification47Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceNameAndAdressRule#forPartyIdentification47Choice
 * ConstraintCoexistenceNameAndAdressRule.forPartyIdentification47Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentification47Choice", propOrder = {"anyBIC", "proprietaryIdentification", "nameAndAddress"})
public class PartyIdentification47Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AnyBIC", required = true)
	protected AnyBICIdentifier anyBIC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
	 * OrganisationIdentification.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice
	 * PartyIdentification47Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnyBIC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentification47Choice, AnyBICIdentifier> mmAnyBIC = new MMMessageAttribute<PartyIdentification47Choice, AnyBICIdentifier>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> com.tools20022.repository.choice.PartyIdentification47Choice.mmObject();
			isDerived = false;
			xmlTag = "AnyBIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyBIC";
			definition = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}

		@Override
		public AnyBICIdentifier getValue(PartyIdentification47Choice obj) {
			return obj.getAnyBIC();
		}

		@Override
		public void setValue(PartyIdentification47Choice obj, AnyBICIdentifier value) {
			obj.setAnyBIC(value);
		}
	};
	@XmlElement(name = "PrtryId", required = true)
	protected GenericIdentification19 proprietaryIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification19
	 * GenericIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice
	 * PartyIdentification47Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95R:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentification47Choice, GenericIdentification19> mmProprietaryIdentification = new MMMessageAssociationEnd<PartyIdentification47Choice, GenericIdentification19>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.PartyIdentification47Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95R:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification19.mmObject();
		}

		@Override
		public GenericIdentification19 getValue(PartyIdentification47Choice obj) {
			return obj.getProprietaryIdentification();
		}

		@Override
		public void setValue(PartyIdentification47Choice obj, GenericIdentification19 value) {
			obj.setProprietaryIdentification(value);
		}
	};
	@XmlElement(name = "NmAndAdr", required = true)
	protected NameAndAddress5 nameAndAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress5
	 * NameAndAddress5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification47Choice
	 * PartyIdentification47Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmAndAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameAndAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name and address of a party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95Q:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentification47Choice, NameAndAddress5> mmNameAndAddress = new MMMessageAssociationEnd<PartyIdentification47Choice, NameAndAddress5>() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PartyIdentification47Choice.mmObject();
			isDerived = false;
			xmlTag = "NmAndAdr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95Q:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress";
			definition = "Name and address of a party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NameAndAddress5.mmObject();
		}

		@Override
		public NameAndAddress5 getValue(PartyIdentification47Choice obj) {
			return obj.getNameAndAddress();
		}

		@Override
		public void setValue(PartyIdentification47Choice obj, NameAndAddress5 value) {
			obj.setNameAndAddress(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartyIdentification47Choice.mmAnyBIC, com.tools20022.repository.choice.PartyIdentification47Choice.mmProprietaryIdentification,
						com.tools20022.repository.choice.PartyIdentification47Choice.mmNameAndAddress);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNotificationV02.mmIssuerAgent, CorporateActionNotificationV02.mmPayingAgent, CorporateActionNotificationV02.mmSubPayingAgent,
						CorporateActionNotificationV02.mmRegistrar, CorporateActionNotificationV02.mmResellingAgent, CorporateActionNotificationV02.mmPhysicalSecuritiesAgent, CorporateActionNotificationV02.mmDropAgent,
						CorporateActionNotificationV02.mmSolicitationAgent, CorporateActionNotificationV02.mmInformationAgent, CorporateActionNotificationV03.mmIssuerAgent, CorporateActionNotificationV03.mmPayingAgent,
						CorporateActionNotificationV03.mmSubPayingAgent, CorporateActionNotificationV03.mmRegistrar, CorporateActionNotificationV03.mmResellingAgent, CorporateActionNotificationV03.mmPhysicalSecuritiesAgent,
						CorporateActionNotificationV03.mmDropAgent, CorporateActionNotificationV03.mmSolicitationAgent, CorporateActionNotificationV03.mmInformationAgent, CorporateActionNotificationV04.mmIssuerAgent,
						CorporateActionNotificationV04.mmPayingAgent, CorporateActionNotificationV04.mmSubPayingAgent, CorporateActionNotificationV04.mmRegistrar, CorporateActionNotificationV04.mmResellingAgent,
						CorporateActionNotificationV04.mmPhysicalSecuritiesAgent, CorporateActionNotificationV04.mmDropAgent, CorporateActionNotificationV04.mmSolicitationAgent, CorporateActionNotificationV04.mmInformationAgent,
						CorporateActionNotificationV05.mmIssuerAgent, CorporateActionNotificationV05.mmPayingAgent, CorporateActionNotificationV05.mmSubPayingAgent, CorporateActionNotificationV05.mmRegistrar,
						CorporateActionNotificationV05.mmResellingAgent, CorporateActionNotificationV05.mmPhysicalSecuritiesAgent, CorporateActionNotificationV05.mmDropAgent, CorporateActionNotificationV05.mmSolicitationAgent,
						CorporateActionNotificationV05.mmInformationAgent);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistencePartyProprietaryIdentificationRule.forPartyIdentification47Choice,
						com.tools20022.repository.constraints.ConstraintCoexistenceNameAndAdressRule.forPartyIdentification47Choice);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PartyIdentification47Choice";
				definition = "Choice of identification of a party.";
			}
		});
		return mmObject_lazy.get();
	}

	public AnyBICIdentifier getAnyBIC() {
		return anyBIC;
	}

	public PartyIdentification47Choice setAnyBIC(AnyBICIdentifier anyBIC) {
		this.anyBIC = Objects.requireNonNull(anyBIC);
		return this;
	}

	public GenericIdentification19 getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public PartyIdentification47Choice setProprietaryIdentification(GenericIdentification19 proprietaryIdentification) {
		this.proprietaryIdentification = Objects.requireNonNull(proprietaryIdentification);
		return this;
	}

	public NameAndAddress5 getNameAndAddress() {
		return nameAndAddress;
	}

	public PartyIdentification47Choice setNameAndAddress(NameAndAddress5 nameAndAddress) {
		this.nameAndAddress = Objects.requireNonNull(nameAndAddress);
		return this;
	}
}