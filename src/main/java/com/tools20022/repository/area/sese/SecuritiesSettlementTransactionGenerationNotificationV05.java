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

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.choice.NumberCount1Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope An account servicer sends a
 * SecuritiesSettlementTransactionGenerationNotification to an account owner to
 * advise the account owner of a securities settlement transaction that has been
 * generated/created by the account servicer for the account owner. The reason
 * for creation can range from the automatic transformation of pending
 * settlement instructions following a corporate event to the recovery of an
 * account owner transactions' database initiated by its account servicer. The
 * account servicer/owner relationship may be: - a central securities depository
 * or another settlement market infrastructure acting on behalf of their
 * participants - an agent (sub-custodian) acting on behalf of their global
 * custodian customer, or - a custodian acting on behalf of an investment
 * management institution or a broker/dealer
 * 
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 * 
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.032.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmTransactionIdentificationDetails
 * SecuritiesSettlementTransactionGenerationNotificationV05.
 * mmTransactionIdentificationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmNumberCounts
 * SecuritiesSettlementTransactionGenerationNotificationV05.mmNumberCounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmLinkages
 * SecuritiesSettlementTransactionGenerationNotificationV05.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmTradeDetails
 * SecuritiesSettlementTransactionGenerationNotificationV05.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionGenerationNotificationV05.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionGenerationNotificationV05.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionGenerationNotificationV05.
 * mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmSettlementParameters
 * SecuritiesSettlementTransactionGenerationNotificationV05.
 * mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionGenerationNotificationV05.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionGenerationNotificationV05.
 * mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmCashParties
 * SecuritiesSettlementTransactionGenerationNotificationV05.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmSettlementAmount
 * SecuritiesSettlementTransactionGenerationNotificationV05.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmOtherAmounts
 * SecuritiesSettlementTransactionGenerationNotificationV05.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmOtherBusinessParties
 * SecuritiesSettlementTransactionGenerationNotificationV05.
 * mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmAdditionalPhysicalOrRegistrationDetails
 * SecuritiesSettlementTransactionGenerationNotificationV05.
 * mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmGeneratedReason
 * SecuritiesSettlementTransactionGenerationNotificationV05.mmGeneratedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmStatusAndReason
 * SecuritiesSettlementTransactionGenerationNotificationV05.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05#mmSupplementaryData
 * SecuritiesSettlementTransactionGenerationNotificationV05.mmSupplementaryData}
 * </li>
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
 * xmlTag} = "SctiesSttlmTxGnrtnNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionGenerationNotificationV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn account servicer sends a SecuritiesSettlementTransactionGenerationNotification to an account owner to advise the account owner of a securities settlement transaction that has been generated/created by the account servicer for the account owner. The reason for creation can range from the automatic transformation of pending settlement instructions following a corporate event to the recovery of an account owner transactions' database initiated by its account servicer.\nThe account servicer/owner relationship may be:\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\n- a custodian acting on behalf of an investment management institution or a broker/dealer\n\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountRule#for_sese_SecuritiesSettlementTransactionGenerationNotificationV05
 * ConstraintSettlementAmountRule.
 * for_sese_SecuritiesSettlementTransactionGenerationNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#for_sese_SecuritiesSettlementTransactionGenerationNotificationV05
 * ConstraintReceivingDepositoryAndParty1Rule.
 * for_sese_SecuritiesSettlementTransactionGenerationNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule#for_sese_SecuritiesSettlementTransactionGenerationNotificationV05
 * ConstraintAdditionalPhysicalOrRegistrationDetailsRule.
 * for_sese_SecuritiesSettlementTransactionGenerationNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Rule#for_sese_SecuritiesSettlementTransactionGenerationNotificationV05
 * ConstraintDeliveringDepositoryAndParty1Rule.
 * for_sese_SecuritiesSettlementTransactionGenerationNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToSellRule#for_sese_SecuritiesSettlementTransactionGenerationNotificationV05
 * ConstraintCurrencyToSellRule.
 * for_sese_SecuritiesSettlementTransactionGenerationNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyRule#for_sese_SecuritiesSettlementTransactionGenerationNotificationV05
 * ConstraintCurrencyToBuyRule.
 * for_sese_SecuritiesSettlementTransactionGenerationNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#for_sese_SecuritiesSettlementTransactionGenerationNotificationV05
 * ConstraintCoexistenceAmountRule.
 * for_sese_SecuritiesSettlementTransactionGenerationNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesSettlementTransactionGenerationNotificationV05
 * ConstraintCoexistenceCharacterSetXRule.
 * for_sese_SecuritiesSettlementTransactionGenerationNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_sese_SecuritiesSettlementTransactionGenerationNotificationV05
 * ConstraintCoexistenceIdentificationRule.
 * for_sese_SecuritiesSettlementTransactionGenerationNotificationV05}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06
 * SecuritiesSettlementTransactionGenerationNotificationV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04
 * SecuritiesSettlementTransactionGenerationNotificationV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSettlementTransactionGenerationNotificationV05", propOrder = {"transactionIdentificationDetails", "numberCounts", "linkages", "tradeDetails", "financialInstrumentIdentification", "financialInstrumentAttributes",
		"quantityAndAccountDetails", "settlementParameters", "deliveringSettlementParties", "receivingSettlementParties", "cashParties", "settlementAmount", "otherAmounts", "otherBusinessParties", "additionalPhysicalOrRegistrationDetails",
		"generatedReason", "statusAndReason", "supplementaryData"})
public class SecuritiesSettlementTransactionGenerationNotificationV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxIdDtls", required = true)
	protected SettlementTypeAndIdentification15 transactionIdentificationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15
	 * SettlementTypeAndIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides transaction type and identification information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmTransactionIdentificationDetails
	 * SecuritiesSettlementTransactionGenerationNotificationV06.
	 * mmTransactionIdentificationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmTransactionIdentificationDetails
	 * SecuritiesSettlementTransactionGenerationNotificationV04.
	 * mmTransactionIdentificationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, SettlementTypeAndIdentification15> mmTransactionIdentificationDetails = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, SettlementTypeAndIdentification15>() {
		{
			xmlTag = "TxIdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationDetails";
			definition = "Provides transaction type and identification information.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmTransactionIdentificationDetails);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmTransactionIdentificationDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementTypeAndIdentification15.mmObject();
		}

		@Override
		public SettlementTypeAndIdentification15 getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getTransactionIdentificationDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, SettlementTypeAndIdentification15 value) {
			obj.setTransactionIdentificationDetails(value);
		}
	};
	@XmlElement(name = "NbCounts")
	protected NumberCount1Choice numberCounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NumberCount1Choice
	 * NumberCount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbCounts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberCounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Count of the number of transactions linked."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmNumberCounts
	 * SecuritiesSettlementTransactionGenerationNotificationV06.mmNumberCounts}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmNumberCounts
	 * SecuritiesSettlementTransactionGenerationNotificationV04.mmNumberCounts}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<NumberCount1Choice>> mmNumberCounts = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<NumberCount1Choice>>() {
		{
			xmlTag = "NbCounts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberCounts";
			definition = "Count of the number of transactions linked.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmNumberCounts);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmNumberCounts;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NumberCount1Choice.mmObject();
		}

		@Override
		public Optional<NumberCount1Choice> getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getNumberCounts();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, Optional<NumberCount1Choice> value) {
			obj.setNumberCounts(value.orElse(null));
		}
	};
	@XmlElement(name = "Lnkgs")
	protected List<Linkages17> linkages;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Linkages17
	 * Linkages17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lnkgs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Link to another transaction that must be processed after, before or at the same time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmLinkages
	 * SecuritiesSettlementTransactionGenerationNotificationV06.mmLinkages}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmLinkages
	 * SecuritiesSettlementTransactionGenerationNotificationV04.mmLinkages}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, List<Linkages17>> mmLinkages = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, List<Linkages17>>() {
		{
			xmlTag = "Lnkgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Link to another transaction that must be processed after, before or at the same time.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmLinkages);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmLinkages;
			minOccurs = 0;
			complexType_lazy = () -> Linkages17.mmObject();
		}

		@Override
		public List<Linkages17> getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getLinkages();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, List<Linkages17> value) {
			obj.setLinkages(value);
		}
	};
	@XmlElement(name = "TradDtls", required = true)
	protected SecuritiesTradeDetails33 tradeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmTradeDetails
	 * SecuritiesSettlementTransactionGenerationNotificationV06.mmTradeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmTradeDetails
	 * SecuritiesSettlementTransactionGenerationNotificationV04.mmTradeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, SecuritiesTradeDetails33> mmTradeDetails = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, SecuritiesTradeDetails33>() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the trade.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmTradeDetails);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmTradeDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTradeDetails33.mmObject();
		}

		@Override
		public SecuritiesTradeDetails33 getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getTradeDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, SecuritiesTradeDetails33 value) {
			obj.setTradeDetails(value);
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmFinancialInstrumentIdentification
	 * SecuritiesSettlementTransactionGenerationNotificationV06.
	 * mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmFinancialInstrumentIdentification
	 * SecuritiesSettlementTransactionGenerationNotificationV04.
	 * mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, SecurityIdentification14> mmFinancialInstrumentIdentification = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, SecurityIdentification14>() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmFinancialInstrumentIdentification);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public SecurityIdentification14 getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, SecurityIdentification14 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes35 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35
	 * FinancialInstrumentAttributes35}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionGenerationNotificationV06.
	 * mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionGenerationNotificationV04.
	 * mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<FinancialInstrumentAttributes35>> mmFinancialInstrumentAttributes = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<FinancialInstrumentAttributes35>>() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmFinancialInstrumentAttributes);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmFinancialInstrumentAttributes;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes35.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes35> getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, Optional<FinancialInstrumentAttributes35> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyAndAcctDtls", required = true)
	protected List<QuantityAndAccount25> quantityAndAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25
	 * QuantityAndAccount25}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmQuantityAndAccountDetails
	 * SecuritiesSettlementTransactionGenerationNotificationV06.
	 * mmQuantityAndAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmQuantityAndAccountDetails
	 * SecuritiesSettlementTransactionGenerationNotificationV04.
	 * mmQuantityAndAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, List<QuantityAndAccount25>> mmQuantityAndAccountDetails = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, List<QuantityAndAccount25>>() {
		{
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmQuantityAndAccountDetails);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmQuantityAndAccountDetails;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAccount25.mmObject();
		}

		@Override
		public List<QuantityAndAccount25> getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getQuantityAndAccountDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, List<QuantityAndAccount25> value) {
			obj.setQuantityAndAccountDetails(value);
		}
	};
	@XmlElement(name = "SttlmParams", required = true)
	protected SettlementDetails67 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmSettlementParameters
	 * SecuritiesSettlementTransactionGenerationNotificationV06.
	 * mmSettlementParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmSettlementParameters
	 * SecuritiesSettlementTransactionGenerationNotificationV04.
	 * mmSettlementParameters}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, SettlementDetails67> mmSettlementParameters = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, SettlementDetails67>() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmSettlementParameters);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmSettlementParameters;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementDetails67.mmObject();
		}

		@Override
		public SettlementDetails67 getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getSettlementParameters();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, SettlementDetails67 value) {
			obj.setSettlementParameters(value);
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties11 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties11
	 * SettlementParties11}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmDeliveringSettlementParties
	 * SecuritiesSettlementTransactionGenerationNotificationV06.
	 * mmDeliveringSettlementParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmDeliveringSettlementParties
	 * SecuritiesSettlementTransactionGenerationNotificationV04.
	 * mmDeliveringSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<SettlementParties11>> mmDeliveringSettlementParties = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<SettlementParties11>>() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmDeliveringSettlementParties);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmDeliveringSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties11.mmObject();
		}

		@Override
		public Optional<SettlementParties11> getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, Optional<SettlementParties11> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties11 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties11
	 * SettlementParties11}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmReceivingSettlementParties
	 * SecuritiesSettlementTransactionGenerationNotificationV06.
	 * mmReceivingSettlementParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmReceivingSettlementParties
	 * SecuritiesSettlementTransactionGenerationNotificationV04.
	 * mmReceivingSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<SettlementParties11>> mmReceivingSettlementParties = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<SettlementParties11>>() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmReceivingSettlementParties);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmReceivingSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties11.mmObject();
		}

		@Override
		public Optional<SettlementParties11> getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, Optional<SettlementParties11> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties17 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashParties17
	 * CashParties17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmCashParties
	 * SecuritiesSettlementTransactionGenerationNotificationV06.mmCashParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmCashParties
	 * SecuritiesSettlementTransactionGenerationNotificationV04.mmCashParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<CashParties17>> mmCashParties = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<CashParties17>>() {
		{
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the transaction if different for the securities settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmCashParties);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmCashParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashParties17.mmObject();
		}

		@Override
		public Optional<CashParties17> getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getCashParties();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, Optional<CashParties17> value) {
			obj.setCashParties(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAmt")
	protected AmountAndDirection36 settlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36
	 * AmountAndDirection36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmSettlementAmount
	 * SecuritiesSettlementTransactionGenerationNotificationV06.
	 * mmSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmSettlementAmount
	 * SecuritiesSettlementTransactionGenerationNotificationV04.
	 * mmSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<AmountAndDirection36>> mmSettlementAmount = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<AmountAndDirection36>>() {
		{
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmSettlementAmount);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection36.mmObject();
		}

		@Override
		public Optional<AmountAndDirection36> getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, Optional<AmountAndDirection36> value) {
			obj.setSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrAmts")
	protected OtherAmounts14 otherAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherAmounts14
	 * OtherAmounts14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmOtherAmounts
	 * SecuritiesSettlementTransactionGenerationNotificationV06.mmOtherAmounts}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmOtherAmounts
	 * SecuritiesSettlementTransactionGenerationNotificationV04.mmOtherAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<OtherAmounts14>> mmOtherAmounts = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<OtherAmounts14>>() {
		{
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmOtherAmounts);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmOtherAmounts;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherAmounts14.mmObject();
		}

		@Override
		public Optional<OtherAmounts14> getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getOtherAmounts();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, Optional<OtherAmounts14> value) {
			obj.setOtherAmounts(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties19 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherParties19
	 * OtherParties19}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmOtherBusinessParties
	 * SecuritiesSettlementTransactionGenerationNotificationV06.
	 * mmOtherBusinessParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmOtherBusinessParties
	 * SecuritiesSettlementTransactionGenerationNotificationV04.
	 * mmOtherBusinessParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<OtherParties19>> mmOtherBusinessParties = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<OtherParties19>>() {
		{
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmOtherBusinessParties);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmOtherBusinessParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherParties19.mmObject();
		}

		@Override
		public Optional<OtherParties19> getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getOtherBusinessParties();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, Optional<OtherParties19> value) {
			obj.setOtherBusinessParties(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlPhysOrRegnDtls")
	protected RegistrationParameters1 additionalPhysicalOrRegistrationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1
	 * RegistrationParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPhysOrRegnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information required for the registration or physical settlement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionGenerationNotificationV06.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionGenerationNotificationV04.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<RegistrationParameters1>> mmAdditionalPhysicalOrRegistrationDetails = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<RegistrationParameters1>>() {
		{
			xmlTag = "AddtlPhysOrRegnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetails";
			definition = "Provides information required for the registration or physical settlement.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmAdditionalPhysicalOrRegistrationDetails);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmAdditionalPhysicalOrRegistrationDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegistrationParameters1.mmObject();
		}

		@Override
		public Optional<RegistrationParameters1> getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getAdditionalPhysicalOrRegistrationDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, Optional<RegistrationParameters1> value) {
			obj.setAdditionalPhysicalOrRegistrationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "GnrtdRsn")
	protected List<GeneratedReason3> generatedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GeneratedReason3
	 * GeneratedReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GnrtdRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneratedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the transaction was generated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmGeneratedReason
	 * SecuritiesSettlementTransactionGenerationNotificationV06.
	 * mmGeneratedReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmGeneratedReason
	 * SecuritiesSettlementTransactionGenerationNotificationV04.
	 * mmGeneratedReason}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, List<GeneratedReason3>> mmGeneratedReason = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, List<GeneratedReason3>>() {
		{
			xmlTag = "GnrtdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneratedReason";
			definition = "Specifies the reason why the transaction was generated.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmGeneratedReason);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmGeneratedReason;
			minOccurs = 0;
			complexType_lazy = () -> GeneratedReason3.mmObject();
		}

		@Override
		public List<GeneratedReason3> getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getGeneratedReason();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, List<GeneratedReason3> value) {
			obj.setGeneratedReason(value);
		}
	};
	@XmlElement(name = "StsAndRsn")
	protected StatusAndReason19 statusAndReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason19
	 * StatusAndReason19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsAndRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAndReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status and reason of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmStatusAndReason
	 * SecuritiesSettlementTransactionGenerationNotificationV06.
	 * mmStatusAndReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmStatusAndReason
	 * SecuritiesSettlementTransactionGenerationNotificationV04.
	 * mmStatusAndReason}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<StatusAndReason19>> mmStatusAndReason = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, Optional<StatusAndReason19>>() {
		{
			xmlTag = "StsAndRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReason";
			definition = "Status and reason of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmStatusAndReason);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmStatusAndReason;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatusAndReason19.mmObject();
		}

		@Override
		public Optional<StatusAndReason19> getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getStatusAndReason();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, Optional<StatusAndReason19> value) {
			obj.setStatusAndReason(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV06#mmSupplementaryData
	 * SecuritiesSettlementTransactionGenerationNotificationV06.
	 * mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV04#mmSupplementaryData
	 * SecuritiesSettlementTransactionGenerationNotificationV04.
	 * mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesSettlementTransactionGenerationNotificationV05, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmSupplementaryData);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionGenerationNotificationV05 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementAmountRule.for_sese_SecuritiesSettlementTransactionGenerationNotificationV05,
						com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.for_sese_SecuritiesSettlementTransactionGenerationNotificationV05,
						com.tools20022.repository.constraints.ConstraintAdditionalPhysicalOrRegistrationDetailsRule.for_sese_SecuritiesSettlementTransactionGenerationNotificationV05,
						com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Rule.for_sese_SecuritiesSettlementTransactionGenerationNotificationV05,
						com.tools20022.repository.constraints.ConstraintCurrencyToSellRule.for_sese_SecuritiesSettlementTransactionGenerationNotificationV05,
						com.tools20022.repository.constraints.ConstraintCurrencyToBuyRule.for_sese_SecuritiesSettlementTransactionGenerationNotificationV05,
						com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.for_sese_SecuritiesSettlementTransactionGenerationNotificationV05,
						com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesSettlementTransactionGenerationNotificationV05,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_sese_SecuritiesSettlementTransactionGenerationNotificationV05);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionGenerationNotificationV05";
				definition = "Scope\nAn account servicer sends a SecuritiesSettlementTransactionGenerationNotification to an account owner to advise the account owner of a securities settlement transaction that has been generated/created by the account servicer for the account owner. The reason for creation can range from the automatic transformation of pending settlement instructions following a corporate event to the recovery of an account owner transactions' database initiated by its account servicer.\nThe account servicer/owner relationship may be:\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\n- a custodian acting on behalf of an investment management institution or a broker/dealer\n\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV06.mmObject());
				previousVersion_lazy = () -> SecuritiesSettlementTransactionGenerationNotificationV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxGnrtnNtfctn";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmTransactionIdentificationDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmNumberCounts, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmLinkages,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmTradeDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmFinancialInstrumentIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmFinancialInstrumentAttributes,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmQuantityAndAccountDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmSettlementParameters,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmDeliveringSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmReceivingSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmCashParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmSettlementAmount,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmOtherAmounts,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmAdditionalPhysicalOrRegistrationDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmGeneratedReason,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmStatusAndReason,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "032";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionGenerationNotificationV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementTypeAndIdentification15 getTransactionIdentificationDetails() {
		return transactionIdentificationDetails;
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setTransactionIdentificationDetails(SettlementTypeAndIdentification15 transactionIdentificationDetails) {
		this.transactionIdentificationDetails = Objects.requireNonNull(transactionIdentificationDetails);
		return this;
	}

	public Optional<NumberCount1Choice> getNumberCounts() {
		return numberCounts == null ? Optional.empty() : Optional.of(numberCounts);
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setNumberCounts(NumberCount1Choice numberCounts) {
		this.numberCounts = numberCounts;
		return this;
	}

	public List<Linkages17> getLinkages() {
		return linkages == null ? linkages = new ArrayList<>() : linkages;
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setLinkages(List<Linkages17> linkages) {
		this.linkages = Objects.requireNonNull(linkages);
		return this;
	}

	public SecuritiesTradeDetails33 getTradeDetails() {
		return tradeDetails;
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setTradeDetails(SecuritiesTradeDetails33 tradeDetails) {
		this.tradeDetails = Objects.requireNonNull(tradeDetails);
		return this;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes35> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setFinancialInstrumentAttributes(FinancialInstrumentAttributes35 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public List<QuantityAndAccount25> getQuantityAndAccountDetails() {
		return quantityAndAccountDetails == null ? quantityAndAccountDetails = new ArrayList<>() : quantityAndAccountDetails;
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setQuantityAndAccountDetails(List<QuantityAndAccount25> quantityAndAccountDetails) {
		this.quantityAndAccountDetails = Objects.requireNonNull(quantityAndAccountDetails);
		return this;
	}

	public SettlementDetails67 getSettlementParameters() {
		return settlementParameters;
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setSettlementParameters(SettlementDetails67 settlementParameters) {
		this.settlementParameters = Objects.requireNonNull(settlementParameters);
		return this;
	}

	public Optional<SettlementParties11> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setDeliveringSettlementParties(SettlementParties11 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties11> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setReceivingSettlementParties(SettlementParties11 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<CashParties17> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setCashParties(CashParties17 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<AmountAndDirection36> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setSettlementAmount(AmountAndDirection36 settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<OtherAmounts14> getOtherAmounts() {
		return otherAmounts == null ? Optional.empty() : Optional.of(otherAmounts);
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setOtherAmounts(OtherAmounts14 otherAmounts) {
		this.otherAmounts = otherAmounts;
		return this;
	}

	public Optional<OtherParties19> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setOtherBusinessParties(OtherParties19 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public Optional<RegistrationParameters1> getAdditionalPhysicalOrRegistrationDetails() {
		return additionalPhysicalOrRegistrationDetails == null ? Optional.empty() : Optional.of(additionalPhysicalOrRegistrationDetails);
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setAdditionalPhysicalOrRegistrationDetails(RegistrationParameters1 additionalPhysicalOrRegistrationDetails) {
		this.additionalPhysicalOrRegistrationDetails = additionalPhysicalOrRegistrationDetails;
		return this;
	}

	public List<GeneratedReason3> getGeneratedReason() {
		return generatedReason == null ? generatedReason = new ArrayList<>() : generatedReason;
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setGeneratedReason(List<GeneratedReason3> generatedReason) {
		this.generatedReason = Objects.requireNonNull(generatedReason);
		return this;
	}

	public Optional<StatusAndReason19> getStatusAndReason() {
		return statusAndReason == null ? Optional.empty() : Optional.of(statusAndReason);
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setStatusAndReason(StatusAndReason19 statusAndReason) {
		this.statusAndReason = statusAndReason;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesSettlementTransactionGenerationNotificationV05 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.032.001.05")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxGnrtnNtfctn", required = true)
		public SecuritiesSettlementTransactionGenerationNotificationV05 messageBody;
	}
}