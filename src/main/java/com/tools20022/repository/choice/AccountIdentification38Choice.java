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
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.entity.AccountIdentification;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesAccount19;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique identification of the securities account or the cash account owned by
 * the customer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification38Choice#mmSecuritiesAccountIdentification
 * AccountIdentification38Choice.mmSecuritiesAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification38Choice#mmCashAccountIdentification
 * AccountIdentification38Choice.mmCashAccountIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AccountIdentification
 * AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountIdentification38Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique identification of the securities account or the cash account owned by the customer."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.AccountIdentification20Choice
 * AccountIdentification20Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountIdentification38Choice", propOrder = {"securitiesAccountIdentification", "cashAccountIdentification"})
public class AccountIdentification38Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesAcctId", required = true)
	protected SecuritiesAccount19 securitiesAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification38Choice
	 * AccountIdentification38Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the securities account as assigned by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification20Choice#mmSecuritiesAccountIdentification
	 * AccountIdentification20Choice.mmSecuritiesAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountIdentification38Choice, SecuritiesAccount19> mmSecuritiesAccountIdentification = new MMMessageAttribute<AccountIdentification38Choice, SecuritiesAccount19>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentification38Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountIdentification";
			definition = "Unique identification of the securities account as assigned by the account servicer.";
			previousVersion_lazy = () -> AccountIdentification20Choice.mmSecuritiesAccountIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount19.mmObject();
		}

		@Override
		public SecuritiesAccount19 getValue(AccountIdentification38Choice obj) {
			return obj.getSecuritiesAccountIdentification();
		}

		@Override
		public void setValue(AccountIdentification38Choice obj, SecuritiesAccount19 value) {
			obj.setSecuritiesAccountIdentification(value);
		}
	};
	@XmlElement(name = "CshAcctId", required = true)
	protected AccountIdentification4Choice cashAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification38Choice
	 * AccountIdentification38Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the cash account, as assigned by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification20Choice#mmCashAccountIdentification
	 * AccountIdentification20Choice.mmCashAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountIdentification38Choice, AccountIdentification4Choice> mmCashAccountIdentification = new MMMessageAttribute<AccountIdentification38Choice, AccountIdentification4Choice>() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentification38Choice.mmObject();
			isDerived = false;
			xmlTag = "CshAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountIdentification";
			definition = "Unique identification of the cash account, as assigned by the account servicer.";
			previousVersion_lazy = () -> AccountIdentification20Choice.mmCashAccountIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification4Choice.mmObject();
		}

		@Override
		public AccountIdentification4Choice getValue(AccountIdentification38Choice obj) {
			return obj.getCashAccountIdentification();
		}

		@Override
		public void setValue(AccountIdentification38Choice obj, AccountIdentification4Choice value) {
			obj.setCashAccountIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentification38Choice.mmSecuritiesAccountIdentification,
						com.tools20022.repository.choice.AccountIdentification38Choice.mmCashAccountIdentification);
				trace_lazy = () -> AccountIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountIdentification38Choice";
				definition = "Unique identification of the securities account or the cash account owned by the customer.";
				previousVersion_lazy = () -> AccountIdentification20Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesAccount19 getSecuritiesAccountIdentification() {
		return securitiesAccountIdentification;
	}

	public AccountIdentification38Choice setSecuritiesAccountIdentification(SecuritiesAccount19 securitiesAccountIdentification) {
		this.securitiesAccountIdentification = Objects.requireNonNull(securitiesAccountIdentification);
		return this;
	}

	public AccountIdentification4Choice getCashAccountIdentification() {
		return cashAccountIdentification;
	}

	public AccountIdentification38Choice setCashAccountIdentification(AccountIdentification4Choice cashAccountIdentification) {
		this.cashAccountIdentification = Objects.requireNonNull(cashAccountIdentification);
		return this;
	}
}