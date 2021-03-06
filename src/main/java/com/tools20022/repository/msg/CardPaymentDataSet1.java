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
import com.tools20022.repository.area.caaa.AcceptorBatchTransferV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of transactions to capture, sharing common characteristics.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet1#mmDataSetIdentification
 * CardPaymentDataSet1.mmDataSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet1#mmTraceability
 * CardPaymentDataSet1.mmTraceability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet1#mmDataSetInitiator
 * CardPaymentDataSet1.mmDataSetInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet1#mmTransactionTotals
 * CardPaymentDataSet1.mmTransactionTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet1#mmCommonData
 * CardPaymentDataSet1.mmCommonData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet1#mmTransactionToCapture
 * CardPaymentDataSet1.mmTransactionToCapture}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV01#mmDataSet
 * AcceptorBatchTransferV01.mmDataSet}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentDataSet1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of transactions to capture, sharing common characteristics."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentDataSet4
 * CardPaymentDataSet4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentDataSet1", propOrder = {"dataSetIdentification", "traceability", "dataSetInitiator", "transactionTotals", "commonData", "transactionToCapture"})
public class CardPaymentDataSet1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DataSetId", required = true)
	protected DataSetIdentification1 dataSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataSetIdentification1
	 * DataSetIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet1
	 * CardPaymentDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the data set."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet1, DataSetIdentification1> mmDataSetIdentification = new MMMessageAssociationEnd<CardPaymentDataSet1, DataSetIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet1.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Identification of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DataSetIdentification1.mmObject();
		}

		@Override
		public DataSetIdentification1 getValue(CardPaymentDataSet1 obj) {
			return obj.getDataSetIdentification();
		}

		@Override
		public void setValue(CardPaymentDataSet1 obj, DataSetIdentification1 value) {
			obj.setDataSetIdentification(value);
		}
	};
	@XmlElement(name = "Tracblt")
	protected List<Traceability1> traceability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Traceability1
	 * Traceability1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet1
	 * CardPaymentDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tracblt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Traceability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of partners involved in the data set building."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet1, List<Traceability1>> mmTraceability = new MMMessageAssociationEnd<CardPaymentDataSet1, List<Traceability1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet1.mmObject();
			isDerived = false;
			xmlTag = "Tracblt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Traceability";
			definition = "Identification of partners involved in the data set building.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Traceability1.mmObject();
		}

		@Override
		public List<Traceability1> getValue(CardPaymentDataSet1 obj) {
			return obj.getTraceability();
		}

		@Override
		public void setValue(CardPaymentDataSet1 obj, List<Traceability1> value) {
			obj.setTraceability(value);
		}
	};
	@XmlElement(name = "DataSetInitr")
	protected GenericIdentification32 dataSetInitiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet1
	 * CardPaymentDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetInitr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetInitiator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initiator of the data set."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet1, Optional<GenericIdentification32>> mmDataSetInitiator = new MMMessageAssociationEnd<CardPaymentDataSet1, Optional<GenericIdentification32>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet1.mmObject();
			isDerived = false;
			xmlTag = "DataSetInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetInitiator";
			definition = "Initiator of the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification32.mmObject();
		}

		@Override
		public Optional<GenericIdentification32> getValue(CardPaymentDataSet1 obj) {
			return obj.getDataSetInitiator();
		}

		@Override
		public void setValue(CardPaymentDataSet1 obj, Optional<GenericIdentification32> value) {
			obj.setDataSetInitiator(value.orElse(null));
		}
	};
	@XmlElement(name = "TxTtls", required = true)
	protected List<TransactionTotals1> transactionTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionTotals1
	 * TransactionTotals1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet1
	 * CardPaymentDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction totals of the data set."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet1, List<TransactionTotals1>> mmTransactionTotals = new MMMessageAssociationEnd<CardPaymentDataSet1, List<TransactionTotals1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet1.mmObject();
			isDerived = false;
			xmlTag = "TxTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTotals";
			definition = "Transaction totals of the data set.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionTotals1.mmObject();
		}

		@Override
		public List<TransactionTotals1> getValue(CardPaymentDataSet1 obj) {
			return obj.getTransactionTotals();
		}

		@Override
		public void setValue(CardPaymentDataSet1 obj, List<TransactionTotals1> value) {
			obj.setTransactionTotals(value);
		}
	};
	@XmlElement(name = "CmonData")
	protected CommonData1 commonData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CommonData1
	 * CommonData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet1
	 * CardPaymentDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data common to all transactions of the data set."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet1, Optional<CommonData1>> mmCommonData = new MMMessageAssociationEnd<CardPaymentDataSet1, Optional<CommonData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet1.mmObject();
			isDerived = false;
			xmlTag = "CmonData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonData";
			definition = "Data common to all transactions of the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommonData1.mmObject();
		}

		@Override
		public Optional<CommonData1> getValue(CardPaymentDataSet1 obj) {
			return obj.getCommonData();
		}

		@Override
		public void setValue(CardPaymentDataSet1 obj, Optional<CommonData1> value) {
			obj.setCommonData(value.orElse(null));
		}
	};
	@XmlElement(name = "TxToCaptr")
	protected List<CardPaymentDataSetTransaction1> transactionToCapture;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction1
	 * CardPaymentDataSetTransaction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet1
	 * CardPaymentDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxToCaptr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionToCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of transaction to capture."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet1, List<CardPaymentDataSetTransaction1>> mmTransactionToCapture = new MMMessageAssociationEnd<CardPaymentDataSet1, List<CardPaymentDataSetTransaction1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet1.mmObject();
			isDerived = false;
			xmlTag = "TxToCaptr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionToCapture";
			definition = "Set of transaction to capture.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardPaymentDataSetTransaction1.mmObject();
		}

		@Override
		public List<CardPaymentDataSetTransaction1> getValue(CardPaymentDataSet1 obj) {
			return obj.getTransactionToCapture();
		}

		@Override
		public void setValue(CardPaymentDataSet1 obj, List<CardPaymentDataSetTransaction1> value) {
			obj.setTransactionToCapture(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentDataSet1.mmDataSetIdentification, com.tools20022.repository.msg.CardPaymentDataSet1.mmTraceability,
						com.tools20022.repository.msg.CardPaymentDataSet1.mmDataSetInitiator, com.tools20022.repository.msg.CardPaymentDataSet1.mmTransactionTotals, com.tools20022.repository.msg.CardPaymentDataSet1.mmCommonData,
						com.tools20022.repository.msg.CardPaymentDataSet1.mmTransactionToCapture);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorBatchTransferV01.mmDataSet);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentDataSet1";
				definition = "Set of transactions to capture, sharing common characteristics.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public DataSetIdentification1 getDataSetIdentification() {
		return dataSetIdentification;
	}

	public CardPaymentDataSet1 setDataSetIdentification(DataSetIdentification1 dataSetIdentification) {
		this.dataSetIdentification = Objects.requireNonNull(dataSetIdentification);
		return this;
	}

	public List<Traceability1> getTraceability() {
		return traceability == null ? traceability = new ArrayList<>() : traceability;
	}

	public CardPaymentDataSet1 setTraceability(List<Traceability1> traceability) {
		this.traceability = Objects.requireNonNull(traceability);
		return this;
	}

	public Optional<GenericIdentification32> getDataSetInitiator() {
		return dataSetInitiator == null ? Optional.empty() : Optional.of(dataSetInitiator);
	}

	public CardPaymentDataSet1 setDataSetInitiator(GenericIdentification32 dataSetInitiator) {
		this.dataSetInitiator = dataSetInitiator;
		return this;
	}

	public List<TransactionTotals1> getTransactionTotals() {
		return transactionTotals == null ? transactionTotals = new ArrayList<>() : transactionTotals;
	}

	public CardPaymentDataSet1 setTransactionTotals(List<TransactionTotals1> transactionTotals) {
		this.transactionTotals = Objects.requireNonNull(transactionTotals);
		return this;
	}

	public Optional<CommonData1> getCommonData() {
		return commonData == null ? Optional.empty() : Optional.of(commonData);
	}

	public CardPaymentDataSet1 setCommonData(CommonData1 commonData) {
		this.commonData = commonData;
		return this;
	}

	public List<CardPaymentDataSetTransaction1> getTransactionToCapture() {
		return transactionToCapture == null ? transactionToCapture = new ArrayList<>() : transactionToCapture;
	}

	public CardPaymentDataSet1 setTransactionToCapture(List<CardPaymentDataSetTransaction1> transactionToCapture) {
		this.transactionToCapture = Objects.requireNonNull(transactionToCapture);
		return this;
	}
}