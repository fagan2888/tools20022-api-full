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

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementPreviousVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer, for example, a registrar, transfer agent, custodian bank
 * or securities depository sends the AccountDetailsConfirmation message to the
 * account owner, for example, an investor to confirm the opening of an account,
 * execution of an AccountModificationInstruction or to return information
 * requested in a GetAccountDetails message.<br>
 * <b>Usage</b><br>
 * The AccountDetailsConfirmation message is used to confirm the opening of an
 * account, modification of an account or the provision of information requested
 * in a previously sent GetAccountDetails message. The message contains detailed
 * information relevant to the opened account.<br>
 * When the AccountDetailsConfirmation is used to confirm execution of an
 * AccountModificationInstruction message, it contains the modified subsets of
 * account details that were specified in the AccountModificationInstruction.<br>
 * When the AccountDetailsConfirmation is used to reply to a GetAccountDetails
 * message, it returns the selected subsets of account details that were
 * specified in the GetAccountDetails message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.002.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementPreviousVersion
 * AccountManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmMessageIdentification
 * AccountDetailsConfirmationV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmOrderReference
 * AccountDetailsConfirmationV06.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmRelatedReference
 * AccountDetailsConfirmationV06.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmConfirmationDetails
 * AccountDetailsConfirmationV06.mmConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmInvestmentAccount
 * AccountDetailsConfirmationV06.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmAccountParties
 * AccountDetailsConfirmationV06.mmAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmIntermediaries
 * AccountDetailsConfirmationV06.mmIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmPlacement
 * AccountDetailsConfirmationV06.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmNewIssueAllocation
 * AccountDetailsConfirmationV06.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmSavingsInvestmentPlan
 * AccountDetailsConfirmationV06.mmSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmWithdrawalInvestmentPlan
 * AccountDetailsConfirmationV06.mmWithdrawalInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmCashSettlement
 * AccountDetailsConfirmationV06.mmCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmServiceLevelAgreement
 * AccountDetailsConfirmationV06.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmAdditionalInformation
 * AccountDetailsConfirmationV06.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmMarketPracticeVersion
 * AccountDetailsConfirmationV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmExtension
 * AccountDetailsConfirmationV06.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctDtlsConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountDetailsConfirmationV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer, for example, a registrar, transfer agent, custodian bank or securities depository sends the AccountDetailsConfirmation message to the account owner, for example, an investor to confirm the opening of an account, execution of an AccountModificationInstruction or to return information requested in a GetAccountDetails message.\r\nUsage\r\nThe AccountDetailsConfirmation message is used to confirm the opening of an account, modification of an account or the provision of information requested in a previously sent GetAccountDetails message. The message contains detailed information relevant to the opened account.\r\nWhen the AccountDetailsConfirmation is used to confirm execution of an AccountModificationInstruction message, it contains the modified subsets of account details that were specified in the AccountModificationInstruction.\r\nWhen the AccountDetailsConfirmation is used to reply to a GetAccountDetails message, it returns the selected subsets of account details that were specified in the GetAccountDetails message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountRule#for_acmt_AccountDetailsConfirmationV06
 * ConstraintInvestmentAccountRule.for_acmt_AccountDetailsConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUnit1Rule#for_acmt_AccountDetailsConfirmationV06
 * ConstraintUnit1Rule.for_acmt_AccountDetailsConfirmationV06}</li>
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
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07
 * AccountDetailsConfirmationV07}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05
 * AccountDetailsConfirmationV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountDetailsConfirmationV06", propOrder = {"messageIdentification", "orderReference", "relatedReference", "confirmationDetails", "investmentAccount", "accountParties", "intermediaries", "placement", "newIssueAllocation",
		"savingsInvestmentPlan", "withdrawalInvestmentPlan", "cashSettlement", "serviceLevelAgreement", "additionalInformation", "marketPracticeVersion", "extension"})
public class AccountDetailsConfirmationV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies the message from a business application standpoint."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmMessageIdentification
	 * AccountDetailsConfirmationV07.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmMessageIdentification
	 * AccountDetailsConfirmationV05.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV06, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<AccountDetailsConfirmationV06, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies the message from a business application standpoint.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmMessageIdentification);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(AccountDetailsConfirmationV06 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV06 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "OrdrRef")
	protected InvestmentFundOrder4 orderReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder4
	 * InvestmentFundOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a related order or settlement transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmOrderReference
	 * AccountDetailsConfirmationV07.mmOrderReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmOrderReference
	 * AccountDetailsConfirmationV05.mmOrderReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV06, Optional<InvestmentFundOrder4>> mmOrderReference = new MMMessageBuildingBlock<AccountDetailsConfirmationV06, Optional<InvestmentFundOrder4>>() {
		{
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Identifies a related order or settlement transaction.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmOrderReference);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmOrderReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundOrder4.mmObject();
		}

		@Override
		public Optional<InvestmentFundOrder4> getValue(AccountDetailsConfirmationV06 obj) {
			return obj.getOrderReference();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV06 obj, Optional<InvestmentFundOrder4> value) {
			obj.setOrderReference(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference6 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmRelatedReference
	 * AccountDetailsConfirmationV07.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmRelatedReference
	 * AccountDetailsConfirmationV05.mmRelatedReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV06, Optional<AdditionalReference6>> mmRelatedReference = new MMMessageBuildingBlock<AccountDetailsConfirmationV06, Optional<AdditionalReference6>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmRelatedReference);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmRelatedReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference6.mmObject();
		}

		@Override
		public Optional<AdditionalReference6> getValue(AccountDetailsConfirmationV06 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV06 obj, Optional<AdditionalReference6> value) {
			obj.setRelatedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "ConfDtls", required = true)
	protected AccountManagementConfirmation3 confirmationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation3
	 * AccountManagementConfirmation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the request or instruction which triggered this confirmation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmConfirmationDetails
	 * AccountDetailsConfirmationV07.mmConfirmationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmConfirmationDetails
	 * AccountDetailsConfirmationV05.mmConfirmationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV06, AccountManagementConfirmation3> mmConfirmationDetails = new MMMessageBuildingBlock<AccountDetailsConfirmationV06, AccountManagementConfirmation3>() {
		{
			xmlTag = "ConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDetails";
			definition = "Information about the request or instruction which triggered this confirmation.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmConfirmationDetails);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmConfirmationDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountManagementConfirmation3.mmObject();
		}

		@Override
		public AccountManagementConfirmation3 getValue(AccountDetailsConfirmationV06 obj) {
			return obj.getConfirmationDetails();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV06 obj, AccountManagementConfirmation3 value) {
			obj.setConfirmationDetails(value);
		}
	};
	@XmlElement(name = "InvstmtAcct")
	protected InvestmentAccount50 investmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the information related to the investment account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmInvestmentAccount
	 * AccountDetailsConfirmationV07.mmInvestmentAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmInvestmentAccount
	 * AccountDetailsConfirmationV05.mmInvestmentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV06, Optional<InvestmentAccount50>> mmInvestmentAccount = new MMMessageBuildingBlock<AccountDetailsConfirmationV06, Optional<InvestmentAccount50>>() {
		{
			xmlTag = "InvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			definition = "Confirmation of the information related to the investment account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmInvestmentAccount);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmInvestmentAccount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccount50.mmObject();
		}

		@Override
		public Optional<InvestmentAccount50> getValue(AccountDetailsConfirmationV06 obj) {
			return obj.getInvestmentAccount();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV06 obj, Optional<InvestmentAccount50> value) {
			obj.setInvestmentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctPties")
	protected AccountParties13 accountParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13
	 * AccountParties13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of information related to parties that are related to the account, for example, primary account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmAccountParties
	 * AccountDetailsConfirmationV07.mmAccountParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmAccountParties
	 * AccountDetailsConfirmationV05.mmAccountParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV06, Optional<AccountParties13>> mmAccountParties = new MMMessageBuildingBlock<AccountDetailsConfirmationV06, Optional<AccountParties13>>() {
		{
			xmlTag = "AcctPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountParties";
			definition = "Confirmation of information related to parties that are related to the account, for example, primary account owner.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmAccountParties);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmAccountParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountParties13.mmObject();
		}

		@Override
		public Optional<AccountParties13> getValue(AccountDetailsConfirmationV06 obj) {
			return obj.getAccountParties();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV06 obj, Optional<AccountParties13> value) {
			obj.setAccountParties(value.orElse(null));
		}
	};
	@XmlElement(name = "Intrmies")
	protected List<Intermediary36> intermediaries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Intermediary36
	 * Intermediary36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrmies"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediaries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of an intermediary or other party related to the management of the account. In some markets, when this intermediary is a party acting on behalf of the investor for which it has opened an account at, for example, a central securities depository or international central securities depository, this party is known by the investor as the 'account controller'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmIntermediaries
	 * AccountDetailsConfirmationV07.mmIntermediaries}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmIntermediaries
	 * AccountDetailsConfirmationV05.mmIntermediaries}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV06, List<Intermediary36>> mmIntermediaries = new MMMessageBuildingBlock<AccountDetailsConfirmationV06, List<Intermediary36>>() {
		{
			xmlTag = "Intrmies";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediaries";
			definition = "Confirmation of an intermediary or other party related to the management of the account. In some markets, when this intermediary is a party acting on behalf of the investor for which it has opened an account at, for example, a central securities depository or international central securities depository, this party is known by the investor as the 'account controller'.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmIntermediaries);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmIntermediaries;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> Intermediary36.mmObject();
		}

		@Override
		public List<Intermediary36> getValue(AccountDetailsConfirmationV06 obj) {
			return obj.getIntermediaries();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV06 obj, List<Intermediary36> value) {
			obj.setIntermediaries(value);
		}
	};
	@XmlElement(name = "Plcmnt")
	protected ReferredAgent2 placement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReferredAgent2
	 * ReferredAgent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Plcmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Placement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Confirmation of referral information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmPlacement
	 * AccountDetailsConfirmationV07.mmPlacement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmPlacement
	 * AccountDetailsConfirmationV05.mmPlacement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV06, Optional<ReferredAgent2>> mmPlacement = new MMMessageBuildingBlock<AccountDetailsConfirmationV06, Optional<ReferredAgent2>>() {
		{
			xmlTag = "Plcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			definition = "Confirmation of referral information.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmPlacement);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmPlacement;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ReferredAgent2.mmObject();
		}

		@Override
		public Optional<ReferredAgent2> getValue(AccountDetailsConfirmationV06 obj) {
			return obj.getPlacement();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV06 obj, Optional<ReferredAgent2> value) {
			obj.setPlacement(value.orElse(null));
		}
	};
	@XmlElement(name = "NewIsseAllcn")
	protected NewIssueAllocation2 newIssueAllocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation2
	 * NewIssueAllocation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewIsseAllcn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssueAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of eligibility conditions applicable when there is an allocation of new issues for hedge fund account opening."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmNewIssueAllocation
	 * AccountDetailsConfirmationV07.mmNewIssueAllocation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmNewIssueAllocation
	 * AccountDetailsConfirmationV05.mmNewIssueAllocation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV06, Optional<NewIssueAllocation2>> mmNewIssueAllocation = new MMMessageBuildingBlock<AccountDetailsConfirmationV06, Optional<NewIssueAllocation2>>() {
		{
			xmlTag = "NewIsseAllcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssueAllocation";
			definition = "Confirmation of eligibility conditions applicable when there is an allocation of new issues for hedge fund account opening.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmNewIssueAllocation);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmNewIssueAllocation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NewIssueAllocation2.mmObject();
		}

		@Override
		public Optional<NewIssueAllocation2> getValue(AccountDetailsConfirmationV06 obj) {
			return obj.getNewIssueAllocation();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV06 obj, Optional<NewIssueAllocation2> value) {
			obj.setNewIssueAllocation(value.orElse(null));
		}
	};
	@XmlElement(name = "SvgsInvstmtPlan")
	protected List<InvestmentPlan12> savingsInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvgsInvstmtPlan"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SavingsInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the information related to a savings plan that is related to the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmSavingsInvestmentPlan
	 * AccountDetailsConfirmationV07.mmSavingsInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmSavingsInvestmentPlan
	 * AccountDetailsConfirmationV05.mmSavingsInvestmentPlan}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV06, List<InvestmentPlan12>> mmSavingsInvestmentPlan = new MMMessageBuildingBlock<AccountDetailsConfirmationV06, List<InvestmentPlan12>>() {
		{
			xmlTag = "SvgsInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsInvestmentPlan";
			definition = "Confirmation of the information related to a savings plan that is related to the account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmSavingsInvestmentPlan);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmSavingsInvestmentPlan;
			maxOccurs = 50;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan12.mmObject();
		}

		@Override
		public List<InvestmentPlan12> getValue(AccountDetailsConfirmationV06 obj) {
			return obj.getSavingsInvestmentPlan();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV06 obj, List<InvestmentPlan12> value) {
			obj.setSavingsInvestmentPlan(value);
		}
	};
	@XmlElement(name = "WdrwlInvstmtPlan")
	protected List<InvestmentPlan12> withdrawalInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WdrwlInvstmtPlan"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the information related to a withdrawal plan that is related to the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmWithdrawalInvestmentPlan
	 * AccountDetailsConfirmationV07.mmWithdrawalInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmWithdrawalInvestmentPlan
	 * AccountDetailsConfirmationV05.mmWithdrawalInvestmentPlan}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV06, List<InvestmentPlan12>> mmWithdrawalInvestmentPlan = new MMMessageBuildingBlock<AccountDetailsConfirmationV06, List<InvestmentPlan12>>() {
		{
			xmlTag = "WdrwlInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalInvestmentPlan";
			definition = "Confirmation of the information related to a withdrawal plan that is related to the account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmWithdrawalInvestmentPlan);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmWithdrawalInvestmentPlan;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan12.mmObject();
		}

		@Override
		public List<InvestmentPlan12> getValue(AccountDetailsConfirmationV06 obj) {
			return obj.getWithdrawalInvestmentPlan();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV06 obj, List<InvestmentPlan12> value) {
			obj.setWithdrawalInvestmentPlan(value);
		}
	};
	@XmlElement(name = "CshSttlm")
	protected List<CashSettlement1> cashSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashSettlement1
	 * CashSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of a cash settlement standing instruction associated to transactions on the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmCashSettlement
	 * AccountDetailsConfirmationV07.mmCashSettlement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmCashSettlement
	 * AccountDetailsConfirmationV05.mmCashSettlement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV06, List<CashSettlement1>> mmCashSettlement = new MMMessageBuildingBlock<AccountDetailsConfirmationV06, List<CashSettlement1>>() {
		{
			xmlTag = "CshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "Confirmation of a cash settlement standing instruction associated to transactions on the account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmCashSettlement);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmCashSettlement;
			maxOccurs = 8;
			minOccurs = 0;
			complexType_lazy = () -> CashSettlement1.mmObject();
		}

		@Override
		public List<CashSettlement1> getValue(AccountDetailsConfirmationV06 obj) {
			return obj.getCashSettlement();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV06 obj, List<CashSettlement1> value) {
			obj.setCashSettlement(value);
		}
	};
	@XmlElement(name = "SvcLvlAgrmt")
	protected List<DocumentToSend3> serviceLevelAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.DocumentToSend3
	 * DocumentToSend3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcLvlAgrmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevelAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies documents to be provided for the account opening."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmServiceLevelAgreement
	 * AccountDetailsConfirmationV07.mmServiceLevelAgreement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmServiceLevelAgreement
	 * AccountDetailsConfirmationV05.mmServiceLevelAgreement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV06, List<DocumentToSend3>> mmServiceLevelAgreement = new MMMessageBuildingBlock<AccountDetailsConfirmationV06, List<DocumentToSend3>>() {
		{
			xmlTag = "SvcLvlAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevelAgreement";
			definition = "Identifies documents to be provided for the account opening.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmServiceLevelAgreement);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmServiceLevelAgreement;
			maxOccurs = 30;
			minOccurs = 0;
			complexType_lazy = () -> DocumentToSend3.mmObject();
		}

		@Override
		public List<DocumentToSend3> getValue(AccountDetailsConfirmationV06 obj) {
			return obj.getServiceLevelAgreement();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV06 obj, List<DocumentToSend3> value) {
			obj.setServiceLevelAgreement(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<AccountRestrictions1> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1
	 * AccountRestrictions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information concerning limitations and restrictions on the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmAdditionalInformation
	 * AccountDetailsConfirmationV07.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV06, List<AccountRestrictions1>> mmAdditionalInformation = new MMMessageBuildingBlock<AccountDetailsConfirmationV06, List<AccountRestrictions1>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information concerning limitations and restrictions on the account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmAdditionalInformation);
			minOccurs = 0;
			complexType_lazy = () -> AccountRestrictions1.mmObject();
		}

		@Override
		public List<AccountRestrictions1> getValue(AccountDetailsConfirmationV06 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV06 obj, List<AccountRestrictions1> value) {
			obj.setAdditionalInformation(value);
		}
	};
	@XmlElement(name = "MktPrctcVrsn")
	protected MarketPracticeVersion1 marketPracticeVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPrctcVrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market practice to which the message conforms."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmMarketPracticeVersion
	 * AccountDetailsConfirmationV07.mmMarketPracticeVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmMarketPracticeVersion
	 * AccountDetailsConfirmationV05.mmMarketPracticeVersion}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV06, Optional<MarketPracticeVersion1>> mmMarketPracticeVersion = new MMMessageBuildingBlock<AccountDetailsConfirmationV06, Optional<MarketPracticeVersion1>>() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmMarketPracticeVersion);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmMarketPracticeVersion;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		@Override
		public Optional<MarketPracticeVersion1> getValue(AccountDetailsConfirmationV06 obj) {
			return obj.getMarketPracticeVersion();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV06 obj, Optional<MarketPracticeVersion1> value) {
			obj.setMarketPracticeVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmExtension
	 * AccountDetailsConfirmationV07.mmExtension}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmExtension
	 * AccountDetailsConfirmationV05.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV06, List<Extension1>> mmExtension = new MMMessageBuildingBlock<AccountDetailsConfirmationV06, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmExtension);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(AccountDetailsConfirmationV06 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV06 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountRule.for_acmt_AccountDetailsConfirmationV06,
						com.tools20022.repository.constraints.ConstraintUnit1Rule.for_acmt_AccountDetailsConfirmationV06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountDetailsConfirmationV06";
				definition = "Scope\r\nAn account servicer, for example, a registrar, transfer agent, custodian bank or securities depository sends the AccountDetailsConfirmation message to the account owner, for example, an investor to confirm the opening of an account, execution of an AccountModificationInstruction or to return information requested in a GetAccountDetails message.\r\nUsage\r\nThe AccountDetailsConfirmation message is used to confirm the opening of an account, modification of an account or the provision of information requested in a previously sent GetAccountDetails message. The message contains detailed information relevant to the opened account.\r\nWhen the AccountDetailsConfirmation is used to confirm execution of an AccountModificationInstruction message, it contains the modified subsets of account details that were specified in the AccountModificationInstruction.\r\nWhen the AccountDetailsConfirmation is used to reply to a GetAccountDetails message, it returns the selected subsets of account details that were specified in the GetAccountDetails message.";
				nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmObject());
				previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "AcctDtlsConf";
				businessArea_lazy = () -> AccountManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmMessageIdentification, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmOrderReference,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmRelatedReference, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmConfirmationDetails,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmInvestmentAccount, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmAccountParties,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmIntermediaries, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmPlacement,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmNewIssueAllocation, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmSavingsInvestmentPlan,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmWithdrawalInvestmentPlan, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmCashSettlement,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmServiceLevelAgreement, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmAdditionalInformation,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmMarketPracticeVersion, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "002";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountDetailsConfirmationV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public AccountDetailsConfirmationV06 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<InvestmentFundOrder4> getOrderReference() {
		return orderReference == null ? Optional.empty() : Optional.of(orderReference);
	}

	public AccountDetailsConfirmationV06 setOrderReference(InvestmentFundOrder4 orderReference) {
		this.orderReference = orderReference;
		return this;
	}

	public Optional<AdditionalReference6> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public AccountDetailsConfirmationV06 setRelatedReference(AdditionalReference6 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public AccountManagementConfirmation3 getConfirmationDetails() {
		return confirmationDetails;
	}

	public AccountDetailsConfirmationV06 setConfirmationDetails(AccountManagementConfirmation3 confirmationDetails) {
		this.confirmationDetails = Objects.requireNonNull(confirmationDetails);
		return this;
	}

	public Optional<InvestmentAccount50> getInvestmentAccount() {
		return investmentAccount == null ? Optional.empty() : Optional.of(investmentAccount);
	}

	public AccountDetailsConfirmationV06 setInvestmentAccount(InvestmentAccount50 investmentAccount) {
		this.investmentAccount = investmentAccount;
		return this;
	}

	public Optional<AccountParties13> getAccountParties() {
		return accountParties == null ? Optional.empty() : Optional.of(accountParties);
	}

	public AccountDetailsConfirmationV06 setAccountParties(AccountParties13 accountParties) {
		this.accountParties = accountParties;
		return this;
	}

	public List<Intermediary36> getIntermediaries() {
		return intermediaries == null ? intermediaries = new ArrayList<>() : intermediaries;
	}

	public AccountDetailsConfirmationV06 setIntermediaries(List<Intermediary36> intermediaries) {
		this.intermediaries = Objects.requireNonNull(intermediaries);
		return this;
	}

	public Optional<ReferredAgent2> getPlacement() {
		return placement == null ? Optional.empty() : Optional.of(placement);
	}

	public AccountDetailsConfirmationV06 setPlacement(ReferredAgent2 placement) {
		this.placement = placement;
		return this;
	}

	public Optional<NewIssueAllocation2> getNewIssueAllocation() {
		return newIssueAllocation == null ? Optional.empty() : Optional.of(newIssueAllocation);
	}

	public AccountDetailsConfirmationV06 setNewIssueAllocation(NewIssueAllocation2 newIssueAllocation) {
		this.newIssueAllocation = newIssueAllocation;
		return this;
	}

	public List<InvestmentPlan12> getSavingsInvestmentPlan() {
		return savingsInvestmentPlan == null ? savingsInvestmentPlan = new ArrayList<>() : savingsInvestmentPlan;
	}

	public AccountDetailsConfirmationV06 setSavingsInvestmentPlan(List<InvestmentPlan12> savingsInvestmentPlan) {
		this.savingsInvestmentPlan = Objects.requireNonNull(savingsInvestmentPlan);
		return this;
	}

	public List<InvestmentPlan12> getWithdrawalInvestmentPlan() {
		return withdrawalInvestmentPlan == null ? withdrawalInvestmentPlan = new ArrayList<>() : withdrawalInvestmentPlan;
	}

	public AccountDetailsConfirmationV06 setWithdrawalInvestmentPlan(List<InvestmentPlan12> withdrawalInvestmentPlan) {
		this.withdrawalInvestmentPlan = Objects.requireNonNull(withdrawalInvestmentPlan);
		return this;
	}

	public List<CashSettlement1> getCashSettlement() {
		return cashSettlement == null ? cashSettlement = new ArrayList<>() : cashSettlement;
	}

	public AccountDetailsConfirmationV06 setCashSettlement(List<CashSettlement1> cashSettlement) {
		this.cashSettlement = Objects.requireNonNull(cashSettlement);
		return this;
	}

	public List<DocumentToSend3> getServiceLevelAgreement() {
		return serviceLevelAgreement == null ? serviceLevelAgreement = new ArrayList<>() : serviceLevelAgreement;
	}

	public AccountDetailsConfirmationV06 setServiceLevelAgreement(List<DocumentToSend3> serviceLevelAgreement) {
		this.serviceLevelAgreement = Objects.requireNonNull(serviceLevelAgreement);
		return this;
	}

	public List<AccountRestrictions1> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public AccountDetailsConfirmationV06 setAdditionalInformation(List<AccountRestrictions1> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return marketPracticeVersion == null ? Optional.empty() : Optional.of(marketPracticeVersion);
	}

	public AccountDetailsConfirmationV06 setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public AccountDetailsConfirmationV06 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.002.001.06")
	static public class Document {
		@XmlElement(name = "AcctDtlsConf", required = true)
		public AccountDetailsConfirmationV06 messageBody;
	}
}