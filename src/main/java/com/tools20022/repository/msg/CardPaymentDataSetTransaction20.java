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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max9NumericText;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardPaymentContext24;
import com.tools20022.repository.msg.CardPaymentEnvironment62;
import com.tools20022.repository.msg.CardPaymentTransaction71;
import com.tools20022.repository.msg.Traceability5;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Card payment transaction to be authorised in a batch.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20#mmTransactionSequenceCounter
 * CardPaymentDataSetTransaction20.mmTransactionSequenceCounter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20#mmTraceability
 * CardPaymentDataSetTransaction20.mmTraceability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20#mmEnvironment
 * CardPaymentDataSetTransaction20.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20#mmContext
 * CardPaymentDataSetTransaction20.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20#mmTransaction
 * CardPaymentDataSetTransaction20.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentDataSetTransaction20"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Card payment transaction to be authorised in a batch."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction22
 * CardPaymentDataSetTransaction22}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16
 * CardPaymentDataSetTransaction16}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentDataSetTransaction20", propOrder = {"transactionSequenceCounter", "traceability", "environment", "context", "transaction"})
public class CardPaymentDataSetTransaction20 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxSeqCntr", required = true)
	protected Max9NumericText transactionSequenceCounter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max9NumericText
	 * Max9NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20
	 * CardPaymentDataSetTransaction20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSeqCntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionSequenceCounter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential counter of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction22#mmTransactionSequenceCounter
	 * CardPaymentDataSetTransaction22.mmTransactionSequenceCounter}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16#mmTransactionSequenceCounter
	 * CardPaymentDataSetTransaction16.mmTransactionSequenceCounter}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentDataSetTransaction20, Max9NumericText> mmTransactionSequenceCounter = new MMMessageAttribute<CardPaymentDataSetTransaction20, Max9NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSetTransaction20.mmObject();
			isDerived = false;
			xmlTag = "TxSeqCntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionSequenceCounter";
			definition = "Sequential counter of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction22.mmTransactionSequenceCounter);
			previousVersion_lazy = () -> CardPaymentDataSetTransaction16.mmTransactionSequenceCounter;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}

		@Override
		public Max9NumericText getValue(CardPaymentDataSetTransaction20 obj) {
			return obj.getTransactionSequenceCounter();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction20 obj, Max9NumericText value) {
			obj.setTransactionSequenceCounter(value);
		}
	};
	@XmlElement(name = "Tracblt")
	protected List<Traceability5> traceability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Traceability5
	 * Traceability5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20
	 * CardPaymentDataSetTransaction20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tracblt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Traceability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of partners involved in the exchange from the merchant to the issuer, with the corresponding timestamp of their exchanges."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction22#mmTraceability
	 * CardPaymentDataSetTransaction22.mmTraceability}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16#mmTraceability
	 * CardPaymentDataSetTransaction16.mmTraceability}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSetTransaction20, List<Traceability5>> mmTraceability = new MMMessageAssociationEnd<CardPaymentDataSetTransaction20, List<Traceability5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSetTransaction20.mmObject();
			isDerived = false;
			xmlTag = "Tracblt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Traceability";
			definition = "Identification of partners involved in the exchange from the merchant to the issuer, with the corresponding timestamp of their exchanges.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction22.mmTraceability);
			previousVersion_lazy = () -> CardPaymentDataSetTransaction16.mmTraceability;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Traceability5.mmObject();
		}

		@Override
		public List<Traceability5> getValue(CardPaymentDataSetTransaction20 obj) {
			return obj.getTraceability();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction20 obj, List<Traceability5> value) {
			obj.setTraceability(value);
		}
	};
	@XmlElement(name = "Envt", required = true)
	protected CardPaymentEnvironment62 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62
	 * CardPaymentEnvironment62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20
	 * CardPaymentDataSetTransaction20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to the environment of the card payment transaction to authorise."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction22#mmEnvironment
	 * CardPaymentDataSetTransaction22.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16#mmEnvironment
	 * CardPaymentDataSetTransaction16.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSetTransaction20, CardPaymentEnvironment62> mmEnvironment = new MMMessageAssociationEnd<CardPaymentDataSetTransaction20, CardPaymentEnvironment62>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSetTransaction20.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Data related to the environment of the card payment transaction to authorise.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction22.mmEnvironment);
			previousVersion_lazy = () -> CardPaymentDataSetTransaction16.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentEnvironment62.mmObject();
		}

		@Override
		public CardPaymentEnvironment62 getValue(CardPaymentDataSetTransaction20 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction20 obj, CardPaymentEnvironment62 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cntxt")
	protected CardPaymentContext24 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentContext24
	 * CardPaymentContext24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20
	 * CardPaymentDataSetTransaction20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cntxt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Context"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Context in which the transaction is performed (payment and sale)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction22#mmContext
	 * CardPaymentDataSetTransaction22.mmContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16#mmContext
	 * CardPaymentDataSetTransaction16.mmContext}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentDataSetTransaction20, Optional<CardPaymentContext24>> mmContext = new MMMessageAttribute<CardPaymentDataSetTransaction20, Optional<CardPaymentContext24>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSetTransaction20.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed (payment and sale).";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction22.mmContext);
			previousVersion_lazy = () -> CardPaymentDataSetTransaction16.mmContext;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CardPaymentContext24.mmObject();
		}

		@Override
		public Optional<CardPaymentContext24> getValue(CardPaymentDataSetTransaction20 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction20 obj, Optional<CardPaymentContext24> value) {
			obj.setContext(value.orElse(null));
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected CardPaymentTransaction71 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71
	 * CardPaymentTransaction71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction20
	 * CardPaymentDataSetTransaction20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card payment transaction to authorise."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction22#mmTransaction
	 * CardPaymentDataSetTransaction22.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16#mmTransaction
	 * CardPaymentDataSetTransaction16.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSetTransaction20, CardPaymentTransaction71> mmTransaction = new MMMessageAssociationEnd<CardPaymentDataSetTransaction20, CardPaymentTransaction71>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSetTransaction20.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Card payment transaction to authorise.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction22.mmTransaction);
			previousVersion_lazy = () -> CardPaymentDataSetTransaction16.mmTransaction;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentTransaction71.mmObject();
		}

		@Override
		public CardPaymentTransaction71 getValue(CardPaymentDataSetTransaction20 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction20 obj, CardPaymentTransaction71 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentDataSetTransaction20.mmTransactionSequenceCounter, com.tools20022.repository.msg.CardPaymentDataSetTransaction20.mmTraceability,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction20.mmEnvironment, com.tools20022.repository.msg.CardPaymentDataSetTransaction20.mmContext,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction20.mmTransaction);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentDataSetTransaction20";
				definition = "Card payment transaction to be authorised in a batch.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction22.mmObject());
				previousVersion_lazy = () -> CardPaymentDataSetTransaction16.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max9NumericText getTransactionSequenceCounter() {
		return transactionSequenceCounter;
	}

	public CardPaymentDataSetTransaction20 setTransactionSequenceCounter(Max9NumericText transactionSequenceCounter) {
		this.transactionSequenceCounter = Objects.requireNonNull(transactionSequenceCounter);
		return this;
	}

	public List<Traceability5> getTraceability() {
		return traceability == null ? traceability = new ArrayList<>() : traceability;
	}

	public CardPaymentDataSetTransaction20 setTraceability(List<Traceability5> traceability) {
		this.traceability = Objects.requireNonNull(traceability);
		return this;
	}

	public CardPaymentEnvironment62 getEnvironment() {
		return environment;
	}

	public CardPaymentDataSetTransaction20 setEnvironment(CardPaymentEnvironment62 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public Optional<CardPaymentContext24> getContext() {
		return context == null ? Optional.empty() : Optional.of(context);
	}

	public CardPaymentDataSetTransaction20 setContext(CardPaymentContext24 context) {
		this.context = context;
		return this;
	}

	public CardPaymentTransaction71 getTransaction() {
		return transaction;
	}

	public CardPaymentDataSetTransaction20 setTransaction(CardPaymentTransaction71 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}