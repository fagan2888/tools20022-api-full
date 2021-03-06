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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V07;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.UpdatedAdditionalInformation5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information such as the taxation conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#mmAdditionalText
 * CorporateActionNarrative37.mmAdditionalText}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#mmNarrativeVersion
 * CorporateActionNarrative37.mmNarrativeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#mmInformationConditions
 * CorporateActionNarrative37.mmInformationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#mmInformationToComplyWith
 * CorporateActionNarrative37.mmInformationToComplyWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#mmTaxationConditions
 * CorporateActionNarrative37.mmTaxationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#mmDisclaimer
 * CorporateActionNarrative37.mmDisclaimer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#mmPartyContactNarrative
 * CorporateActionNarrative37.mmPartyContactNarrative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#mmRegistrationDetails
 * CorporateActionNarrative37.mmRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#mmBasketOrIndexInformation
 * CorporateActionNarrative37.mmBasketOrIndexInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#mmCertificationBreakdown
 * CorporateActionNarrative37.mmCertificationBreakdown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V07#mmAdditionalInformation
 * CorporateActionMovementPreliminaryAdvice002V07.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09#mmAdditionalInformation
 * CorporateActionMovementPreliminaryAdvice002V09.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNarrative37"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the taxation conditions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionNarrative37
 * ConstraintAdditionalInformationRule.forCorporateActionNarrative37}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNarrative37", propOrder = {"additionalText", "narrativeVersion", "informationConditions", "informationToComplyWith", "taxationConditions", "disclaimer", "partyContactNarrative", "registrationDetails",
		"basketOrIndexInformation", "certificationBreakdown"})
public class CorporateActionNarrative37 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AddtlTxt")
	protected UpdatedAdditionalInformation5 additionalText;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5
	 * UpdatedAdditionalInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37
	 * CorporateActionNarrative37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTxt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalText"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::ADTX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>> mmAdditionalText = new MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative37.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::ADTX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalText";
			definition = "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation5.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation5> getValue(CorporateActionNarrative37 obj) {
			return obj.getAdditionalText();
		}

		@Override
		public void setValue(CorporateActionNarrative37 obj, Optional<UpdatedAdditionalInformation5> value) {
			obj.setAdditionalText(value.orElse(null));
		}
	};
	@XmlElement(name = "NrrtvVrsn")
	protected UpdatedAdditionalInformation5 narrativeVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5
	 * UpdatedAdditionalInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37
	 * CorporateActionNarrative37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NrrtvVrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information that can be ignored for automated processing; - reiteration of information that has been included within structured fields of this message, - or narrative information not needed for automatic processing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::TXNR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>> mmNarrativeVersion = new MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative37.mmObject();
			isDerived = false;
			xmlTag = "NrrtvVrsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::TXNR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeVersion";
			definition = "Provides information that can be ignored for automated processing; - reiteration of information that has been included within structured fields of this message, - or narrative information not needed for automatic processing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation5.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation5> getValue(CorporateActionNarrative37 obj) {
			return obj.getNarrativeVersion();
		}

		@Override
		public void setValue(CorporateActionNarrative37 obj, Optional<UpdatedAdditionalInformation5> value) {
			obj.setNarrativeVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "InfConds")
	protected UpdatedAdditionalInformation5 informationConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5
	 * UpdatedAdditionalInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmInformationConditions
	 * CorporateActionEvent.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37
	 * CorporateActionNarrative37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfConds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides conditional information related to the event, for example, an offer is subject to 50 percent acceptance, the offeror allows the securities holder to set some conditions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::INCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>> mmInformationConditions = new MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmInformationConditions;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative37.mmObject();
			isDerived = false;
			xmlTag = "InfConds";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::INCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationConditions";
			definition = "Provides conditional information related to the event, for example, an offer is subject to 50 percent acceptance, the offeror allows the securities holder to set some conditions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation5.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation5> getValue(CorporateActionNarrative37 obj) {
			return obj.getInformationConditions();
		}

		@Override
		public void setValue(CorporateActionNarrative37 obj, Optional<UpdatedAdditionalInformation5> value) {
			obj.setInformationConditions(value.orElse(null));
		}
	};
	@XmlElement(name = "InfToCmplyWth")
	protected UpdatedAdditionalInformation5 informationToComplyWith;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5
	 * UpdatedAdditionalInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmInformationToComplyWith
	 * BiddingConditions.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37
	 * CorporateActionNarrative37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfToCmplyWth"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationToComplyWith"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or SIL (Sophisticated Investor Letter) to be provided."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::COMP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>> mmInformationToComplyWith = new MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmInformationToComplyWith;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative37.mmObject();
			isDerived = false;
			xmlTag = "InfToCmplyWth";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::COMP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationToComplyWith";
			definition = "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or SIL (Sophisticated Investor Letter) to be provided.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation5.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation5> getValue(CorporateActionNarrative37 obj) {
			return obj.getInformationToComplyWith();
		}

		@Override
		public void setValue(CorporateActionNarrative37 obj, Optional<UpdatedAdditionalInformation5> value) {
			obj.setInformationToComplyWith(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxtnConds")
	protected UpdatedAdditionalInformation5 taxationConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5
	 * UpdatedAdditionalInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxationConditions
	 * Tax.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37
	 * CorporateActionNarrative37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxtnConds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides taxation conditions that cannot be included within the structured fields of this message and has not been mentioned in the Service Level Agreement (SLA)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::TAXE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>> mmTaxationConditions = new MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxationConditions;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative37.mmObject();
			isDerived = false;
			xmlTag = "TaxtnConds";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::TAXE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxationConditions";
			definition = "Provides taxation conditions that cannot be included within the structured fields of this message and has not been mentioned in the Service Level Agreement (SLA).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation5.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation5> getValue(CorporateActionNarrative37 obj) {
			return obj.getTaxationConditions();
		}

		@Override
		public void setValue(CorporateActionNarrative37 obj, Optional<UpdatedAdditionalInformation5> value) {
			obj.setTaxationConditions(value.orElse(null));
		}
	};
	@XmlElement(name = "Dsclmr")
	protected UpdatedAdditionalInformation5 disclaimer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5
	 * UpdatedAdditionalInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37
	 * CorporateActionNarrative37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dsclmr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disclaimer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides a disclaimer relative to the information provided in the message. It may be ignored for automated processing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::DISC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>> mmDisclaimer = new MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative37.mmObject();
			isDerived = false;
			xmlTag = "Dsclmr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::DISC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclaimer";
			definition = "Provides a disclaimer relative to the information provided in the message. It may be ignored for automated processing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation5.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation5> getValue(CorporateActionNarrative37 obj) {
			return obj.getDisclaimer();
		}

		@Override
		public void setValue(CorporateActionNarrative37 obj, Optional<UpdatedAdditionalInformation5> value) {
			obj.setDisclaimer(value.orElse(null));
		}
	};
	@XmlElement(name = "PtyCtctNrrtv")
	protected UpdatedAdditionalInformation5 partyContactNarrative;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5
	 * UpdatedAdditionalInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
	 * Role.mmContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37
	 * CorporateActionNarrative37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyCtctNrrtv"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyContactNarrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::PACO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>> mmPartyContactNarrative = new MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>>() {
		{
			businessElementTrace_lazy = () -> Role.mmContactPersonRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative37.mmObject();
			isDerived = false;
			xmlTag = "PtyCtctNrrtv";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::PACO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyContactNarrative";
			definition = "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation5.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation5> getValue(CorporateActionNarrative37 obj) {
			return obj.getPartyContactNarrative();
		}

		@Override
		public void setValue(CorporateActionNarrative37 obj, Optional<UpdatedAdditionalInformation5> value) {
			obj.setPartyContactNarrative(value.orElse(null));
		}
	};
	@XmlElement(name = "RegnDtls")
	protected UpdatedAdditionalInformation5 registrationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5
	 * UpdatedAdditionalInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRegistrationDetails
	 * CorporateActionEvent.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37
	 * CorporateActionNarrative37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information required for the registration."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::REGI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>> mmRegistrationDetails = new MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmRegistrationDetails;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative37.mmObject();
			isDerived = false;
			xmlTag = "RegnDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::REGI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetails";
			definition = "Provides information required for the registration.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation5.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation5> getValue(CorporateActionNarrative37 obj) {
			return obj.getRegistrationDetails();
		}

		@Override
		public void setValue(CorporateActionNarrative37 obj, Optional<UpdatedAdditionalInformation5> value) {
			obj.setRegistrationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "BsktOrIndxInf")
	protected UpdatedAdditionalInformation5 basketOrIndexInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5
	 * UpdatedAdditionalInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBasketOrIndexInformation
	 * CorporateActionEvent.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37
	 * CorporateActionNarrative37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BsktOrIndxInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasketOrIndexInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information on the basket or index underlying a security, for example a warrant."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::BAIN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>> mmBasketOrIndexInformation = new MMMessageAssociationEnd<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmBasketOrIndexInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative37.mmObject();
			isDerived = false;
			xmlTag = "BsktOrIndxInf";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::BAIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasketOrIndexInformation";
			definition = "Provides additional information on the basket or index underlying a security, for example a warrant.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation5.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation5> getValue(CorporateActionNarrative37 obj) {
			return obj.getBasketOrIndexInformation();
		}

		@Override
		public void setValue(CorporateActionNarrative37 obj, Optional<UpdatedAdditionalInformation5> value) {
			obj.setBasketOrIndexInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "CertfctnBrkdwn")
	protected UpdatedAdditionalInformation5 certificationBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5
	 * UpdatedAdditionalInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37
	 * CorporateActionNarrative37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnBrkdwn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information about the type of certification/breakdown required."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>> mmCertificationBreakdown = new MMMessageAttribute<CorporateActionNarrative37, Optional<UpdatedAdditionalInformation5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative37.mmObject();
			isDerived = false;
			xmlTag = "CertfctnBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationBreakdown";
			definition = "Provides additional information about the type of certification/breakdown required.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UpdatedAdditionalInformation5.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation5> getValue(CorporateActionNarrative37 obj) {
			return obj.getCertificationBreakdown();
		}

		@Override
		public void setValue(CorporateActionNarrative37 obj, Optional<UpdatedAdditionalInformation5> value) {
			obj.setCertificationBreakdown(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative37.mmAdditionalText, com.tools20022.repository.msg.CorporateActionNarrative37.mmNarrativeVersion,
						com.tools20022.repository.msg.CorporateActionNarrative37.mmInformationConditions, com.tools20022.repository.msg.CorporateActionNarrative37.mmInformationToComplyWith,
						com.tools20022.repository.msg.CorporateActionNarrative37.mmTaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative37.mmDisclaimer,
						com.tools20022.repository.msg.CorporateActionNarrative37.mmPartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative37.mmRegistrationDetails,
						com.tools20022.repository.msg.CorporateActionNarrative37.mmBasketOrIndexInformation, com.tools20022.repository.msg.CorporateActionNarrative37.mmCertificationBreakdown);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdvice002V07.mmAdditionalInformation, CorporateActionMovementPreliminaryAdvice002V09.mmAdditionalInformation);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionNarrative37);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrative37";
				definition = "Provides additional information such as the taxation conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<UpdatedAdditionalInformation5> getAdditionalText() {
		return additionalText == null ? Optional.empty() : Optional.of(additionalText);
	}

	public CorporateActionNarrative37 setAdditionalText(UpdatedAdditionalInformation5 additionalText) {
		this.additionalText = additionalText;
		return this;
	}

	public Optional<UpdatedAdditionalInformation5> getNarrativeVersion() {
		return narrativeVersion == null ? Optional.empty() : Optional.of(narrativeVersion);
	}

	public CorporateActionNarrative37 setNarrativeVersion(UpdatedAdditionalInformation5 narrativeVersion) {
		this.narrativeVersion = narrativeVersion;
		return this;
	}

	public Optional<UpdatedAdditionalInformation5> getInformationConditions() {
		return informationConditions == null ? Optional.empty() : Optional.of(informationConditions);
	}

	public CorporateActionNarrative37 setInformationConditions(UpdatedAdditionalInformation5 informationConditions) {
		this.informationConditions = informationConditions;
		return this;
	}

	public Optional<UpdatedAdditionalInformation5> getInformationToComplyWith() {
		return informationToComplyWith == null ? Optional.empty() : Optional.of(informationToComplyWith);
	}

	public CorporateActionNarrative37 setInformationToComplyWith(UpdatedAdditionalInformation5 informationToComplyWith) {
		this.informationToComplyWith = informationToComplyWith;
		return this;
	}

	public Optional<UpdatedAdditionalInformation5> getTaxationConditions() {
		return taxationConditions == null ? Optional.empty() : Optional.of(taxationConditions);
	}

	public CorporateActionNarrative37 setTaxationConditions(UpdatedAdditionalInformation5 taxationConditions) {
		this.taxationConditions = taxationConditions;
		return this;
	}

	public Optional<UpdatedAdditionalInformation5> getDisclaimer() {
		return disclaimer == null ? Optional.empty() : Optional.of(disclaimer);
	}

	public CorporateActionNarrative37 setDisclaimer(UpdatedAdditionalInformation5 disclaimer) {
		this.disclaimer = disclaimer;
		return this;
	}

	public Optional<UpdatedAdditionalInformation5> getPartyContactNarrative() {
		return partyContactNarrative == null ? Optional.empty() : Optional.of(partyContactNarrative);
	}

	public CorporateActionNarrative37 setPartyContactNarrative(UpdatedAdditionalInformation5 partyContactNarrative) {
		this.partyContactNarrative = partyContactNarrative;
		return this;
	}

	public Optional<UpdatedAdditionalInformation5> getRegistrationDetails() {
		return registrationDetails == null ? Optional.empty() : Optional.of(registrationDetails);
	}

	public CorporateActionNarrative37 setRegistrationDetails(UpdatedAdditionalInformation5 registrationDetails) {
		this.registrationDetails = registrationDetails;
		return this;
	}

	public Optional<UpdatedAdditionalInformation5> getBasketOrIndexInformation() {
		return basketOrIndexInformation == null ? Optional.empty() : Optional.of(basketOrIndexInformation);
	}

	public CorporateActionNarrative37 setBasketOrIndexInformation(UpdatedAdditionalInformation5 basketOrIndexInformation) {
		this.basketOrIndexInformation = basketOrIndexInformation;
		return this;
	}

	public Optional<UpdatedAdditionalInformation5> getCertificationBreakdown() {
		return certificationBreakdown == null ? Optional.empty() : Optional.of(certificationBreakdown);
	}

	public CorporateActionNarrative37 setCertificationBreakdown(UpdatedAdditionalInformation5 certificationBreakdown) {
		this.certificationBreakdown = certificationBreakdown;
		return this;
	}
}