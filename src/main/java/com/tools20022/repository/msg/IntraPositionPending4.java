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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CorporateActionEventType29Choice;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.PriorityNumeric4Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the details of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmStatusAndReason
 * IntraPositionPending4.mmStatusAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmAccountOwnerTransactionIdentification
 * IntraPositionPending4.mmAccountOwnerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmAccountServicerTransactionIdentification
 * IntraPositionPending4.mmAccountServicerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmMarketInfrastructureTransactionIdentification
 * IntraPositionPending4.mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmProcessorTransactionIdentification
 * IntraPositionPending4.mmProcessorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmCorporateActionEventIdentification
 * IntraPositionPending4.mmCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmPoolIdentification
 * IntraPositionPending4.mmPoolIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmBalanceFrom
 * IntraPositionPending4.mmBalanceFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmBalanceTo
 * IntraPositionPending4.mmBalanceTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmFinancialInstrumentIdentification
 * IntraPositionPending4.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmFinancialInstrumentAttributes
 * IntraPositionPending4.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmSettlementQuantity
 * IntraPositionPending4.mmSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmIntendedSettlementDate
 * IntraPositionPending4.mmIntendedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmStatusDate
 * IntraPositionPending4.mmStatusDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmLinkages
 * IntraPositionPending4.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmSecuritiesSubBalanceIdentification
 * IntraPositionPending4.mmSecuritiesSubBalanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmPriority
 * IntraPositionPending4.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmCorporateActionEventType
 * IntraPositionPending4.mmCorporateActionEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmMessageOriginator
 * IntraPositionPending4.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmCreationDateTime
 * IntraPositionPending4.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmInstructionProcessingAdditionalDetails
 * IntraPositionPending4.mmInstructionProcessingAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4#mmSupplementaryData
 * IntraPositionPending4.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraPositionPending4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the details of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule#forIntraPositionPending4
 * ConstraintNoAccountOwnerTransactionIdentificationRule.
 * forIntraPositionPending4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionPending6
 * IntraPositionPending6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2
 * IntraPositionPending2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraPositionPending4", propOrder = {"statusAndReason", "accountOwnerTransactionIdentification", "accountServicerTransactionIdentification", "marketInfrastructureTransactionIdentification",
		"processorTransactionIdentification", "corporateActionEventIdentification", "poolIdentification", "balanceFrom", "balanceTo", "financialInstrumentIdentification", "financialInstrumentAttributes", "settlementQuantity",
		"intendedSettlementDate", "statusDate", "linkages", "securitiesSubBalanceIdentification", "priority", "corporateActionEventType", "messageOriginator", "creationDateTime", "instructionProcessingAdditionalDetails",
		"supplementaryData"})
public class IntraPositionPending4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StsAndRsn")
	protected PendingStatusAndReason2 statusAndReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PendingStatusAndReason2
	 * PendingStatusAndReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsAndRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAndReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status and status reason of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:STAT [and 16R:REAS]</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmStatusAndReason
	 * IntraPositionPending6.mmStatusAndReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmStatusAndReason
	 * IntraPositionPending2.mmStatusAndReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionPending4, Optional<PendingStatusAndReason2>> mmStatusAndReason = new MMMessageAssociationEnd<IntraPositionPending4, Optional<PendingStatusAndReason2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "StsAndRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:STAT [and 16R:REAS]"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAndReason";
			definition = "Status and status reason of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmStatusAndReason);
			previousVersion_lazy = () -> IntraPositionPending2.mmStatusAndReason;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PendingStatusAndReason2.mmObject();
		}

		@Override
		public Optional<PendingStatusAndReason2> getValue(IntraPositionPending4 obj) {
			return obj.getStatusAndReason();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, Optional<PendingStatusAndReason2> value) {
			obj.setStatusAndReason(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnrTxId", required = true)
	protected Max35Text accountOwnerTransactionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrTxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmAccountOwnerTransactionIdentification
	 * IntraPositionPending6.mmAccountOwnerTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmAccountOwnerTransactionIdentification
	 * IntraPositionPending2.mmAccountOwnerTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionPending4, Max35Text> mmAccountOwnerTransactionIdentification = new MMMessageAttribute<IntraPositionPending4, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account).";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmAccountOwnerTransactionIdentification);
			previousVersion_lazy = () -> IntraPositionPending2.mmAccountOwnerTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IntraPositionPending4 obj) {
			return obj.getAccountOwnerTransactionIdentification();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, Max35Text value) {
			obj.setAccountOwnerTransactionIdentification(value);
		}
	};
	@XmlElement(name = "AcctSvcrTxId")
	protected Max35Text accountServicerTransactionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrTxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::ASRF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmAccountServicerTransactionIdentification
	 * IntraPositionPending6.mmAccountServicerTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmAccountServicerTransactionIdentification
	 * IntraPositionPending2.mmAccountServicerTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionPending4, Optional<Max35Text>> mmAccountServicerTransactionIdentification = new MMMessageAttribute<IntraPositionPending4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::ASRF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmAccountServicerTransactionIdentification);
			previousVersion_lazy = () -> IntraPositionPending2.mmAccountServicerTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraPositionPending4 obj) {
			return obj.getAccountServicerTransactionIdentification();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, Optional<Max35Text> value) {
			obj.setAccountServicerTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MktInfrstrctrTxId")
	protected Max35Text marketInfrastructureTransactionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktInfrstrctrTxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketInfrastructureTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::MITI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmMarketInfrastructureTransactionIdentification
	 * IntraPositionPending6.mmMarketInfrastructureTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmMarketInfrastructureTransactionIdentification
	 * IntraPositionPending2.mmMarketInfrastructureTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionPending4, Optional<Max35Text>> mmMarketInfrastructureTransactionIdentification = new MMMessageAttribute<IntraPositionPending4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "MktInfrstrctrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::MITI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketInfrastructureTransactionIdentification";
			definition = "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmMarketInfrastructureTransactionIdentification);
			previousVersion_lazy = () -> IntraPositionPending2.mmMarketInfrastructureTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraPositionPending4 obj) {
			return obj.getMarketInfrastructureTransactionIdentification();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, Optional<Max35Text> value) {
			obj.setMarketInfrastructureTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcrTxId")
	protected Max35Text processorTransactionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcrTxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessorTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction as assigned by the processor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmProcessorTransactionIdentification
	 * IntraPositionPending6.mmProcessorTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmProcessorTransactionIdentification
	 * IntraPositionPending2.mmProcessorTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionPending4, Optional<Max35Text>> mmProcessorTransactionIdentification = new MMMessageAttribute<IntraPositionPending4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "PrcrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessorTransactionIdentification";
			definition = "Identification of the transaction as assigned by the processor.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmProcessorTransactionIdentification);
			previousVersion_lazy = () -> IntraPositionPending2.mmProcessorTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraPositionPending4 obj) {
			return obj.getProcessorTransactionIdentification();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, Optional<Max35Text> value) {
			obj.setProcessorTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnEvtId")
	protected Max35Text corporateActionEventIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by the account servicer to unambiguously identify a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::CORP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmCorporateActionEventIdentification
	 * IntraPositionPending6.mmCorporateActionEventIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmCorporateActionEventIdentification
	 * IntraPositionPending2.mmCorporateActionEventIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionPending4, Optional<Max35Text>> mmCorporateActionEventIdentification = new MMMessageAttribute<IntraPositionPending4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::CORP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventIdentification";
			definition = "Identification assigned by the account servicer to unambiguously identify a corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmCorporateActionEventIdentification);
			previousVersion_lazy = () -> IntraPositionPending2.mmCorporateActionEventIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraPositionPending4 obj) {
			return obj.getCorporateActionEventIdentification();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, Optional<Max35Text> value) {
			obj.setCorporateActionEventIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PoolId")
	protected Max35Text poolIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::POOL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmPoolIdentification
	 * IntraPositionPending6.mmPoolIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmPoolIdentification
	 * IntraPositionPending2.mmPoolIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionPending4, Optional<Max35Text>> mmPoolIdentification = new MMMessageAttribute<IntraPositionPending4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "PoolId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::POOL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolIdentification";
			definition = "Collective reference identifying a set of messages.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmPoolIdentification);
			previousVersion_lazy = () -> IntraPositionPending2.mmPoolIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IntraPositionPending4 obj) {
			return obj.getPoolIdentification();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, Optional<Max35Text> value) {
			obj.setPoolIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "BalFr", required = true)
	protected SecuritiesSubBalanceTypeAndQuantityBreakdown3 balanceFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance from which the securities are moving."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93A::FROM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmBalanceFrom
	 * IntraPositionPending6.mmBalanceFrom}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmBalanceFrom
	 * IntraPositionPending2.mmBalanceFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionPending4, SecuritiesSubBalanceTypeAndQuantityBreakdown3> mmBalanceFrom = new MMMessageAssociationEnd<IntraPositionPending4, SecuritiesSubBalanceTypeAndQuantityBreakdown3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "BalFr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::FROM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFrom";
			definition = "Balance from which the securities are moving.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmBalanceFrom);
			previousVersion_lazy = () -> IntraPositionPending2.mmBalanceFrom;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesSubBalanceTypeAndQuantityBreakdown3.mmObject();
		}

		@Override
		public SecuritiesSubBalanceTypeAndQuantityBreakdown3 getValue(IntraPositionPending4 obj) {
			return obj.getBalanceFrom();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, SecuritiesSubBalanceTypeAndQuantityBreakdown3 value) {
			obj.setBalanceFrom(value);
		}
	};
	@XmlElement(name = "BalTo", required = true)
	protected SecuritiesSubBalanceTypeAndQuantityBreakdown3 balanceTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance to which the securities are moving."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93A::TOBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmBalanceTo
	 * IntraPositionPending6.mmBalanceTo}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmBalanceTo
	 * IntraPositionPending2.mmBalanceTo}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionPending4, SecuritiesSubBalanceTypeAndQuantityBreakdown3> mmBalanceTo = new MMMessageAssociationEnd<IntraPositionPending4, SecuritiesSubBalanceTypeAndQuantityBreakdown3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "BalTo";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::TOBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTo";
			definition = "Balance to which the securities are moving.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmBalanceTo);
			previousVersion_lazy = () -> IntraPositionPending2.mmBalanceTo;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesSubBalanceTypeAndQuantityBreakdown3.mmObject();
		}

		@Override
		public SecuritiesSubBalanceTypeAndQuantityBreakdown3 getValue(IntraPositionPending4 obj) {
			return obj.getBalanceTo();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, SecuritiesSubBalanceTypeAndQuantityBreakdown3 value) {
			obj.setBalanceTo(value);
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :35B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmFinancialInstrumentIdentification
	 * IntraPositionPending6.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmFinancialInstrumentIdentification
	 * IntraPositionPending2.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionPending4, SecurityIdentification19> mmFinancialInstrumentIdentification = new MMMessageAttribute<IntraPositionPending4, SecurityIdentification19>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmFinancialInstrumentIdentification);
			previousVersion_lazy = () -> IntraPositionPending2.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public SecurityIdentification19 getValue(IntraPositionPending4 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, SecurityIdentification19 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes63 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63
	 * FinancialInstrumentAttributes63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmFinancialInstrumentAttributes
	 * IntraPositionPending6.mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmFinancialInstrumentAttributes
	 * IntraPositionPending2.mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionPending4, Optional<FinancialInstrumentAttributes63>> mmFinancialInstrumentAttributes = new MMMessageAssociationEnd<IntraPositionPending4, Optional<FinancialInstrumentAttributes63>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmFinancialInstrumentAttributes);
			previousVersion_lazy = () -> IntraPositionPending2.mmFinancialInstrumentAttributes;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes63.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes63> getValue(IntraPositionPending4 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, Optional<FinancialInstrumentAttributes63> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmQty", required = true)
	protected FinancialInstrumentQuantity1Choice settlementQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities to be settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmSettlementQuantity
	 * IntraPositionPending6.mmSettlementQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmSettlementQuantity
	 * IntraPositionPending2.mmSettlementQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionPending4, FinancialInstrumentQuantity1Choice> mmSettlementQuantity = new MMMessageAssociationEnd<IntraPositionPending4, FinancialInstrumentQuantity1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "SttlmQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementQuantity";
			definition = "Total quantity of securities to be settled.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmSettlementQuantity);
			previousVersion_lazy = () -> IntraPositionPending2.mmSettlementQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity1Choice getValue(IntraPositionPending4 obj) {
			return obj.getSettlementQuantity();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, FinancialInstrumentQuantity1Choice value) {
			obj.setSettlementQuantity(value);
		}
	};
	@XmlElement(name = "IntnddSttlmDt", required = true)
	protected DateAndDateTimeChoice intendedSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntnddSttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntendedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are intended to be moved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmIntendedSettlementDate
	 * IntraPositionPending6.mmIntendedSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmIntendedSettlementDate
	 * IntraPositionPending2.mmIntendedSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionPending4, DateAndDateTimeChoice> mmIntendedSettlementDate = new MMMessageAttribute<IntraPositionPending4, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "IntnddSttlmDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntendedSettlementDate";
			definition = "Date and time at which the securities are intended to be moved.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmIntendedSettlementDate);
			previousVersion_lazy = () -> IntraPositionPending2.mmIntendedSettlementDate;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(IntraPositionPending4 obj) {
			return obj.getIntendedSettlementDate();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, DateAndDateTimeChoice value) {
			obj.setIntendedSettlementDate(value);
		}
	};
	@XmlElement(name = "StsDt")
	protected ISODateTime statusDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the status was assigned."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmStatusDate
	 * IntraPositionPending6.mmStatusDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmStatusDate
	 * IntraPositionPending2.mmStatusDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionPending4, Optional<ISODateTime>> mmStatusDate = new MMMessageAttribute<IntraPositionPending4, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "StsDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDate";
			definition = "Date and time at which the status was assigned.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmStatusDate);
			previousVersion_lazy = () -> IntraPositionPending2.mmStatusDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(IntraPositionPending4 obj) {
			return obj.getStatusDate();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, Optional<ISODateTime> value) {
			obj.setStatusDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Lnkgs")
	protected List<Linkages51> linkages;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Linkages51
	 * Linkages51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmLinkages
	 * IntraPositionPending6.mmLinkages}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmLinkages
	 * IntraPositionPending2.mmLinkages}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionPending4, List<Linkages51>> mmLinkages = new MMMessageAttribute<IntraPositionPending4, List<Linkages51>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "Lnkgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Link to another transaction that must be processed after, before or at the same time.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmLinkages);
			previousVersion_lazy = () -> IntraPositionPending2.mmLinkages;
			minOccurs = 0;
			complexType_lazy = () -> Linkages51.mmObject();
		}

		@Override
		public List<Linkages51> getValue(IntraPositionPending4 obj) {
			return obj.getLinkages();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, List<Linkages51> value) {
			obj.setLinkages(value);
		}
	};
	@XmlElement(name = "SctiesSubBalId")
	protected GenericIdentification37 securitiesSubBalanceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification37
	 * GenericIdentification37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSubBalId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSubBalanceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number identifying a lot constituting the sub-balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmSecuritiesSubBalanceIdentification
	 * IntraPositionPending6.mmSecuritiesSubBalanceIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmSecuritiesSubBalanceIdentification
	 * IntraPositionPending2.mmSecuritiesSubBalanceIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionPending4, Optional<GenericIdentification37>> mmSecuritiesSubBalanceIdentification = new MMMessageAssociationEnd<IntraPositionPending4, Optional<GenericIdentification37>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "SctiesSubBalId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSubBalanceIdentification";
			definition = "Number identifying a lot constituting the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmSecuritiesSubBalanceIdentification);
			previousVersion_lazy = () -> IntraPositionPending2.mmSecuritiesSubBalanceIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification37.mmObject();
		}

		@Override
		public Optional<GenericIdentification37> getValue(IntraPositionPending4 obj) {
			return obj.getSecuritiesSubBalanceIdentification();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, Optional<GenericIdentification37> value) {
			obj.setSecuritiesSubBalanceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Prty")
	protected PriorityNumeric4Choice priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric4Choice
	 * PriorityNumeric4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is to be executed with a high priority."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmPriority
	 * IntraPositionPending6.mmPriority}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmPriority
	 * IntraPositionPending2.mmPriority}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionPending4, Optional<PriorityNumeric4Choice>> mmPriority = new MMMessageAttribute<IntraPositionPending4, Optional<PriorityNumeric4Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmPriority);
			previousVersion_lazy = () -> IntraPositionPending2.mmPriority;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriorityNumeric4Choice.mmObject();
		}

		@Override
		public Optional<PriorityNumeric4Choice> getValue(IntraPositionPending4 obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, Optional<PriorityNumeric4Choice> value) {
			obj.setPriority(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnEvtTp")
	protected CorporateActionEventType29Choice corporateActionEventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType29Choice
	 * CorporateActionEventType29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of corporate event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmCorporateActionEventType
	 * IntraPositionPending6.mmCorporateActionEventType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmCorporateActionEventType
	 * IntraPositionPending2.mmCorporateActionEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionPending4, Optional<CorporateActionEventType29Choice>> mmCorporateActionEventType = new MMMessageAttribute<IntraPositionPending4, Optional<CorporateActionEventType29Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventType";
			definition = "Specifies the type of corporate event.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmCorporateActionEventType);
			previousVersion_lazy = () -> IntraPositionPending2.mmCorporateActionEventType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventType29Choice.mmObject();
		}

		@Override
		public Optional<CorporateActionEventType29Choice> getValue(IntraPositionPending4 obj) {
			return obj.getCorporateActionEventType();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, Optional<CorporateActionEventType29Choice> value) {
			obj.setCorporateActionEventType(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgOrgtr")
	protected SystemPartyIdentification6 messageOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification6
	 * SystemPartyIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmMessageOriginator
	 * IntraPositionPending6.mmMessageOriginator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmMessageOriginator
	 * IntraPositionPending2.mmMessageOriginator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionPending4, Optional<SystemPartyIdentification6>> mmMessageOriginator = new MMMessageAssociationEnd<IntraPositionPending4, Optional<SystemPartyIdentification6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmMessageOriginator);
			previousVersion_lazy = () -> IntraPositionPending2.mmMessageOriginator;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification6.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification6> getValue(IntraPositionPending4 obj) {
			return obj.getMessageOriginator();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, Optional<SystemPartyIdentification6> value) {
			obj.setMessageOriginator(value.orElse(null));
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the creation date/time of the intra-position movement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::TRAD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmCreationDateTime
	 * IntraPositionPending6.mmCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmCreationDateTime
	 * IntraPositionPending2.mmCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionPending4, ISODateTime> mmCreationDateTime = new MMMessageAttribute<IntraPositionPending4, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Specifies the creation date/time of the intra-position movement.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmCreationDateTime);
			previousVersion_lazy = () -> IntraPositionPending2.mmCreationDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(IntraPositionPending4 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "InstrPrcgAddtlDtls")
	protected Max350Text instructionProcessingAdditionalDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrcgAddtlDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional settlement processing information which can not be included within the structured fields of the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::SPRO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmInstructionProcessingAdditionalDetails
	 * IntraPositionPending6.mmInstructionProcessingAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmInstructionProcessingAdditionalDetails
	 * IntraPositionPending2.mmInstructionProcessingAdditionalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionPending4, Optional<Max350Text>> mmInstructionProcessingAdditionalDetails = new MMMessageAttribute<IntraPositionPending4, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "InstrPrcgAddtlDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::SPRO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessingAdditionalDetails";
			definition = "Provides additional settlement processing information which can not be included within the structured fields of the message.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmInstructionProcessingAdditionalDetails);
			previousVersion_lazy = () -> IntraPositionPending2.mmInstructionProcessingAdditionalDetails;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(IntraPositionPending4 obj) {
			return obj.getInstructionProcessingAdditionalDetails();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, Optional<Max350Text> value) {
			obj.setInstructionProcessingAdditionalDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending4
	 * IntraPositionPending4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending6#mmSupplementaryData
	 * IntraPositionPending6.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionPending2#mmSupplementaryData
	 * IntraPositionPending2.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionPending4, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<IntraPositionPending4, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionPending4.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmSupplementaryData);
			previousVersion_lazy = () -> IntraPositionPending2.mmSupplementaryData;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(IntraPositionPending4 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(IntraPositionPending4 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraPositionPending4.mmStatusAndReason, com.tools20022.repository.msg.IntraPositionPending4.mmAccountOwnerTransactionIdentification,
						com.tools20022.repository.msg.IntraPositionPending4.mmAccountServicerTransactionIdentification, com.tools20022.repository.msg.IntraPositionPending4.mmMarketInfrastructureTransactionIdentification,
						com.tools20022.repository.msg.IntraPositionPending4.mmProcessorTransactionIdentification, com.tools20022.repository.msg.IntraPositionPending4.mmCorporateActionEventIdentification,
						com.tools20022.repository.msg.IntraPositionPending4.mmPoolIdentification, com.tools20022.repository.msg.IntraPositionPending4.mmBalanceFrom, com.tools20022.repository.msg.IntraPositionPending4.mmBalanceTo,
						com.tools20022.repository.msg.IntraPositionPending4.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.IntraPositionPending4.mmFinancialInstrumentAttributes,
						com.tools20022.repository.msg.IntraPositionPending4.mmSettlementQuantity, com.tools20022.repository.msg.IntraPositionPending4.mmIntendedSettlementDate,
						com.tools20022.repository.msg.IntraPositionPending4.mmStatusDate, com.tools20022.repository.msg.IntraPositionPending4.mmLinkages,
						com.tools20022.repository.msg.IntraPositionPending4.mmSecuritiesSubBalanceIdentification, com.tools20022.repository.msg.IntraPositionPending4.mmPriority,
						com.tools20022.repository.msg.IntraPositionPending4.mmCorporateActionEventType, com.tools20022.repository.msg.IntraPositionPending4.mmMessageOriginator,
						com.tools20022.repository.msg.IntraPositionPending4.mmCreationDateTime, com.tools20022.repository.msg.IntraPositionPending4.mmInstructionProcessingAdditionalDetails,
						com.tools20022.repository.msg.IntraPositionPending4.mmSupplementaryData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNoAccountOwnerTransactionIdentificationRule.forIntraPositionPending4);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraPositionPending4";
				definition = "Identifies the details of the transaction.";
				nextVersions_lazy = () -> Arrays.asList(IntraPositionPending6.mmObject());
				previousVersion_lazy = () -> IntraPositionPending2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PendingStatusAndReason2> getStatusAndReason() {
		return statusAndReason == null ? Optional.empty() : Optional.of(statusAndReason);
	}

	public IntraPositionPending4 setStatusAndReason(PendingStatusAndReason2 statusAndReason) {
		this.statusAndReason = statusAndReason;
		return this;
	}

	public Max35Text getAccountOwnerTransactionIdentification() {
		return accountOwnerTransactionIdentification;
	}

	public IntraPositionPending4 setAccountOwnerTransactionIdentification(Max35Text accountOwnerTransactionIdentification) {
		this.accountOwnerTransactionIdentification = Objects.requireNonNull(accountOwnerTransactionIdentification);
		return this;
	}

	public Optional<Max35Text> getAccountServicerTransactionIdentification() {
		return accountServicerTransactionIdentification == null ? Optional.empty() : Optional.of(accountServicerTransactionIdentification);
	}

	public IntraPositionPending4 setAccountServicerTransactionIdentification(Max35Text accountServicerTransactionIdentification) {
		this.accountServicerTransactionIdentification = accountServicerTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getMarketInfrastructureTransactionIdentification() {
		return marketInfrastructureTransactionIdentification == null ? Optional.empty() : Optional.of(marketInfrastructureTransactionIdentification);
	}

	public IntraPositionPending4 setMarketInfrastructureTransactionIdentification(Max35Text marketInfrastructureTransactionIdentification) {
		this.marketInfrastructureTransactionIdentification = marketInfrastructureTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getProcessorTransactionIdentification() {
		return processorTransactionIdentification == null ? Optional.empty() : Optional.of(processorTransactionIdentification);
	}

	public IntraPositionPending4 setProcessorTransactionIdentification(Max35Text processorTransactionIdentification) {
		this.processorTransactionIdentification = processorTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getCorporateActionEventIdentification() {
		return corporateActionEventIdentification == null ? Optional.empty() : Optional.of(corporateActionEventIdentification);
	}

	public IntraPositionPending4 setCorporateActionEventIdentification(Max35Text corporateActionEventIdentification) {
		this.corporateActionEventIdentification = corporateActionEventIdentification;
		return this;
	}

	public Optional<Max35Text> getPoolIdentification() {
		return poolIdentification == null ? Optional.empty() : Optional.of(poolIdentification);
	}

	public IntraPositionPending4 setPoolIdentification(Max35Text poolIdentification) {
		this.poolIdentification = poolIdentification;
		return this;
	}

	public SecuritiesSubBalanceTypeAndQuantityBreakdown3 getBalanceFrom() {
		return balanceFrom;
	}

	public IntraPositionPending4 setBalanceFrom(SecuritiesSubBalanceTypeAndQuantityBreakdown3 balanceFrom) {
		this.balanceFrom = Objects.requireNonNull(balanceFrom);
		return this;
	}

	public SecuritiesSubBalanceTypeAndQuantityBreakdown3 getBalanceTo() {
		return balanceTo;
	}

	public IntraPositionPending4 setBalanceTo(SecuritiesSubBalanceTypeAndQuantityBreakdown3 balanceTo) {
		this.balanceTo = Objects.requireNonNull(balanceTo);
		return this;
	}

	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public IntraPositionPending4 setFinancialInstrumentIdentification(SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes63> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public IntraPositionPending4 setFinancialInstrumentAttributes(FinancialInstrumentAttributes63 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public FinancialInstrumentQuantity1Choice getSettlementQuantity() {
		return settlementQuantity;
	}

	public IntraPositionPending4 setSettlementQuantity(FinancialInstrumentQuantity1Choice settlementQuantity) {
		this.settlementQuantity = Objects.requireNonNull(settlementQuantity);
		return this;
	}

	public DateAndDateTimeChoice getIntendedSettlementDate() {
		return intendedSettlementDate;
	}

	public IntraPositionPending4 setIntendedSettlementDate(DateAndDateTimeChoice intendedSettlementDate) {
		this.intendedSettlementDate = Objects.requireNonNull(intendedSettlementDate);
		return this;
	}

	public Optional<ISODateTime> getStatusDate() {
		return statusDate == null ? Optional.empty() : Optional.of(statusDate);
	}

	public IntraPositionPending4 setStatusDate(ISODateTime statusDate) {
		this.statusDate = statusDate;
		return this;
	}

	public List<Linkages51> getLinkages() {
		return linkages == null ? linkages = new ArrayList<>() : linkages;
	}

	public IntraPositionPending4 setLinkages(List<Linkages51> linkages) {
		this.linkages = Objects.requireNonNull(linkages);
		return this;
	}

	public Optional<GenericIdentification37> getSecuritiesSubBalanceIdentification() {
		return securitiesSubBalanceIdentification == null ? Optional.empty() : Optional.of(securitiesSubBalanceIdentification);
	}

	public IntraPositionPending4 setSecuritiesSubBalanceIdentification(GenericIdentification37 securitiesSubBalanceIdentification) {
		this.securitiesSubBalanceIdentification = securitiesSubBalanceIdentification;
		return this;
	}

	public Optional<PriorityNumeric4Choice> getPriority() {
		return priority == null ? Optional.empty() : Optional.of(priority);
	}

	public IntraPositionPending4 setPriority(PriorityNumeric4Choice priority) {
		this.priority = priority;
		return this;
	}

	public Optional<CorporateActionEventType29Choice> getCorporateActionEventType() {
		return corporateActionEventType == null ? Optional.empty() : Optional.of(corporateActionEventType);
	}

	public IntraPositionPending4 setCorporateActionEventType(CorporateActionEventType29Choice corporateActionEventType) {
		this.corporateActionEventType = corporateActionEventType;
		return this;
	}

	public Optional<SystemPartyIdentification6> getMessageOriginator() {
		return messageOriginator == null ? Optional.empty() : Optional.of(messageOriginator);
	}

	public IntraPositionPending4 setMessageOriginator(SystemPartyIdentification6 messageOriginator) {
		this.messageOriginator = messageOriginator;
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public IntraPositionPending4 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Optional<Max350Text> getInstructionProcessingAdditionalDetails() {
		return instructionProcessingAdditionalDetails == null ? Optional.empty() : Optional.of(instructionProcessingAdditionalDetails);
	}

	public IntraPositionPending4 setInstructionProcessingAdditionalDetails(Max350Text instructionProcessingAdditionalDetails) {
		this.instructionProcessingAdditionalDetails = instructionProcessingAdditionalDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public IntraPositionPending4 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}