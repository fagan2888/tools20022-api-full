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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardPaymentEnvironment33;
import com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse5;
import com.tools20022.repository.msg.ResponseType1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Transaction for whose batch capture has been rejected.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet11#mmTransactionSequenceCounter
 * CardPaymentDataSet11.mmTransactionSequenceCounter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet11#mmTransactionResponse
 * CardPaymentDataSet11.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet11#mmEnvironment
 * CardPaymentDataSet11.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet11#mmTransaction
 * CardPaymentDataSet11.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentDataSet11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Transaction for whose batch capture has been rejected."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentDataSet15
 * CardPaymentDataSet15}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet8
 * CardPaymentDataSet8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentDataSet11", propOrder = {"transactionSequenceCounter", "transactionResponse", "environment", "transaction"})
public class CardPaymentDataSet11 {

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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet11
	 * CardPaymentDataSet11}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet15#mmTransactionSequenceCounter
	 * CardPaymentDataSet15.mmTransactionSequenceCounter}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet8#mmTransactionSequenceCounter
	 * CardPaymentDataSet8.mmTransactionSequenceCounter}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentDataSet11, Max9NumericText> mmTransactionSequenceCounter = new MMMessageAttribute<CardPaymentDataSet11, Max9NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet11.mmObject();
			isDerived = false;
			xmlTag = "TxSeqCntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionSequenceCounter";
			definition = "Sequential counter of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet15.mmTransactionSequenceCounter);
			previousVersion_lazy = () -> CardPaymentDataSet8.mmTransactionSequenceCounter;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}

		@Override
		public Max9NumericText getValue(CardPaymentDataSet11 obj) {
			return obj.getTransactionSequenceCounter();
		}

		@Override
		public void setValue(CardPaymentDataSet11 obj, Max9NumericText value) {
			obj.setTransactionSequenceCounter(value);
		}
	};
	@XmlElement(name = "TxRspn", required = true)
	protected ResponseType1 transactionResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType1
	 * ResponseType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet11
	 * CardPaymentDataSet11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to the capture of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet15#mmTransactionResponse
	 * CardPaymentDataSet15.mmTransactionResponse}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet8#mmTransactionResponse
	 * CardPaymentDataSet8.mmTransactionResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet11, ResponseType1> mmTransactionResponse = new MMMessageAssociationEnd<CardPaymentDataSet11, ResponseType1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet11.mmObject();
			isDerived = false;
			xmlTag = "TxRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionResponse";
			definition = "Response to the capture of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet15.mmTransactionResponse);
			previousVersion_lazy = () -> CardPaymentDataSet8.mmTransactionResponse;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ResponseType1.mmObject();
		}

		@Override
		public ResponseType1 getValue(CardPaymentDataSet11 obj) {
			return obj.getTransactionResponse();
		}

		@Override
		public void setValue(CardPaymentDataSet11 obj, ResponseType1 value) {
			obj.setTransactionResponse(value);
		}
	};
	@XmlElement(name = "Envt", required = true)
	protected CardPaymentEnvironment33 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment33
	 * CardPaymentEnvironment33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet11
	 * CardPaymentDataSet11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data related to the environment of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet15#mmEnvironment
	 * CardPaymentDataSet15.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet8#mmEnvironment
	 * CardPaymentDataSet8.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet11, CardPaymentEnvironment33> mmEnvironment = new MMMessageAssociationEnd<CardPaymentDataSet11, CardPaymentEnvironment33>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet11.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Data related to the environment of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet15.mmEnvironment);
			previousVersion_lazy = () -> CardPaymentDataSet8.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentEnvironment33.mmObject();
		}

		@Override
		public CardPaymentEnvironment33 getValue(CardPaymentDataSet11 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(CardPaymentDataSet11 obj, CardPaymentEnvironment33 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected CardPaymentTransactionAdviceResponse5 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse5
	 * CardPaymentTransactionAdviceResponse5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet11
	 * CardPaymentDataSet11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction that has been rejected."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet15#mmTransaction
	 * CardPaymentDataSet15.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet8#mmTransaction
	 * CardPaymentDataSet8.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet11, CardPaymentTransactionAdviceResponse5> mmTransaction = new MMMessageAssociationEnd<CardPaymentDataSet11, CardPaymentTransactionAdviceResponse5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet11.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Transaction that has been rejected.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet15.mmTransaction);
			previousVersion_lazy = () -> CardPaymentDataSet8.mmTransaction;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentTransactionAdviceResponse5.mmObject();
		}

		@Override
		public CardPaymentTransactionAdviceResponse5 getValue(CardPaymentDataSet11 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(CardPaymentDataSet11 obj, CardPaymentTransactionAdviceResponse5 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentDataSet11.mmTransactionSequenceCounter, com.tools20022.repository.msg.CardPaymentDataSet11.mmTransactionResponse,
						com.tools20022.repository.msg.CardPaymentDataSet11.mmEnvironment, com.tools20022.repository.msg.CardPaymentDataSet11.mmTransaction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentDataSet11";
				definition = "Transaction for whose batch capture has been rejected.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet15.mmObject());
				previousVersion_lazy = () -> CardPaymentDataSet8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max9NumericText getTransactionSequenceCounter() {
		return transactionSequenceCounter;
	}

	public CardPaymentDataSet11 setTransactionSequenceCounter(Max9NumericText transactionSequenceCounter) {
		this.transactionSequenceCounter = Objects.requireNonNull(transactionSequenceCounter);
		return this;
	}

	public ResponseType1 getTransactionResponse() {
		return transactionResponse;
	}

	public CardPaymentDataSet11 setTransactionResponse(ResponseType1 transactionResponse) {
		this.transactionResponse = Objects.requireNonNull(transactionResponse);
		return this;
	}

	public CardPaymentEnvironment33 getEnvironment() {
		return environment;
	}

	public CardPaymentDataSet11 setEnvironment(CardPaymentEnvironment33 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public CardPaymentTransactionAdviceResponse5 getTransaction() {
		return transaction;
	}

	public CardPaymentDataSet11 setTransaction(CardPaymentTransactionAdviceResponse5 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}