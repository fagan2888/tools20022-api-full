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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the corporate action security option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmSecurityDetails
 * SecuritiesOption59.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmCreditDebitIndicator
 * SecuritiesOption59.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmTemporaryFinancialInstrumentIndicator
 * SecuritiesOption59.mmTemporaryFinancialInstrumentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmNonEligibleProceedsIndicator
 * SecuritiesOption59.mmNonEligibleProceedsIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmIssuerOfferorTaxabilityIndicator
 * SecuritiesOption59.mmIssuerOfferorTaxabilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmNewSecuritiesIssuanceIndicator
 * SecuritiesOption59.mmNewSecuritiesIssuanceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmIncomeType
 * SecuritiesOption59.mmIncomeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmExemptionType
 * SecuritiesOption59.mmExemptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmEntitledQuantity
 * SecuritiesOption59.mmEntitledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmSafekeepingPlace
 * SecuritiesOption59.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmCountryOfIncomeSource
 * SecuritiesOption59.mmCountryOfIncomeSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmFractionDisposition
 * SecuritiesOption59.mmFractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmCurrencyOption
 * SecuritiesOption59.mmCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmTradingPeriod
 * SecuritiesOption59.mmTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmDateDetails
 * SecuritiesOption59.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmRateDetails
 * SecuritiesOption59.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmPriceDetails
 * SecuritiesOption59.mmPriceDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionOption
 * CorporateActionOption}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesOption59"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the corporate action security option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forSecuritiesOption59
 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption59}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forSecuritiesOption59
 * ConstraintIncomeTypeUsageRule.forSecuritiesOption59}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintExemptionTypeUsageRule#forSecuritiesOption59
 * ConstraintExemptionTypeUsageRule.forSecuritiesOption59}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesOption64
 * SecuritiesOption64}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49
 * SecuritiesOption49}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesOption59", propOrder = {"securityDetails", "creditDebitIndicator", "temporaryFinancialInstrumentIndicator", "nonEligibleProceedsIndicator", "issuerOfferorTaxabilityIndicator", "newSecuritiesIssuanceIndicator",
		"incomeType", "exemptionType", "entitledQuantity", "safekeepingPlace", "countryOfIncomeSource", "fractionDisposition", "currencyOption", "tradingPeriod", "dateDetails", "rateDetails", "priceDetails"})
public class SecuritiesOption59 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctyDtls", required = true)
	protected FinancialInstrumentAttributes80 securityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80
	 * FinancialInstrumentAttributes80}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
	 * CorporateActionEvent.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides description of the financial instrument related to securities movement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R::FIA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmSecurityDetails
	 * SecuritiesOption64.mmSecurityDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmSecurityDetails
	 * SecuritiesOption49.mmSecurityDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption59, FinancialInstrumentAttributes80> mmSecurityDetails = new MMMessageAssociationEnd<SecuritiesOption59, FinancialInstrumentAttributes80>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmUnderlyingSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "SctyDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R::FIA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDetails";
			definition = "Provides description of the financial instrument related to securities movement.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmSecurityDetails);
			previousVersion_lazy = () -> SecuritiesOption49.mmSecurityDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes80.mmObject();
		}

		@Override
		public FinancialInstrumentAttributes80 getValue(SecuritiesOption59 obj) {
			return obj.getSecurityDetails();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, FinancialInstrumentAttributes80 value) {
			obj.setSecurityDetails(value);
		}
	};
	@XmlElement(name = "CdtDbtInd", required = true)
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCreditDebitIndicator
	 * ProceedsDefinition.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the value is a debit or credit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::CRDB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmCreditDebitIndicator
	 * SecuritiesOption64.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmCreditDebitIndicator
	 * SecuritiesOption49.mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesOption59, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<SecuritiesOption59, CreditDebitCode>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::CRDB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies whether the value is a debit or credit.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmCreditDebitIndicator);
			previousVersion_lazy = () -> SecuritiesOption49.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public CreditDebitCode getValue(SecuritiesOption59 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "TempFinInstrmInd")
	protected TemporaryFinancialInstrumentIndicator3Choice temporaryFinancialInstrumentIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice
	 * TemporaryFinancialInstrumentIndicator3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTemporaryFinancialInstrumentIndicator
	 * Security.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TempFinInstrmInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TemporaryFinancialInstrumentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the security identified is a temporary security identification used for processing reasons, for example, contra security used in the US."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TEMP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption64.mmTemporaryFinancialInstrumentIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmTemporaryFinancialInstrumentIndicator
	 * SecuritiesOption49.mmTemporaryFinancialInstrumentIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption59, Optional<TemporaryFinancialInstrumentIndicator3Choice>> mmTemporaryFinancialInstrumentIndicator = new MMMessageAssociationEnd<SecuritiesOption59, Optional<TemporaryFinancialInstrumentIndicator3Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmTemporaryFinancialInstrumentIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "TempFinInstrmInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TEMP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TemporaryFinancialInstrumentIndicator";
			definition = "Specifies that the security identified is a temporary security identification used for processing reasons, for example, contra security used in the US.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmTemporaryFinancialInstrumentIndicator);
			previousVersion_lazy = () -> SecuritiesOption49.mmTemporaryFinancialInstrumentIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TemporaryFinancialInstrumentIndicator3Choice.mmObject();
		}

		@Override
		public Optional<TemporaryFinancialInstrumentIndicator3Choice> getValue(SecuritiesOption59 obj) {
			return obj.getTemporaryFinancialInstrumentIndicator();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, Optional<TemporaryFinancialInstrumentIndicator3Choice> value) {
			obj.setTemporaryFinancialInstrumentIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "NonElgblPrcdsInd")
	protected NonEligibleProceedsIndicator3Choice nonEligibleProceedsIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator3Choice
	 * NonEligibleProceedsIndicator3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmNonEligibleProceedsIndicator
	 * ProceedsDefinition.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonElgblPrcdsInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEligibleProceedsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information regarding outturn resources that cannot be processed by the Central Securities Depository (CSD). Special delivery instruction is required from the account owner for the corporate action outcome to be credited."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::NELP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmNonEligibleProceedsIndicator
	 * SecuritiesOption64.mmNonEligibleProceedsIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmNonEligibleProceedsIndicator
	 * SecuritiesOption49.mmNonEligibleProceedsIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption59, Optional<NonEligibleProceedsIndicator3Choice>> mmNonEligibleProceedsIndicator = new MMMessageAssociationEnd<SecuritiesOption59, Optional<NonEligibleProceedsIndicator3Choice>>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmNonEligibleProceedsIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "NonElgblPrcdsInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::NELP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonEligibleProceedsIndicator";
			definition = "Specifies information regarding outturn resources that cannot be processed by the Central Securities Depository (CSD). Special delivery instruction is required from the account owner for the corporate action outcome to be credited.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmNonEligibleProceedsIndicator);
			previousVersion_lazy = () -> SecuritiesOption49.mmNonEligibleProceedsIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NonEligibleProceedsIndicator3Choice.mmObject();
		}

		@Override
		public Optional<NonEligibleProceedsIndicator3Choice> getValue(SecuritiesOption59 obj) {
			return obj.getNonEligibleProceedsIndicator();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, Optional<NonEligibleProceedsIndicator3Choice> value) {
			obj.setNonEligibleProceedsIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrOfferrTaxbltyInd")
	protected IssuerOfferorTaxabilityIndicator1Choice issuerOfferorTaxabilityIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.IssuerOfferorTaxabilityIndicator1Choice
	 * IssuerOfferorTaxabilityIndicator1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmIssuerOfferorTaxabilityIndicator
	 * ProceedsDefinition.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrOfferrTaxbltyInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proceeds are taxable according to the information provided by the issuer / offeror."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption64.mmIssuerOfferorTaxabilityIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption49.mmIssuerOfferorTaxabilityIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesOption59, Optional<IssuerOfferorTaxabilityIndicator1Choice>> mmIssuerOfferorTaxabilityIndicator = new MMMessageAttribute<SecuritiesOption59, Optional<IssuerOfferorTaxabilityIndicator1Choice>>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmIssuerOfferorTaxabilityIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "IssrOfferrTaxbltyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicator";
			definition = "Proceeds are taxable according to the information provided by the issuer / offeror.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmIssuerOfferorTaxabilityIndicator);
			previousVersion_lazy = () -> SecuritiesOption49.mmIssuerOfferorTaxabilityIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IssuerOfferorTaxabilityIndicator1Choice.mmObject();
		}

		@Override
		public Optional<IssuerOfferorTaxabilityIndicator1Choice> getValue(SecuritiesOption59 obj) {
			return obj.getIssuerOfferorTaxabilityIndicator();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, Optional<IssuerOfferorTaxabilityIndicator1Choice> value) {
			obj.setIssuerOfferorTaxabilityIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "NewSctiesIssncInd")
	protected NewSecuritiesIssuanceType5Code newSecuritiesIssuanceIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NewSecuritiesIssuanceType5Code
	 * NewSecuritiesIssuanceType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewSctiesIssncInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewSecuritiesIssuanceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the securities are newly issued or not."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmNewSecuritiesIssuanceIndicator
	 * SecuritiesOption64.mmNewSecuritiesIssuanceIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmNewSecuritiesIssuanceIndicator
	 * SecuritiesOption49.mmNewSecuritiesIssuanceIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesOption59, Optional<NewSecuritiesIssuanceType5Code>> mmNewSecuritiesIssuanceIndicator = new MMMessageAttribute<SecuritiesOption59, Optional<NewSecuritiesIssuanceType5Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "NewSctiesIssncInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewSecuritiesIssuanceIndicator";
			definition = "Indicates whether the securities are newly issued or not.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmNewSecuritiesIssuanceIndicator);
			previousVersion_lazy = () -> SecuritiesOption49.mmNewSecuritiesIssuanceIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NewSecuritiesIssuanceType5Code.mmObject();
		}

		@Override
		public Optional<NewSecuritiesIssuanceType5Code> getValue(SecuritiesOption59 obj) {
			return obj.getNewSecuritiesIssuanceIndicator();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, Optional<NewSecuritiesIssuanceType5Code> value) {
			obj.setNewSecuritiesIssuanceIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "IncmTp")
	protected GenericIdentification30 incomeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30
	 * GenericIdentification30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmIncomeType
	 * CashProceedsDefinition.mmIncomeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of income.\nThe lists of income type codes to be used, are available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ITYP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmIncomeType
	 * SecuritiesOption64.mmIncomeType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmIncomeType
	 * SecuritiesOption49.mmIncomeType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption59, Optional<GenericIdentification30>> mmIncomeType = new MMMessageAssociationEnd<SecuritiesOption59, Optional<GenericIdentification30>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmIncomeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "IncmTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ITYP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeType";
			definition = "Specifies the type of income.\nThe lists of income type codes to be used, are available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmIncomeType);
			previousVersion_lazy = () -> SecuritiesOption49.mmIncomeType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification30.mmObject();
		}

		@Override
		public Optional<GenericIdentification30> getValue(SecuritiesOption59 obj) {
			return obj.getIncomeType();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, Optional<GenericIdentification30> value) {
			obj.setIncomeType(value.orElse(null));
		}
	};
	@XmlElement(name = "XmptnTp")
	protected List<GenericIdentification30> exemptionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30
	 * GenericIdentification30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the basis for the reduced rate of withholding."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmExemptionType
	 * SecuritiesOption64.mmExemptionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmExemptionType
	 * SecuritiesOption49.mmExemptionType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption59, List<GenericIdentification30>> mmExemptionType = new MMMessageAssociationEnd<SecuritiesOption59, List<GenericIdentification30>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "XmptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionType";
			definition = "Specifies the basis for the reduced rate of withholding.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmExemptionType);
			previousVersion_lazy = () -> SecuritiesOption49.mmExemptionType;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification30.mmObject();
		}

		@Override
		public List<GenericIdentification30> getValue(SecuritiesOption59 obj) {
			return obj.getExemptionType();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, List<GenericIdentification30> value) {
			obj.setExemptionType(value);
		}
	};
	@XmlElement(name = "EntitldQty")
	protected Quantity6Choice entitledQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity6Choice
	 * Quantity6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmEntitledSecuritiesQuantity
	 * CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitldQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities based on the terms of the corporate action event and balance of underlying securities entitled to the account owner. (This quantity can be positive or negative)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::ENTL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmEntitledQuantity
	 * SecuritiesOption64.mmEntitledQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmEntitledQuantity
	 * SecuritiesOption49.mmEntitledQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption59, Optional<Quantity6Choice>> mmEntitledQuantity = new MMMessageAssociationEnd<SecuritiesOption59, Optional<Quantity6Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "EntitldQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::ENTL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitledQuantity";
			definition = "Quantity of securities based on the terms of the corporate action event and balance of underlying securities entitled to the account owner. (This quantity can be positive or negative).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmEntitledQuantity);
			previousVersion_lazy = () -> SecuritiesOption49.mmEntitledQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Quantity6Choice.mmObject();
		}

		@Override
		public Optional<Quantity6Choice> getValue(SecuritiesOption59 obj) {
			return obj.getEntitledQuantity();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, Optional<Quantity6Choice> value) {
			obj.setEntitledQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgPlc")
	protected SafekeepingPlaceFormat10Choice safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice
	 * SafekeepingPlaceFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location where the financial instruments are/will be safekept."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94a::SAFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmSafekeepingPlace
	 * SecuritiesOption64.mmSafekeepingPlace}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmSafekeepingPlace
	 * SecuritiesOption49.mmSafekeepingPlace}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption59, Optional<SafekeepingPlaceFormat10Choice>> mmSafekeepingPlace = new MMMessageAssociationEnd<SecuritiesOption59, Optional<SafekeepingPlaceFormat10Choice>>() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94a::SAFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Location where the financial instruments are/will be safekept.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmSafekeepingPlace);
			previousVersion_lazy = () -> SecuritiesOption49.mmSafekeepingPlace;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceFormat10Choice.mmObject();
		}

		@Override
		public Optional<SafekeepingPlaceFormat10Choice> getValue(SecuritiesOption59 obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, Optional<SafekeepingPlaceFormat10Choice> value) {
			obj.setSafekeepingPlace(value.orElse(null));
		}
	};
	@XmlElement(name = "CtryOfIncmSrc")
	protected CountryCode countryOfIncomeSource;
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
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCountryOfIncomeSource
	 * ProceedsDefinition.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfIncmSrc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfIncomeSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the country from which the income originates."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmCountryOfIncomeSource
	 * SecuritiesOption64.mmCountryOfIncomeSource}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmCountryOfIncomeSource
	 * SecuritiesOption49.mmCountryOfIncomeSource}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesOption59, Optional<CountryCode>> mmCountryOfIncomeSource = new MMMessageAttribute<SecuritiesOption59, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmCountryOfIncomeSource;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIncmSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIncomeSource";
			definition = "Indicates the country from which the income originates.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmCountryOfIncomeSource);
			previousVersion_lazy = () -> SecuritiesOption49.mmCountryOfIncomeSource;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(SecuritiesOption59 obj) {
			return obj.getCountryOfIncomeSource();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, Optional<CountryCode> value) {
			obj.setCountryOfIncomeSource(value.orElse(null));
		}
	};
	@XmlElement(name = "FrctnDspstn")
	protected FractionDispositionType26Choice fractionDisposition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType26Choice
	 * FractionDispositionType26Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmFractionDisposition
	 * CorporateActionOption.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmFractionDisposition
	 * SecuritiesOption64.mmFractionDisposition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmFractionDisposition
	 * SecuritiesOption49.mmFractionDisposition}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption59, Optional<FractionDispositionType26Choice>> mmFractionDisposition = new MMMessageAssociationEnd<SecuritiesOption59, Optional<FractionDispositionType26Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmFractionDisposition;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "FrctnDspstn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DISF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionDisposition";
			definition = "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmFractionDisposition);
			previousVersion_lazy = () -> SecuritiesOption49.mmFractionDisposition;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FractionDispositionType26Choice.mmObject();
		}

		@Override
		public Optional<FractionDispositionType26Choice> getValue(SecuritiesOption59 obj) {
			return obj.getFractionDisposition();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, Optional<FractionDispositionType26Choice> value) {
			obj.setFractionDisposition(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmCurrencyOption
	 * SecuritiesOption64.mmCurrencyOption}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmCurrencyOption
	 * SecuritiesOption49.mmCurrencyOption}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesOption59, Optional<ActiveCurrencyCode>> mmCurrencyOption = new MMMessageAttribute<SecuritiesOption59, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmCurrencyOption;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "CcyOptn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":11A::OPTN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyOption";
			definition = "Currency in which the cash disbursed from an interest or dividend payment is offered.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmCurrencyOption);
			previousVersion_lazy = () -> SecuritiesOption49.mmCurrencyOption;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(SecuritiesOption59 obj) {
			return obj.getCurrencyOption();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, Optional<ActiveCurrencyCode> value) {
			obj.setCurrencyOption(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgPrd")
	protected Period3Choice tradingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTradingPeriod
	 * CorporateActionEvent.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which intermediate or outturn securities are tradable in a secondary market."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::TRDP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmTradingPeriod
	 * SecuritiesOption64.mmTradingPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmTradingPeriod
	 * SecuritiesOption49.mmTradingPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption59, Optional<Period3Choice>> mmTradingPeriod = new MMMessageAssociationEnd<SecuritiesOption59, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmTradingPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "TradgPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::TRDP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingPeriod";
			definition = "Period during which intermediate or outturn securities are tradable in a secondary market.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmTradingPeriod);
			previousVersion_lazy = () -> SecuritiesOption49.mmTradingPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(SecuritiesOption59 obj) {
			return obj.getTradingPeriod();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, Optional<Period3Choice> value) {
			obj.setTradingPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "DtDtls", required = true)
	protected SecurityDate12 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityDate12
	 * SecurityDate12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
	 * CorporateActionEvent.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the dates related to securities movement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmDateDetails
	 * SecuritiesOption64.mmDateDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmDateDetails
	 * SecuritiesOption49.mmDateDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption59, SecurityDate12> mmDateDetails = new MMMessageAssociationEnd<SecuritiesOption59, SecurityDate12>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmUnderlyingSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to securities movement.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmDateDetails);
			previousVersion_lazy = () -> SecuritiesOption49.mmDateDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityDate12.mmObject();
		}

		@Override
		public SecurityDate12 getValue(SecuritiesOption59 obj) {
			return obj.getDateDetails();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, SecurityDate12 value) {
			obj.setDateDetails(value);
		}
	};
	@XmlElement(name = "RateDtls")
	protected CorporateActionRate69 rateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate69
	 * CorporateActionRate69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the rates related to securities movement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmRateDetails
	 * SecuritiesOption64.mmRateDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmRateDetails
	 * SecuritiesOption49.mmRateDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption59, Optional<CorporateActionRate69>> mmRateDetails = new MMMessageAssociationEnd<SecuritiesOption59, Optional<CorporateActionRate69>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "RateDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateDetails";
			definition = "Provides information about the rates related to securities movement.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmRateDetails);
			previousVersion_lazy = () -> SecuritiesOption49.mmRateDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionRate69.mmObject();
		}

		@Override
		public Optional<CorporateActionRate69> getValue(SecuritiesOption59 obj) {
			return obj.getRateDetails();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, Optional<CorporateActionRate69> value) {
			obj.setRateDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDtls")
	protected CorporateActionPrice56 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPrice56
	 * CorporateActionPrice56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the prices related to securities movement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64#mmPriceDetails
	 * SecuritiesOption64.mmPriceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmPriceDetails
	 * SecuritiesOption49.mmPriceDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption59, Optional<CorporateActionPrice56>> mmPriceDetails = new MMMessageAssociationEnd<SecuritiesOption59, Optional<CorporateActionPrice56>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption59.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to securities movement.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmPriceDetails);
			previousVersion_lazy = () -> SecuritiesOption49.mmPriceDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionPrice56.mmObject();
		}

		@Override
		public Optional<CorporateActionPrice56> getValue(SecuritiesOption59 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(SecuritiesOption59 obj, Optional<CorporateActionPrice56> value) {
			obj.setPriceDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption59.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption59.mmCreditDebitIndicator,
						com.tools20022.repository.msg.SecuritiesOption59.mmTemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption59.mmNonEligibleProceedsIndicator,
						com.tools20022.repository.msg.SecuritiesOption59.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption59.mmNewSecuritiesIssuanceIndicator,
						com.tools20022.repository.msg.SecuritiesOption59.mmIncomeType, com.tools20022.repository.msg.SecuritiesOption59.mmExemptionType, com.tools20022.repository.msg.SecuritiesOption59.mmEntitledQuantity,
						com.tools20022.repository.msg.SecuritiesOption59.mmSafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption59.mmCountryOfIncomeSource, com.tools20022.repository.msg.SecuritiesOption59.mmFractionDisposition,
						com.tools20022.repository.msg.SecuritiesOption59.mmCurrencyOption, com.tools20022.repository.msg.SecuritiesOption59.mmTradingPeriod, com.tools20022.repository.msg.SecuritiesOption59.mmDateDetails,
						com.tools20022.repository.msg.SecuritiesOption59.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption59.mmPriceDetails);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption59,
						com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forSecuritiesOption59, com.tools20022.repository.constraints.ConstraintExemptionTypeUsageRule.forSecuritiesOption59);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOption59";
				definition = "Provides information about the corporate action security option.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesOption64.mmObject());
				previousVersion_lazy = () -> SecuritiesOption49.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrumentAttributes80 getSecurityDetails() {
		return securityDetails;
	}

	public SecuritiesOption59 setSecurityDetails(FinancialInstrumentAttributes80 securityDetails) {
		this.securityDetails = Objects.requireNonNull(securityDetails);
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public SecuritiesOption59 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public Optional<TemporaryFinancialInstrumentIndicator3Choice> getTemporaryFinancialInstrumentIndicator() {
		return temporaryFinancialInstrumentIndicator == null ? Optional.empty() : Optional.of(temporaryFinancialInstrumentIndicator);
	}

	public SecuritiesOption59 setTemporaryFinancialInstrumentIndicator(TemporaryFinancialInstrumentIndicator3Choice temporaryFinancialInstrumentIndicator) {
		this.temporaryFinancialInstrumentIndicator = temporaryFinancialInstrumentIndicator;
		return this;
	}

	public Optional<NonEligibleProceedsIndicator3Choice> getNonEligibleProceedsIndicator() {
		return nonEligibleProceedsIndicator == null ? Optional.empty() : Optional.of(nonEligibleProceedsIndicator);
	}

	public SecuritiesOption59 setNonEligibleProceedsIndicator(NonEligibleProceedsIndicator3Choice nonEligibleProceedsIndicator) {
		this.nonEligibleProceedsIndicator = nonEligibleProceedsIndicator;
		return this;
	}

	public Optional<IssuerOfferorTaxabilityIndicator1Choice> getIssuerOfferorTaxabilityIndicator() {
		return issuerOfferorTaxabilityIndicator == null ? Optional.empty() : Optional.of(issuerOfferorTaxabilityIndicator);
	}

	public SecuritiesOption59 setIssuerOfferorTaxabilityIndicator(IssuerOfferorTaxabilityIndicator1Choice issuerOfferorTaxabilityIndicator) {
		this.issuerOfferorTaxabilityIndicator = issuerOfferorTaxabilityIndicator;
		return this;
	}

	public Optional<NewSecuritiesIssuanceType5Code> getNewSecuritiesIssuanceIndicator() {
		return newSecuritiesIssuanceIndicator == null ? Optional.empty() : Optional.of(newSecuritiesIssuanceIndicator);
	}

	public SecuritiesOption59 setNewSecuritiesIssuanceIndicator(NewSecuritiesIssuanceType5Code newSecuritiesIssuanceIndicator) {
		this.newSecuritiesIssuanceIndicator = newSecuritiesIssuanceIndicator;
		return this;
	}

	public Optional<GenericIdentification30> getIncomeType() {
		return incomeType == null ? Optional.empty() : Optional.of(incomeType);
	}

	public SecuritiesOption59 setIncomeType(GenericIdentification30 incomeType) {
		this.incomeType = incomeType;
		return this;
	}

	public List<GenericIdentification30> getExemptionType() {
		return exemptionType == null ? exemptionType = new ArrayList<>() : exemptionType;
	}

	public SecuritiesOption59 setExemptionType(List<GenericIdentification30> exemptionType) {
		this.exemptionType = Objects.requireNonNull(exemptionType);
		return this;
	}

	public Optional<Quantity6Choice> getEntitledQuantity() {
		return entitledQuantity == null ? Optional.empty() : Optional.of(entitledQuantity);
	}

	public SecuritiesOption59 setEntitledQuantity(Quantity6Choice entitledQuantity) {
		this.entitledQuantity = entitledQuantity;
		return this;
	}

	public Optional<SafekeepingPlaceFormat10Choice> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public SecuritiesOption59 setSafekeepingPlace(SafekeepingPlaceFormat10Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}

	public Optional<CountryCode> getCountryOfIncomeSource() {
		return countryOfIncomeSource == null ? Optional.empty() : Optional.of(countryOfIncomeSource);
	}

	public SecuritiesOption59 setCountryOfIncomeSource(CountryCode countryOfIncomeSource) {
		this.countryOfIncomeSource = countryOfIncomeSource;
		return this;
	}

	public Optional<FractionDispositionType26Choice> getFractionDisposition() {
		return fractionDisposition == null ? Optional.empty() : Optional.of(fractionDisposition);
	}

	public SecuritiesOption59 setFractionDisposition(FractionDispositionType26Choice fractionDisposition) {
		this.fractionDisposition = fractionDisposition;
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrencyOption() {
		return currencyOption == null ? Optional.empty() : Optional.of(currencyOption);
	}

	public SecuritiesOption59 setCurrencyOption(ActiveCurrencyCode currencyOption) {
		this.currencyOption = currencyOption;
		return this;
	}

	public Optional<Period3Choice> getTradingPeriod() {
		return tradingPeriod == null ? Optional.empty() : Optional.of(tradingPeriod);
	}

	public SecuritiesOption59 setTradingPeriod(Period3Choice tradingPeriod) {
		this.tradingPeriod = tradingPeriod;
		return this;
	}

	public SecurityDate12 getDateDetails() {
		return dateDetails;
	}

	public SecuritiesOption59 setDateDetails(SecurityDate12 dateDetails) {
		this.dateDetails = Objects.requireNonNull(dateDetails);
		return this;
	}

	public Optional<CorporateActionRate69> getRateDetails() {
		return rateDetails == null ? Optional.empty() : Optional.of(rateDetails);
	}

	public SecuritiesOption59 setRateDetails(CorporateActionRate69 rateDetails) {
		this.rateDetails = rateDetails;
		return this;
	}

	public Optional<CorporateActionPrice56> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public SecuritiesOption59 setPriceDetails(CorporateActionPrice56 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}
}