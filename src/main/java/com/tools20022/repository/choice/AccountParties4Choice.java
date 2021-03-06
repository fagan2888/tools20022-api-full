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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9;
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
 * Party associated with the account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#mmPrimaryOwner
 * AccountParties4Choice.mmPrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#mmTrustee
 * AccountParties4Choice.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#mmCustodianForMinor
 * AccountParties4Choice.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#mmNominee
 * AccountParties4Choice.mmNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#mmJointOwner
 * AccountParties4Choice.mmJointOwner}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountParties4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party associated with the account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule#forAccountParties4Choice
 * ConstraintRegistrationAddressIndicator1Rule.forAccountParties4Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties7Choice
 * AccountParties7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties5Choice
 * AccountParties5Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice
 * AccountParties1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountParties4Choice", propOrder = {"primaryOwner", "trustee", "custodianForMinor", "nominee", "jointOwner"})
public class AccountParties4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmryOwnr", required = true)
	protected InvestmentAccountOwnershipInformation9 primaryOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9
	 * InvestmentAccountOwnershipInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrimaryOwner PrimaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice
	 * AccountParties4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Single owner of the investment account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#mmPrimaryOwner
	 * AccountParties7Choice.mmPrimaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#mmPrimaryOwner
	 * AccountParties5Choice.mmPrimaryOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#mmPrimaryOwner
	 * AccountParties1Choice.mmPrimaryOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties4Choice, InvestmentAccountOwnershipInformation9> mmPrimaryOwner = new MMMessageAssociationEnd<AccountParties4Choice, InvestmentAccountOwnershipInformation9>() {
		{
			businessComponentTrace_lazy = () -> PrimaryOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountParties4Choice.mmObject();
			isDerived = false;
			xmlTag = "PmryOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryOwner";
			definition = "Single owner of the investment account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties7Choice.mmPrimaryOwner, AccountParties5Choice.mmPrimaryOwner);
			previousVersion_lazy = () -> AccountParties1Choice.mmPrimaryOwner;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation9.mmObject();
		}

		@Override
		public InvestmentAccountOwnershipInformation9 getValue(AccountParties4Choice obj) {
			return obj.getPrimaryOwner();
		}

		@Override
		public void setValue(AccountParties4Choice obj, InvestmentAccountOwnershipInformation9 value) {
			obj.setPrimaryOwner(value);
		}
	};
	@XmlElement(name = "Trstee", required = true)
	protected List<InvestmentAccountOwnershipInformation9> trustee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9
	 * InvestmentAccountOwnershipInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TrusteeRole TrusteeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice
	 * AccountParties4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trstee"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trustee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal owners of the property. However, the beneficiary has the equitable or beneficial ownership."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#mmTrustee
	 * AccountParties7Choice.mmTrustee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#mmTrustee
	 * AccountParties5Choice.mmTrustee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#mmTrustee
	 * AccountParties1Choice.mmTrustee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties4Choice, List<InvestmentAccountOwnershipInformation9>> mmTrustee = new MMMessageAssociationEnd<AccountParties4Choice, List<InvestmentAccountOwnershipInformation9>>() {
		{
			businessComponentTrace_lazy = () -> TrusteeRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountParties4Choice.mmObject();
			isDerived = false;
			xmlTag = "Trstee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trustee";
			definition = "Legal owners of the property. However, the beneficiary has the equitable or beneficial ownership.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties7Choice.mmTrustee, AccountParties5Choice.mmTrustee);
			previousVersion_lazy = () -> AccountParties1Choice.mmTrustee;
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation9.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation9> getValue(AccountParties4Choice obj) {
			return obj.getTrustee();
		}

		@Override
		public void setValue(AccountParties4Choice obj, List<InvestmentAccountOwnershipInformation9> value) {
			obj.setTrustee(value);
		}
	};
	@XmlElement(name = "CtdnForMnr", required = true)
	protected InvestmentAccountOwnershipInformation9 custodianForMinor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9
	 * InvestmentAccountOwnershipInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CustodianForMinor
	 * CustodianForMinor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice
	 * AccountParties4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtdnForMnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodianForMinor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#mmCustodianForMinor
	 * AccountParties7Choice.mmCustodianForMinor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#mmCustodianForMinor
	 * AccountParties5Choice.mmCustodianForMinor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#mmCustodianForMinor
	 * AccountParties1Choice.mmCustodianForMinor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties4Choice, InvestmentAccountOwnershipInformation9> mmCustodianForMinor = new MMMessageAssociationEnd<AccountParties4Choice, InvestmentAccountOwnershipInformation9>() {
		{
			businessComponentTrace_lazy = () -> CustodianForMinor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountParties4Choice.mmObject();
			isDerived = false;
			xmlTag = "CtdnForMnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianForMinor";
			definition = "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties7Choice.mmCustodianForMinor, AccountParties5Choice.mmCustodianForMinor);
			previousVersion_lazy = () -> AccountParties1Choice.mmCustodianForMinor;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation9.mmObject();
		}

		@Override
		public InvestmentAccountOwnershipInformation9 getValue(AccountParties4Choice obj) {
			return obj.getCustodianForMinor();
		}

		@Override
		public void setValue(AccountParties4Choice obj, InvestmentAccountOwnershipInformation9 value) {
			obj.setCustodianForMinor(value);
		}
	};
	@XmlElement(name = "Nmnee", required = true)
	protected InvestmentAccountOwnershipInformation9 nominee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9
	 * InvestmentAccountOwnershipInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Nominee Nominee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice
	 * AccountParties4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nmnee"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nominee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#mmNominee
	 * AccountParties7Choice.mmNominee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#mmNominee
	 * AccountParties5Choice.mmNominee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#mmNominee
	 * AccountParties1Choice.mmNominee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties4Choice, InvestmentAccountOwnershipInformation9> mmNominee = new MMMessageAssociationEnd<AccountParties4Choice, InvestmentAccountOwnershipInformation9>() {
		{
			businessComponentTrace_lazy = () -> Nominee.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountParties4Choice.mmObject();
			isDerived = false;
			xmlTag = "Nmnee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nominee";
			definition = "Entity named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties7Choice.mmNominee, AccountParties5Choice.mmNominee);
			previousVersion_lazy = () -> AccountParties1Choice.mmNominee;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation9.mmObject();
		}

		@Override
		public InvestmentAccountOwnershipInformation9 getValue(AccountParties4Choice obj) {
			return obj.getNominee();
		}

		@Override
		public void setValue(AccountParties4Choice obj, InvestmentAccountOwnershipInformation9 value) {
			obj.setNominee(value);
		}
	};
	@XmlElement(name = "JntOwnr", required = true)
	protected List<InvestmentAccountOwnershipInformation9> jointOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9
	 * InvestmentAccountOwnershipInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.JointOwner JointOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice
	 * AccountParties4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "JntOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JointOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Co-owner of the investment account when the ownership is assigned to more than one party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#mmJointOwner
	 * AccountParties7Choice.mmJointOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#mmJointOwner
	 * AccountParties5Choice.mmJointOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#mmJointOwner
	 * AccountParties1Choice.mmJointOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties4Choice, List<InvestmentAccountOwnershipInformation9>> mmJointOwner = new MMMessageAssociationEnd<AccountParties4Choice, List<InvestmentAccountOwnershipInformation9>>() {
		{
			businessComponentTrace_lazy = () -> JointOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountParties4Choice.mmObject();
			isDerived = false;
			xmlTag = "JntOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointOwner";
			definition = "Co-owner of the investment account when the ownership is assigned to more than one party.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties7Choice.mmJointOwner, AccountParties5Choice.mmJointOwner);
			previousVersion_lazy = () -> AccountParties1Choice.mmJointOwner;
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation9.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation9> getValue(AccountParties4Choice obj) {
			return obj.getJointOwner();
		}

		@Override
		public void setValue(AccountParties4Choice obj, List<InvestmentAccountOwnershipInformation9> value) {
			obj.setJointOwner(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties4Choice.mmPrimaryOwner, com.tools20022.repository.choice.AccountParties4Choice.mmTrustee,
						com.tools20022.repository.choice.AccountParties4Choice.mmCustodianForMinor, com.tools20022.repository.choice.AccountParties4Choice.mmNominee, com.tools20022.repository.choice.AccountParties4Choice.mmJointOwner);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule.forAccountParties4Choice);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountParties4Choice";
				definition = "Party associated with the account.";
				nextVersions_lazy = () -> Arrays.asList(AccountParties7Choice.mmObject(), AccountParties5Choice.mmObject());
				previousVersion_lazy = () -> AccountParties1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public InvestmentAccountOwnershipInformation9 getPrimaryOwner() {
		return primaryOwner;
	}

	public AccountParties4Choice setPrimaryOwner(InvestmentAccountOwnershipInformation9 primaryOwner) {
		this.primaryOwner = Objects.requireNonNull(primaryOwner);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation9> getTrustee() {
		return trustee == null ? trustee = new ArrayList<>() : trustee;
	}

	public AccountParties4Choice setTrustee(List<InvestmentAccountOwnershipInformation9> trustee) {
		this.trustee = Objects.requireNonNull(trustee);
		return this;
	}

	public InvestmentAccountOwnershipInformation9 getCustodianForMinor() {
		return custodianForMinor;
	}

	public AccountParties4Choice setCustodianForMinor(InvestmentAccountOwnershipInformation9 custodianForMinor) {
		this.custodianForMinor = Objects.requireNonNull(custodianForMinor);
		return this;
	}

	public InvestmentAccountOwnershipInformation9 getNominee() {
		return nominee;
	}

	public AccountParties4Choice setNominee(InvestmentAccountOwnershipInformation9 nominee) {
		this.nominee = Objects.requireNonNull(nominee);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation9> getJointOwner() {
		return jointOwner == null ? jointOwner = new ArrayList<>() : jointOwner;
	}

	public AccountParties4Choice setJointOwner(List<InvestmentAccountOwnershipInformation9> jointOwner) {
		this.jointOwner = Objects.requireNonNull(jointOwner);
		return this;
	}
}