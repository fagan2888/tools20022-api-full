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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.choice.PartyIdentification10Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * SCOPE<br>
 * A securities financing transaction account servicer sends a
 * SecuritiesFinancingConfirmation to an account owner to confirm or advise of
 * the partial or full settlement of the opening or closing leg of a securities
 * financing transaction. <br>
 * The account servicer/owner relationship may be:<br>
 * - a central securities depository or another settlement market infrastructure
 * managing securities financing transactions on behalf of their participants<br>
 * - an agent (sub-custodian) managing securities financing transactions on
 * behalf of their global custodian customer, or <br>
 * - a custodian managing securities financing transactions on behalf of an
 * investment management institution or a broker/dealer.<br>
 * <br>
 * USAGE<br>
 * The message may also be used to: <br>
 * - re-send a message previously sent (the sub-function of the message is
 * Duplicate) <br>
 * - provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy) <br>
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate).<br>
 * <br>
 * ISO 15022 - 20022 COEXISTENCE<br>
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards
 * will coexist for a certain number of years. Until this coexistence period
 * ends, the usage of certain data types is restricted to ensure
 * interoperability between ISO 15022 and 20022 users. Compliance to these rules
 * is mandatory in a coexistence environment. The coexistence restrictions are
 * described in a Textual Rule linked to the Message Items they concern. These
 * coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.035.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmIdentification
 * SecuritiesFinancingConfirmationV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmTransactionIdentificationDetails
 * SecuritiesFinancingConfirmationV01.mmTransactionIdentificationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmAdditionalParameters
 * SecuritiesFinancingConfirmationV01.mmAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmTradeDetails
 * SecuritiesFinancingConfirmationV01.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmFinancialInstrumentIdentification
 * SecuritiesFinancingConfirmationV01.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmFinancialInstrumentAttributes
 * SecuritiesFinancingConfirmationV01.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmQuantityAndAccountDetails
 * SecuritiesFinancingConfirmationV01.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmSecuritiesFinancingDetails
 * SecuritiesFinancingConfirmationV01.mmSecuritiesFinancingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmStandingSettlementInstructionDetails
 * SecuritiesFinancingConfirmationV01.mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmSettlementParameters
 * SecuritiesFinancingConfirmationV01.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmDeliveringSettlementParties
 * SecuritiesFinancingConfirmationV01.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmReceivingSettlementParties
 * SecuritiesFinancingConfirmationV01.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmCashParties
 * SecuritiesFinancingConfirmationV01.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmSettledAmount
 * SecuritiesFinancingConfirmationV01.mmSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmOtherAmounts
 * SecuritiesFinancingConfirmationV01.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmOtherBusinessParties
 * SecuritiesFinancingConfirmationV01.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmMessageOriginator
 * SecuritiesFinancingConfirmationV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmMessageRecipient
 * SecuritiesFinancingConfirmationV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmExtension
 * SecuritiesFinancingConfirmationV01.mmExtension}</li>
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
 * xmlTag} = "SctiesFincgConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingConfirmationV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "SCOPE\r\nA securities financing transaction account servicer sends a SecuritiesFinancingConfirmation to an account owner to confirm or advise of the partial or full settlement of the opening or closing leg of a securities financing transaction. \r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure managing securities financing transactions on behalf of their participants\r\n- an agent (sub-custodian) managing securities financing transactions on behalf of their global custodian customer, or \r\n- a custodian managing securities financing transactions on behalf of an investment management institution or a broker/dealer.\r\n\r\nUSAGE\r\nThe message may also be used to: \r\r\n- re-send a message previously sent (the sub-function of the message is Duplicate) \r\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy) \r\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).\r\n\r\nISO 15022 - 20022 COEXISTENCE\r\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#for_sese_SecuritiesFinancingConfirmationV01
 * ConstraintCoexistenceAmountRule.for_sese_SecuritiesFinancingConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesFinancingConfirmationV01
 * ConstraintCoexistenceCharacterSetXRule.
 * for_sese_SecuritiesFinancingConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_sese_SecuritiesFinancingConfirmationV01
 * ConstraintCoexistenceIdentificationRule.
 * for_sese_SecuritiesFinancingConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBuyerSSIRule#for_sese_SecuritiesFinancingConfirmationV01
 * ConstraintBuyerSSIRule.for_sese_SecuritiesFinancingConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSIRule#for_sese_SecuritiesFinancingConfirmationV01
 * ConstraintSellerSSIRule.for_sese_SecuritiesFinancingConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Rule#for_sese_SecuritiesFinancingConfirmationV01
 * ConstraintDeliveringDepositoryAndParty1Rule.
 * for_sese_SecuritiesFinancingConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#for_sese_SecuritiesFinancingConfirmationV01
 * ConstraintReceivingDepositoryAndParty1Rule.
 * for_sese_SecuritiesFinancingConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettledAmountRule#for_sese_SecuritiesFinancingConfirmationV01
 * ConstraintSettledAmountRule.for_sese_SecuritiesFinancingConfirmationV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: MT 544-7, Seq A :23G:NEWM, Seq D present</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV02
 * SecuritiesFinancingConfirmationV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesFinancingConfirmationV01", propOrder = {"identification", "transactionIdentificationDetails", "additionalParameters", "tradeDetails", "financialInstrumentIdentification", "financialInstrumentAttributes",
		"quantityAndAccountDetails", "securitiesFinancingDetails", "standingSettlementInstructionDetails", "settlementParameters", "deliveringSettlementParties", "receivingSettlementParties", "cashParties", "settledAmount", "otherAmounts",
		"otherBusinessParties", "messageOriginator", "messageRecipient", "extension"})
public class SecuritiesFinancingConfirmationV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected DocumentIdentification11 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11
	 * DocumentIdentification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that unambiguously identifies a SecuritiesFinancingConfirmation message as known by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, DocumentIdentification11> mmIdentification = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, DocumentIdentification11>() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Information that unambiguously identifies a SecuritiesFinancingConfirmation message as known by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification11.mmObject();
		}

		@Override
		public DocumentIdentification11 getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, DocumentIdentification11 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "TxIdDtls", required = true)
	protected TransactionTypeAndAdditionalParameters3 transactionIdentificationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3
	 * TransactionTypeAndAdditionalParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing) and other parameters."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, TransactionTypeAndAdditionalParameters3> mmTransactionIdentificationDetails = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, TransactionTypeAndAdditionalParameters3>() {
		{
			xmlTag = "TxIdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationDetails";
			definition = "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing) and other parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionTypeAndAdditionalParameters3.mmObject();
		}

		@Override
		public TransactionTypeAndAdditionalParameters3 getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getTransactionIdentificationDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, TransactionTypeAndAdditionalParameters3 value) {
			obj.setTransactionIdentificationDetails(value);
		}
	};
	@XmlElement(name = "AddtlParams")
	protected AdditionalParameters2 additionalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters2
	 * AdditionalParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional parameters to the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<AdditionalParameters2>> mmAdditionalParameters = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<AdditionalParameters2>>() {
		{
			xmlTag = "AddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalParameters";
			definition = "Additional parameters to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalParameters2.mmObject();
		}

		@Override
		public Optional<AdditionalParameters2> getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getAdditionalParameters();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, Optional<AdditionalParameters2> value) {
			obj.setAdditionalParameters(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDtls", required = true)
	protected SecuritiesTradeDetails6 tradeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6
	 * SecuritiesTradeDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the securities financing deal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, SecuritiesTradeDetails6> mmTradeDetails = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, SecuritiesTradeDetails6>() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the securities financing deal.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTradeDetails6.mmObject();
		}

		@Override
		public SecuritiesTradeDetails6 getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getTradeDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, SecuritiesTradeDetails6 value) {
			obj.setTradeDetails(value);
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification11 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11
	 * SecurityIdentification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, SecurityIdentification11> mmFinancialInstrumentIdentification = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, SecurityIdentification11>() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification11.mmObject();
		}

		@Override
		public SecurityIdentification11 getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, SecurityIdentification11 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes8 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8
	 * FinancialInstrumentAttributes8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Elements characterising a financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<FinancialInstrumentAttributes8>> mmFinancialInstrumentAttributes = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<FinancialInstrumentAttributes8>>() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes8.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes8> getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, Optional<FinancialInstrumentAttributes8> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyAndAcctDtls", required = true)
	protected QuantityAndAccount6 quantityAndAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6
	 * QuantityAndAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyAndAcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityAndAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the account and quantity involved in the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, QuantityAndAccount6> mmQuantityAndAccountDetails = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, QuantityAndAccount6>() {
		{
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAccount6.mmObject();
		}

		@Override
		public QuantityAndAccount6 getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getQuantityAndAccountDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, QuantityAndAccount6 value) {
			obj.setQuantityAndAccountDetails(value);
		}
	};
	@XmlElement(name = "SctiesFincgDtls")
	protected SecuritiesFinancingTransactionDetails3 securitiesFinancingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3
	 * SecuritiesFinancingTransactionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the closing of the securities financing transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<SecuritiesFinancingTransactionDetails3>> mmSecuritiesFinancingDetails = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<SecuritiesFinancingTransactionDetails3>>() {
		{
			xmlTag = "SctiesFincgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingDetails";
			definition = "Details of the closing of the securities financing transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesFinancingTransactionDetails3.mmObject();
		}

		@Override
		public Optional<SecuritiesFinancingTransactionDetails3> getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getSecuritiesFinancingDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, Optional<SecuritiesFinancingTransactionDetails3> value) {
			obj.setSecuritiesFinancingDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "StgSttlmInstrDtls")
	protected StandingSettlementInstruction1 standingSettlementInstructionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction1
	 * StandingSettlementInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgSttlmInstrDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstructionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<StandingSettlementInstruction1>> mmStandingSettlementInstructionDetails = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<StandingSettlementInstruction1>>() {
		{
			xmlTag = "StgSttlmInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstructionDetails";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StandingSettlementInstruction1.mmObject();
		}

		@Override
		public Optional<StandingSettlementInstruction1> getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getStandingSettlementInstructionDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, Optional<StandingSettlementInstruction1> value) {
			obj.setStandingSettlementInstructionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmParams")
	protected SettlementDetails9 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9
	 * SettlementDetails9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<SettlementDetails9>> mmSettlementParameters = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<SettlementDetails9>>() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementDetails9.mmObject();
		}

		@Override
		public Optional<SettlementDetails9> getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getSettlementParameters();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, Optional<SettlementDetails9> value) {
			obj.setSettlementParameters(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties5 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties5
	 * SettlementParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of delivering settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<SettlementParties5>> mmDeliveringSettlementParties = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<SettlementParties5>>() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties5.mmObject();
		}

		@Override
		public Optional<SettlementParties5> getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, Optional<SettlementParties5> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties5 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties5
	 * SettlementParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of receiving settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<SettlementParties5>> mmReceivingSettlementParties = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<SettlementParties5>>() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties5.mmObject();
		}

		@Override
		public Optional<SettlementParties5> getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, Optional<SettlementParties5> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties3 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashParties3
	 * CashParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash parties involved in the transaction if different for the securities settlement parties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<CashParties3>> mmCashParties = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<CashParties3>>() {
		{
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the transaction if different for the securities settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashParties3.mmObject();
		}

		@Override
		public Optional<CashParties3> getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getCashParties();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, Optional<CashParties3> value) {
			obj.setCashParties(value.orElse(null));
		}
	};
	@XmlElement(name = "SttldAmt")
	protected AmountAndDirection2 settledAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2
	 * AmountAndDirection2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<AmountAndDirection2>> mmSettledAmount = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<AmountAndDirection2>>() {
		{
			xmlTag = "SttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledAmount";
			definition = "Amount effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection2.mmObject();
		}

		@Override
		public Optional<AmountAndDirection2> getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getSettledAmount();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, Optional<AmountAndDirection2> value) {
			obj.setSettledAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrAmts")
	protected OtherAmounts4 otherAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherAmounts4
	 * OtherAmounts4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAmts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other amounts than the settlement amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<OtherAmounts4>> mmOtherAmounts = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<OtherAmounts4>>() {
		{
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherAmounts4.mmObject();
		}

		@Override
		public Optional<OtherAmounts4> getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getOtherAmounts();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, Optional<OtherAmounts4> value) {
			obj.setOtherAmounts(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties2 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherParties2
	 * OtherParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other business parties relevant to the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<OtherParties2>> mmOtherBusinessParties = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<OtherParties2>>() {
		{
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherParties2.mmObject();
		}

		@Override
		public Optional<OtherParties2> getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getOtherBusinessParties();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, Optional<OtherParties2> value) {
			obj.setOtherBusinessParties(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgOrgtr")
	protected PartyIdentification10Choice messageOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgOrgtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that originated the message, if other than the sender."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<PartyIdentification10Choice>> mmMessageOriginator = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<PartyIdentification10Choice>>() {
		{
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification10Choice> getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getMessageOriginator();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, Optional<PartyIdentification10Choice> value) {
			obj.setMessageOriginator(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgRcpt")
	protected PartyIdentification10Choice messageRecipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRcpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageRecipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is the final destination of the message, if other than the receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<PartyIdentification10Choice>> mmMessageRecipient = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, Optional<PartyIdentification10Choice>>() {
		{
			xmlTag = "MsgRcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageRecipient";
			definition = "Party that is the final destination of the message, if other than the receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification10Choice> getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getMessageRecipient();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, Optional<PartyIdentification10Choice> value) {
			obj.setMessageRecipient(value.orElse(null));
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension2> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension2
	 * Extension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, List<Extension2>> mmExtension = new MMMessageBuildingBlock<SecuritiesFinancingConfirmationV01, List<Extension2>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension2.mmObject();
		}

		@Override
		public List<Extension2> getValue(SecuritiesFinancingConfirmationV01 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmationV01 obj, List<Extension2> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.for_sese_SecuritiesFinancingConfirmationV01,
						com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesFinancingConfirmationV01,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_sese_SecuritiesFinancingConfirmationV01,
						com.tools20022.repository.constraints.ConstraintBuyerSSIRule.for_sese_SecuritiesFinancingConfirmationV01, com.tools20022.repository.constraints.ConstraintSellerSSIRule.for_sese_SecuritiesFinancingConfirmationV01,
						com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Rule.for_sese_SecuritiesFinancingConfirmationV01,
						com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.for_sese_SecuritiesFinancingConfirmationV01,
						com.tools20022.repository.constraints.ConstraintSettledAmountRule.for_sese_SecuritiesFinancingConfirmationV01);
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "MT 544-7, Seq A :23G:NEWM, Seq D present"));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingConfirmationV01";
				definition = "SCOPE\r\nA securities financing transaction account servicer sends a SecuritiesFinancingConfirmation to an account owner to confirm or advise of the partial or full settlement of the opening or closing leg of a securities financing transaction. \r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure managing securities financing transactions on behalf of their participants\r\n- an agent (sub-custodian) managing securities financing transactions on behalf of their global custodian customer, or \r\n- a custodian managing securities financing transactions on behalf of an investment management institution or a broker/dealer.\r\n\r\nUSAGE\r\nThe message may also be used to: \r\r\n- re-send a message previously sent (the sub-function of the message is Duplicate) \r\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy) \r\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).\r\n\r\nISO 15022 - 20022 COEXISTENCE\r\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesFincgConf";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmIdentification,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmTransactionIdentificationDetails, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmAdditionalParameters,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmTradeDetails, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmFinancialInstrumentIdentification,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmFinancialInstrumentAttributes, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmQuantityAndAccountDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmSecuritiesFinancingDetails, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmStandingSettlementInstructionDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmSettlementParameters, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmDeliveringSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmReceivingSettlementParties, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmCashParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmSettledAmount, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmOtherAmounts,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmOtherBusinessParties, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmMessageOriginator,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmMessageRecipient, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "035";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesFinancingConfirmationV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification11 getIdentification() {
		return identification;
	}

	public SecuritiesFinancingConfirmationV01 setIdentification(DocumentIdentification11 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public TransactionTypeAndAdditionalParameters3 getTransactionIdentificationDetails() {
		return transactionIdentificationDetails;
	}

	public SecuritiesFinancingConfirmationV01 setTransactionIdentificationDetails(TransactionTypeAndAdditionalParameters3 transactionIdentificationDetails) {
		this.transactionIdentificationDetails = Objects.requireNonNull(transactionIdentificationDetails);
		return this;
	}

	public Optional<AdditionalParameters2> getAdditionalParameters() {
		return additionalParameters == null ? Optional.empty() : Optional.of(additionalParameters);
	}

	public SecuritiesFinancingConfirmationV01 setAdditionalParameters(AdditionalParameters2 additionalParameters) {
		this.additionalParameters = additionalParameters;
		return this;
	}

	public SecuritiesTradeDetails6 getTradeDetails() {
		return tradeDetails;
	}

	public SecuritiesFinancingConfirmationV01 setTradeDetails(SecuritiesTradeDetails6 tradeDetails) {
		this.tradeDetails = Objects.requireNonNull(tradeDetails);
		return this;
	}

	public SecurityIdentification11 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesFinancingConfirmationV01 setFinancialInstrumentIdentification(SecurityIdentification11 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes8> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public SecuritiesFinancingConfirmationV01 setFinancialInstrumentAttributes(FinancialInstrumentAttributes8 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public QuantityAndAccount6 getQuantityAndAccountDetails() {
		return quantityAndAccountDetails;
	}

	public SecuritiesFinancingConfirmationV01 setQuantityAndAccountDetails(QuantityAndAccount6 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = Objects.requireNonNull(quantityAndAccountDetails);
		return this;
	}

	public Optional<SecuritiesFinancingTransactionDetails3> getSecuritiesFinancingDetails() {
		return securitiesFinancingDetails == null ? Optional.empty() : Optional.of(securitiesFinancingDetails);
	}

	public SecuritiesFinancingConfirmationV01 setSecuritiesFinancingDetails(SecuritiesFinancingTransactionDetails3 securitiesFinancingDetails) {
		this.securitiesFinancingDetails = securitiesFinancingDetails;
		return this;
	}

	public Optional<StandingSettlementInstruction1> getStandingSettlementInstructionDetails() {
		return standingSettlementInstructionDetails == null ? Optional.empty() : Optional.of(standingSettlementInstructionDetails);
	}

	public SecuritiesFinancingConfirmationV01 setStandingSettlementInstructionDetails(StandingSettlementInstruction1 standingSettlementInstructionDetails) {
		this.standingSettlementInstructionDetails = standingSettlementInstructionDetails;
		return this;
	}

	public Optional<SettlementDetails9> getSettlementParameters() {
		return settlementParameters == null ? Optional.empty() : Optional.of(settlementParameters);
	}

	public SecuritiesFinancingConfirmationV01 setSettlementParameters(SettlementDetails9 settlementParameters) {
		this.settlementParameters = settlementParameters;
		return this;
	}

	public Optional<SettlementParties5> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesFinancingConfirmationV01 setDeliveringSettlementParties(SettlementParties5 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties5> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesFinancingConfirmationV01 setReceivingSettlementParties(SettlementParties5 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<CashParties3> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public SecuritiesFinancingConfirmationV01 setCashParties(CashParties3 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<AmountAndDirection2> getSettledAmount() {
		return settledAmount == null ? Optional.empty() : Optional.of(settledAmount);
	}

	public SecuritiesFinancingConfirmationV01 setSettledAmount(AmountAndDirection2 settledAmount) {
		this.settledAmount = settledAmount;
		return this;
	}

	public Optional<OtherAmounts4> getOtherAmounts() {
		return otherAmounts == null ? Optional.empty() : Optional.of(otherAmounts);
	}

	public SecuritiesFinancingConfirmationV01 setOtherAmounts(OtherAmounts4 otherAmounts) {
		this.otherAmounts = otherAmounts;
		return this;
	}

	public Optional<OtherParties2> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public SecuritiesFinancingConfirmationV01 setOtherBusinessParties(OtherParties2 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public Optional<PartyIdentification10Choice> getMessageOriginator() {
		return messageOriginator == null ? Optional.empty() : Optional.of(messageOriginator);
	}

	public SecuritiesFinancingConfirmationV01 setMessageOriginator(PartyIdentification10Choice messageOriginator) {
		this.messageOriginator = messageOriginator;
		return this;
	}

	public Optional<PartyIdentification10Choice> getMessageRecipient() {
		return messageRecipient == null ? Optional.empty() : Optional.of(messageRecipient);
	}

	public SecuritiesFinancingConfirmationV01 setMessageRecipient(PartyIdentification10Choice messageRecipient) {
		this.messageRecipient = messageRecipient;
		return this;
	}

	public List<Extension2> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public SecuritiesFinancingConfirmationV01 setExtension(List<Extension2> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.035.001.01")
	static public class Document {
		@XmlElement(name = "SctiesFincgConf", required = true)
		public SecuritiesFinancingConfirmationV01 messageBody;
	}
}