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
import com.tools20022.repository.msg.CorporateActionBalanceDetails8;
import com.tools20022.repository.msg.EventInformation2;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.UnderlyingSecurity3;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance4#mmGeneralInformation
 * CorporateActionEventAndBalance4.mmGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance4#mmUnderlyingSecurity
 * CorporateActionEventAndBalance4.mmUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance4#mmBalance
 * CorporateActionEventAndBalance4.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance4#mmSupplementaryData
 * CorporateActionEventAndBalance4.mmSupplementaryData}</li>
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
 * "CorporateActionEventAndBalance4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Detailed account holdings information report for a corporate action event."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionEventAndBalance4", propOrder = {"generalInformation", "underlyingSecurity", "balance", "supplementaryData"})
public class CorporateActionEventAndBalance4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GnlInf", required = true)
	protected EventInformation2 generalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EventInformation2
	 * EventInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance4
	 * CorporateActionEventAndBalance4}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionEventAndBalance4, EventInformation2> mmGeneralInformation = new MMMessageAssociationEnd<CorporateActionEventAndBalance4, EventInformation2>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventAndBalance4.mmObject();
			isDerived = false;
			xmlTag = "GnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralInformation";
			definition = "Provides general information related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EventInformation2.mmObject();
		}

		@Override
		public EventInformation2 getValue(CorporateActionEventAndBalance4 obj) {
			return obj.getGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionEventAndBalance4 obj, EventInformation2 value) {
			obj.setGeneralInformation(value);
		}
	};
	@XmlElement(name = "UndrlygScty", required = true)
	protected UnderlyingSecurity3 underlyingSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnderlyingSecurity3
	 * UnderlyingSecurity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
	 * CorporateActionEvent.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance4
	 * CorporateActionEventAndBalance4}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionEventAndBalance4, UnderlyingSecurity3> mmUnderlyingSecurity = new MMMessageAssociationEnd<CorporateActionEventAndBalance4, UnderlyingSecurity3>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmUnderlyingSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventAndBalance4.mmObject();
			isDerived = false;
			xmlTag = "UndrlygScty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSecurity";
			definition = "Security concerned by the corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UnderlyingSecurity3.mmObject();
		}

		@Override
		public UnderlyingSecurity3 getValue(CorporateActionEventAndBalance4 obj) {
			return obj.getUnderlyingSecurity();
		}

		@Override
		public void setValue(CorporateActionEventAndBalance4 obj, UnderlyingSecurity3 value) {
			obj.setUnderlyingSecurity(value);
		}
	};
	@XmlElement(name = "Bal")
	protected CorporateActionBalanceDetails8 balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8
	 * CorporateActionBalanceDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAggregateQuantityBalance
	 * SecuritiesQuantity.mmAggregateQuantityBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance4
	 * CorporateActionEventAndBalance4}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionEventAndBalance4, Optional<CorporateActionBalanceDetails8>> mmBalance = new MMMessageAssociationEnd<CorporateActionEventAndBalance4, Optional<CorporateActionBalanceDetails8>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAggregateQuantityBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventAndBalance4.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Provides information about the balance related to a corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionBalanceDetails8.mmObject();
		}

		@Override
		public Optional<CorporateActionBalanceDetails8> getValue(CorporateActionEventAndBalance4 obj) {
			return obj.getBalance();
		}

		@Override
		public void setValue(CorporateActionEventAndBalance4 obj, Optional<CorporateActionBalanceDetails8> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventAndBalance4
	 * CorporateActionEventAndBalance4}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionEventAndBalance4, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<CorporateActionEventAndBalance4, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventAndBalance4.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Provides additional information related to the event and the balance of the corporate action.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CorporateActionEventAndBalance4 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CorporateActionEventAndBalance4 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionEventAndBalance4.mmGeneralInformation, com.tools20022.repository.msg.CorporateActionEventAndBalance4.mmUnderlyingSecurity,
						com.tools20022.repository.msg.CorporateActionEventAndBalance4.mmBalance, com.tools20022.repository.msg.CorporateActionEventAndBalance4.mmSupplementaryData);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventAndBalance4";
				definition = "Detailed account holdings information report for a corporate action event.";
			}
		});
		return mmObject_lazy.get();
	}

	public EventInformation2 getGeneralInformation() {
		return generalInformation;
	}

	public CorporateActionEventAndBalance4 setGeneralInformation(EventInformation2 generalInformation) {
		this.generalInformation = Objects.requireNonNull(generalInformation);
		return this;
	}

	public UnderlyingSecurity3 getUnderlyingSecurity() {
		return underlyingSecurity;
	}

	public CorporateActionEventAndBalance4 setUnderlyingSecurity(UnderlyingSecurity3 underlyingSecurity) {
		this.underlyingSecurity = Objects.requireNonNull(underlyingSecurity);
		return this;
	}

	public Optional<CorporateActionBalanceDetails8> getBalance() {
		return balance == null ? Optional.empty() : Optional.of(balance);
	}

	public CorporateActionEventAndBalance4 setBalance(CorporateActionBalanceDetails8 balance) {
		this.balance = balance;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionEventAndBalance4 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}