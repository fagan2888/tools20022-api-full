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
import com.tools20022.repository.choice.AmountType3Choice;
import com.tools20022.repository.choice.Purpose2Choice;
import com.tools20022.repository.codeset.ChargeBearerType1Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details specific to the individual transaction(s) included
 * in the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmPaymentIdentification
 * CreditTransferTransaction10.mmPaymentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmPaymentTypeInformation
 * CreditTransferTransaction10.mmPaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmAmount
 * CreditTransferTransaction10.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmChargeBearer
 * CreditTransferTransaction10.mmChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmChequeInstruction
 * CreditTransferTransaction10.mmChequeInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmUltimateDebtor
 * CreditTransferTransaction10.mmUltimateDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmIntermediaryAgent1
 * CreditTransferTransaction10.mmIntermediaryAgent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmIntermediaryAgent2
 * CreditTransferTransaction10.mmIntermediaryAgent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmIntermediaryAgent3
 * CreditTransferTransaction10.mmIntermediaryAgent3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmCreditorAgent
 * CreditTransferTransaction10.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmCreditor
 * CreditTransferTransaction10.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmCreditorAccount
 * CreditTransferTransaction10.mmCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmUltimateCreditor
 * CreditTransferTransaction10.mmUltimateCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmInstructionForCreditorAgent
 * CreditTransferTransaction10.mmInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmPurpose
 * CreditTransferTransaction10.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmRegulatoryReporting
 * CreditTransferTransaction10.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmTax
 * CreditTransferTransaction10.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmRelatedRemittanceInformation
 * CreditTransferTransaction10.mmRelatedRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmRemittanceInformation
 * CreditTransferTransaction10.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmSupplementaryData
 * CreditTransferTransaction10.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CreditTransfer
 * CreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CreditTransferTransaction10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details specific to the individual transaction(s) included in the message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransaction10
 * ConstraintUltimateCreditorGuideline.forCreditTransferTransaction10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransaction10
 * ConstraintUltimateDebtorGuideline.forCreditTransferTransaction10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent2Rule#forCreditTransferTransaction10
 * ConstraintIntermediaryAgent2Rule.forCreditTransferTransaction10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransaction10
 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionForCreditorAgentRule#forCreditTransferTransaction10
 * ConstraintInstructionForCreditorAgentRule.forCreditTransferTransaction10}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransferTransaction21
 * CreditTransferTransaction21}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5
 * CreditTransferTransaction5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CreditTransferTransaction10", propOrder = {"paymentIdentification", "paymentTypeInformation", "amount", "chargeBearer", "chequeInstruction", "ultimateDebtor", "intermediaryAgent1", "intermediaryAgent2",
		"intermediaryAgent3", "creditorAgent", "creditor", "creditorAccount", "ultimateCreditor", "instructionForCreditorAgent", "purpose", "regulatoryReporting", "tax", "relatedRemittanceInformation", "remittanceInformation",
		"supplementaryData"})
public class CreditTransferTransaction10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtId", required = true)
	protected PaymentIdentification1 paymentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentIdentification1
	 * PaymentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
	 * Payment.mmPaymentRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of elements used to reference a payment instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmPaymentIdentification
	 * CreditTransferTransaction21.mmPaymentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, PaymentIdentification1> mmPaymentIdentification = new MMMessageAssociationEnd<CreditTransferTransaction10, PaymentIdentification1>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentRelatedIdentifications;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "PmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentIdentification";
			definition = "Set of elements used to reference a payment instruction.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmPaymentIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentIdentification1.mmObject();
		}

		@Override
		public PaymentIdentification1 getValue(CreditTransferTransaction10 obj) {
			return obj.getPaymentIdentification();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, PaymentIdentification1 value) {
			obj.setPaymentIdentification(value);
		}
	};
	@XmlElement(name = "PmtTpInf")
	protected PaymentTypeInformation19 paymentTypeInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19
	 * PaymentTypeInformation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmProcessingInstructions
	 * PaymentExecution.mmProcessingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTpInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTypeInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to further specify the type of transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmPaymentTypeInformation
	 * CreditTransferTransaction21.mmPaymentTypeInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, Optional<PaymentTypeInformation19>> mmPaymentTypeInformation = new MMMessageAssociationEnd<CreditTransferTransaction10, Optional<PaymentTypeInformation19>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmProcessingInstructions;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "PmtTpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeInformation";
			definition = "Set of elements used to further specify the type of transaction.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmPaymentTypeInformation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTypeInformation19.mmObject();
		}

		@Override
		public Optional<PaymentTypeInformation19> getValue(CreditTransferTransaction10 obj) {
			return obj.getPaymentTypeInformation();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, Optional<PaymentTypeInformation19> value) {
			obj.setPaymentTypeInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected AmountType3Choice amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.AmountType3Choice
	 * AmountType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmAmount
	 * CreditTransferTransaction21.mmAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, AmountType3Choice> mmAmount = new MMMessageAssociationEnd<CreditTransferTransaction10, AmountType3Choice>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmAmount);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountType3Choice.mmObject();
		}

		@Override
		public AmountType3Choice getValue(CreditTransferTransaction10 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, AmountType3Choice value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "ChrgBr", required = true)
	protected ChargeBearerType1Code chargeBearer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmBearerType
	 * Charges.mmBearerType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgBr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies which party/parties will bear the charges associated with the processing of the payment transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmChargeBearer
	 * CreditTransferTransaction21.mmChargeBearer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditTransferTransaction10, ChargeBearerType1Code> mmChargeBearer = new MMMessageAttribute<CreditTransferTransaction10, ChargeBearerType1Code>() {
		{
			businessElementTrace_lazy = () -> Charges.mmBearerType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmChargeBearer);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChargeBearerType1Code.mmObject();
		}

		@Override
		public ChargeBearerType1Code getValue(CreditTransferTransaction10 obj) {
			return obj.getChargeBearer();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, ChargeBearerType1Code value) {
			obj.setChargeBearer(value);
		}
	};
	@XmlElement(name = "ChqInstr")
	protected Cheque7 chequeInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cheque7 Cheque7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChqInstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of elements needed to issue a cheque."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmChequeInstruction
	 * CreditTransferTransaction21.mmChequeInstruction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, Optional<Cheque7>> mmChequeInstruction = new MMMessageAssociationEnd<CreditTransferTransaction10, Optional<Cheque7>>() {
		{
			businessComponentTrace_lazy = () -> ChequeIssue.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "ChqInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstruction";
			definition = "Set of elements needed to issue a cheque.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmChequeInstruction);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Cheque7.mmObject();
		}

		@Override
		public Optional<Cheque7> getValue(CreditTransferTransaction10 obj) {
			return obj.getChequeInstruction();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, Optional<Cheque7> value) {
			obj.setChequeInstruction(value.orElse(null));
		}
	};
	@XmlElement(name = "UltmtDbtr")
	protected PartyIdentification43 ultimateDebtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtDbtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate party that owes an amount of money to the (ultimate) creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmUltimateDebtor
	 * CreditTransferTransaction21.mmUltimateDebtor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, Optional<PartyIdentification43>> mmUltimateDebtor = new MMMessageAssociationEnd<CreditTransferTransaction10, Optional<PartyIdentification43>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmUltimateDebtor);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(CreditTransferTransaction10 obj) {
			return obj.getUltimateDebtor();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, Optional<PartyIdentification43> value) {
			obj.setUltimateDebtor(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyAgt1")
	protected BranchAndFinancialInstitutionIdentification5 intermediaryAgent1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If more than one intermediary agent is present, then IntermediaryAgent1 identifies the agent between the DebtorAgent and the IntermediaryAgent2."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmIntermediaryAgent1
	 * CreditTransferTransaction21.mmIntermediaryAgent1}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, Optional<BranchAndFinancialInstitutionIdentification5>> mmIntermediaryAgent1 = new MMMessageAssociationEnd<CreditTransferTransaction10, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1";
			definition = "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If more than one intermediary agent is present, then IntermediaryAgent1 identifies the agent between the DebtorAgent and the IntermediaryAgent2.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmIntermediaryAgent1);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(CreditTransferTransaction10 obj) {
			return obj.getIntermediaryAgent1();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setIntermediaryAgent1(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyAgt2")
	protected BranchAndFinancialInstitutionIdentification5 intermediaryAgent2;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If more than two intermediary agents are present, then IntermediaryAgent2 identifies the agent between the IntermediaryAgent1 and the IntermediaryAgent3."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmIntermediaryAgent2
	 * CreditTransferTransaction21.mmIntermediaryAgent2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, Optional<BranchAndFinancialInstitutionIdentification5>> mmIntermediaryAgent2 = new MMMessageAssociationEnd<CreditTransferTransaction10, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent2";
			definition = "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If more than two intermediary agents are present, then IntermediaryAgent2 identifies the agent between the IntermediaryAgent1 and the IntermediaryAgent3.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmIntermediaryAgent2);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(CreditTransferTransaction10 obj) {
			return obj.getIntermediaryAgent2();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setIntermediaryAgent2(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyAgt3")
	protected BranchAndFinancialInstitutionIdentification5 intermediaryAgent3;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt3"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If IntermediaryAgent3 is present, then it identifies the agent between the IntermediaryAgent 2 and the CreditorAgent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmIntermediaryAgent3
	 * CreditTransferTransaction21.mmIntermediaryAgent3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, Optional<BranchAndFinancialInstitutionIdentification5>> mmIntermediaryAgent3 = new MMMessageAssociationEnd<CreditTransferTransaction10, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt3";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3";
			definition = "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If IntermediaryAgent3 is present, then it identifies the agent between the IntermediaryAgent 2 and the CreditorAgent.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmIntermediaryAgent3);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(CreditTransferTransaction10 obj) {
			return obj.getIntermediaryAgent3();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setIntermediaryAgent3(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAgt", required = true)
	protected BranchAndFinancialInstitutionIdentification5 creditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmCreditorAgent
	 * CreditTransferTransaction21.mmCreditorAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, BranchAndFinancialInstitutionIdentification5> mmCreditorAgent = new MMMessageAssociationEnd<CreditTransferTransaction10, BranchAndFinancialInstitutionIdentification5>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmCreditorAgent);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public BranchAndFinancialInstitutionIdentification5 getValue(CreditTransferTransaction10 obj) {
			return obj.getCreditorAgent();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, BranchAndFinancialInstitutionIdentification5 value) {
			obj.setCreditorAgent(value);
		}
	};
	@XmlElement(name = "Cdtr", required = true)
	protected PartyIdentification43 creditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to which an amount of money is due."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmCreditor
	 * CreditTransferTransaction21.mmCreditor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, PartyIdentification43> mmCreditor = new MMMessageAssociationEnd<CreditTransferTransaction10, PartyIdentification43>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party to which an amount of money is due.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmCreditor);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public PartyIdentification43 getValue(CreditTransferTransaction10 obj) {
			return obj.getCreditor();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, PartyIdentification43 value) {
			obj.setCreditor(value);
		}
	};
	@XmlElement(name = "CdtrAcct")
	protected CashAccount24 creditorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmCreditorAccount
	 * CreditTransferTransaction21.mmCreditorAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, Optional<CashAccount24>> mmCreditorAccount = new MMMessageAssociationEnd<CreditTransferTransaction10, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmCreditorAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(CreditTransferTransaction10 obj) {
			return obj.getCreditorAccount();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, Optional<CashAccount24> value) {
			obj.setCreditorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "UltmtCdtr")
	protected PartyIdentification43 ultimateCreditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtCdtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ultimate party to which an amount of money is due."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmUltimateCreditor
	 * CreditTransferTransaction21.mmUltimateCreditor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, Optional<PartyIdentification43>> mmUltimateCreditor = new MMMessageAssociationEnd<CreditTransferTransaction10, Optional<PartyIdentification43>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "UltmtCdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditor";
			definition = "Ultimate party to which an amount of money is due.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmUltimateCreditor);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(CreditTransferTransaction10 obj) {
			return obj.getUltimateCreditor();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, Optional<PartyIdentification43> value) {
			obj.setUltimateCreditor(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrForCdtrAgt")
	protected List<InstructionForCreditorAgent1> instructionForCreditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent1
	 * InstructionForCreditorAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForCreditorAgent
	 * Payment.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrForCdtrAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction, provided by the initiating party, and intended for the creditor agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmInstructionForCreditorAgent
	 * CreditTransferTransaction21.mmInstructionForCreditorAgent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, List<InstructionForCreditorAgent1>> mmInstructionForCreditorAgent = new MMMessageAssociationEnd<CreditTransferTransaction10, List<InstructionForCreditorAgent1>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructionForCreditorAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "InstrForCdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForCreditorAgent";
			definition = "Further information related to the processing of the payment instruction, provided by the initiating party, and intended for the creditor agent.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmInstructionForCreditorAgent);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InstructionForCreditorAgent1.mmObject();
		}

		@Override
		public List<InstructionForCreditorAgent1> getValue(CreditTransferTransaction10 obj) {
			return obj.getInstructionForCreditorAgent();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, List<InstructionForCreditorAgent1> value) {
			obj.setInstructionForCreditorAgent(value);
		}
	};
	@XmlElement(name = "Purp")
	protected Purpose2Choice purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Purpose2Choice
	 * Purpose2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPurpose
	 * PaymentObligation.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying reason for the payment transaction.\nUsage: Purpose is used by the end-customers, that is initiating party, (ultimate) debtor, (ultimate) creditor to provide information concerning the nature of the payment. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmPurpose
	 * CreditTransferTransaction21.mmPurpose}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, Optional<Purpose2Choice>> mmPurpose = new MMMessageAssociationEnd<CreditTransferTransaction10, Optional<Purpose2Choice>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment transaction.\nUsage: Purpose is used by the end-customers, that is initiating party, (ultimate) debtor, (ultimate) creditor to provide information concerning the nature of the payment. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmPurpose);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Purpose2Choice.mmObject();
		}

		@Override
		public Optional<Purpose2Choice> getValue(CreditTransferTransaction10 obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, Optional<Purpose2Choice> value) {
			obj.setPurpose(value.orElse(null));
		}
	};
	@XmlElement(name = "RgltryRptg")
	protected List<RegulatoryReporting3> regulatoryReporting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RegulatoryReporting3
	 * RegulatoryReporting3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmRegulatoryReport
	 * FinancialTransaction.mmRegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryRptg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information needed due to regulatory and statutory requirements."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmRegulatoryReporting
	 * CreditTransferTransaction21.mmRegulatoryReporting}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, List<RegulatoryReporting3>> mmRegulatoryReporting = new MMMessageAssociationEnd<CreditTransferTransaction10, List<RegulatoryReporting3>>() {
		{
			businessElementTrace_lazy = () -> FinancialTransaction.mmRegulatoryReport;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "RgltryRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryReporting";
			definition = "Information needed due to regulatory and statutory requirements.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmRegulatoryReporting);
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RegulatoryReporting3.mmObject();
		}

		@Override
		public List<RegulatoryReporting3> getValue(CreditTransferTransaction10 obj) {
			return obj.getRegulatoryReporting();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, List<RegulatoryReporting3> value) {
			obj.setRegulatoryReporting(value);
		}
	};
	@XmlElement(name = "Tax")
	protected TaxInformation3 tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxInformation3
	 * TaxInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
	 * Payment.mmTaxOnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmTax
	 * CreditTransferTransaction21.mmTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, Optional<TaxInformation3>> mmTax = new MMMessageAssociationEnd<CreditTransferTransaction10, Optional<TaxInformation3>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmTaxOnPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Provides details on the tax.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmTax);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxInformation3.mmObject();
		}

		@Override
		public Optional<TaxInformation3> getValue(CreditTransferTransaction10 obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, Optional<TaxInformation3> value) {
			obj.setTax(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdRmtInf")
	protected List<RemittanceLocation2> relatedRemittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceLocation2
	 * RemittanceLocation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRemittanceLocation
	 * PaymentObligation.mmRemittanceLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRmtInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information related to the handling of the remittance information by any of the agents in the transaction processing chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmRelatedRemittanceInformation
	 * CreditTransferTransaction21.mmRelatedRemittanceInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, List<RemittanceLocation2>> mmRelatedRemittanceInformation = new MMMessageAssociationEnd<CreditTransferTransaction10, List<RemittanceLocation2>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmRemittanceLocation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "RltdRmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedRemittanceInformation";
			definition = "Provides information related to the handling of the remittance information by any of the agents in the transaction processing chain.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmRelatedRemittanceInformation);
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RemittanceLocation2.mmObject();
		}

		@Override
		public List<RemittanceLocation2> getValue(CreditTransferTransaction10 obj) {
			return obj.getRelatedRemittanceInformation();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, List<RemittanceLocation2> value) {
			obj.setRelatedRemittanceInformation(value);
		}
	};
	@XmlElement(name = "RmtInf")
	protected RemittanceInformation7 remittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceInformation7
	 * RemittanceInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
	 * PaymentObligation.mmAssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmRemittanceInformation
	 * CreditTransferTransaction21.mmRemittanceInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CreditTransferTransaction10, Optional<RemittanceInformation7>> mmRemittanceInformation = new MMMessageAssociationEnd<CreditTransferTransaction10, Optional<RemittanceInformation7>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAssociatedDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "RmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceInformation";
			definition = "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmRemittanceInformation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RemittanceInformation7.mmObject();
		}

		@Override
		public Optional<RemittanceInformation7> getValue(CreditTransferTransaction10 obj) {
			return obj.getRemittanceInformation();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, Optional<RemittanceInformation7> value) {
			obj.setRemittanceInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10
	 * CreditTransferTransaction10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmSupplementaryData
	 * CreditTransferTransaction21.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditTransferTransaction10, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAttribute<CreditTransferTransaction10, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransaction10.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CreditTransferTransaction10 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CreditTransferTransaction10 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction10.mmPaymentIdentification, com.tools20022.repository.msg.CreditTransferTransaction10.mmPaymentTypeInformation,
						com.tools20022.repository.msg.CreditTransferTransaction10.mmAmount, com.tools20022.repository.msg.CreditTransferTransaction10.mmChargeBearer,
						com.tools20022.repository.msg.CreditTransferTransaction10.mmChequeInstruction, com.tools20022.repository.msg.CreditTransferTransaction10.mmUltimateDebtor,
						com.tools20022.repository.msg.CreditTransferTransaction10.mmIntermediaryAgent1, com.tools20022.repository.msg.CreditTransferTransaction10.mmIntermediaryAgent2,
						com.tools20022.repository.msg.CreditTransferTransaction10.mmIntermediaryAgent3, com.tools20022.repository.msg.CreditTransferTransaction10.mmCreditorAgent,
						com.tools20022.repository.msg.CreditTransferTransaction10.mmCreditor, com.tools20022.repository.msg.CreditTransferTransaction10.mmCreditorAccount,
						com.tools20022.repository.msg.CreditTransferTransaction10.mmUltimateCreditor, com.tools20022.repository.msg.CreditTransferTransaction10.mmInstructionForCreditorAgent,
						com.tools20022.repository.msg.CreditTransferTransaction10.mmPurpose, com.tools20022.repository.msg.CreditTransferTransaction10.mmRegulatoryReporting, com.tools20022.repository.msg.CreditTransferTransaction10.mmTax,
						com.tools20022.repository.msg.CreditTransferTransaction10.mmRelatedRemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction10.mmRemittanceInformation,
						com.tools20022.repository.msg.CreditTransferTransaction10.mmSupplementaryData);
				trace_lazy = () -> CreditTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransaction10,
						com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransaction10, com.tools20022.repository.constraints.ConstraintIntermediaryAgent2Rule.forCreditTransferTransaction10,
						com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransaction10, com.tools20022.repository.constraints.ConstraintInstructionForCreditorAgentRule.forCreditTransferTransaction10);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditTransferTransaction10";
				definition = "Provides further details specific to the individual transaction(s) included in the message.";
				nextVersions_lazy = () -> Arrays.asList(CreditTransferTransaction21.mmObject());
				previousVersion_lazy = () -> CreditTransferTransaction5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentIdentification1 getPaymentIdentification() {
		return paymentIdentification;
	}

	public CreditTransferTransaction10 setPaymentIdentification(PaymentIdentification1 paymentIdentification) {
		this.paymentIdentification = Objects.requireNonNull(paymentIdentification);
		return this;
	}

	public Optional<PaymentTypeInformation19> getPaymentTypeInformation() {
		return paymentTypeInformation == null ? Optional.empty() : Optional.of(paymentTypeInformation);
	}

	public CreditTransferTransaction10 setPaymentTypeInformation(PaymentTypeInformation19 paymentTypeInformation) {
		this.paymentTypeInformation = paymentTypeInformation;
		return this;
	}

	public AmountType3Choice getAmount() {
		return amount;
	}

	public CreditTransferTransaction10 setAmount(AmountType3Choice amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public ChargeBearerType1Code getChargeBearer() {
		return chargeBearer;
	}

	public CreditTransferTransaction10 setChargeBearer(ChargeBearerType1Code chargeBearer) {
		this.chargeBearer = Objects.requireNonNull(chargeBearer);
		return this;
	}

	public Optional<Cheque7> getChequeInstruction() {
		return chequeInstruction == null ? Optional.empty() : Optional.of(chequeInstruction);
	}

	public CreditTransferTransaction10 setChequeInstruction(Cheque7 chequeInstruction) {
		this.chequeInstruction = chequeInstruction;
		return this;
	}

	public Optional<PartyIdentification43> getUltimateDebtor() {
		return ultimateDebtor == null ? Optional.empty() : Optional.of(ultimateDebtor);
	}

	public CreditTransferTransaction10 setUltimateDebtor(PartyIdentification43 ultimateDebtor) {
		this.ultimateDebtor = ultimateDebtor;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getIntermediaryAgent1() {
		return intermediaryAgent1 == null ? Optional.empty() : Optional.of(intermediaryAgent1);
	}

	public CreditTransferTransaction10 setIntermediaryAgent1(BranchAndFinancialInstitutionIdentification5 intermediaryAgent1) {
		this.intermediaryAgent1 = intermediaryAgent1;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getIntermediaryAgent2() {
		return intermediaryAgent2 == null ? Optional.empty() : Optional.of(intermediaryAgent2);
	}

	public CreditTransferTransaction10 setIntermediaryAgent2(BranchAndFinancialInstitutionIdentification5 intermediaryAgent2) {
		this.intermediaryAgent2 = intermediaryAgent2;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getIntermediaryAgent3() {
		return intermediaryAgent3 == null ? Optional.empty() : Optional.of(intermediaryAgent3);
	}

	public CreditTransferTransaction10 setIntermediaryAgent3(BranchAndFinancialInstitutionIdentification5 intermediaryAgent3) {
		this.intermediaryAgent3 = intermediaryAgent3;
		return this;
	}

	public BranchAndFinancialInstitutionIdentification5 getCreditorAgent() {
		return creditorAgent;
	}

	public CreditTransferTransaction10 setCreditorAgent(BranchAndFinancialInstitutionIdentification5 creditorAgent) {
		this.creditorAgent = Objects.requireNonNull(creditorAgent);
		return this;
	}

	public PartyIdentification43 getCreditor() {
		return creditor;
	}

	public CreditTransferTransaction10 setCreditor(PartyIdentification43 creditor) {
		this.creditor = Objects.requireNonNull(creditor);
		return this;
	}

	public Optional<CashAccount24> getCreditorAccount() {
		return creditorAccount == null ? Optional.empty() : Optional.of(creditorAccount);
	}

	public CreditTransferTransaction10 setCreditorAccount(CashAccount24 creditorAccount) {
		this.creditorAccount = creditorAccount;
		return this;
	}

	public Optional<PartyIdentification43> getUltimateCreditor() {
		return ultimateCreditor == null ? Optional.empty() : Optional.of(ultimateCreditor);
	}

	public CreditTransferTransaction10 setUltimateCreditor(PartyIdentification43 ultimateCreditor) {
		this.ultimateCreditor = ultimateCreditor;
		return this;
	}

	public List<InstructionForCreditorAgent1> getInstructionForCreditorAgent() {
		return instructionForCreditorAgent == null ? instructionForCreditorAgent = new ArrayList<>() : instructionForCreditorAgent;
	}

	public CreditTransferTransaction10 setInstructionForCreditorAgent(List<InstructionForCreditorAgent1> instructionForCreditorAgent) {
		this.instructionForCreditorAgent = Objects.requireNonNull(instructionForCreditorAgent);
		return this;
	}

	public Optional<Purpose2Choice> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public CreditTransferTransaction10 setPurpose(Purpose2Choice purpose) {
		this.purpose = purpose;
		return this;
	}

	public List<RegulatoryReporting3> getRegulatoryReporting() {
		return regulatoryReporting == null ? regulatoryReporting = new ArrayList<>() : regulatoryReporting;
	}

	public CreditTransferTransaction10 setRegulatoryReporting(List<RegulatoryReporting3> regulatoryReporting) {
		this.regulatoryReporting = Objects.requireNonNull(regulatoryReporting);
		return this;
	}

	public Optional<TaxInformation3> getTax() {
		return tax == null ? Optional.empty() : Optional.of(tax);
	}

	public CreditTransferTransaction10 setTax(TaxInformation3 tax) {
		this.tax = tax;
		return this;
	}

	public List<RemittanceLocation2> getRelatedRemittanceInformation() {
		return relatedRemittanceInformation == null ? relatedRemittanceInformation = new ArrayList<>() : relatedRemittanceInformation;
	}

	public CreditTransferTransaction10 setRelatedRemittanceInformation(List<RemittanceLocation2> relatedRemittanceInformation) {
		this.relatedRemittanceInformation = Objects.requireNonNull(relatedRemittanceInformation);
		return this;
	}

	public Optional<RemittanceInformation7> getRemittanceInformation() {
		return remittanceInformation == null ? Optional.empty() : Optional.of(remittanceInformation);
	}

	public CreditTransferTransaction10 setRemittanceInformation(RemittanceInformation7 remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CreditTransferTransaction10 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}