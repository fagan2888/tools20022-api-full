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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.entity.PaymentIdentification;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.UnderlyingGroupInformation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reference information concerning the original transaction, to which the
 * investigation message refers.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalGroupInformation
 * UnderlyingPaymentTransaction2.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalInstructionIdentification
 * UnderlyingPaymentTransaction2.mmOriginalInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalEndToEndIdentification
 * UnderlyingPaymentTransaction2.mmOriginalEndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalTransactionIdentification
 * UnderlyingPaymentTransaction2.mmOriginalTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalInterbankSettlementAmount
 * UnderlyingPaymentTransaction2.mmOriginalInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2#mmOriginalInterbankSettlementDate
 * UnderlyingPaymentTransaction2.mmOriginalInterbankSettlementDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingPaymentTransaction2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reference information concerning the original transaction, to which the investigation message refers."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOriginalIdentificationRule#forUnderlyingPaymentTransaction2
 * ConstraintOriginalIdentificationRule.forUnderlyingPaymentTransaction2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction3
 * UnderlyingPaymentTransaction3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnderlyingPaymentTransaction2", propOrder = {"originalGroupInformation", "originalInstructionIdentification", "originalEndToEndIdentification", "originalTransactionIdentification", "originalInterbankSettlementAmount",
		"originalInterbankSettlementDate"})
public class UnderlyingPaymentTransaction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlGrpInf")
	protected UnderlyingGroupInformation1 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingGroupInformation1
	 * UnderlyingGroupInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2
	 * UnderlyingPaymentTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the original message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction3#mmOriginalGroupInformation
	 * UnderlyingPaymentTransaction3.mmOriginalGroupInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingPaymentTransaction2, Optional<UnderlyingGroupInformation1>> mmOriginalGroupInformation = new MMMessageAssociationEnd<UnderlyingPaymentTransaction2, Optional<UnderlyingGroupInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Set of elements used to provide information on the original message.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingPaymentTransaction3.mmOriginalGroupInformation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnderlyingGroupInformation1.mmObject();
		}

		@Override
		public Optional<UnderlyingGroupInformation1> getValue(UnderlyingPaymentTransaction2 obj) {
			return obj.getOriginalGroupInformation();
		}

		@Override
		public void setValue(UnderlyingPaymentTransaction2 obj, Optional<UnderlyingGroupInformation1> value) {
			obj.setOriginalGroupInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlInstrId")
	protected Max35Text originalInstructionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmInstructionIdentification
	 * PaymentIdentification.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2
	 * UnderlyingPaymentTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlInstrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction3#mmOriginalInstructionIdentification
	 * UnderlyingPaymentTransaction3.mmOriginalInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingPaymentTransaction2, Optional<Max35Text>> mmOriginalInstructionIdentification = new MMMessageAttribute<UnderlyingPaymentTransaction2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmInstructionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInstructionIdentification";
			definition = "Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingPaymentTransaction3.mmOriginalInstructionIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(UnderlyingPaymentTransaction2 obj) {
			return obj.getOriginalInstructionIdentification();
		}

		@Override
		public void setValue(UnderlyingPaymentTransaction2 obj, Optional<Max35Text> value) {
			obj.setOriginalInstructionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlEndToEndId")
	protected Max35Text originalEndToEndIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmEndToEndIdentification
	 * PaymentIdentification.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2
	 * UnderlyingPaymentTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlEndToEndId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalEndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original initiating party, to unambiguously identify the original transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction3#mmOriginalEndToEndIdentification
	 * UnderlyingPaymentTransaction3.mmOriginalEndToEndIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingPaymentTransaction2, Optional<Max35Text>> mmOriginalEndToEndIdentification = new MMMessageAttribute<UnderlyingPaymentTransaction2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlEndToEndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalEndToEndIdentification";
			definition = "Unique identification, as assigned by the original initiating party, to unambiguously identify the original transaction.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingPaymentTransaction3.mmOriginalEndToEndIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(UnderlyingPaymentTransaction2 obj) {
			return obj.getOriginalEndToEndIdentification();
		}

		@Override
		public void setValue(UnderlyingPaymentTransaction2 obj, Optional<Max35Text> value) {
			obj.setOriginalEndToEndIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlTxId")
	protected Max35Text originalTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmTransactionIdentification
	 * PaymentIdentification.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2
	 * UnderlyingPaymentTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlTxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original first instructing agent, to unambiguously identify the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction3#mmOriginalTransactionIdentification
	 * UnderlyingPaymentTransaction3.mmOriginalTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingPaymentTransaction2, Optional<Max35Text>> mmOriginalTransactionIdentification = new MMMessageAttribute<UnderlyingPaymentTransaction2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalTransactionIdentification";
			definition = "Unique identification, as assigned by the original first instructing agent, to unambiguously identify the transaction.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingPaymentTransaction3.mmOriginalTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(UnderlyingPaymentTransaction2 obj) {
			return obj.getOriginalTransactionIdentification();
		}

		@Override
		public void setValue(UnderlyingPaymentTransaction2 obj, Optional<Max35Text> value) {
			obj.setOriginalTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlIntrBkSttlmAmt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount originalInterbankSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2
	 * UnderlyingPaymentTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlIntrBkSttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money, as provided in the original transaction, to be moved between the instructing agent and the instructed agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction3#mmOriginalInterbankSettlementAmount
	 * UnderlyingPaymentTransaction3.mmOriginalInterbankSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingPaymentTransaction2, ActiveOrHistoricCurrencyAndAmount> mmOriginalInterbankSettlementAmount = new MMMessageAttribute<UnderlyingPaymentTransaction2, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlIntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInterbankSettlementAmount";
			definition = "Amount of money, as provided in the original transaction, to be moved between the instructing agent and the instructed agent.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingPaymentTransaction3.mmOriginalInterbankSettlementAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(UnderlyingPaymentTransaction2 obj) {
			return obj.getOriginalInterbankSettlementAmount();
		}

		@Override
		public void setValue(UnderlyingPaymentTransaction2 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setOriginalInterbankSettlementAmount(value);
		}
	};
	@XmlElement(name = "OrgnlIntrBkSttlmDt", required = true)
	protected ISODate originalInterbankSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementDate
	 * CashSettlement.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction2
	 * UnderlyingPaymentTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlIntrBkSttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date, as provided in the original transaction, on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingPaymentTransaction3#mmOriginalInterbankSettlementDate
	 * UnderlyingPaymentTransaction3.mmOriginalInterbankSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnderlyingPaymentTransaction2, ISODate> mmOriginalInterbankSettlementDate = new MMMessageAttribute<UnderlyingPaymentTransaction2, ISODate>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlIntrBkSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInterbankSettlementDate";
			definition = "Date, as provided in the original transaction, on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingPaymentTransaction3.mmOriginalInterbankSettlementDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(UnderlyingPaymentTransaction2 obj) {
			return obj.getOriginalInterbankSettlementDate();
		}

		@Override
		public void setValue(UnderlyingPaymentTransaction2 obj, ISODate value) {
			obj.setOriginalInterbankSettlementDate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmOriginalGroupInformation,
						com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmOriginalInstructionIdentification, com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmOriginalEndToEndIdentification,
						com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmOriginalTransactionIdentification, com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmOriginalInterbankSettlementAmount,
						com.tools20022.repository.msg.UnderlyingPaymentTransaction2.mmOriginalInterbankSettlementDate);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOriginalIdentificationRule.forUnderlyingPaymentTransaction2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingPaymentTransaction2";
				definition = "Reference information concerning the original transaction, to which the investigation message refers.";
				nextVersions_lazy = () -> Arrays.asList(UnderlyingPaymentTransaction3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<UnderlyingGroupInformation1> getOriginalGroupInformation() {
		return originalGroupInformation == null ? Optional.empty() : Optional.of(originalGroupInformation);
	}

	public UnderlyingPaymentTransaction2 setOriginalGroupInformation(UnderlyingGroupInformation1 originalGroupInformation) {
		this.originalGroupInformation = originalGroupInformation;
		return this;
	}

	public Optional<Max35Text> getOriginalInstructionIdentification() {
		return originalInstructionIdentification == null ? Optional.empty() : Optional.of(originalInstructionIdentification);
	}

	public UnderlyingPaymentTransaction2 setOriginalInstructionIdentification(Max35Text originalInstructionIdentification) {
		this.originalInstructionIdentification = originalInstructionIdentification;
		return this;
	}

	public Optional<Max35Text> getOriginalEndToEndIdentification() {
		return originalEndToEndIdentification == null ? Optional.empty() : Optional.of(originalEndToEndIdentification);
	}

	public UnderlyingPaymentTransaction2 setOriginalEndToEndIdentification(Max35Text originalEndToEndIdentification) {
		this.originalEndToEndIdentification = originalEndToEndIdentification;
		return this;
	}

	public Optional<Max35Text> getOriginalTransactionIdentification() {
		return originalTransactionIdentification == null ? Optional.empty() : Optional.of(originalTransactionIdentification);
	}

	public UnderlyingPaymentTransaction2 setOriginalTransactionIdentification(Max35Text originalTransactionIdentification) {
		this.originalTransactionIdentification = originalTransactionIdentification;
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getOriginalInterbankSettlementAmount() {
		return originalInterbankSettlementAmount;
	}

	public UnderlyingPaymentTransaction2 setOriginalInterbankSettlementAmount(ActiveOrHistoricCurrencyAndAmount originalInterbankSettlementAmount) {
		this.originalInterbankSettlementAmount = Objects.requireNonNull(originalInterbankSettlementAmount);
		return this;
	}

	public ISODate getOriginalInterbankSettlementDate() {
		return originalInterbankSettlementDate;
	}

	public UnderlyingPaymentTransaction2 setOriginalInterbankSettlementDate(ISODate originalInterbankSettlementDate) {
		this.originalInterbankSettlementDate = Objects.requireNonNull(originalInterbankSettlementDate);
		return this;
	}
}