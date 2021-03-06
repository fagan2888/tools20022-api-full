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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesAccount13;
import com.tools20022.repository.msg.SecuritiesAccountRange1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies one or a range of securities accounts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesAccount1Choice#mmRange
 * SecuritiesAccount1Choice.mmRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesAccount1Choice#mmAccount
 * SecuritiesAccount1Choice.mmAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
 * SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesAccount1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies one or a range of securities accounts."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.SecuritiesAccount2Choice
 * SecuritiesAccount2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesAccount1Choice", propOrder = {"range", "account"})
public class SecuritiesAccount1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rg", required = true)
	protected SecuritiesAccountRange1 range;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountRange1
	 * SecuritiesAccountRange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccount1Choice
	 * SecuritiesAccount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Range"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Range of identifications of the securities accounts."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccount2Choice#mmRange
	 * SecuritiesAccount2Choice.mmRange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesAccount1Choice, SecuritiesAccountRange1> mmRange = new MMMessageAssociationEnd<SecuritiesAccount1Choice, SecuritiesAccountRange1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesAccount1Choice.mmObject();
			isDerived = false;
			xmlTag = "Rg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Range";
			definition = "Range of identifications of the securities accounts.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccount2Choice.mmRange);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccountRange1.mmObject();
		}

		@Override
		public SecuritiesAccountRange1 getValue(SecuritiesAccount1Choice obj) {
			return obj.getRange();
		}

		@Override
		public void setValue(SecuritiesAccount1Choice obj, SecuritiesAccountRange1 value) {
			obj.setRange(value);
		}
	};
	@XmlElement(name = "Acct", required = true)
	protected List<SecuritiesAccount13> account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccount1Choice
	 * SecuritiesAccount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of the securities account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccount2Choice#mmAccount
	 * SecuritiesAccount2Choice.mmAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesAccount1Choice, List<SecuritiesAccount13>> mmAccount = new MMMessageAssociationEnd<SecuritiesAccount1Choice, List<SecuritiesAccount13>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesAccount1Choice.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unique identification of the securities account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccount2Choice.mmAccount);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount13.mmObject();
		}

		@Override
		public List<SecuritiesAccount13> getValue(SecuritiesAccount1Choice obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(SecuritiesAccount1Choice obj, List<SecuritiesAccount13> value) {
			obj.setAccount(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuritiesAccount1Choice.mmRange, com.tools20022.repository.choice.SecuritiesAccount1Choice.mmAccount);
				trace_lazy = () -> SecuritiesAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesAccount1Choice";
				definition = "Specifies one or a range of securities accounts.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesAccount2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesAccountRange1 getRange() {
		return range;
	}

	public SecuritiesAccount1Choice setRange(SecuritiesAccountRange1 range) {
		this.range = Objects.requireNonNull(range);
		return this;
	}

	public List<SecuritiesAccount13> getAccount() {
		return account == null ? account = new ArrayList<>() : account;
	}

	public SecuritiesAccount1Choice setAccount(List<SecuritiesAccount13> account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}
}