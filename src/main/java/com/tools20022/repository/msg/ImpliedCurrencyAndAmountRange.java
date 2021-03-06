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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.entity.AmountRange;
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
 * Expresses an amount or an amount range with an explicit debit/credit
 * indicator and where the currency is implied.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange#mmAmount
 * ImpliedCurrencyAndAmountRange.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange#mmCreditDebitIndicator
 * ImpliedCurrencyAndAmountRange.mmCreditDebitIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AmountRange
 * AmountRange}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ImpliedCurrencyAndAmountRange"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Expresses an amount or an amount range with an explicit debit/credit indicator and where the currency is implied."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange1
 * ImpliedCurrencyAndAmountRange1}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ImpliedCurrencyAndAmountRange", propOrder = {"amount", "creditDebitIndicator"})
public class ImpliedCurrencyAndAmountRange {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt", required = true)
	protected ImpliedCurrencyAmountRangeChoice amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
	 * ImpliedCurrencyAmountRangeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRange AmountRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange
	 * ImpliedCurrencyAndAmountRange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A specified amount or amount range."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange1#mmAmount
	 * ImpliedCurrencyAndAmountRange1.mmAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ImpliedCurrencyAndAmountRange, ImpliedCurrencyAmountRangeChoice> mmAmount = new MMMessageAttribute<ImpliedCurrencyAndAmountRange, ImpliedCurrencyAmountRangeChoice>() {
		{
			businessComponentTrace_lazy = () -> AmountRange.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "A specified amount or amount range.";
			nextVersions_lazy = () -> Arrays.asList(ImpliedCurrencyAndAmountRange1.mmAmount);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ImpliedCurrencyAmountRangeChoice.mmObject();
		}

		@Override
		public ImpliedCurrencyAmountRangeChoice getValue(ImpliedCurrencyAndAmountRange obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(ImpliedCurrencyAndAmountRange obj, ImpliedCurrencyAmountRangeChoice value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "CdtDbtInd")
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
	 * {@linkplain com.tools20022.repository.entity.AmountRange#mmCreditDebitIndicator
	 * AmountRange.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange
	 * ImpliedCurrencyAndAmountRange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the amount is a credited or debited amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange1#mmCreditDebitIndicator
	 * ImpliedCurrencyAndAmountRange1.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ImpliedCurrencyAndAmountRange, Optional<CreditDebitCode>> mmCreditDebitIndicator = new MMMessageAttribute<ImpliedCurrencyAndAmountRange, Optional<CreditDebitCode>>() {
		{
			businessElementTrace_lazy = () -> AmountRange.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the amount is a credited or debited amount.";
			nextVersions_lazy = () -> Arrays.asList(ImpliedCurrencyAndAmountRange1.mmCreditDebitIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public Optional<CreditDebitCode> getValue(ImpliedCurrencyAndAmountRange obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(ImpliedCurrencyAndAmountRange obj, Optional<CreditDebitCode> value) {
			obj.setCreditDebitIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange.mmAmount, com.tools20022.repository.msg.ImpliedCurrencyAndAmountRange.mmCreditDebitIndicator);
				trace_lazy = () -> AmountRange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ImpliedCurrencyAndAmountRange";
				definition = "Expresses an amount or an amount range with an explicit debit/credit indicator and where the currency is implied.";
				nextVersions_lazy = () -> Arrays.asList(ImpliedCurrencyAndAmountRange1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ImpliedCurrencyAmountRangeChoice getAmount() {
		return amount;
	}

	public ImpliedCurrencyAndAmountRange setAmount(ImpliedCurrencyAmountRangeChoice amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Optional<CreditDebitCode> getCreditDebitIndicator() {
		return creditDebitIndicator == null ? Optional.empty() : Optional.of(creditDebitIndicator);
	}

	public ImpliedCurrencyAndAmountRange setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}
}