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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorporateActionBalanceDetails9;
import com.tools20022.repository.msg.EventInformation5;
import com.tools20022.repository.msg.SecurityIdentification14;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Detailed account holdings information report for a corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance7#mmGeneralInformation
 * CorporateActionEventAndBalance7.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance7#mmUnderlyingSecurity
 * CorporateActionEventAndBalance7.mmUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance7#mmBalance
 * CorporateActionEventAndBalance7.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance7#mmSupplementaryData
 * CorporateActionEventAndBalance7.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventAndBalance7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Detailed account holdings information report for a corporate action event."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance9
 * CorporateActionEventAndBalance9}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance5
 * CorporateActionEventAndBalance5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionEventAndBalance7", propOrder = {"generalInformation", "underlyingSecurity", "balance", "supplementaryData"})
public class CorporateActionEventAndBalance7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GnlInf", required = true)
	protected EventInformation5 generalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EventInformation5
	 * EventInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance7
	 * CorporateActionEventAndBalance7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GnlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides general information related to a corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance9#mmGeneralInformation
	 * CorporateActionEventAndBalance9.mmGeneralInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionEventAndBalance7, EventInformation5> mmGeneralInformation = new MMMessageAssociationEnd<CorporateActionEventAndBalance7, EventInformation5>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventAndBalance7.mmObject();
			isDerived = false;
			xmlTag = "GnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralInformation";
			definition = "Provides general information related to a corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventAndBalance9.mmGeneralInformation);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EventInformation5.mmObject();
		}

		@Override
		public EventInformation5 getValue(CorporateActionEventAndBalance7 obj) {
			return obj.getGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionEventAndBalance7 obj, EventInformation5 value) {
			obj.setGeneralInformation(value);
		}
	};
	@XmlElement(name = "UndrlygScty", required = true)
	protected SecurityIdentification14 underlyingSecurity;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
	 * CorporateActionEvent.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance7
	 * CorporateActionEventAndBalance7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygScty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security concerned by the corporate action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :35B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance9#mmUnderlyingSecurity
	 * CorporateActionEventAndBalance9.mmUnderlyingSecurity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionEventAndBalance7, SecurityIdentification14> mmUnderlyingSecurity = new MMMessageAssociationEnd<CorporateActionEventAndBalance7, SecurityIdentification14>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmUnderlyingSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventAndBalance7.mmObject();
			isDerived = false;
			xmlTag = "UndrlygScty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSecurity";
			definition = "Security concerned by the corporate action.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventAndBalance9.mmUnderlyingSecurity);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public SecurityIdentification14 getValue(CorporateActionEventAndBalance7 obj) {
			return obj.getUnderlyingSecurity();
		}

		@Override
		public void setValue(CorporateActionEventAndBalance7 obj, SecurityIdentification14 value) {
			obj.setUnderlyingSecurity(value);
		}
	};
	@XmlElement(name = "Bal")
	protected CorporateActionBalanceDetails9 balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9
	 * CorporateActionBalanceDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAggregateQuantityBalance
	 * SecuritiesQuantity.mmAggregateQuantityBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance7
	 * CorporateActionEventAndBalance7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the balance related to a corporate action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance9#mmBalance
	 * CorporateActionEventAndBalance9.mmBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionEventAndBalance7, Optional<CorporateActionBalanceDetails9>> mmBalance = new MMMessageAssociationEnd<CorporateActionEventAndBalance7, Optional<CorporateActionBalanceDetails9>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAggregateQuantityBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventAndBalance7.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Provides information about the balance related to a corporate action.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventAndBalance9.mmBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionBalanceDetails9.mmObject();
		}

		@Override
		public Optional<CorporateActionBalanceDetails9> getValue(CorporateActionEventAndBalance7 obj) {
			return obj.getBalance();
		}

		@Override
		public void setValue(CorporateActionEventAndBalance7 obj, Optional<CorporateActionBalanceDetails9> value) {
			obj.setBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance7
	 * CorporateActionEventAndBalance7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information related to the event and the balance of the corporate action."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance9#mmSupplementaryData
	 * CorporateActionEventAndBalance9.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionEventAndBalance7, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<CorporateActionEventAndBalance7, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventAndBalance7.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Provides additional information related to the event and the balance of the corporate action.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventAndBalance9.mmSupplementaryData);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CorporateActionEventAndBalance7 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CorporateActionEventAndBalance7 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionEventAndBalance7.mmGeneralInformation, com.tools20022.repository.msg.CorporateActionEventAndBalance7.mmUnderlyingSecurity,
						com.tools20022.repository.msg.CorporateActionEventAndBalance7.mmBalance, com.tools20022.repository.msg.CorporateActionEventAndBalance7.mmSupplementaryData);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventAndBalance7";
				definition = "Detailed account holdings information report for a corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionEventAndBalance9.mmObject());
				previousVersion_lazy = () -> CorporateActionEventAndBalance5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public EventInformation5 getGeneralInformation() {
		return generalInformation;
	}

	public CorporateActionEventAndBalance7 setGeneralInformation(EventInformation5 generalInformation) {
		this.generalInformation = Objects.requireNonNull(generalInformation);
		return this;
	}

	public SecurityIdentification14 getUnderlyingSecurity() {
		return underlyingSecurity;
	}

	public CorporateActionEventAndBalance7 setUnderlyingSecurity(SecurityIdentification14 underlyingSecurity) {
		this.underlyingSecurity = Objects.requireNonNull(underlyingSecurity);
		return this;
	}

	public Optional<CorporateActionBalanceDetails9> getBalance() {
		return balance == null ? Optional.empty() : Optional.of(balance);
	}

	public CorporateActionEventAndBalance7 setBalance(CorporateActionBalanceDetails9 balance) {
		this.balance = balance;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionEventAndBalance7 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}