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

package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.PaymentsInitiationArchive;
import com.tools20022.repository.msg.GroupHeader1;
import com.tools20022.repository.msg.PaymentInstructionInformation2;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CustomerDirectDebitInitiation message is sent by the initiating party to
 * the forwarding agent or creditor agent. It is used to request single or bulk
 * collection(s) of funds from one or various debtor's account(s) for a
 * creditor.<br>
 * <b>Usage</b><br>
 * The CustomerDirectDebitInitiation message can contain one or more direct
 * debit instructions.<br>
 * The message can be used in a direct or a relay scenario:<br>
 * - In a direct scenario, the message is sent directly to the creditor agent.
 * The creditor agent is the account servicer of the creditor.<br>
 * - In a relay scenario, the message is sent to a forwarding agent. The
 * forwarding agent acts as a concentrating financial institution. It will
 * forward the CustomerDirectDebitInitiation message to the creditor agent.<br>
 * The message can also be used by an initiating party that has authority to
 * send the message on behalf of the creditor. This caters for example for the
 * scenario of a payments factory initiating all payments on behalf of a large
 * corporate.<br>
 * The CustomerDirectDebitInitiation message can be used in domestic and
 * cross-border scenarios.<br>
 * The CustomerDirectDebitInitiation may or may not contain mandate related
 * information, i.e. extracts from a mandate, such as MandateIdentification or
 * DateOfSignature. The CustomerDirectDebitInitiation message must not be
 * considered as a mandate.<br>
 * The CustomerDirectDebitInitiation message must not be used by the creditor
 * agent to execute the direct debit instruction(s). The
 * FIToFICustomerDirectDebit message must be used instead.<br>
 * If it is agreed to include the payment information related to the credit side
 * only once (i.e. Grouped mode), the PaymentInformation block will be present
 * only once. If it is agreed to repeat the payment information related to the
 * credit side (i.e. Single mode), the PaymentInformation block must be present
 * once per occurrence of the DirectDebitTransactionInformation block. The
 * CustomerDirectDebitInitiation message also allows for a Mixed mode where the
 * PaymentInformation block can be repeated and each PaymentInformation block
 * can contain one or several DirectDebitTransactionInformation block(s). Single
 * When grouping is set to Single, information for each individual instruction
 * is included separately. This means the PaymentInformation block is repeated,
 * and present for each occurrence of the Direct Debit TransactionInformation
 * block. Grouped When grouping is set to Grouped, the PaymentInformation block
 * will be present once and the Direct Debit TransactionInformation block will
 * be repeated. Mixed When grouping is set to Mixed, the PaymentInformation
 * block may be present once or may be repeated. Each sequence of the
 * PaymentInformation block may contain one or several Direct Debit
 * TransactionInformation block(s).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pain.008.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationArchive
 * PaymentsInitiationArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV01#mmGroupHeader
 * CustomerDirectDebitInitiationV01.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV01#mmPaymentInformation
 * CustomerDirectDebitInitiationV01.mmPaymentInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "pain.008.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "pain.008.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerDirectDebitInitiationV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CustomerDirectDebitInitiation message is sent by the initiating party to the forwarding agent or creditor agent. It is used to request single or bulk collection(s) of funds from one or various debtor's account(s) for a creditor.\r\nUsage\r\nThe CustomerDirectDebitInitiation message can contain one or more direct debit instructions.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the creditor agent. The creditor agent is the account servicer of the creditor.\r\n- In a relay scenario, the message is sent to a forwarding agent. The forwarding agent acts as a concentrating financial institution. It will forward the CustomerDirectDebitInitiation message to the creditor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor. This caters for example for the scenario of a payments factory initiating all payments on behalf of a large corporate.\r\nThe CustomerDirectDebitInitiation message can be used in domestic and cross-border scenarios.\r\nThe CustomerDirectDebitInitiation may or may not contain mandate related information, i.e. extracts from a mandate, such as MandateIdentification or DateOfSignature. The CustomerDirectDebitInitiation message must not be considered as a mandate.\r\nThe CustomerDirectDebitInitiation message must not be used by the creditor agent to execute the direct debit instruction(s). The FIToFICustomerDirectDebit message must be used instead.\r\nIf it is agreed to include the payment information related to the credit side only once (i.e. Grouped mode), the PaymentInformation block will be present only once. If it is agreed to repeat the payment information related to the credit side (i.e. Single mode), the PaymentInformation block must be present once per occurrence of the DirectDebitTransactionInformation block. The CustomerDirectDebitInitiation message also allows for a Mixed mode where the PaymentInformation block can be repeated and each PaymentInformation block can contain one or several DirectDebitTransactionInformation block(s).\nSingle\nWhen grouping is set to Single, information for each individual instruction is included separately. This means the\nPaymentInformation block is repeated, and present for each occurrence of the Direct Debit TransactionInformation block.\nGrouped\nWhen grouping is set to Grouped, the PaymentInformation block will be present once and the Direct Debit\nTransactionInformation block will be repeated.\nMixed\nWhen grouping is set to Mixed, the PaymentInformation block may be present once or may be repeated. Each sequence\nof the PaymentInformation block may contain one or several Direct Debit TransactionInformation block(s)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGrouping1Rule#for_pain_CustomerDirectDebitInitiationV01
 * ConstraintGrouping1Rule.for_pain_CustomerDirectDebitInitiationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGrouping2Rule#for_pain_CustomerDirectDebitInitiationV01
 * ConstraintGrouping2Rule.for_pain_CustomerDirectDebitInitiationV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV02
 * CustomerDirectDebitInitiationV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "pain.008.001.01", propOrder = {"groupHeader", "paymentInformation"})
public class CustomerDirectDebitInitiationV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader1 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader1
	 * GroupHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics shared by all individual transactions included in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerDirectDebitInitiationV01, GroupHeader1> mmGroupHeader = new MMMessageBuildingBlock<CustomerDirectDebitInitiationV01, GroupHeader1>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader1.mmObject();
		}

		@Override
		public GroupHeader1 getValue(CustomerDirectDebitInitiationV01 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(CustomerDirectDebitInitiationV01 obj, GroupHeader1 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "PmtInf", required = true)
	protected List<PaymentInstructionInformation2> paymentInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation2
	 * PaymentInstructionInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics that apply to the credit side of the payment transactions included in the direct debit transaction initiation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerDirectDebitInitiationV01, List<PaymentInstructionInformation2>> mmPaymentInformation = new MMMessageBuildingBlock<CustomerDirectDebitInitiationV01, List<PaymentInstructionInformation2>>() {
		{
			xmlTag = "PmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformation";
			definition = "Set of characteristics that apply to the credit side of the payment transactions included in the direct debit transaction initiation.";
			minOccurs = 1;
			complexType_lazy = () -> PaymentInstructionInformation2.mmObject();
		}

		@Override
		public List<PaymentInstructionInformation2> getValue(CustomerDirectDebitInitiationV01 obj) {
			return obj.getPaymentInformation();
		}

		@Override
		public void setValue(CustomerDirectDebitInitiationV01 obj, List<PaymentInstructionInformation2> value) {
			obj.setPaymentInformation(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrouping1Rule.for_pain_CustomerDirectDebitInitiationV01,
						com.tools20022.repository.constraints.ConstraintGrouping2Rule.for_pain_CustomerDirectDebitInitiationV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustomerDirectDebitInitiationV01";
				definition = "Scope\r\nThe CustomerDirectDebitInitiation message is sent by the initiating party to the forwarding agent or creditor agent. It is used to request single or bulk collection(s) of funds from one or various debtor's account(s) for a creditor.\r\nUsage\r\nThe CustomerDirectDebitInitiation message can contain one or more direct debit instructions.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the creditor agent. The creditor agent is the account servicer of the creditor.\r\n- In a relay scenario, the message is sent to a forwarding agent. The forwarding agent acts as a concentrating financial institution. It will forward the CustomerDirectDebitInitiation message to the creditor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor. This caters for example for the scenario of a payments factory initiating all payments on behalf of a large corporate.\r\nThe CustomerDirectDebitInitiation message can be used in domestic and cross-border scenarios.\r\nThe CustomerDirectDebitInitiation may or may not contain mandate related information, i.e. extracts from a mandate, such as MandateIdentification or DateOfSignature. The CustomerDirectDebitInitiation message must not be considered as a mandate.\r\nThe CustomerDirectDebitInitiation message must not be used by the creditor agent to execute the direct debit instruction(s). The FIToFICustomerDirectDebit message must be used instead.\r\nIf it is agreed to include the payment information related to the credit side only once (i.e. Grouped mode), the PaymentInformation block will be present only once. If it is agreed to repeat the payment information related to the credit side (i.e. Single mode), the PaymentInformation block must be present once per occurrence of the DirectDebitTransactionInformation block. The CustomerDirectDebitInitiation message also allows for a Mixed mode where the PaymentInformation block can be repeated and each PaymentInformation block can contain one or several DirectDebitTransactionInformation block(s).\nSingle\nWhen grouping is set to Single, information for each individual instruction is included separately. This means the\nPaymentInformation block is repeated, and present for each occurrence of the Direct Debit TransactionInformation block.\nGrouped\nWhen grouping is set to Grouped, the PaymentInformation block will be present once and the Direct Debit\nTransactionInformation block will be repeated.\nMixed\nWhen grouping is set to Mixed, the PaymentInformation block may be present once or may be repeated. Each sequence\nof the PaymentInformation block may contain one or several Direct Debit TransactionInformation block(s).";
				nextVersions_lazy = () -> Arrays.asList(CustomerDirectDebitInitiationV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "pain.008.001.01";
				businessArea_lazy = () -> PaymentsInitiationArchive.mmObject();
				xmlName = "pain.008.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV01.mmGroupHeader, com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV01.mmPaymentInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pain";
						messageFunctionality = "008";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CustomerDirectDebitInitiationV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader1 getGroupHeader() {
		return groupHeader;
	}

	public CustomerDirectDebitInitiationV01 setGroupHeader(GroupHeader1 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<PaymentInstructionInformation2> getPaymentInformation() {
		return paymentInformation == null ? paymentInformation = new ArrayList<>() : paymentInformation;
	}

	public CustomerDirectDebitInitiationV01 setPaymentInformation(List<PaymentInstructionInformation2> paymentInformation) {
		this.paymentInformation = Objects.requireNonNull(paymentInformation);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.008.001.01")
	static public class Document {
		@XmlElement(name = "pain.008.001.01", required = true)
		public CustomerDirectDebitInitiationV01 messageBody;
	}
}