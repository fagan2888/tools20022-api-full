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

package com.tools20022.repository.area.semt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesManagementArchive;
import com.tools20022.repository.choice.PartyIdentification36Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope An account servicer sends a SecuritiesTransactionPendingReport to an
 * account owner to provide, as at a specified time, the details of pending
 * increases and decreases of holdings, for all or selected securities in a
 * specified safekeeping account, for all or selected reasons why the
 * transaction is pending. The account servicer/owner relationship may be: - a
 * central securities depository or another settlement market infrastructure
 * acting on behalf of their participants - an agent (sub-custodian) acting on
 * behalf of their global custodian customer, or - a custodian acting on behalf
 * of an investment management institution or a broker/dealer.
 * 
 * Usage The statement may also include future settlement or forward
 * transactions which have become binding on the account owner. The message may
 * also be used to: - re-send a message previously sent, - provide a third party
 * with a copy of a message for information, - re-send to a third party a copy
 * of a message for information using the relevant elements in the Business
 * Application Header.
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
 * messageDefinitionIdentifier} = {@code semt.018.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementArchive
 * SecuritiesManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06#mmPagination
 * SecuritiesTransactionPendingReportV06.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06#mmStatementGeneralDetails
 * SecuritiesTransactionPendingReportV06.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06#mmAccountOwner
 * SecuritiesTransactionPendingReportV06.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06#mmSafekeepingAccount
 * SecuritiesTransactionPendingReportV06.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06#mmStatus
 * SecuritiesTransactionPendingReportV06.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06#mmTransactions
 * SecuritiesTransactionPendingReportV06.mmTransactions}</li>
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
 * xmlTag} = "SctiesTxPdgRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransactionPendingReportV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn account servicer sends a SecuritiesTransactionPendingReport to an account owner to provide, as at a specified time, the details of pending increases and decreases of holdings, for all or selected securities in a specified safekeeping account, for all or selected reasons why the transaction is pending. \nThe account servicer/owner relationship may be:\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or \n- a custodian acting on behalf of an investment management institution or a broker/dealer.\n\nUsage\nThe statement may also include future settlement or forward transactions which have become binding on the account owner.\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_semt_SecuritiesTransactionPendingReportV06
 * ConstraintCoexistenceCharacterSetXRule.
 * for_semt_SecuritiesTransactionPendingReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_semt_SecuritiesTransactionPendingReportV06
 * ConstraintCoexistenceIdentificationRule.
 * for_semt_SecuritiesTransactionPendingReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_semt_SecuritiesTransactionPendingReportV06
 * ConstraintSecuritiesMarketPracticeGroupGuideline.
 * for_semt_SecuritiesTransactionPendingReportV06}</li>
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
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV07
 * SecuritiesTransactionPendingReportV07}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05
 * SecuritiesTransactionPendingReportV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesTransactionPendingReportV06", propOrder = {"pagination", "statementGeneralDetails", "accountOwner", "safekeepingAccount", "status", "transactions"})
public class SecuritiesTransactionPendingReportV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pgntn", required = true)
	protected Pagination pagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pgntn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message (within a statement) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the statement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV07#mmPagination
	 * SecuritiesTransactionPendingReportV07.mmPagination}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05#mmPagination
	 * SecuritiesTransactionPendingReportV05.mmPagination}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionPendingReportV06, Pagination> mmPagination = new MMMessageBuildingBlock<SecuritiesTransactionPendingReportV06, Pagination>() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message (within a statement) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the statement.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionPendingReportV07.mmPagination);
			previousVersion_lazy = () -> SecuritiesTransactionPendingReportV05.mmPagination;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Pagination getValue(SecuritiesTransactionPendingReportV06 obj) {
			return obj.getPagination();
		}

		@Override
		public void setValue(SecuritiesTransactionPendingReportV06 obj, Pagination value) {
			obj.setPagination(value);
		}
	};
	@XmlElement(name = "StmtGnlDtls", required = true)
	protected Statement14 statementGeneralDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Statement14
	 * Statement14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtGnlDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementGeneralDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides general information on the report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV07#mmStatementGeneralDetails
	 * SecuritiesTransactionPendingReportV07.mmStatementGeneralDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05#mmStatementGeneralDetails
	 * SecuritiesTransactionPendingReportV05.mmStatementGeneralDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionPendingReportV06, Statement14> mmStatementGeneralDetails = new MMMessageBuildingBlock<SecuritiesTransactionPendingReportV06, Statement14>() {
		{
			xmlTag = "StmtGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementGeneralDetails";
			definition = "Provides general information on the report.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionPendingReportV07.mmStatementGeneralDetails);
			previousVersion_lazy = () -> SecuritiesTransactionPendingReportV05.mmStatementGeneralDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Statement14.mmObject();
		}

		@Override
		public Statement14 getValue(SecuritiesTransactionPendingReportV06 obj) {
			return obj.getStatementGeneralDetails();
		}

		@Override
		public void setValue(SecuritiesTransactionPendingReportV06 obj, Statement14 value) {
			obj.setStatementGeneralDetails(value);
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification36Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice
	 * PartyIdentification36Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV07#mmAccountOwner
	 * SecuritiesTransactionPendingReportV07.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05#mmAccountOwner
	 * SecuritiesTransactionPendingReportV05.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionPendingReportV06, Optional<PartyIdentification36Choice>> mmAccountOwner = new MMMessageBuildingBlock<SecuritiesTransactionPendingReportV06, Optional<PartyIdentification36Choice>>() {
		{
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionPendingReportV07.mmAccountOwner);
			previousVersion_lazy = () -> SecuritiesTransactionPendingReportV05.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification36Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification36Choice> getValue(SecuritiesTransactionPendingReportV06 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(SecuritiesTransactionPendingReportV06 obj, Optional<PartyIdentification36Choice> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct", required = true)
	protected SecuritiesAccount13 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV07#mmSafekeepingAccount
	 * SecuritiesTransactionPendingReportV07.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05#mmSafekeepingAccount
	 * SecuritiesTransactionPendingReportV05.mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionPendingReportV06, SecuritiesAccount13> mmSafekeepingAccount = new MMMessageBuildingBlock<SecuritiesTransactionPendingReportV06, SecuritiesAccount13>() {
		{
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionPendingReportV07.mmSafekeepingAccount);
			previousVersion_lazy = () -> SecuritiesTransactionPendingReportV05.mmSafekeepingAccount;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount13.mmObject();
		}

		@Override
		public SecuritiesAccount13 getValue(SecuritiesTransactionPendingReportV06 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(SecuritiesTransactionPendingReportV06 obj, SecuritiesAccount13 value) {
			obj.setSafekeepingAccount(value);
		}
	};
	@XmlElement(name = "Sts")
	protected List<StatusAndReason25> status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StatusAndReason25
	 * StatusAndReason25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV07#mmStatus
	 * SecuritiesTransactionPendingReportV07.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05#mmStatus
	 * SecuritiesTransactionPendingReportV05.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionPendingReportV06, List<StatusAndReason25>> mmStatus = new MMMessageBuildingBlock<SecuritiesTransactionPendingReportV06, List<StatusAndReason25>>() {
		{
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status information.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionPendingReportV07.mmStatus);
			previousVersion_lazy = () -> SecuritiesTransactionPendingReportV05.mmStatus;
			minOccurs = 0;
			complexType_lazy = () -> StatusAndReason25.mmObject();
		}

		@Override
		public List<StatusAndReason25> getValue(SecuritiesTransactionPendingReportV06 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(SecuritiesTransactionPendingReportV06 obj, List<StatusAndReason25> value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "Txs")
	protected List<Transaction41> transactions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Transaction41
	 * Transaction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Txs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the transactions reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV07#mmTransactions
	 * SecuritiesTransactionPendingReportV07.mmTransactions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05#mmTransactions
	 * SecuritiesTransactionPendingReportV05.mmTransactions}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionPendingReportV06, List<Transaction41>> mmTransactions = new MMMessageBuildingBlock<SecuritiesTransactionPendingReportV06, List<Transaction41>>() {
		{
			xmlTag = "Txs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transactions";
			definition = "Details of the transactions reported.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionPendingReportV07.mmTransactions);
			previousVersion_lazy = () -> SecuritiesTransactionPendingReportV05.mmTransactions;
			minOccurs = 0;
			complexType_lazy = () -> Transaction41.mmObject();
		}

		@Override
		public List<Transaction41> getValue(SecuritiesTransactionPendingReportV06 obj) {
			return obj.getTransactions();
		}

		@Override
		public void setValue(SecuritiesTransactionPendingReportV06 obj, List<Transaction41> value) {
			obj.setTransactions(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_semt_SecuritiesTransactionPendingReportV06,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_semt_SecuritiesTransactionPendingReportV06,
						com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_semt_SecuritiesTransactionPendingReportV06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionPendingReportV06";
				definition = "Scope\nAn account servicer sends a SecuritiesTransactionPendingReport to an account owner to provide, as at a specified time, the details of pending increases and decreases of holdings, for all or selected securities in a specified safekeeping account, for all or selected reasons why the transaction is pending. \nThe account servicer/owner relationship may be:\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or \n- a custodian acting on behalf of an investment management institution or a broker/dealer.\n\nUsage\nThe statement may also include future settlement or forward transactions which have become binding on the account owner.\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionPendingReportV07.mmObject());
				previousVersion_lazy = () -> SecuritiesTransactionPendingReportV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesTxPdgRpt";
				businessArea_lazy = () -> SecuritiesManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06.mmPagination,
						com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06.mmStatementGeneralDetails, com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06.mmAccountOwner,
						com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06.mmSafekeepingAccount, com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06.mmStatus,
						com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06.mmTransactions);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "018";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTransactionPendingReportV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Pagination getPagination() {
		return pagination;
	}

	public SecuritiesTransactionPendingReportV06 setPagination(Pagination pagination) {
		this.pagination = Objects.requireNonNull(pagination);
		return this;
	}

	public Statement14 getStatementGeneralDetails() {
		return statementGeneralDetails;
	}

	public SecuritiesTransactionPendingReportV06 setStatementGeneralDetails(Statement14 statementGeneralDetails) {
		this.statementGeneralDetails = Objects.requireNonNull(statementGeneralDetails);
		return this;
	}

	public Optional<PartyIdentification36Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public SecuritiesTransactionPendingReportV06 setAccountOwner(PartyIdentification36Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public SecuritiesAccount13 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public SecuritiesTransactionPendingReportV06 setSafekeepingAccount(SecuritiesAccount13 safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public List<StatusAndReason25> getStatus() {
		return status == null ? status = new ArrayList<>() : status;
	}

	public SecuritiesTransactionPendingReportV06 setStatus(List<StatusAndReason25> status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<Transaction41> getTransactions() {
		return transactions == null ? transactions = new ArrayList<>() : transactions;
	}

	public SecuritiesTransactionPendingReportV06 setTransactions(List<Transaction41> transactions) {
		this.transactions = Objects.requireNonNull(transactions);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.018.001.06")
	static public class Document {
		@XmlElement(name = "SctiesTxPdgRpt", required = true)
		public SecuritiesTransactionPendingReportV06 messageBody;
	}
}