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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CorporateActionEventType19Choice;
import com.tools20022.repository.choice.SecuritiesTransactionType14Choice;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of transaction type, corporate action event or settlement transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent11Choice#mmSecuritiesTransactionType
 * SettlementOrCorporateActionEvent11Choice.mmSecuritiesTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent11Choice#mmCorporateActionEventType
 * SettlementOrCorporateActionEvent11Choice.mmCorporateActionEventType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementOrCorporateActionEvent11Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of transaction type, corporate action event or settlement transaction."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementOrCorporateActionEvent11Choice", propOrder = {"securitiesTransactionType", "corporateActionEventType"})
public class SettlementOrCorporateActionEvent11Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesTxTp", required = true)
	protected SecuritiesTransactionType14Choice securitiesTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType14Choice
	 * SecuritiesTransactionType14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
	 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent11Choice
	 * SettlementOrCorporateActionEvent11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesTxTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of securities transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementOrCorporateActionEvent11Choice, SecuritiesTransactionType14Choice> mmSecuritiesTransactionType = new MMMessageAttribute<SettlementOrCorporateActionEvent11Choice, SecuritiesTransactionType14Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.choice.SettlementOrCorporateActionEvent11Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Identifies the type of securities transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTransactionType14Choice.mmObject();
		}

		@Override
		public SecuritiesTransactionType14Choice getValue(SettlementOrCorporateActionEvent11Choice obj) {
			return obj.getSecuritiesTransactionType();
		}

		@Override
		public void setValue(SettlementOrCorporateActionEvent11Choice obj, SecuritiesTransactionType14Choice value) {
			obj.setSecuritiesTransactionType(value);
		}
	};
	@XmlElement(name = "CorpActnEvtTp", required = true)
	protected CorporateActionEventType19Choice corporateActionEventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType19Choice
	 * CorporateActionEventType19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmType
	 * CorporateActionEvent.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent11Choice
	 * SettlementOrCorporateActionEvent11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of corporate event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementOrCorporateActionEvent11Choice, CorporateActionEventType19Choice> mmCorporateActionEventType = new MMMessageAttribute<SettlementOrCorporateActionEvent11Choice, CorporateActionEventType19Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmType;
			componentContext_lazy = () -> com.tools20022.repository.choice.SettlementOrCorporateActionEvent11Choice.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventType";
			definition = "Specifies the type of corporate event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionEventType19Choice.mmObject();
		}

		@Override
		public CorporateActionEventType19Choice getValue(SettlementOrCorporateActionEvent11Choice obj) {
			return obj.getCorporateActionEventType();
		}

		@Override
		public void setValue(SettlementOrCorporateActionEvent11Choice obj, CorporateActionEventType19Choice value) {
			obj.setCorporateActionEventType(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SettlementOrCorporateActionEvent11Choice.mmSecuritiesTransactionType,
						com.tools20022.repository.choice.SettlementOrCorporateActionEvent11Choice.mmCorporateActionEventType);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementOrCorporateActionEvent11Choice";
				definition = "Choice of transaction type, corporate action event or settlement transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesTransactionType14Choice getSecuritiesTransactionType() {
		return securitiesTransactionType;
	}

	public SettlementOrCorporateActionEvent11Choice setSecuritiesTransactionType(SecuritiesTransactionType14Choice securitiesTransactionType) {
		this.securitiesTransactionType = Objects.requireNonNull(securitiesTransactionType);
		return this;
	}

	public CorporateActionEventType19Choice getCorporateActionEventType() {
		return corporateActionEventType;
	}

	public SettlementOrCorporateActionEvent11Choice setCorporateActionEventType(CorporateActionEventType19Choice corporateActionEventType) {
		this.corporateActionEventType = Objects.requireNonNull(corporateActionEventType);
		return this;
	}
}