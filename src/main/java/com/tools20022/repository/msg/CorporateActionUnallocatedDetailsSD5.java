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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1;
import com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2;
import com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD5;
import com.tools20022.repository.msg.CorporateActionUnallocatedSecuritiesTransactionDetailsSD6;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding the corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5#mmUnallocatedDistributionBalance
 * CorporateActionUnallocatedDetailsSD5.mmUnallocatedDistributionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5#mmUnallocatedRedemptionBalance
 * CorporateActionUnallocatedDetailsSD5.mmUnallocatedRedemptionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5#mmUnallocatedReorganisationBalance
 * CorporateActionUnallocatedDetailsSD5.mmUnallocatedReorganisationBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5#mmUnallocatedSecuritiesTransactionDetails
 * CorporateActionUnallocatedDetailsSD5.
 * mmUnallocatedSecuritiesTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5#mmUnallocatedCashTransactionDetails
 * CorporateActionUnallocatedDetailsSD5.mmUnallocatedCashTransactionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionUnallocatedDetailsSD5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding the corporate action event."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD6
 * CorporateActionUnallocatedDetailsSD6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4
 * CorporateActionUnallocatedDetailsSD4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionUnallocatedDetailsSD5", propOrder = {"unallocatedDistributionBalance", "unallocatedRedemptionBalance", "unallocatedReorganisationBalance", "unallocatedSecuritiesTransactionDetails",
		"unallocatedCashTransactionDetails"})
public class CorporateActionUnallocatedDetailsSD5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UallctdDstrbtnBal")
	protected CorporateActionUnallocatedBalanceSD2Choice unallocatedDistributionBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD2Choice
	 * CorporateActionUnallocatedBalanceSD2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5
	 * CorporateActionUnallocatedDetailsSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UallctdDstrbtnBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnallocatedDistributionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of Participants positions distribution balance concerned in unallocated payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Unallocated Balance</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD6#mmUnallocatedDistributionBalance
	 * CorporateActionUnallocatedDetailsSD6.mmUnallocatedDistributionBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4#mmUnallocatedDistributionBalance
	 * CorporateActionUnallocatedDetailsSD4.mmUnallocatedDistributionBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedDetailsSD5, Optional<CorporateActionUnallocatedBalanceSD2Choice>> mmUnallocatedDistributionBalance = new MMMessageAssociationEnd<CorporateActionUnallocatedDetailsSD5, Optional<CorporateActionUnallocatedBalanceSD2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "UallctdDstrbtnBal";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Unallocated Balance"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedDistributionBalance";
			definition = "Type of Participants positions distribution balance concerned in unallocated payment.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedDetailsSD6.mmUnallocatedDistributionBalance);
			previousVersion_lazy = () -> CorporateActionUnallocatedDetailsSD4.mmUnallocatedDistributionBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionUnallocatedBalanceSD2Choice.mmObject();
		}

		@Override
		public Optional<CorporateActionUnallocatedBalanceSD2Choice> getValue(CorporateActionUnallocatedDetailsSD5 obj) {
			return obj.getUnallocatedDistributionBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedDetailsSD5 obj, Optional<CorporateActionUnallocatedBalanceSD2Choice> value) {
			obj.setUnallocatedDistributionBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "UallctdRedBal")
	protected CorporateActionUnallocatedBalanceSD1 unallocatedRedemptionBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD1
	 * CorporateActionUnallocatedBalanceSD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5
	 * CorporateActionUnallocatedDetailsSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UallctdRedBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnallocatedRedemptionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of Participants positions redemption balance concerned in unallocated payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD6#mmUnallocatedRedemptionBalance
	 * CorporateActionUnallocatedDetailsSD6.mmUnallocatedRedemptionBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4#mmUnallocatedRedemptionBalance
	 * CorporateActionUnallocatedDetailsSD4.mmUnallocatedRedemptionBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedDetailsSD5, Optional<CorporateActionUnallocatedBalanceSD1>> mmUnallocatedRedemptionBalance = new MMMessageAssociationEnd<CorporateActionUnallocatedDetailsSD5, Optional<CorporateActionUnallocatedBalanceSD1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "UallctdRedBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedRedemptionBalance";
			definition = "Type of Participants positions redemption balance concerned in unallocated payment.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedDetailsSD6.mmUnallocatedRedemptionBalance);
			previousVersion_lazy = () -> CorporateActionUnallocatedDetailsSD4.mmUnallocatedRedemptionBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionUnallocatedBalanceSD1.mmObject();
		}

		@Override
		public Optional<CorporateActionUnallocatedBalanceSD1> getValue(CorporateActionUnallocatedDetailsSD5 obj) {
			return obj.getUnallocatedRedemptionBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedDetailsSD5 obj, Optional<CorporateActionUnallocatedBalanceSD1> value) {
			obj.setUnallocatedRedemptionBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "UallctdReorgBal")
	protected CorporateActionUnallocatedBalanceSD2 unallocatedReorganisationBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2
	 * CorporateActionUnallocatedBalanceSD2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5
	 * CorporateActionUnallocatedDetailsSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UallctdReorgBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnallocatedReorganisationBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of participants positions reorganisation balance concerned in unallocated payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD6#mmUnallocatedReorganisationBalance
	 * CorporateActionUnallocatedDetailsSD6.mmUnallocatedReorganisationBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedDetailsSD5, Optional<CorporateActionUnallocatedBalanceSD2>> mmUnallocatedReorganisationBalance = new MMMessageAssociationEnd<CorporateActionUnallocatedDetailsSD5, Optional<CorporateActionUnallocatedBalanceSD2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "UallctdReorgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedReorganisationBalance";
			definition = "Type of participants positions reorganisation balance concerned in unallocated payment.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedDetailsSD6.mmUnallocatedReorganisationBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionUnallocatedBalanceSD2.mmObject();
		}

		@Override
		public Optional<CorporateActionUnallocatedBalanceSD2> getValue(CorporateActionUnallocatedDetailsSD5 obj) {
			return obj.getUnallocatedReorganisationBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedDetailsSD5 obj, Optional<CorporateActionUnallocatedBalanceSD2> value) {
			obj.setUnallocatedReorganisationBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "UallctdSctiesTxDtls")
	protected List<CorporateActionUnallocatedSecuritiesTransactionDetailsSD6> unallocatedSecuritiesTransactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedSecuritiesTransactionDetailsSD6
	 * CorporateActionUnallocatedSecuritiesTransactionDetailsSD6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5
	 * CorporateActionUnallocatedDetailsSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UallctdSctiesTxDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnallocatedSecuritiesTransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the securities transactions concerned in unallocated payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Payout (Cash)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD6#mmUnallocatedSecuritiesTransactionDetails
	 * CorporateActionUnallocatedDetailsSD6.
	 * mmUnallocatedSecuritiesTransactionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4#mmUnallocatedSecuritiesTransactionDetails
	 * CorporateActionUnallocatedDetailsSD4.
	 * mmUnallocatedSecuritiesTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedDetailsSD5, List<CorporateActionUnallocatedSecuritiesTransactionDetailsSD6>> mmUnallocatedSecuritiesTransactionDetails = new MMMessageAssociationEnd<CorporateActionUnallocatedDetailsSD5, List<CorporateActionUnallocatedSecuritiesTransactionDetailsSD6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "UallctdSctiesTxDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payout (Cash)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedSecuritiesTransactionDetails";
			definition = "Details of the securities transactions concerned in unallocated payment.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedDetailsSD6.mmUnallocatedSecuritiesTransactionDetails);
			previousVersion_lazy = () -> CorporateActionUnallocatedDetailsSD4.mmUnallocatedSecuritiesTransactionDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionUnallocatedSecuritiesTransactionDetailsSD6.mmObject();
		}

		@Override
		public List<CorporateActionUnallocatedSecuritiesTransactionDetailsSD6> getValue(CorporateActionUnallocatedDetailsSD5 obj) {
			return obj.getUnallocatedSecuritiesTransactionDetails();
		}

		@Override
		public void setValue(CorporateActionUnallocatedDetailsSD5 obj, List<CorporateActionUnallocatedSecuritiesTransactionDetailsSD6> value) {
			obj.setUnallocatedSecuritiesTransactionDetails(value);
		}
	};
	@XmlElement(name = "UallctdCshTxDtls")
	protected List<CorporateActionUnallocatedCashTransactionDetailsSD5> unallocatedCashTransactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD5
	 * CorporateActionUnallocatedCashTransactionDetailsSD5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5
	 * CorporateActionUnallocatedDetailsSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UallctdCshTxDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnallocatedCashTransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the cash transactions concerned in unallocated payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Payout (Securities)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD6#mmUnallocatedCashTransactionDetails
	 * CorporateActionUnallocatedDetailsSD6.mmUnallocatedCashTransactionDetails}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD4#mmUnallocatedCashTransactionDetails
	 * CorporateActionUnallocatedDetailsSD4.mmUnallocatedCashTransactionDetails}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedDetailsSD5, List<CorporateActionUnallocatedCashTransactionDetailsSD5>> mmUnallocatedCashTransactionDetails = new MMMessageAssociationEnd<CorporateActionUnallocatedDetailsSD5, List<CorporateActionUnallocatedCashTransactionDetailsSD5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "UallctdCshTxDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payout (Securities)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedCashTransactionDetails";
			definition = "Details of the cash transactions concerned in unallocated payment.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedDetailsSD6.mmUnallocatedCashTransactionDetails);
			previousVersion_lazy = () -> CorporateActionUnallocatedDetailsSD4.mmUnallocatedCashTransactionDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionUnallocatedCashTransactionDetailsSD5.mmObject();
		}

		@Override
		public List<CorporateActionUnallocatedCashTransactionDetailsSD5> getValue(CorporateActionUnallocatedDetailsSD5 obj) {
			return obj.getUnallocatedCashTransactionDetails();
		}

		@Override
		public void setValue(CorporateActionUnallocatedDetailsSD5 obj, List<CorporateActionUnallocatedCashTransactionDetailsSD5> value) {
			obj.setUnallocatedCashTransactionDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5.mmUnallocatedDistributionBalance,
						com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5.mmUnallocatedRedemptionBalance, com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5.mmUnallocatedReorganisationBalance,
						com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5.mmUnallocatedSecuritiesTransactionDetails, com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD5.mmUnallocatedCashTransactionDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionUnallocatedDetailsSD5";
				definition = "Provides additional information regarding the corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedDetailsSD6.mmObject());
				previousVersion_lazy = () -> CorporateActionUnallocatedDetailsSD4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CorporateActionUnallocatedBalanceSD2Choice> getUnallocatedDistributionBalance() {
		return unallocatedDistributionBalance == null ? Optional.empty() : Optional.of(unallocatedDistributionBalance);
	}

	public CorporateActionUnallocatedDetailsSD5 setUnallocatedDistributionBalance(CorporateActionUnallocatedBalanceSD2Choice unallocatedDistributionBalance) {
		this.unallocatedDistributionBalance = unallocatedDistributionBalance;
		return this;
	}

	public Optional<CorporateActionUnallocatedBalanceSD1> getUnallocatedRedemptionBalance() {
		return unallocatedRedemptionBalance == null ? Optional.empty() : Optional.of(unallocatedRedemptionBalance);
	}

	public CorporateActionUnallocatedDetailsSD5 setUnallocatedRedemptionBalance(CorporateActionUnallocatedBalanceSD1 unallocatedRedemptionBalance) {
		this.unallocatedRedemptionBalance = unallocatedRedemptionBalance;
		return this;
	}

	public Optional<CorporateActionUnallocatedBalanceSD2> getUnallocatedReorganisationBalance() {
		return unallocatedReorganisationBalance == null ? Optional.empty() : Optional.of(unallocatedReorganisationBalance);
	}

	public CorporateActionUnallocatedDetailsSD5 setUnallocatedReorganisationBalance(CorporateActionUnallocatedBalanceSD2 unallocatedReorganisationBalance) {
		this.unallocatedReorganisationBalance = unallocatedReorganisationBalance;
		return this;
	}

	public List<CorporateActionUnallocatedSecuritiesTransactionDetailsSD6> getUnallocatedSecuritiesTransactionDetails() {
		return unallocatedSecuritiesTransactionDetails == null ? unallocatedSecuritiesTransactionDetails = new ArrayList<>() : unallocatedSecuritiesTransactionDetails;
	}

	public CorporateActionUnallocatedDetailsSD5 setUnallocatedSecuritiesTransactionDetails(List<CorporateActionUnallocatedSecuritiesTransactionDetailsSD6> unallocatedSecuritiesTransactionDetails) {
		this.unallocatedSecuritiesTransactionDetails = Objects.requireNonNull(unallocatedSecuritiesTransactionDetails);
		return this;
	}

	public List<CorporateActionUnallocatedCashTransactionDetailsSD5> getUnallocatedCashTransactionDetails() {
		return unallocatedCashTransactionDetails == null ? unallocatedCashTransactionDetails = new ArrayList<>() : unallocatedCashTransactionDetails;
	}

	public CorporateActionUnallocatedDetailsSD5 setUnallocatedCashTransactionDetails(List<CorporateActionUnallocatedCashTransactionDetailsSD5> unallocatedCashTransactionDetails) {
		this.unallocatedCashTransactionDetails = Objects.requireNonNull(unallocatedCashTransactionDetails);
		return this;
	}
}