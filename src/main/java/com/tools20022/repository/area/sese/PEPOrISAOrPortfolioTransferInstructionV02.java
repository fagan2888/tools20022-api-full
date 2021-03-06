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
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An instructing party, eg, a (new) plan manager, sends the
 * PEPOrISAOrPortfolioTransferInstruction message to the executing party, eg, a
 * (old) plan manager, on behalf of the initiating party, eg, an investor
 * (client), to instruct the transfer of financial instruments from the clients
 * account at the old plan manager to the clients account at the new plan
 * manager through a nominee account.<br>
 * <b>Usage</b><br>
 * The PEPOrISAOrPortfolioTransferInstruction message is used to instruct the
 * withdrawal of one or more PEP or ISA or portfolio products from one account
 * and deliver them to another account.<br>
 * The PEPOrISAOrPortfolioTransferInstruction message is used to instruct one or
 * more transfers for one client. Each transfer is for delivery to the same
 * account. The account may be owned by one or more individual investors or one
 * or more corporate investors. Each transfer is identified in
 * TransferIdentification.<br>
 * If the instructing party does not have enough information to instruct the
 * transfer, then it must first send a RequestForPEPOrISAOrPortfolioInformation
 * message to the executing party in order to receive a
 * PEPOrISAOrPortfolioInformation message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.012.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmMessageReference
 * PEPOrISAOrPortfolioTransferInstructionV02.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmPoolReference
 * PEPOrISAOrPortfolioTransferInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmPreviousReference
 * PEPOrISAOrPortfolioTransferInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmRelatedReference
 * PEPOrISAOrPortfolioTransferInstructionV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmPrimaryIndividualInvestor
 * PEPOrISAOrPortfolioTransferInstructionV02.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmSecondaryIndividualInvestor
 * PEPOrISAOrPortfolioTransferInstructionV02.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmOtherIndividualInvestor
 * PEPOrISAOrPortfolioTransferInstructionV02.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmPrimaryCorporateInvestor
 * PEPOrISAOrPortfolioTransferInstructionV02.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmSecondaryCorporateInvestor
 * PEPOrISAOrPortfolioTransferInstructionV02.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmOtherCorporateInvestor
 * PEPOrISAOrPortfolioTransferInstructionV02.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmClientAccount
 * PEPOrISAOrPortfolioTransferInstructionV02.mmClientAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmNomineeAccount
 * PEPOrISAOrPortfolioTransferInstructionV02.mmNomineeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmNewPlanManager
 * PEPOrISAOrPortfolioTransferInstructionV02.mmNewPlanManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmCashAccount
 * PEPOrISAOrPortfolioTransferInstructionV02.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmProductTransfer
 * PEPOrISAOrPortfolioTransferInstructionV02.mmProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02#mmExtension
 * PEPOrISAOrPortfolioTransferInstructionV02.mmExtension}</li>
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
 * xmlTag} = "PEPOrISAOrPrtflTrfInstrV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PEPOrISAOrPortfolioTransferInstructionV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn instructing party, eg, a (new) plan manager, sends the PEPOrISAOrPortfolioTransferInstruction message to the executing party, eg, a (old) plan manager, on behalf of the initiating party, eg, an investor (client), to instruct the transfer of financial instruments from the clients account at the old plan manager to the clients account at the new plan manager through a nominee account.\r\nUsage\r\nThe PEPOrISAOrPortfolioTransferInstruction message is used to instruct the withdrawal of one or more PEP or ISA or portfolio products from one account and deliver them to another account.\r\nThe PEPOrISAOrPortfolioTransferInstruction message is used to instruct one or more transfers for one client. Each transfer is for delivery to the same account. The account may be owned by one or more individual investors or one or more corporate investors. Each transfer is identified in TransferIdentification.\r\nIf the instructing party does not have enough information to instruct the transfer, then it must first send a RequestForPEPOrISAOrPortfolioInformation message to the executing party in order to receive a PEPOrISAOrPortfolioInformation message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNomineeAccountServicerRule#for_sese_PEPOrISAOrPortfolioTransferInstructionV02
 * ConstraintNomineeAccountServicerRule.
 * for_sese_PEPOrISAOrPortfolioTransferInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPEPISARule#for_sese_PEPOrISAOrPortfolioTransferInstructionV02
 * ConstraintPEPISARule.for_sese_PEPOrISAOrPortfolioTransferInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#for_sese_PEPOrISAOrPortfolioTransferInstructionV02
 * ConstraintPorfolioRule.for_sese_PEPOrISAOrPortfolioTransferInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#for_sese_PEPOrISAOrPortfolioTransferInstructionV02
 * ConstraintInvestorRule.for_sese_PEPOrISAOrPortfolioTransferInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PEPOrISAOrPortfolioTransferInstructionV02
 * ConstraintCorporateRule.for_sese_PEPOrISAOrPortfolioTransferInstructionV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_PEPOrISAOrPortfolioTransferInstructionV02
 * ConstraintDesignationRule.for_sese_PEPOrISAOrPortfolioTransferInstructionV02}
 * </li>
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
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV03
 * PortfolioTransferInstructionV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PEPOrISAOrPortfolioTransferInstructionV02", propOrder = {"messageReference", "poolReference", "previousReference", "relatedReference", "primaryIndividualInvestor", "secondaryIndividualInvestor", "otherIndividualInvestor",
		"primaryCorporateInvestor", "secondaryCorporateInvestor", "otherCorporateInvestor", "clientAccount", "nomineeAccount", "newPlanManager", "cashAccount", "productTransfer", "extension"})
public class PEPOrISAOrPortfolioTransferInstructionV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgRef", required = true)
	protected MessageIdentification1 messageReference;
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
	 * xmlTag} = "MsgRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, MessageIdentification1> mmMessageReference = new MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, MessageIdentification1>() {
		{
			xmlTag = "MsgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageReference";
			definition = "Identifies the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(PEPOrISAOrPortfolioTransferInstructionV02 obj) {
			return obj.getMessageReference();
		}

		@Override
		public void setValue(PEPOrISAOrPortfolioTransferInstructionV02 obj, MessageIdentification1 value) {
			obj.setMessageReference(value);
		}
	};
	@XmlElement(name = "PoolRef")
	protected AdditionalReference3 poolReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<AdditionalReference3>> mmPoolReference = new MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<AdditionalReference3>>() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(PEPOrISAOrPortfolioTransferInstructionV02 obj) {
			return obj.getPoolReference();
		}

		@Override
		public void setValue(PEPOrISAOrPortfolioTransferInstructionV02 obj, Optional<AdditionalReference3> value) {
			obj.setPoolReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsRef")
	protected AdditionalReference3 previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<AdditionalReference3>> mmPreviousReference = new MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<AdditionalReference3>>() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(PEPOrISAOrPortfolioTransferInstructionV02 obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(PEPOrISAOrPortfolioTransferInstructionV02 obj, Optional<AdditionalReference3> value) {
			obj.setPreviousReference(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference3 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<AdditionalReference3>> mmRelatedReference = new MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<AdditionalReference3>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(PEPOrISAOrPortfolioTransferInstructionV02 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(PEPOrISAOrPortfolioTransferInstructionV02 obj, Optional<AdditionalReference3> value) {
			obj.setRelatedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PmryIndvInvstr")
	protected IndividualPerson8 primaryIndividualInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryIndvInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryIndividualInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the primary individual investor, eg, name, address, social security number and date of birth."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<IndividualPerson8>> mmPrimaryIndividualInvestor = new MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<IndividualPerson8>>() {
		{
			xmlTag = "PmryIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryIndividualInvestor";
			definition = "Information identifying the primary individual investor, eg, name, address, social security number and date of birth.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		@Override
		public Optional<IndividualPerson8> getValue(PEPOrISAOrPortfolioTransferInstructionV02 obj) {
			return obj.getPrimaryIndividualInvestor();
		}

		@Override
		public void setValue(PEPOrISAOrPortfolioTransferInstructionV02 obj, Optional<IndividualPerson8> value) {
			obj.setPrimaryIndividualInvestor(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndryIndvInvstr")
	protected IndividualPerson8 secondaryIndividualInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryIndvInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryIndividualInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the secondary individual investor, eg, name, address, social security number and date of birth."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<IndividualPerson8>> mmSecondaryIndividualInvestor = new MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<IndividualPerson8>>() {
		{
			xmlTag = "ScndryIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryIndividualInvestor";
			definition = "Information identifying the secondary individual investor, eg, name, address, social security number and date of birth.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		@Override
		public Optional<IndividualPerson8> getValue(PEPOrISAOrPortfolioTransferInstructionV02 obj) {
			return obj.getSecondaryIndividualInvestor();
		}

		@Override
		public void setValue(PEPOrISAOrPortfolioTransferInstructionV02 obj, Optional<IndividualPerson8> value) {
			obj.setSecondaryIndividualInvestor(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrIndvInvstr")
	protected List<IndividualPerson8> otherIndividualInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrIndvInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherIndividualInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the other individual investors, eg, name, address, social security number and date of birth."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, List<IndividualPerson8>> mmOtherIndividualInvestor = new MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, List<IndividualPerson8>>() {
		{
			xmlTag = "OthrIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIndividualInvestor";
			definition = "Information identifying the other individual investors, eg, name, address, social security number and date of birth.";
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		@Override
		public List<IndividualPerson8> getValue(PEPOrISAOrPortfolioTransferInstructionV02 obj) {
			return obj.getOtherIndividualInvestor();
		}

		@Override
		public void setValue(PEPOrISAOrPortfolioTransferInstructionV02 obj, List<IndividualPerson8> value) {
			obj.setOtherIndividualInvestor(value);
		}
	};
	@XmlElement(name = "PmryCorpInvstr")
	protected Organisation4 primaryCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation4
	 * Organisation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryCorpInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryCorporateInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the primary corporate investor, eg, name and address."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<Organisation4>> mmPrimaryCorporateInvestor = new MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<Organisation4>>() {
		{
			xmlTag = "PmryCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryCorporateInvestor";
			definition = "Information identifying the primary corporate investor, eg, name and address.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Organisation4.mmObject();
		}

		@Override
		public Optional<Organisation4> getValue(PEPOrISAOrPortfolioTransferInstructionV02 obj) {
			return obj.getPrimaryCorporateInvestor();
		}

		@Override
		public void setValue(PEPOrISAOrPortfolioTransferInstructionV02 obj, Optional<Organisation4> value) {
			obj.setPrimaryCorporateInvestor(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndryCorpInvstr")
	protected Organisation4 secondaryCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation4
	 * Organisation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryCorpInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryCorporateInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the secondary corporate investor, eg, name and address."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<Organisation4>> mmSecondaryCorporateInvestor = new MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<Organisation4>>() {
		{
			xmlTag = "ScndryCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryCorporateInvestor";
			definition = "Information identifying the secondary corporate investor, eg, name and address.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Organisation4.mmObject();
		}

		@Override
		public Optional<Organisation4> getValue(PEPOrISAOrPortfolioTransferInstructionV02 obj) {
			return obj.getSecondaryCorporateInvestor();
		}

		@Override
		public void setValue(PEPOrISAOrPortfolioTransferInstructionV02 obj, Optional<Organisation4> value) {
			obj.setSecondaryCorporateInvestor(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrCorpInvstr")
	protected List<Organisation4> otherCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation4
	 * Organisation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrCorpInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCorporateInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the other corporate investors, eg, name and address."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, List<Organisation4>> mmOtherCorporateInvestor = new MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, List<Organisation4>>() {
		{
			xmlTag = "OthrCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCorporateInvestor";
			definition = "Information identifying the other corporate investors, eg, name and address.";
			minOccurs = 0;
			complexType_lazy = () -> Organisation4.mmObject();
		}

		@Override
		public List<Organisation4> getValue(PEPOrISAOrPortfolioTransferInstructionV02 obj) {
			return obj.getOtherCorporateInvestor();
		}

		@Override
		public void setValue(PEPOrISAOrPortfolioTransferInstructionV02 obj, List<Organisation4> value) {
			obj.setOtherCorporateInvestor(value);
		}
	};
	@XmlElement(name = "ClntAcct", required = true)
	protected Account5 clientAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Account5
	 * Account5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an account owned by the investor at the old plan manager (account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Account5> mmClientAccount = new MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Account5>() {
		{
			xmlTag = "ClntAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientAccount";
			definition = "Identification of an account owned by the investor at the old plan manager (account servicer).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Account5.mmObject();
		}

		@Override
		public Account5 getValue(PEPOrISAOrPortfolioTransferInstructionV02 obj) {
			return obj.getClientAccount();
		}

		@Override
		public void setValue(PEPOrISAOrPortfolioTransferInstructionV02 obj, Account5 value) {
			obj.setClientAccount(value);
		}
	};
	@XmlElement(name = "NmneeAcct")
	protected Account6 nomineeAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Account6
	 * Account6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmneeAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NomineeAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account held in the name of a party that is not the name of the beneficial owner of the shares."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<Account6>> mmNomineeAccount = new MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<Account6>>() {
		{
			xmlTag = "NmneeAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NomineeAccount";
			definition = "Account held in the name of a party that is not the name of the beneficial owner of the shares.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Account6.mmObject();
		}

		@Override
		public Optional<Account6> getValue(PEPOrISAOrPortfolioTransferInstructionV02 obj) {
			return obj.getNomineeAccount();
		}

		@Override
		public void setValue(PEPOrISAOrPortfolioTransferInstructionV02 obj, Optional<Account6> value) {
			obj.setNomineeAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "NewPlanMgr", required = true)
	protected PartyIdentification2Choice newPlanManager;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewPlanMgr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPlanManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the institution to which the financial instrument is to be transferred."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, PartyIdentification2Choice> mmNewPlanManager = new MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, PartyIdentification2Choice>() {
		{
			xmlTag = "NewPlanMgr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPlanManager";
			definition = "Information related to the institution to which the financial instrument is to be transferred.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public PartyIdentification2Choice getValue(PEPOrISAOrPortfolioTransferInstructionV02 obj) {
			return obj.getNewPlanManager();
		}

		@Override
		public void setValue(PEPOrISAOrPortfolioTransferInstructionV02 obj, PartyIdentification2Choice value) {
			obj.setNewPlanManager(value);
		}
	};
	@XmlElement(name = "CshAcct")
	protected CashAccount11 cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashAccount11
	 * CashAccount11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an account owned by the investor to which a cash entry is made based on the transfer of asset(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<CashAccount11>> mmCashAccount = new MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, Optional<CashAccount11>>() {
		{
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Identification of an account owned by the investor to which a cash entry is made based on the transfer of asset(s).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashAccount11.mmObject();
		}

		@Override
		public Optional<CashAccount11> getValue(PEPOrISAOrPortfolioTransferInstructionV02 obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(PEPOrISAOrPortfolioTransferInstructionV02 obj, Optional<CashAccount11> value) {
			obj.setCashAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "PdctTrf", required = true)
	protected List<PEPISATransfer3> productTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PEPISATransfer3
	 * PEPISATransfer3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctTrf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information related to the asset(s) transferred."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, List<PEPISATransfer3>> mmProductTransfer = new MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, List<PEPISATransfer3>>() {
		{
			xmlTag = "PdctTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductTransfer";
			definition = "Provides information related to the asset(s) transferred.";
			minOccurs = 1;
			complexType_lazy = () -> PEPISATransfer3.mmObject();
		}

		@Override
		public List<PEPISATransfer3> getValue(PEPOrISAOrPortfolioTransferInstructionV02 obj) {
			return obj.getProductTransfer();
		}

		@Override
		public void setValue(PEPOrISAOrPortfolioTransferInstructionV02 obj, List<PEPISATransfer3> value) {
			obj.setProductTransfer(value);
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, List<Extension1>> mmExtension = new MMMessageBuildingBlock<PEPOrISAOrPortfolioTransferInstructionV02, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(PEPOrISAOrPortfolioTransferInstructionV02 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(PEPOrISAOrPortfolioTransferInstructionV02 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNomineeAccountServicerRule.for_sese_PEPOrISAOrPortfolioTransferInstructionV02,
						com.tools20022.repository.constraints.ConstraintPEPISARule.for_sese_PEPOrISAOrPortfolioTransferInstructionV02,
						com.tools20022.repository.constraints.ConstraintPorfolioRule.for_sese_PEPOrISAOrPortfolioTransferInstructionV02,
						com.tools20022.repository.constraints.ConstraintInvestorRule.for_sese_PEPOrISAOrPortfolioTransferInstructionV02,
						com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PEPOrISAOrPortfolioTransferInstructionV02,
						com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_PEPOrISAOrPortfolioTransferInstructionV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PEPOrISAOrPortfolioTransferInstructionV02";
				definition = "Scope\r\nAn instructing party, eg, a (new) plan manager, sends the PEPOrISAOrPortfolioTransferInstruction message to the executing party, eg, a (old) plan manager, on behalf of the initiating party, eg, an investor (client), to instruct the transfer of financial instruments from the clients account at the old plan manager to the clients account at the new plan manager through a nominee account.\r\nUsage\r\nThe PEPOrISAOrPortfolioTransferInstruction message is used to instruct the withdrawal of one or more PEP or ISA or portfolio products from one account and deliver them to another account.\r\nThe PEPOrISAOrPortfolioTransferInstruction message is used to instruct one or more transfers for one client. Each transfer is for delivery to the same account. The account may be owned by one or more individual investors or one or more corporate investors. Each transfer is identified in TransferIdentification.\r\nIf the instructing party does not have enough information to instruct the transfer, then it must first send a RequestForPEPOrISAOrPortfolioInformation message to the executing party in order to receive a PEPOrISAOrPortfolioInformation message.";
				nextVersions_lazy = () -> Arrays.asList(PortfolioTransferInstructionV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "PEPOrISAOrPrtflTrfInstrV02";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmMessageReference,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmPoolReference, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmPreviousReference,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmRelatedReference, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmPrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmSecondaryIndividualInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmOtherIndividualInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmPrimaryCorporateInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmSecondaryCorporateInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmOtherCorporateInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmClientAccount,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmNomineeAccount, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmNewPlanManager,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmCashAccount, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmProductTransfer,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferInstructionV02.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "012";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PEPOrISAOrPortfolioTransferInstructionV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageReference() {
		return messageReference;
	}

	public PEPOrISAOrPortfolioTransferInstructionV02 setMessageReference(MessageIdentification1 messageReference) {
		this.messageReference = Objects.requireNonNull(messageReference);
		return this;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public PEPOrISAOrPortfolioTransferInstructionV02 setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public Optional<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? Optional.empty() : Optional.of(previousReference);
	}

	public PEPOrISAOrPortfolioTransferInstructionV02 setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = previousReference;
		return this;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public PEPOrISAOrPortfolioTransferInstructionV02 setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public Optional<IndividualPerson8> getPrimaryIndividualInvestor() {
		return primaryIndividualInvestor == null ? Optional.empty() : Optional.of(primaryIndividualInvestor);
	}

	public PEPOrISAOrPortfolioTransferInstructionV02 setPrimaryIndividualInvestor(IndividualPerson8 primaryIndividualInvestor) {
		this.primaryIndividualInvestor = primaryIndividualInvestor;
		return this;
	}

	public Optional<IndividualPerson8> getSecondaryIndividualInvestor() {
		return secondaryIndividualInvestor == null ? Optional.empty() : Optional.of(secondaryIndividualInvestor);
	}

	public PEPOrISAOrPortfolioTransferInstructionV02 setSecondaryIndividualInvestor(IndividualPerson8 secondaryIndividualInvestor) {
		this.secondaryIndividualInvestor = secondaryIndividualInvestor;
		return this;
	}

	public List<IndividualPerson8> getOtherIndividualInvestor() {
		return otherIndividualInvestor == null ? otherIndividualInvestor = new ArrayList<>() : otherIndividualInvestor;
	}

	public PEPOrISAOrPortfolioTransferInstructionV02 setOtherIndividualInvestor(List<IndividualPerson8> otherIndividualInvestor) {
		this.otherIndividualInvestor = Objects.requireNonNull(otherIndividualInvestor);
		return this;
	}

	public Optional<Organisation4> getPrimaryCorporateInvestor() {
		return primaryCorporateInvestor == null ? Optional.empty() : Optional.of(primaryCorporateInvestor);
	}

	public PEPOrISAOrPortfolioTransferInstructionV02 setPrimaryCorporateInvestor(Organisation4 primaryCorporateInvestor) {
		this.primaryCorporateInvestor = primaryCorporateInvestor;
		return this;
	}

	public Optional<Organisation4> getSecondaryCorporateInvestor() {
		return secondaryCorporateInvestor == null ? Optional.empty() : Optional.of(secondaryCorporateInvestor);
	}

	public PEPOrISAOrPortfolioTransferInstructionV02 setSecondaryCorporateInvestor(Organisation4 secondaryCorporateInvestor) {
		this.secondaryCorporateInvestor = secondaryCorporateInvestor;
		return this;
	}

	public List<Organisation4> getOtherCorporateInvestor() {
		return otherCorporateInvestor == null ? otherCorporateInvestor = new ArrayList<>() : otherCorporateInvestor;
	}

	public PEPOrISAOrPortfolioTransferInstructionV02 setOtherCorporateInvestor(List<Organisation4> otherCorporateInvestor) {
		this.otherCorporateInvestor = Objects.requireNonNull(otherCorporateInvestor);
		return this;
	}

	public Account5 getClientAccount() {
		return clientAccount;
	}

	public PEPOrISAOrPortfolioTransferInstructionV02 setClientAccount(Account5 clientAccount) {
		this.clientAccount = Objects.requireNonNull(clientAccount);
		return this;
	}

	public Optional<Account6> getNomineeAccount() {
		return nomineeAccount == null ? Optional.empty() : Optional.of(nomineeAccount);
	}

	public PEPOrISAOrPortfolioTransferInstructionV02 setNomineeAccount(Account6 nomineeAccount) {
		this.nomineeAccount = nomineeAccount;
		return this;
	}

	public PartyIdentification2Choice getNewPlanManager() {
		return newPlanManager;
	}

	public PEPOrISAOrPortfolioTransferInstructionV02 setNewPlanManager(PartyIdentification2Choice newPlanManager) {
		this.newPlanManager = Objects.requireNonNull(newPlanManager);
		return this;
	}

	public Optional<CashAccount11> getCashAccount() {
		return cashAccount == null ? Optional.empty() : Optional.of(cashAccount);
	}

	public PEPOrISAOrPortfolioTransferInstructionV02 setCashAccount(CashAccount11 cashAccount) {
		this.cashAccount = cashAccount;
		return this;
	}

	public List<PEPISATransfer3> getProductTransfer() {
		return productTransfer == null ? productTransfer = new ArrayList<>() : productTransfer;
	}

	public PEPOrISAOrPortfolioTransferInstructionV02 setProductTransfer(List<PEPISATransfer3> productTransfer) {
		this.productTransfer = Objects.requireNonNull(productTransfer);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public PEPOrISAOrPortfolioTransferInstructionV02 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.012.001.02")
	static public class Document {
		@XmlElement(name = "PEPOrISAOrPrtflTrfInstrV02", required = true)
		public PEPOrISAOrPortfolioTransferInstructionV02 messageBody;
	}
}