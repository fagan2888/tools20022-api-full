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
import com.tools20022.repository.area.seev.CorporateActionNotificationV02;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmOptionNumber
 * CorporateActionOption19.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmOptionType
 * CorporateActionOption19.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmFractionDisposition
 * CorporateActionOption19.mmFractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmOfferType
 * CorporateActionOption19.mmOfferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmOptionFeatures
 * CorporateActionOption19.mmOptionFeatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmOptionAvailabilityStatus
 * CorporateActionOption19.mmOptionAvailabilityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmCertificationType
 * CorporateActionOption19.mmCertificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmNonDomicileCountry
 * CorporateActionOption19.mmNonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmValidDomicileCountry
 * CorporateActionOption19.mmValidDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmCurrencyOption
 * CorporateActionOption19.mmCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmDefaultProcessingOrStandingInstruction
 * CorporateActionOption19.mmDefaultProcessingOrStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmChargesAppliedIndicator
 * CorporateActionOption19.mmChargesAppliedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmCertificationIndicator
 * CorporateActionOption19.mmCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmWithdrawalAllowedIndicator
 * CorporateActionOption19.mmWithdrawalAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmChangeAllowedIndicator
 * CorporateActionOption19.mmChangeAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmSecurityIdentification
 * CorporateActionOption19.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmDateDetails
 * CorporateActionOption19.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmPeriodDetails
 * CorporateActionOption19.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmRateAndAmountDetails
 * CorporateActionOption19.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmPriceDetails
 * CorporateActionOption19.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmSecuritiesQuantity
 * CorporateActionOption19.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmSecuritiesMovementDetails
 * CorporateActionOption19.mmSecuritiesMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmCashMovementDetails
 * CorporateActionOption19.mmCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmAdditionalInformation
 * CorporateActionOption19.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionOption
 * CorporateActionOption}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmCorporateActionOptionDetails
 * CorporateActionNotificationV02.mmCorporateActionOptionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionOption19"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the corporate action option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalTextRule#forCorporateActionOption19
 * ConstraintAdditionalTextRule.forCorporateActionOption19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionNumberGuideline#forCorporateActionOption19
 * ConstraintOptionNumberGuideline.forCorporateActionOption19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule#forCorporateActionOption19
 * ConstraintRevocabilityPeriodRule.forCorporateActionOption19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forCorporateActionOption19
 * ConstraintCoexistenceQuantityRule.forCorporateActionOption19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forCorporateActionOption19
 * ConstraintCoexistenceAmountRule.forCorporateActionOption19}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionOption36
 * CorporateActionOption36}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionOption19", propOrder = {"optionNumber", "optionType", "fractionDisposition", "offerType", "optionFeatures", "optionAvailabilityStatus", "certificationType", "nonDomicileCountry", "validDomicileCountry",
		"currencyOption", "defaultProcessingOrStandingInstruction", "chargesAppliedIndicator", "certificationIndicator", "withdrawalAllowedIndicator", "changeAllowedIndicator", "securityIdentification", "dateDetails", "periodDetails",
		"rateAndAmountDetails", "priceDetails", "securitiesQuantity", "securitiesMovementDetails", "cashMovementDetails", "additionalInformation"})
public class CorporateActionOption19 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OptnNb", required = true)
	protected Exact3NumericText optionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionNumber
	 * CorporateActionOption.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying the available corporate action options."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13A::CAON</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption19, Exact3NumericText> mmOptionNumber = new MMMessageAttribute<CorporateActionOption19, Exact3NumericText>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13A::CAON"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Exact3NumericText getValue(CorporateActionOption19 obj) {
			return obj.getOptionNumber();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, Exact3NumericText value) {
			obj.setOptionNumber(value);
		}
	};
	@XmlElement(name = "OptnTp", required = true)
	protected CorporateActionOption2Choice optionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption2Choice
	 * CorporateActionOption2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the corporate action options available to the account owner."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAOP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption19, CorporateActionOption2Choice> mmOptionType = new MMMessageAssociationEnd<CorporateActionOption19, CorporateActionOption2Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAOP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionOption2Choice.mmObject();
		}

		@Override
		public CorporateActionOption2Choice getValue(CorporateActionOption19 obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, CorporateActionOption2Choice value) {
			obj.setOptionType(value);
		}
	};
	@XmlElement(name = "FrctnDspstn")
	protected FractionDispositionType1Choice fractionDisposition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType1Choice
	 * FractionDispositionType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmFractionDisposition
	 * CorporateActionOption.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrctnDspstn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionDisposition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DISF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption19, Optional<FractionDispositionType1Choice>> mmFractionDisposition = new MMMessageAssociationEnd<CorporateActionOption19, Optional<FractionDispositionType1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmFractionDisposition;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "FrctnDspstn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DISF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionDisposition";
			definition = "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FractionDispositionType1Choice.mmObject();
		}

		@Override
		public Optional<FractionDispositionType1Choice> getValue(CorporateActionOption19 obj) {
			return obj.getFractionDisposition();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, Optional<FractionDispositionType1Choice> value) {
			obj.setFractionDisposition(value.orElse(null));
		}
	};
	@XmlElement(name = "OfferTp")
	protected List<OfferTypeFormat1Choice> offerType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat1Choice
	 * OfferTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOfferType
	 * CorporateActionOption.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OfferTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conditions that apply to the offer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::OFFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption19, List<OfferTypeFormat1Choice>> mmOfferType = new MMMessageAssociationEnd<CorporateActionOption19, List<OfferTypeFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOfferType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "OfferTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::OFFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferType";
			definition = "Specifies the conditions that apply to the offer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OfferTypeFormat1Choice.mmObject();
		}

		@Override
		public List<OfferTypeFormat1Choice> getValue(CorporateActionOption19 obj) {
			return obj.getOfferType();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, List<OfferTypeFormat1Choice> value) {
			obj.setOfferType(value);
		}
	};
	@XmlElement(name = "OptnFeatrs")
	protected List<OptionFeaturesFormat5Choice> optionFeatures;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OptionFeaturesFormat5Choice
	 * OptionFeaturesFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionFeatures
	 * CorporateActionOption.mmOptionFeatures}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnFeatrs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionFeatures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the features that may apply to a corporate action option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::OPTF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption19, List<OptionFeaturesFormat5Choice>> mmOptionFeatures = new MMMessageAssociationEnd<CorporateActionOption19, List<OptionFeaturesFormat5Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionFeatures;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "OptnFeatrs";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::OPTF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionFeatures";
			definition = "Specifies the features that may apply to a corporate action option.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionFeaturesFormat5Choice.mmObject();
		}

		@Override
		public List<OptionFeaturesFormat5Choice> getValue(CorporateActionOption19 obj) {
			return obj.getOptionFeatures();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, List<OptionFeaturesFormat5Choice> value) {
			obj.setOptionFeatures(value);
		}
	};
	@XmlElement(name = "OptnAvlbtySts")
	protected OptionAvailabilityStatus1Choice optionAvailabilityStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OptionAvailabilityStatus1Choice
	 * OptionAvailabilityStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmOptionAvailabilityStatus
	 * CorporateActionStatus.mmOptionAvailabilityStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnAvlbtySts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionAvailabilityStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::OSTA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption19, Optional<OptionAvailabilityStatus1Choice>> mmOptionAvailabilityStatus = new MMMessageAssociationEnd<CorporateActionOption19, Optional<OptionAvailabilityStatus1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatus.mmOptionAvailabilityStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "OptnAvlbtySts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::OSTA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionAvailabilityStatus";
			definition = "Specifies the status of the option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OptionAvailabilityStatus1Choice.mmObject();
		}

		@Override
		public Optional<OptionAvailabilityStatus1Choice> getValue(CorporateActionOption19 obj) {
			return obj.getOptionAvailabilityStatus();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, Optional<OptionAvailabilityStatus1Choice> value) {
			obj.setOptionAvailabilityStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "CertfctnTp")
	protected List<BeneficiaryCertificationType1Choice> certificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1Choice
	 * BeneficiaryCertificationType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
	 * BeneficialOwner.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of certification which is required."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CETI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption19, List<BeneficiaryCertificationType1Choice>> mmCertificationType = new MMMessageAssociationEnd<CorporateActionOption19, List<BeneficiaryCertificationType1Choice>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "CertfctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CETI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationType";
			definition = "Type of certification which is required.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BeneficiaryCertificationType1Choice.mmObject();
		}

		@Override
		public List<BeneficiaryCertificationType1Choice> getValue(CorporateActionOption19 obj) {
			return obj.getCertificationType();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, List<BeneficiaryCertificationType1Choice> value) {
			obj.setCertificationType(value);
		}
	};
	@XmlElement(name = "NonDmclCtry")
	protected List<CountryCode> nonDomicileCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmNonDomicileCountry
	 * BeneficialOwner.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonDmclCtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDomicileCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94C::NDOM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption19, List<CountryCode>> mmNonDomicileCountry = new MMMessageAttribute<CorporateActionOption19, List<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmNonDomicileCountry;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "NonDmclCtry";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94C::NDOM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDomicileCountry";
			definition = "Holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated.";
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public List<CountryCode> getValue(CorporateActionOption19 obj) {
			return obj.getNonDomicileCountry();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, List<CountryCode> value) {
			obj.setNonDomicileCountry(value);
		}
	};
	@XmlElement(name = "VldDmclCtry")
	protected List<CountryCode> validDomicileCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmCountry
	 * PostalAddress.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldDmclCtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidDomicileCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of domicile in which the Corporate Action option is valid. The holder of the security has to certify that it is domiciled in the country indicated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94C::DOMI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption19, List<CountryCode>> mmValidDomicileCountry = new MMMessageAttribute<CorporateActionOption19, List<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmCountry;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "VldDmclCtry";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94C::DOMI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidDomicileCountry";
			definition = "Country of domicile in which the Corporate Action option is valid. The holder of the security has to certify that it is domiciled in the country indicated.";
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public List<CountryCode> getValue(CorporateActionOption19 obj) {
			return obj.getValidDomicileCountry();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, List<CountryCode> value) {
			obj.setValidDomicileCountry(value);
		}
	};
	@XmlElement(name = "CcyOptn")
	protected ActiveCurrencyCode currencyOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCurrencyOption
	 * CorporateActionOption.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyOptn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which the cash disbursed from an interest or dividend payment is offered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :11A::OPTN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption19, Optional<ActiveCurrencyCode>> mmCurrencyOption = new MMMessageAttribute<CorporateActionOption19, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmCurrencyOption;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "CcyOptn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":11A::OPTN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyOption";
			definition = "Currency in which the cash disbursed from an interest or dividend payment is offered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(CorporateActionOption19 obj) {
			return obj.getCurrencyOption();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, Optional<ActiveCurrencyCode> value) {
			obj.setCurrencyOption(value.orElse(null));
		}
	};
	@XmlElement(name = "DfltPrcgOrStgInstr", required = true)
	protected DefaultProcessingOrStandingInstruction1Choice defaultProcessingOrStandingInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DefaultProcessingOrStandingInstruction1Choice
	 * DefaultProcessingOrStandingInstruction1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltPrcgOrStgInstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultProcessingOrStandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the corporate action movement is a default processing or a standing instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::DFLT or STIN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption19, DefaultProcessingOrStandingInstruction1Choice> mmDefaultProcessingOrStandingInstruction = new MMMessageAssociationEnd<CorporateActionOption19, DefaultProcessingOrStandingInstruction1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "DfltPrcgOrStgInstr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::DFLT or STIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultProcessingOrStandingInstruction";
			definition = "Indicates whether the corporate action movement is a default processing or a standing instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DefaultProcessingOrStandingInstruction1Choice.mmObject();
		}

		@Override
		public DefaultProcessingOrStandingInstruction1Choice getValue(CorporateActionOption19 obj) {
			return obj.getDefaultProcessingOrStandingInstruction();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, DefaultProcessingOrStandingInstruction1Choice value) {
			obj.setDefaultProcessingOrStandingInstruction(value);
		}
	};
	@XmlElement(name = "ChrgsApldInd")
	protected YesNoIndicator chargesAppliedIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmChargesAppliedIndicator
	 * CorporateActionOption.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsApldInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAppliedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether charges apply to the holder, for instance redemption charges."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::RCHG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption19, Optional<YesNoIndicator>> mmChargesAppliedIndicator = new MMMessageAttribute<CorporateActionOption19, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmChargesAppliedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "ChrgsApldInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::RCHG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAppliedIndicator";
			definition = "Indicates whether charges apply to the holder, for instance redemption charges.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionOption19 obj) {
			return obj.getChargesAppliedIndicator();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, Optional<YesNoIndicator> value) {
			obj.setChargesAppliedIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CertfctnInd")
	protected YesNoIndicator certificationIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationIndicator
	 * BeneficialOwner.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Whether or not certification is required from the account owner. \nYes: certification required \nNo: no certification required."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::CERT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption19, Optional<YesNoIndicator>> mmCertificationIndicator = new MMMessageAttribute<CorporateActionOption19, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "CertfctnInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::CERT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationIndicator";
			definition = "Whether or not certification is required from the account owner. \nYes: certification required \nNo: no certification required.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionOption19 obj) {
			return obj.getCertificationIndicator();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, Optional<YesNoIndicator> value) {
			obj.setCertificationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "WdrwlAllwdInd")
	protected YesNoIndicator withdrawalAllowedIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmWithdrawalAllowedIndicator
	 * CorporateActionOption.mmWithdrawalAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WdrwlAllwdInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalAllowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether withdrawal of instruction is allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::WTHD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption19, Optional<YesNoIndicator>> mmWithdrawalAllowedIndicator = new MMMessageAttribute<CorporateActionOption19, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmWithdrawalAllowedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "WdrwlAllwdInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::WTHD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalAllowedIndicator";
			definition = "Indicates whether withdrawal of instruction is allowed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionOption19 obj) {
			return obj.getWithdrawalAllowedIndicator();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, Optional<YesNoIndicator> value) {
			obj.setWithdrawalAllowedIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ChngAllwdInd")
	protected YesNoIndicator changeAllowedIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmChangeAllowedIndicator
	 * CorporateActionOption.mmChangeAllowedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChngAllwdInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeAllowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether change of instruction is allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::CHAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionOption19, Optional<YesNoIndicator>> mmChangeAllowedIndicator = new MMMessageAttribute<CorporateActionOption19, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmChangeAllowedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "ChngAllwdInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::CHAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeAllowedIndicator";
			definition = "Indicates whether change of instruction is allowed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionOption19 obj) {
			return obj.getChangeAllowedIndicator();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, Optional<YesNoIndicator> value) {
			obj.setChangeAllowedIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyId")
	protected SecurityIdentification14 securityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :35B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption19, Optional<SecurityIdentification14>> mmSecurityIdentification = new MMMessageAssociationEnd<CorporateActionOption19, Optional<SecurityIdentification14>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identifies the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public Optional<SecurityIdentification14> getValue(CorporateActionOption19 obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, Optional<SecurityIdentification14> value) {
			obj.setSecurityIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DtDtls")
	protected CorporateActionDate15 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate15
	 * CorporateActionDate15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the dates related to a corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption19, Optional<CorporateActionDate15>> mmDateDetails = new MMMessageAssociationEnd<CorporateActionOption19, Optional<CorporateActionDate15>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionDate15.mmObject();
		}

		@Override
		public Optional<CorporateActionDate15> getValue(CorporateActionOption19 obj) {
			return obj.getDateDetails();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, Optional<CorporateActionDate15> value) {
			obj.setDateDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PrdDtls")
	protected CorporateActionPeriod7 periodDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7
	 * CorporateActionPeriod7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrdDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the periods related to a corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption19, Optional<CorporateActionPeriod7>> mmPeriodDetails = new MMMessageAssociationEnd<CorporateActionOption19, Optional<CorporateActionPeriod7>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "PrdDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodDetails";
			definition = "Provides information about the periods related to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionPeriod7.mmObject();
		}

		@Override
		public Optional<CorporateActionPeriod7> getValue(CorporateActionOption19 obj) {
			return obj.getPeriodDetails();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, Optional<CorporateActionPeriod7> value) {
			obj.setPeriodDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RateAndAmtDtls")
	protected CorporateActionRate15 rateAndAmountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate15
	 * CorporateActionRate15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmRelatedChoiceCorporateAction
	 * CorporateActionOption.mmRelatedChoiceCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateAndAmtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndAmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about rates and amounts related to a corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption19, Optional<CorporateActionRate15>> mmRateAndAmountDetails = new MMMessageAssociationEnd<CorporateActionOption19, Optional<CorporateActionRate15>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmRelatedChoiceCorporateAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about rates and amounts related to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionRate15.mmObject();
		}

		@Override
		public Optional<CorporateActionRate15> getValue(CorporateActionOption19 obj) {
			return obj.getRateAndAmountDetails();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, Optional<CorporateActionRate15> value) {
			obj.setRateAndAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDtls")
	protected CorporateActionPrice16 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPrice16
	 * CorporateActionPrice16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the prices related to a corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption19, Optional<CorporateActionPrice16>> mmPriceDetails = new MMMessageAssociationEnd<CorporateActionOption19, Optional<CorporateActionPrice16>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionPrice16.mmObject();
		}

		@Override
		public Optional<CorporateActionPrice16> getValue(CorporateActionOption19 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, Optional<CorporateActionPrice16> value) {
			obj.setPriceDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesQty")
	protected SecuritiesOption15 securitiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesOption15
	 * SecuritiesOption15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmSecuritiesQuantity
	 * SecuritiesProceedsDefinition.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about securities quantity linked to a corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption19, Optional<SecuritiesOption15>> mmSecuritiesQuantity = new MMMessageAssociationEnd<CorporateActionOption19, Optional<SecuritiesOption15>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "SctiesQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Provides information about securities quantity linked to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesOption15.mmObject();
		}

		@Override
		public Optional<SecuritiesOption15> getValue(CorporateActionOption19 obj) {
			return obj.getSecuritiesQuantity();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, Optional<SecuritiesOption15> value) {
			obj.setSecuritiesQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesMvmntDtls")
	protected List<SecuritiesOption14> securitiesMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesOption14
	 * SecuritiesOption14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSecuritiesProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesMvmntDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the securities movement linked to the corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R::SECMOVE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption19, List<SecuritiesOption14>> mmSecuritiesMovementDetails = new MMMessageAssociationEnd<CorporateActionOption19, List<SecuritiesOption14>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R::SECMOVE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementDetails";
			definition = "Provides information about the securities movement linked to the corporate action option.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesOption14.mmObject();
		}

		@Override
		public List<SecuritiesOption14> getValue(CorporateActionOption19 obj) {
			return obj.getSecuritiesMovementDetails();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, List<SecuritiesOption14> value) {
			obj.setSecuritiesMovementDetails(value);
		}
	};
	@XmlElement(name = "CshMvmntDtls")
	protected List<CashOption10> cashMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOption10
	 * CashOption10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshMvmntDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the cash movement linked to the corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:CASHMOVE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption19, List<CashOption10>> mmCashMovementDetails = new MMMessageAssociationEnd<CorporateActionOption19, List<CashOption10>>() {
		{
			businessComponentTrace_lazy = () -> CashProceedsDefinition.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "CshMvmntDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:CASHMOVE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashMovementDetails";
			definition = "Provides information about the cash movement linked to the corporate action option.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashOption10.mmObject();
		}

		@Override
		public List<CashOption10> getValue(CorporateActionOption19 obj) {
			return obj.getCashMovementDetails();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, List<CashOption10> value) {
			obj.setCashMovementDetails(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative5 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5
	 * CorporateActionNarrative5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionOption19, Optional<CorporateActionNarrative5>> mmAdditionalInformation = new MMMessageAssociationEnd<CorporateActionOption19, Optional<CorporateActionNarrative5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionOption19.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionNarrative5.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative5> getValue(CorporateActionOption19 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionOption19 obj, Optional<CorporateActionNarrative5> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption19.mmOptionNumber, com.tools20022.repository.msg.CorporateActionOption19.mmOptionType,
						com.tools20022.repository.msg.CorporateActionOption19.mmFractionDisposition, com.tools20022.repository.msg.CorporateActionOption19.mmOfferType, com.tools20022.repository.msg.CorporateActionOption19.mmOptionFeatures,
						com.tools20022.repository.msg.CorporateActionOption19.mmOptionAvailabilityStatus, com.tools20022.repository.msg.CorporateActionOption19.mmCertificationType,
						com.tools20022.repository.msg.CorporateActionOption19.mmNonDomicileCountry, com.tools20022.repository.msg.CorporateActionOption19.mmValidDomicileCountry,
						com.tools20022.repository.msg.CorporateActionOption19.mmCurrencyOption, com.tools20022.repository.msg.CorporateActionOption19.mmDefaultProcessingOrStandingInstruction,
						com.tools20022.repository.msg.CorporateActionOption19.mmChargesAppliedIndicator, com.tools20022.repository.msg.CorporateActionOption19.mmCertificationIndicator,
						com.tools20022.repository.msg.CorporateActionOption19.mmWithdrawalAllowedIndicator, com.tools20022.repository.msg.CorporateActionOption19.mmChangeAllowedIndicator,
						com.tools20022.repository.msg.CorporateActionOption19.mmSecurityIdentification, com.tools20022.repository.msg.CorporateActionOption19.mmDateDetails,
						com.tools20022.repository.msg.CorporateActionOption19.mmPeriodDetails, com.tools20022.repository.msg.CorporateActionOption19.mmRateAndAmountDetails,
						com.tools20022.repository.msg.CorporateActionOption19.mmPriceDetails, com.tools20022.repository.msg.CorporateActionOption19.mmSecuritiesQuantity,
						com.tools20022.repository.msg.CorporateActionOption19.mmSecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption19.mmCashMovementDetails,
						com.tools20022.repository.msg.CorporateActionOption19.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNotificationV02.mmCorporateActionOptionDetails);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalTextRule.forCorporateActionOption19,
						com.tools20022.repository.constraints.ConstraintOptionNumberGuideline.forCorporateActionOption19, com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule.forCorporateActionOption19,
						com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forCorporateActionOption19, com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forCorporateActionOption19);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CorporateActionOption19";
				definition = "Provides information about the corporate action option.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionOption36.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Exact3NumericText getOptionNumber() {
		return optionNumber;
	}

	public CorporateActionOption19 setOptionNumber(Exact3NumericText optionNumber) {
		this.optionNumber = Objects.requireNonNull(optionNumber);
		return this;
	}

	public CorporateActionOption2Choice getOptionType() {
		return optionType;
	}

	public CorporateActionOption19 setOptionType(CorporateActionOption2Choice optionType) {
		this.optionType = Objects.requireNonNull(optionType);
		return this;
	}

	public Optional<FractionDispositionType1Choice> getFractionDisposition() {
		return fractionDisposition == null ? Optional.empty() : Optional.of(fractionDisposition);
	}

	public CorporateActionOption19 setFractionDisposition(FractionDispositionType1Choice fractionDisposition) {
		this.fractionDisposition = fractionDisposition;
		return this;
	}

	public List<OfferTypeFormat1Choice> getOfferType() {
		return offerType == null ? offerType = new ArrayList<>() : offerType;
	}

	public CorporateActionOption19 setOfferType(List<OfferTypeFormat1Choice> offerType) {
		this.offerType = Objects.requireNonNull(offerType);
		return this;
	}

	public List<OptionFeaturesFormat5Choice> getOptionFeatures() {
		return optionFeatures == null ? optionFeatures = new ArrayList<>() : optionFeatures;
	}

	public CorporateActionOption19 setOptionFeatures(List<OptionFeaturesFormat5Choice> optionFeatures) {
		this.optionFeatures = Objects.requireNonNull(optionFeatures);
		return this;
	}

	public Optional<OptionAvailabilityStatus1Choice> getOptionAvailabilityStatus() {
		return optionAvailabilityStatus == null ? Optional.empty() : Optional.of(optionAvailabilityStatus);
	}

	public CorporateActionOption19 setOptionAvailabilityStatus(OptionAvailabilityStatus1Choice optionAvailabilityStatus) {
		this.optionAvailabilityStatus = optionAvailabilityStatus;
		return this;
	}

	public List<BeneficiaryCertificationType1Choice> getCertificationType() {
		return certificationType == null ? certificationType = new ArrayList<>() : certificationType;
	}

	public CorporateActionOption19 setCertificationType(List<BeneficiaryCertificationType1Choice> certificationType) {
		this.certificationType = Objects.requireNonNull(certificationType);
		return this;
	}

	public List<CountryCode> getNonDomicileCountry() {
		return nonDomicileCountry == null ? nonDomicileCountry = new ArrayList<>() : nonDomicileCountry;
	}

	public CorporateActionOption19 setNonDomicileCountry(List<CountryCode> nonDomicileCountry) {
		this.nonDomicileCountry = Objects.requireNonNull(nonDomicileCountry);
		return this;
	}

	public List<CountryCode> getValidDomicileCountry() {
		return validDomicileCountry == null ? validDomicileCountry = new ArrayList<>() : validDomicileCountry;
	}

	public CorporateActionOption19 setValidDomicileCountry(List<CountryCode> validDomicileCountry) {
		this.validDomicileCountry = Objects.requireNonNull(validDomicileCountry);
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrencyOption() {
		return currencyOption == null ? Optional.empty() : Optional.of(currencyOption);
	}

	public CorporateActionOption19 setCurrencyOption(ActiveCurrencyCode currencyOption) {
		this.currencyOption = currencyOption;
		return this;
	}

	public DefaultProcessingOrStandingInstruction1Choice getDefaultProcessingOrStandingInstruction() {
		return defaultProcessingOrStandingInstruction;
	}

	public CorporateActionOption19 setDefaultProcessingOrStandingInstruction(DefaultProcessingOrStandingInstruction1Choice defaultProcessingOrStandingInstruction) {
		this.defaultProcessingOrStandingInstruction = Objects.requireNonNull(defaultProcessingOrStandingInstruction);
		return this;
	}

	public Optional<YesNoIndicator> getChargesAppliedIndicator() {
		return chargesAppliedIndicator == null ? Optional.empty() : Optional.of(chargesAppliedIndicator);
	}

	public CorporateActionOption19 setChargesAppliedIndicator(YesNoIndicator chargesAppliedIndicator) {
		this.chargesAppliedIndicator = chargesAppliedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getCertificationIndicator() {
		return certificationIndicator == null ? Optional.empty() : Optional.of(certificationIndicator);
	}

	public CorporateActionOption19 setCertificationIndicator(YesNoIndicator certificationIndicator) {
		this.certificationIndicator = certificationIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getWithdrawalAllowedIndicator() {
		return withdrawalAllowedIndicator == null ? Optional.empty() : Optional.of(withdrawalAllowedIndicator);
	}

	public CorporateActionOption19 setWithdrawalAllowedIndicator(YesNoIndicator withdrawalAllowedIndicator) {
		this.withdrawalAllowedIndicator = withdrawalAllowedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getChangeAllowedIndicator() {
		return changeAllowedIndicator == null ? Optional.empty() : Optional.of(changeAllowedIndicator);
	}

	public CorporateActionOption19 setChangeAllowedIndicator(YesNoIndicator changeAllowedIndicator) {
		this.changeAllowedIndicator = changeAllowedIndicator;
		return this;
	}

	public Optional<SecurityIdentification14> getSecurityIdentification() {
		return securityIdentification == null ? Optional.empty() : Optional.of(securityIdentification);
	}

	public CorporateActionOption19 setSecurityIdentification(SecurityIdentification14 securityIdentification) {
		this.securityIdentification = securityIdentification;
		return this;
	}

	public Optional<CorporateActionDate15> getDateDetails() {
		return dateDetails == null ? Optional.empty() : Optional.of(dateDetails);
	}

	public CorporateActionOption19 setDateDetails(CorporateActionDate15 dateDetails) {
		this.dateDetails = dateDetails;
		return this;
	}

	public Optional<CorporateActionPeriod7> getPeriodDetails() {
		return periodDetails == null ? Optional.empty() : Optional.of(periodDetails);
	}

	public CorporateActionOption19 setPeriodDetails(CorporateActionPeriod7 periodDetails) {
		this.periodDetails = periodDetails;
		return this;
	}

	public Optional<CorporateActionRate15> getRateAndAmountDetails() {
		return rateAndAmountDetails == null ? Optional.empty() : Optional.of(rateAndAmountDetails);
	}

	public CorporateActionOption19 setRateAndAmountDetails(CorporateActionRate15 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
		return this;
	}

	public Optional<CorporateActionPrice16> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public CorporateActionOption19 setPriceDetails(CorporateActionPrice16 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}

	public Optional<SecuritiesOption15> getSecuritiesQuantity() {
		return securitiesQuantity == null ? Optional.empty() : Optional.of(securitiesQuantity);
	}

	public CorporateActionOption19 setSecuritiesQuantity(SecuritiesOption15 securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
		return this;
	}

	public List<SecuritiesOption14> getSecuritiesMovementDetails() {
		return securitiesMovementDetails == null ? securitiesMovementDetails = new ArrayList<>() : securitiesMovementDetails;
	}

	public CorporateActionOption19 setSecuritiesMovementDetails(List<SecuritiesOption14> securitiesMovementDetails) {
		this.securitiesMovementDetails = Objects.requireNonNull(securitiesMovementDetails);
		return this;
	}

	public List<CashOption10> getCashMovementDetails() {
		return cashMovementDetails == null ? cashMovementDetails = new ArrayList<>() : cashMovementDetails;
	}

	public CorporateActionOption19 setCashMovementDetails(List<CashOption10> cashMovementDetails) {
		this.cashMovementDetails = Objects.requireNonNull(cashMovementDetails);
		return this;
	}

	public Optional<CorporateActionNarrative5> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateActionOption19 setAdditionalInformation(CorporateActionNarrative5 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}