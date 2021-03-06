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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.SettlementUnitType2Choice;
import com.tools20022.repository.datatype.ISOYearMonth;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Settlement of the securities in a securities transaction, that is, the
 * instruction to deliver or receive securities, involving the payment of an
 * amount of money or not.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation4#mmSecuritiesQuantityType
 * SettlementInformation4.mmSecuritiesQuantityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation4#mmContractSettlementMonth
 * SettlementInformation4.mmContractSettlementMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation4#mmMinimumDenomination
 * SettlementInformation4.mmMinimumDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation4#mmMinimumMultipleQuantity
 * SettlementInformation4.mmMinimumMultipleQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation4#mmDeviatingSettlementUnit
 * SettlementInformation4.mmDeviatingSettlementUnit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementInformation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementInformation17
 * SettlementInformation17}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementInformation4", propOrder = {"securitiesQuantityType", "contractSettlementMonth", "minimumDenomination", "minimumMultipleQuantity", "deviatingSettlementUnit"})
public class SettlementInformation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesQtyTp")
	protected SettlementUnitType2Choice securitiesQuantityType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlementUnitType2Choice
	 * SettlementUnitType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation4
	 * SettlementInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesQtyTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Choice between formats for the quantity of security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation17#mmSecuritiesQuantityType
	 * SettlementInformation17.mmSecuritiesQuantityType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInformation4, Optional<SettlementUnitType2Choice>> mmSecuritiesQuantityType = new MMMessageAttribute<SettlementInformation4, Optional<SettlementUnitType2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation4.mmObject();
			isDerived = false;
			xmlTag = "SctiesQtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantityType";
			definition = "Choice between formats for the quantity of security.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInformation17.mmSecuritiesQuantityType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementUnitType2Choice.mmObject();
		}

		@Override
		public Optional<SettlementUnitType2Choice> getValue(SettlementInformation4 obj) {
			return obj.getSecuritiesQuantityType();
		}

		@Override
		public void setValue(SettlementInformation4 obj, Optional<SettlementUnitType2Choice> value) {
			obj.setSecuritiesQuantityType(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrctSttlmMnth")
	protected ISOYearMonth contractSettlementMonth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation4
	 * SettlementInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctSttlmMnth"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSettlementMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies when the contract (i.e. MBS/TBA) will settle."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 667</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation17#mmContractSettlementMonth
	 * SettlementInformation17.mmContractSettlementMonth}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInformation4, Optional<ISOYearMonth>> mmContractSettlementMonth = new MMMessageAttribute<SettlementInformation4, Optional<ISOYearMonth>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation4.mmObject();
			isDerived = false;
			xmlTag = "CtrctSttlmMnth";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "667"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractSettlementMonth";
			definition = "Specifies when the contract (i.e. MBS/TBA) will settle.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInformation17.mmContractSettlementMonth);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}

		@Override
		public Optional<ISOYearMonth> getValue(SettlementInformation4 obj) {
			return obj.getContractSettlementMonth();
		}

		@Override
		public void setValue(SettlementInformation4 obj, Optional<ISOYearMonth> value) {
			obj.setContractSettlementMonth(value.orElse(null));
		}
	};
	@XmlElement(name = "MinDnmtn")
	protected FinancialInstrumentQuantity1Choice minimumDenomination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation4
	 * SettlementInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinDnmtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the minimum quantity (unit or nominal) of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation17#mmMinimumDenomination
	 * SettlementInformation17.mmMinimumDenomination}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInformation4, Optional<FinancialInstrumentQuantity1Choice>> mmMinimumDenomination = new MMMessageAttribute<SettlementInformation4, Optional<FinancialInstrumentQuantity1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation4.mmObject();
			isDerived = false;
			xmlTag = "MinDnmtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumDenomination";
			definition = "Indicates the minimum quantity (unit or nominal) of a security.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInformation17.mmMinimumDenomination);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1Choice> getValue(SettlementInformation4 obj) {
			return obj.getMinimumDenomination();
		}

		@Override
		public void setValue(SettlementInformation4 obj, Optional<FinancialInstrumentQuantity1Choice> value) {
			obj.setMinimumDenomination(value.orElse(null));
		}
	};
	@XmlElement(name = "MinMltplQty")
	protected FinancialInstrumentQuantity1Choice minimumMultipleQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation4
	 * SettlementInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinMltplQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumMultipleQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum multiple quantity (unit or nominal) of securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation17#mmMinimumMultipleQuantity
	 * SettlementInformation17.mmMinimumMultipleQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInformation4, Optional<FinancialInstrumentQuantity1Choice>> mmMinimumMultipleQuantity = new MMMessageAttribute<SettlementInformation4, Optional<FinancialInstrumentQuantity1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation4.mmObject();
			isDerived = false;
			xmlTag = "MinMltplQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMultipleQuantity";
			definition = "Minimum multiple quantity (unit or nominal) of securities.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInformation17.mmMinimumMultipleQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1Choice> getValue(SettlementInformation4 obj) {
			return obj.getMinimumMultipleQuantity();
		}

		@Override
		public void setValue(SettlementInformation4 obj, Optional<FinancialInstrumentQuantity1Choice> value) {
			obj.setMinimumMultipleQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "DevtgSttlmUnit")
	protected List<FinancialInstrumentQuantity1Choice> deviatingSettlementUnit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation4
	 * SettlementInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DevtgSttlmUnit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeviatingSettlementUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125 shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation17#mmDeviatingSettlementUnit
	 * SettlementInformation17.mmDeviatingSettlementUnit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInformation4, List<FinancialInstrumentQuantity1Choice>> mmDeviatingSettlementUnit = new MMMessageAttribute<SettlementInformation4, List<FinancialInstrumentQuantity1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation4.mmObject();
			isDerived = false;
			xmlTag = "DevtgSttlmUnit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeviatingSettlementUnit";
			definition = "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125 shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size.";
			nextVersions_lazy = () -> Arrays.asList(SettlementInformation17.mmDeviatingSettlementUnit);
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public List<FinancialInstrumentQuantity1Choice> getValue(SettlementInformation4 obj) {
			return obj.getDeviatingSettlementUnit();
		}

		@Override
		public void setValue(SettlementInformation4 obj, List<FinancialInstrumentQuantity1Choice> value) {
			obj.setDeviatingSettlementUnit(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInformation4.mmSecuritiesQuantityType, com.tools20022.repository.msg.SettlementInformation4.mmContractSettlementMonth,
						com.tools20022.repository.msg.SettlementInformation4.mmMinimumDenomination, com.tools20022.repository.msg.SettlementInformation4.mmMinimumMultipleQuantity,
						com.tools20022.repository.msg.SettlementInformation4.mmDeviatingSettlementUnit);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementInformation4";
				definition = "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not.";
				nextVersions_lazy = () -> Arrays.asList(SettlementInformation17.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SettlementUnitType2Choice> getSecuritiesQuantityType() {
		return securitiesQuantityType == null ? Optional.empty() : Optional.of(securitiesQuantityType);
	}

	public SettlementInformation4 setSecuritiesQuantityType(SettlementUnitType2Choice securitiesQuantityType) {
		this.securitiesQuantityType = securitiesQuantityType;
		return this;
	}

	public Optional<ISOYearMonth> getContractSettlementMonth() {
		return contractSettlementMonth == null ? Optional.empty() : Optional.of(contractSettlementMonth);
	}

	public SettlementInformation4 setContractSettlementMonth(ISOYearMonth contractSettlementMonth) {
		this.contractSettlementMonth = contractSettlementMonth;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getMinimumDenomination() {
		return minimumDenomination == null ? Optional.empty() : Optional.of(minimumDenomination);
	}

	public SettlementInformation4 setMinimumDenomination(FinancialInstrumentQuantity1Choice minimumDenomination) {
		this.minimumDenomination = minimumDenomination;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getMinimumMultipleQuantity() {
		return minimumMultipleQuantity == null ? Optional.empty() : Optional.of(minimumMultipleQuantity);
	}

	public SettlementInformation4 setMinimumMultipleQuantity(FinancialInstrumentQuantity1Choice minimumMultipleQuantity) {
		this.minimumMultipleQuantity = minimumMultipleQuantity;
		return this;
	}

	public List<FinancialInstrumentQuantity1Choice> getDeviatingSettlementUnit() {
		return deviatingSettlementUnit == null ? deviatingSettlementUnit = new ArrayList<>() : deviatingSettlementUnit;
	}

	public SettlementInformation4 setDeviatingSettlementUnit(List<FinancialInstrumentQuantity1Choice> deviatingSettlementUnit) {
		this.deviatingSettlementUnit = Objects.requireNonNull(deviatingSettlementUnit);
		return this;
	}
}