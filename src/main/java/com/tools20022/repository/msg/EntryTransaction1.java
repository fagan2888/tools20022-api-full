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
import com.tools20022.repository.choice.Purpose1Choice;
import com.tools20022.repository.choice.SecurityIdentification4Choice;
import com.tools20022.repository.choice.TransactionPrice1Choice;
import com.tools20022.repository.choice.TransactionQuantities1Choice;
import com.tools20022.repository.datatype.Max500Text;
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
 * Posting to an account that results in an increase or decrease to a balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction1#mmReferences
 * EntryTransaction1.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmAmountDetails
 * EntryTransaction1.mmAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmAvailability
 * EntryTransaction1.mmAvailability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmBankTransactionCode
 * EntryTransaction1.mmBankTransactionCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction1#mmCharges
 * EntryTransaction1.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction1#mmInterest
 * EntryTransaction1.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmRelatedParties
 * EntryTransaction1.mmRelatedParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmRelatedAgents
 * EntryTransaction1.mmRelatedAgents}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction1#mmPurpose
 * EntryTransaction1.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmRelatedRemittanceInformation
 * EntryTransaction1.mmRelatedRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmRemittanceInformation
 * EntryTransaction1.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmRelatedDates
 * EntryTransaction1.mmRelatedDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmRelatedPrice
 * EntryTransaction1.mmRelatedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmRelatedQuantities
 * EntryTransaction1.mmRelatedQuantities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmFinancialInstrumentIdentification
 * EntryTransaction1.mmFinancialInstrumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction1#mmTax
 * EntryTransaction1.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmReturnInformation
 * EntryTransaction1.mmReturnInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmCorporateAction
 * EntryTransaction1.mmCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmSafekeepingAccount
 * EntryTransaction1.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmAdditionalTransactionInformation
 * EntryTransaction1.mmAdditionalTransactionInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EntryTransaction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Posting to an account that results in an increase or decrease to a balance."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EntryTransaction1", propOrder = {"references", "amountDetails", "availability", "bankTransactionCode", "charges", "interest", "relatedParties", "relatedAgents", "purpose", "relatedRemittanceInformation",
		"remittanceInformation", "relatedDates", "relatedPrice", "relatedQuantities", "financialInstrumentIdentification", "tax", "returnInformation", "corporateAction", "safekeepingAccount", "additionalTransactionInformation"})
public class EntryTransaction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Refs")
	protected TransactionReferences1 references;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionReferences1
	 * TransactionReferences1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmIdentification
	 * Entry.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing the identification of the underlying transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, Optional<TransactionReferences1>> mmReferences = new MMMessageAssociationEnd<EntryTransaction1, Optional<TransactionReferences1>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Set of elements providing the identification of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionReferences1.mmObject();
		}

		@Override
		public Optional<TransactionReferences1> getValue(EntryTransaction1 obj) {
			return obj.getReferences();
		}

		@Override
		public void setValue(EntryTransaction1 obj, Optional<TransactionReferences1> value) {
			obj.setReferences(value.orElse(null));
		}
	};
	@XmlElement(name = "AmtDtls")
	protected AmountAndCurrencyExchange2 amountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2
	 * AmountAndCurrencyExchange2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing details information on the original amount.\n\nUsage: This component (on transaction level) should be used in case booking is for a single transaction and the original amount is different from the entry amount. It can also be used in case individual original amounts are provided in case of a batch or aggregate booking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, Optional<AmountAndCurrencyExchange2>> mmAmountDetails = new MMMessageAssociationEnd<EntryTransaction1, Optional<AmountAndCurrencyExchange2>>() {
		{
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "AmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDetails";
			definition = "Set of elements providing details information on the original amount.\n\nUsage: This component (on transaction level) should be used in case booking is for a single transaction and the original amount is different from the entry amount. It can also be used in case individual original amounts are provided in case of a batch or aggregate booking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndCurrencyExchange2.mmObject();
		}

		@Override
		public Optional<AmountAndCurrencyExchange2> getValue(EntryTransaction1 obj) {
			return obj.getAmountDetails();
		}

		@Override
		public void setValue(EntryTransaction1 obj, Optional<AmountAndCurrencyExchange2> value) {
			obj.setAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "Avlbty")
	protected List<CashBalanceAvailability1> availability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailability1
	 * CashBalanceAvailability1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAvailability
	 * CashEntry.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Avlbty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to indicate when the booked funds will become available, ie can be accessed and start generating interest. \n\nUsage: this type of info is eg used in US, and is linked to particular instruments, such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the funds will only be accessible as of the indicated availability day (according to national banking regulations)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, List<CashBalanceAvailability1>> mmAvailability = new MMMessageAssociationEnd<EntryTransaction1, List<CashBalanceAvailability1>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAvailability;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "Avlbty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Availability";
			definition = "Set of elements used to indicate when the booked funds will become available, ie can be accessed and start generating interest. \n\nUsage: this type of info is eg used in US, and is linked to particular instruments, such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the funds will only be accessible as of the indicated availability day (according to national banking regulations).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashBalanceAvailability1.mmObject();
		}

		@Override
		public List<CashBalanceAvailability1> getValue(EntryTransaction1 obj) {
			return obj.getAvailability();
		}

		@Override
		public void setValue(EntryTransaction1 obj, List<CashBalanceAvailability1> value) {
			obj.setAvailability(value);
		}
	};
	@XmlElement(name = "BkTxCd")
	protected BankTransactionCodeStructure1 bankTransactionCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure1
	 * BankTransactionCodeStructure1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmBankTransactionCode
	 * Entry.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkTxCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankTransactionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements to fully identify the type of underlying transaction resulting in an entry."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, Optional<BankTransactionCodeStructure1>> mmBankTransactionCode = new MMMessageAssociationEnd<EntryTransaction1, Optional<BankTransactionCodeStructure1>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmBankTransactionCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "BkTxCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankTransactionCode";
			definition = "Set of elements to fully identify the type of underlying transaction resulting in an entry.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BankTransactionCodeStructure1.mmObject();
		}

		@Override
		public Optional<BankTransactionCodeStructure1> getValue(EntryTransaction1 obj) {
			return obj.getBankTransactionCode();
		}

		@Override
		public void setValue(EntryTransaction1 obj, Optional<BankTransactionCodeStructure1> value) {
			obj.setBankTransactionCode(value.orElse(null));
		}
	};
	@XmlElement(name = "Chrgs")
	protected List<ChargesInformation3> charges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ChargesInformation3
	 * ChargesInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCharges
	 * CashEntry.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chrgs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the charges included in the entry amount.\n\nUsage: This component (on transaction level) can be used in case the booking is for a single transaction, and charges are included in the entry amount. It can also be used in case individual charge amounts are applied to individual transactions in case of a batch or aggregate amount booking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, List<ChargesInformation3>> mmCharges = new MMMessageAssociationEnd<EntryTransaction1, List<ChargesInformation3>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCharges;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "Chrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			definition = "Provides information on the charges included in the entry amount.\n\nUsage: This component (on transaction level) can be used in case the booking is for a single transaction, and charges are included in the entry amount. It can also be used in case individual charge amounts are applied to individual transactions in case of a batch or aggregate amount booking.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ChargesInformation3.mmObject();
		}

		@Override
		public List<ChargesInformation3> getValue(EntryTransaction1 obj) {
			return obj.getCharges();
		}

		@Override
		public void setValue(EntryTransaction1 obj, List<ChargesInformation3> value) {
			obj.setCharges(value);
		}
	};
	@XmlElement(name = "Intrst")
	protected List<TransactionInterest1> interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionInterest1
	 * TransactionInterest1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing details on the interest amount included in the entry amount.\n\nUsage: This component (on transaction level) can be used in case the booking is for a single transaction, and interest amount is included in the entry amount. It can also be used in case individual interest amounts are applied to individual transactions in case of a batch or aggregate amount booking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, List<TransactionInterest1>> mmInterest = new MMMessageAssociationEnd<EntryTransaction1, List<TransactionInterest1>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Set of elements providing details on the interest amount included in the entry amount.\n\nUsage: This component (on transaction level) can be used in case the booking is for a single transaction, and interest amount is included in the entry amount. It can also be used in case individual interest amounts are applied to individual transactions in case of a batch or aggregate amount booking.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionInterest1.mmObject();
		}

		@Override
		public List<TransactionInterest1> getValue(EntryTransaction1 obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(EntryTransaction1 obj, List<TransactionInterest1> value) {
			obj.setInterest(value);
		}
	};
	@XmlElement(name = "RltdPties")
	protected TransactionParty1 relatedParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionParty1
	 * TransactionParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements identifying the parties related to the underlying transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, Optional<TransactionParty1>> mmRelatedParties = new MMMessageAssociationEnd<EntryTransaction1, Optional<TransactionParty1>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "RltdPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedParties";
			definition = "Set of elements identifying the parties related to the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionParty1.mmObject();
		}

		@Override
		public Optional<TransactionParty1> getValue(EntryTransaction1 obj) {
			return obj.getRelatedParties();
		}

		@Override
		public void setValue(EntryTransaction1 obj, Optional<TransactionParty1> value) {
			obj.setRelatedParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdAgts")
	protected TransactionAgents1 relatedAgents;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionAgents1
	 * TransactionAgents1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdAgts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAgents"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements identifying the agents related to the underlying transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, Optional<TransactionAgents1>> mmRelatedAgents = new MMMessageAssociationEnd<EntryTransaction1, Optional<TransactionAgents1>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "RltdAgts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedAgents";
			definition = "Set of elements identifying the agents related to the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionAgents1.mmObject();
		}

		@Override
		public Optional<TransactionAgents1> getValue(EntryTransaction1 obj) {
			return obj.getRelatedAgents();
		}

		@Override
		public void setValue(EntryTransaction1 obj, Optional<TransactionAgents1> value) {
			obj.setRelatedAgents(value.orElse(null));
		}
	};
	@XmlElement(name = "Purp")
	protected Purpose1Choice purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Purpose1Choice
	 * Purpose1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPurpose
	 * PaymentObligation.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying reason for the payment transaction, eg, a charity payment, or a commercial agreement between the creditor and the debtor. \n\nUsage: purpose is used by the end-customers, ie originating party, initiating party, debtor, creditor, final party, to provide information concerning the nature of the payment transaction. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, Optional<Purpose1Choice>> mmPurpose = new MMMessageAssociationEnd<EntryTransaction1, Optional<Purpose1Choice>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment transaction, eg, a charity payment, or a commercial agreement between the creditor and the debtor. \n\nUsage: purpose is used by the end-customers, ie originating party, initiating party, debtor, creditor, final party, to provide information concerning the nature of the payment transaction. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Purpose1Choice.mmObject();
		}

		@Override
		public Optional<Purpose1Choice> getValue(EntryTransaction1 obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(EntryTransaction1 obj, Optional<Purpose1Choice> value) {
			obj.setPurpose(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdRmtInf")
	protected List<RemittanceLocation1> relatedRemittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceLocation1
	 * RemittanceLocation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPlaceOfStorage
	 * Document.mmPlaceOfStorage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRmtInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the handling of the remittance information by any of the agents in the transaction processing chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, List<RemittanceLocation1>> mmRelatedRemittanceInformation = new MMMessageAssociationEnd<EntryTransaction1, List<RemittanceLocation1>>() {
		{
			businessElementTrace_lazy = () -> Document.mmPlaceOfStorage;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "RltdRmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedRemittanceInformation";
			definition = "Information related to the handling of the remittance information by any of the agents in the transaction processing chain.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RemittanceLocation1.mmObject();
		}

		@Override
		public List<RemittanceLocation1> getValue(EntryTransaction1 obj) {
			return obj.getRelatedRemittanceInformation();
		}

		@Override
		public void setValue(EntryTransaction1 obj, List<RemittanceLocation1> value) {
			obj.setRelatedRemittanceInformation(value);
		}
	};
	@XmlElement(name = "RmtInf")
	protected RemittanceInformation1 remittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceInformation1
	 * RemittanceInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
	 * PaymentObligation.mmAssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that enables the matching, ie, reconciliation, of a payment with the items that the payment is intended to settle, eg, commercial invoices in an account receivable system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, Optional<RemittanceInformation1>> mmRemittanceInformation = new MMMessageAssociationEnd<EntryTransaction1, Optional<RemittanceInformation1>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAssociatedDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "RmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceInformation";
			definition = "Information that enables the matching, ie, reconciliation, of a payment with the items that the payment is intended to settle, eg, commercial invoices in an account receivable system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RemittanceInformation1.mmObject();
		}

		@Override
		public Optional<RemittanceInformation1> getValue(EntryTransaction1 obj) {
			return obj.getRemittanceInformation();
		}

		@Override
		public void setValue(EntryTransaction1 obj, Optional<RemittanceInformation1> value) {
			obj.setRemittanceInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdDts")
	protected TransactionDates1 relatedDates;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionDates1
	 * TransactionDates1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
	 * Payment.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdDts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements identifying the dates related to the underlying transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, Optional<TransactionDates1>> mmRelatedDates = new MMMessageAssociationEnd<EntryTransaction1, Optional<TransactionDates1>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentExecution;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "RltdDts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDates";
			definition = "Set of elements identifying the dates related to the underlying transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionDates1.mmObject();
		}

		@Override
		public Optional<TransactionDates1> getValue(EntryTransaction1 obj) {
			return obj.getRelatedDates();
		}

		@Override
		public void setValue(EntryTransaction1 obj, Optional<TransactionDates1> value) {
			obj.setRelatedDates(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdPric")
	protected TransactionPrice1Choice relatedPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionPrice1Choice
	 * TransactionPrice1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
	 * SecuritiesTradeExecution.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements identifying the price information related to the underlying transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, Optional<TransactionPrice1Choice>> mmRelatedPrice = new MMMessageAssociationEnd<EntryTransaction1, Optional<TransactionPrice1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmDealPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "RltdPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPrice";
			definition = "Set of elements identifying the price information related to the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionPrice1Choice.mmObject();
		}

		@Override
		public Optional<TransactionPrice1Choice> getValue(EntryTransaction1 obj) {
			return obj.getRelatedPrice();
		}

		@Override
		public void setValue(EntryTransaction1 obj, Optional<TransactionPrice1Choice> value) {
			obj.setRelatedPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdQties")
	protected List<TransactionQuantities1Choice> relatedQuantities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionQuantities1Choice
	 * TransactionQuantities1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmFinancialInstrumentQuantity
	 * SecuritiesEntry.mmFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdQties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedQuantities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies related quantities (eg of securities) in the underlying transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, List<TransactionQuantities1Choice>> mmRelatedQuantities = new MMMessageAssociationEnd<EntryTransaction1, List<TransactionQuantities1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesEntry.mmFinancialInstrumentQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "RltdQties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedQuantities";
			definition = "Identifies related quantities (eg of securities) in the underlying transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionQuantities1Choice.mmObject();
		}

		@Override
		public List<TransactionQuantities1Choice> getValue(EntryTransaction1 obj) {
			return obj.getRelatedQuantities();
		}

		@Override
		public void setValue(EntryTransaction1 obj, List<TransactionQuantities1Choice> value) {
			obj.setRelatedQuantities(value);
		}
	};
	@XmlElement(name = "FinInstrmId")
	protected SecurityIdentification4Choice financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification4Choice
	 * SecurityIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a security, as assigned under a formal or proprietary identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, Optional<SecurityIdentification4Choice>> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<EntryTransaction1, Optional<SecurityIdentification4Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of a security, as assigned under a formal or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification4Choice.mmObject();
		}

		@Override
		public Optional<SecurityIdentification4Choice> getValue(EntryTransaction1 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(EntryTransaction1 obj, Optional<SecurityIdentification4Choice> value) {
			obj.setFinancialInstrumentIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Tax")
	protected TaxInformation2 tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxInformation2
	 * TaxInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
	 * Payment.mmTaxOnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, Optional<TaxInformation2>> mmTax = new MMMessageAssociationEnd<EntryTransaction1, Optional<TaxInformation2>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmTaxOnPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxInformation2.mmObject();
		}

		@Override
		public Optional<TaxInformation2> getValue(EntryTransaction1 obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(EntryTransaction1 obj, Optional<TaxInformation2> value) {
			obj.setTax(value.orElse(null));
		}
	};
	@XmlElement(name = "RtrInf")
	protected ReturnReasonInformation5 returnInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReturnReasonInformation5
	 * ReturnReasonInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
	 * Payment.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of elements specifying the return information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, Optional<ReturnReasonInformation5>> mmReturnInformation = new MMMessageAssociationEnd<EntryTransaction1, Optional<ReturnReasonInformation5>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "RtrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnInformation";
			definition = "Set of elements specifying the return information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReturnReasonInformation5.mmObject();
		}

		@Override
		public Optional<ReturnReasonInformation5> getValue(EntryTransaction1 obj) {
			return obj.getReturnInformation();
		}

		@Override
		public void setValue(EntryTransaction1 obj, Optional<ReturnReasonInformation5> value) {
			obj.setReturnInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActn")
	protected CorporateAction1 corporateAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateAction1
	 * CorporateAction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCorporateEvent
	 * Security.mmCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements identifying the underlying corporate action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, Optional<CorporateAction1>> mmCorporateAction = new MMMessageAssociationEnd<EntryTransaction1, Optional<CorporateAction1>>() {
		{
			businessElementTrace_lazy = () -> Security.mmCorporateEvent;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "CorpActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			definition = "Set of elements identifying the underlying corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateAction1.mmObject();
		}

		@Override
		public Optional<CorporateAction1> getValue(EntryTransaction1 obj) {
			return obj.getCorporateAction();
		}

		@Override
		public void setValue(EntryTransaction1 obj, Optional<CorporateAction1> value) {
			obj.setCorporateAction(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct")
	protected CashAccount7 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashAccount
	 * CashEntry.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Safekeeping or investment account. A safekeeping account is an account on which a securities entry is made. An investment account is an account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction1, Optional<CashAccount7>> mmSafekeepingAccount = new MMMessageAssociationEnd<EntryTransaction1, Optional<CashAccount7>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Safekeeping or investment account. A safekeeping account is an account on which a securities entry is made. An investment account is an account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount7.mmObject();
		}

		@Override
		public Optional<CashAccount7> getValue(EntryTransaction1 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(EntryTransaction1 obj, Optional<CashAccount7> value) {
			obj.setSafekeepingAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlTxInf")
	protected Max500Text additionalTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1
	 * EntryTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTxInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details on the transaction details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EntryTransaction1, Optional<Max500Text>> mmAdditionalTransactionInformation = new MMMessageAttribute<EntryTransaction1, Optional<Max500Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction1.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTransactionInformation";
			definition = "Further details on the transaction details.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		@Override
		public Optional<Max500Text> getValue(EntryTransaction1 obj) {
			return obj.getAdditionalTransactionInformation();
		}

		@Override
		public void setValue(EntryTransaction1 obj, Optional<Max500Text> value) {
			obj.setAdditionalTransactionInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntryTransaction1.mmReferences, com.tools20022.repository.msg.EntryTransaction1.mmAmountDetails,
						com.tools20022.repository.msg.EntryTransaction1.mmAvailability, com.tools20022.repository.msg.EntryTransaction1.mmBankTransactionCode, com.tools20022.repository.msg.EntryTransaction1.mmCharges,
						com.tools20022.repository.msg.EntryTransaction1.mmInterest, com.tools20022.repository.msg.EntryTransaction1.mmRelatedParties, com.tools20022.repository.msg.EntryTransaction1.mmRelatedAgents,
						com.tools20022.repository.msg.EntryTransaction1.mmPurpose, com.tools20022.repository.msg.EntryTransaction1.mmRelatedRemittanceInformation, com.tools20022.repository.msg.EntryTransaction1.mmRemittanceInformation,
						com.tools20022.repository.msg.EntryTransaction1.mmRelatedDates, com.tools20022.repository.msg.EntryTransaction1.mmRelatedPrice, com.tools20022.repository.msg.EntryTransaction1.mmRelatedQuantities,
						com.tools20022.repository.msg.EntryTransaction1.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.EntryTransaction1.mmTax, com.tools20022.repository.msg.EntryTransaction1.mmReturnInformation,
						com.tools20022.repository.msg.EntryTransaction1.mmCorporateAction, com.tools20022.repository.msg.EntryTransaction1.mmSafekeepingAccount,
						com.tools20022.repository.msg.EntryTransaction1.mmAdditionalTransactionInformation);
				trace_lazy = () -> Entry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EntryTransaction1";
				definition = "Posting to an account that results in an increase or decrease to a balance.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TransactionReferences1> getReferences() {
		return references == null ? Optional.empty() : Optional.of(references);
	}

	public EntryTransaction1 setReferences(TransactionReferences1 references) {
		this.references = references;
		return this;
	}

	public Optional<AmountAndCurrencyExchange2> getAmountDetails() {
		return amountDetails == null ? Optional.empty() : Optional.of(amountDetails);
	}

	public EntryTransaction1 setAmountDetails(AmountAndCurrencyExchange2 amountDetails) {
		this.amountDetails = amountDetails;
		return this;
	}

	public List<CashBalanceAvailability1> getAvailability() {
		return availability == null ? availability = new ArrayList<>() : availability;
	}

	public EntryTransaction1 setAvailability(List<CashBalanceAvailability1> availability) {
		this.availability = Objects.requireNonNull(availability);
		return this;
	}

	public Optional<BankTransactionCodeStructure1> getBankTransactionCode() {
		return bankTransactionCode == null ? Optional.empty() : Optional.of(bankTransactionCode);
	}

	public EntryTransaction1 setBankTransactionCode(BankTransactionCodeStructure1 bankTransactionCode) {
		this.bankTransactionCode = bankTransactionCode;
		return this;
	}

	public List<ChargesInformation3> getCharges() {
		return charges == null ? charges = new ArrayList<>() : charges;
	}

	public EntryTransaction1 setCharges(List<ChargesInformation3> charges) {
		this.charges = Objects.requireNonNull(charges);
		return this;
	}

	public List<TransactionInterest1> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public EntryTransaction1 setInterest(List<TransactionInterest1> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public Optional<TransactionParty1> getRelatedParties() {
		return relatedParties == null ? Optional.empty() : Optional.of(relatedParties);
	}

	public EntryTransaction1 setRelatedParties(TransactionParty1 relatedParties) {
		this.relatedParties = relatedParties;
		return this;
	}

	public Optional<TransactionAgents1> getRelatedAgents() {
		return relatedAgents == null ? Optional.empty() : Optional.of(relatedAgents);
	}

	public EntryTransaction1 setRelatedAgents(TransactionAgents1 relatedAgents) {
		this.relatedAgents = relatedAgents;
		return this;
	}

	public Optional<Purpose1Choice> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public EntryTransaction1 setPurpose(Purpose1Choice purpose) {
		this.purpose = purpose;
		return this;
	}

	public List<RemittanceLocation1> getRelatedRemittanceInformation() {
		return relatedRemittanceInformation == null ? relatedRemittanceInformation = new ArrayList<>() : relatedRemittanceInformation;
	}

	public EntryTransaction1 setRelatedRemittanceInformation(List<RemittanceLocation1> relatedRemittanceInformation) {
		this.relatedRemittanceInformation = Objects.requireNonNull(relatedRemittanceInformation);
		return this;
	}

	public Optional<RemittanceInformation1> getRemittanceInformation() {
		return remittanceInformation == null ? Optional.empty() : Optional.of(remittanceInformation);
	}

	public EntryTransaction1 setRemittanceInformation(RemittanceInformation1 remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
		return this;
	}

	public Optional<TransactionDates1> getRelatedDates() {
		return relatedDates == null ? Optional.empty() : Optional.of(relatedDates);
	}

	public EntryTransaction1 setRelatedDates(TransactionDates1 relatedDates) {
		this.relatedDates = relatedDates;
		return this;
	}

	public Optional<TransactionPrice1Choice> getRelatedPrice() {
		return relatedPrice == null ? Optional.empty() : Optional.of(relatedPrice);
	}

	public EntryTransaction1 setRelatedPrice(TransactionPrice1Choice relatedPrice) {
		this.relatedPrice = relatedPrice;
		return this;
	}

	public List<TransactionQuantities1Choice> getRelatedQuantities() {
		return relatedQuantities == null ? relatedQuantities = new ArrayList<>() : relatedQuantities;
	}

	public EntryTransaction1 setRelatedQuantities(List<TransactionQuantities1Choice> relatedQuantities) {
		this.relatedQuantities = Objects.requireNonNull(relatedQuantities);
		return this;
	}

	public Optional<SecurityIdentification4Choice> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? Optional.empty() : Optional.of(financialInstrumentIdentification);
	}

	public EntryTransaction1 setFinancialInstrumentIdentification(SecurityIdentification4Choice financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
		return this;
	}

	public Optional<TaxInformation2> getTax() {
		return tax == null ? Optional.empty() : Optional.of(tax);
	}

	public EntryTransaction1 setTax(TaxInformation2 tax) {
		this.tax = tax;
		return this;
	}

	public Optional<ReturnReasonInformation5> getReturnInformation() {
		return returnInformation == null ? Optional.empty() : Optional.of(returnInformation);
	}

	public EntryTransaction1 setReturnInformation(ReturnReasonInformation5 returnInformation) {
		this.returnInformation = returnInformation;
		return this;
	}

	public Optional<CorporateAction1> getCorporateAction() {
		return corporateAction == null ? Optional.empty() : Optional.of(corporateAction);
	}

	public EntryTransaction1 setCorporateAction(CorporateAction1 corporateAction) {
		this.corporateAction = corporateAction;
		return this;
	}

	public Optional<CashAccount7> getSafekeepingAccount() {
		return safekeepingAccount == null ? Optional.empty() : Optional.of(safekeepingAccount);
	}

	public EntryTransaction1 setSafekeepingAccount(CashAccount7 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
		return this;
	}

	public Optional<Max500Text> getAdditionalTransactionInformation() {
		return additionalTransactionInformation == null ? Optional.empty() : Optional.of(additionalTransactionInformation);
	}

	public EntryTransaction1 setAdditionalTransactionInformation(Max500Text additionalTransactionInformation) {
		this.additionalTransactionInformation = additionalTransactionInformation;
		return this;
	}
}