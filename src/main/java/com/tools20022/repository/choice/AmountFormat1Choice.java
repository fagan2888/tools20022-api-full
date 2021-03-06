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

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AmountType1FormatChoice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between amount formats.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AmountFormat1Choice#mmAmount
 * AmountFormat1Choice.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AmountFormat1Choice#mmNotSpecifiedAmount
 * AmountFormat1Choice.mmNotSpecifiedAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmountFormat1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between amount formats."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmountFormat1Choice", propOrder = {"amount", "notSpecifiedAmount"})
public class AmountFormat1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt", required = true)
	protected ActiveCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AmountFormat1Choice
	 * AmountFormat1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of monetary units specified in a currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountFormat1Choice, ActiveCurrencyAndAmount> mmAmount = new MMMessageAttribute<AmountFormat1Choice, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AmountFormat1Choice.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Number of monetary units specified in a currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(AmountFormat1Choice obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(AmountFormat1Choice obj, ActiveCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "NotSpcfdAmt", required = true)
	protected AmountType1FormatChoice notSpecifiedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AmountType1FormatChoice
	 * AmountType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AmountFormat1Choice
	 * AmountFormat1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotSpcfdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The amount is not specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountFormat1Choice, AmountType1FormatChoice> mmNotSpecifiedAmount = new MMMessageAttribute<AmountFormat1Choice, AmountType1FormatChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AmountFormat1Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedAmount";
			definition = "The amount is not specified.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountType1FormatChoice.mmObject();
		}

		@Override
		public AmountType1FormatChoice getValue(AmountFormat1Choice obj) {
			return obj.getNotSpecifiedAmount();
		}

		@Override
		public void setValue(AmountFormat1Choice obj, AmountType1FormatChoice value) {
			obj.setNotSpecifiedAmount(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AmountFormat1Choice.mmAmount, com.tools20022.repository.choice.AmountFormat1Choice.mmNotSpecifiedAmount);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AmountFormat1Choice";
				definition = "Choice between amount formats.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public AmountFormat1Choice setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public AmountType1FormatChoice getNotSpecifiedAmount() {
		return notSpecifiedAmount;
	}

	public AmountFormat1Choice setNotSpecifiedAmount(AmountType1FormatChoice notSpecifiedAmount) {
		this.notSpecifiedAmount = Objects.requireNonNull(notSpecifiedAmount);
		return this;
	}
}