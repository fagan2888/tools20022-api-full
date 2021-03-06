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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV03;
import com.tools20022.repository.entity.ReconciliationTransaction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardPaymentEnvironment25;
import com.tools20022.repository.msg.TransactionReconciliation2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reconciliation request from an acceptor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest3#mmEnvironment
 * AcceptorReconciliationRequest3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest3#mmTransaction
 * AcceptorReconciliationRequest3.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
 * ReconciliationTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV03#mmReconciliationRequest
 * AcceptorReconciliationRequestV03.mmReconciliationRequest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorReconciliationRequest3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reconciliation request from an acceptor."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest4
 * AcceptorReconciliationRequest4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest2
 * AcceptorReconciliationRequest2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorReconciliationRequest3", propOrder = {"environment", "transaction"})
public class AcceptorReconciliationRequest3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected CardPaymentEnvironment25 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment25
	 * CardPaymentEnvironment25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCardPaymentTotal
	 * ReconciliationTransaction.mmCardPaymentTotal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest3
	 * AcceptorReconciliationRequest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Environment of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest4#mmEnvironment
	 * AcceptorReconciliationRequest4.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest2#mmEnvironment
	 * AcceptorReconciliationRequest2.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorReconciliationRequest3, CardPaymentEnvironment25> mmEnvironment = new MMMessageAssociationEnd<AcceptorReconciliationRequest3, CardPaymentEnvironment25>() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmCardPaymentTotal;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorReconciliationRequest3.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorReconciliationRequest4.mmEnvironment);
			previousVersion_lazy = () -> AcceptorReconciliationRequest2.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentEnvironment25.mmObject();
		}

		@Override
		public CardPaymentEnvironment25 getValue(AcceptorReconciliationRequest3 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(AcceptorReconciliationRequest3 obj, CardPaymentEnvironment25 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected TransactionReconciliation2 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation2
	 * TransactionReconciliation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest3
	 * AcceptorReconciliationRequest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reconciliation transaction between an acceptor an acquirer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest4#mmTransaction
	 * AcceptorReconciliationRequest4.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest2#mmTransaction
	 * AcceptorReconciliationRequest2.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorReconciliationRequest3, TransactionReconciliation2> mmTransaction = new MMMessageAssociationEnd<AcceptorReconciliationRequest3, TransactionReconciliation2>() {
		{
			businessComponentTrace_lazy = () -> ReconciliationTransaction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorReconciliationRequest3.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Reconciliation transaction between an acceptor an acquirer.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorReconciliationRequest4.mmTransaction);
			previousVersion_lazy = () -> AcceptorReconciliationRequest2.mmTransaction;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionReconciliation2.mmObject();
		}

		@Override
		public TransactionReconciliation2 getValue(AcceptorReconciliationRequest3 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(AcceptorReconciliationRequest3 obj, TransactionReconciliation2 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorReconciliationRequest3.mmEnvironment, com.tools20022.repository.msg.AcceptorReconciliationRequest3.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorReconciliationRequestV03.mmReconciliationRequest);
				trace_lazy = () -> ReconciliationTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorReconciliationRequest3";
				definition = "Reconciliation request from an acceptor.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorReconciliationRequest4.mmObject());
				previousVersion_lazy = () -> AcceptorReconciliationRequest2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentEnvironment25 getEnvironment() {
		return environment;
	}

	public AcceptorReconciliationRequest3 setEnvironment(CardPaymentEnvironment25 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public TransactionReconciliation2 getTransaction() {
		return transaction;
	}

	public AcceptorReconciliationRequest3 setTransaction(TransactionReconciliation2 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}