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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryStatusJustification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reason for the status of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#mmUnmatched
 * PaymentStatusReasonCode5Choice.mmUnmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#mmCancelled
 * PaymentStatusReasonCode5Choice.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#mmSuspended
 * PaymentStatusReasonCode5Choice.mmSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#mmPendingFailingSettlement
 * PaymentStatusReasonCode5Choice.mmPendingFailingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#mmPendingSettlement
 * PaymentStatusReasonCode5Choice.mmPendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#mmProprietaryRejection
 * PaymentStatusReasonCode5Choice.mmProprietaryRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice#mmProprietary
 * PaymentStatusReasonCode5Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentStatusReasonCode5Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason for the status of the transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice
 * PaymentStatusReasonCode6Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentStatusReasonCode5Choice", propOrder = {"unmatched", "cancelled", "suspended", "pendingFailingSettlement", "pendingSettlement", "proprietaryRejection", "proprietary"})
public class PaymentStatusReasonCode5Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Umtchd", required = true)
	protected UnmatchedStatusReason1Code unmatched;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmUnmatchedStatusReason
	 * PaymentStatus.mmUnmatchedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice
	 * PaymentStatusReasonCode5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Umtchd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the payment status is unmatched."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmUnmatched
	 * PaymentStatusReasonCode6Choice.mmUnmatched}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentStatusReasonCode5Choice, UnmatchedStatusReason1Code> mmUnmatched = new MMMessageAttribute<PaymentStatusReasonCode5Choice, UnmatchedStatusReason1Code>() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmUnmatchedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmObject();
			isDerived = false;
			xmlTag = "Umtchd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			definition = "Reason why the payment status is unmatched.";
			nextVersions_lazy = () -> Arrays.asList(PaymentStatusReasonCode6Choice.mmUnmatched);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnmatchedStatusReason1Code.mmObject();
		}

		@Override
		public UnmatchedStatusReason1Code getValue(PaymentStatusReasonCode5Choice obj) {
			return obj.getUnmatched();
		}

		@Override
		public void setValue(PaymentStatusReasonCode5Choice obj, UnmatchedStatusReason1Code value) {
			obj.setUnmatched(value);
		}
	};
	@XmlElement(name = "Canc", required = true)
	protected CancelledStatusReason1Code cancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason1Code
	 * CancelledStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice
	 * PaymentStatusReasonCode5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Canc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the payment status is cancelled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmCancelled
	 * PaymentStatusReasonCode6Choice.mmCancelled}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentStatusReasonCode5Choice, CancelledStatusReason1Code> mmCancelled = new MMMessageAttribute<PaymentStatusReasonCode5Choice, CancelledStatusReason1Code>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Reason why the payment status is cancelled.";
			nextVersions_lazy = () -> Arrays.asList(PaymentStatusReasonCode6Choice.mmCancelled);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancelledStatusReason1Code.mmObject();
		}

		@Override
		public CancelledStatusReason1Code getValue(PaymentStatusReasonCode5Choice obj) {
			return obj.getCancelled();
		}

		@Override
		public void setValue(PaymentStatusReasonCode5Choice obj, CancelledStatusReason1Code value) {
			obj.setCancelled(value);
		}
	};
	@XmlElement(name = "Sspd", required = true)
	protected SuspendedStatusReason1Code suspended;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReason1Code
	 * SuspendedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmSuspendedStatusReason
	 * PaymentStatus.mmSuspendedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice
	 * PaymentStatusReasonCode5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sspd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the payment status is suspended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmSuspended
	 * PaymentStatusReasonCode6Choice.mmSuspended}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentStatusReasonCode5Choice, SuspendedStatusReason1Code> mmSuspended = new MMMessageAttribute<PaymentStatusReasonCode5Choice, SuspendedStatusReason1Code>() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmSuspendedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmObject();
			isDerived = false;
			xmlTag = "Sspd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			definition = "Reason why the payment status is suspended.";
			nextVersions_lazy = () -> Arrays.asList(PaymentStatusReasonCode6Choice.mmSuspended);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SuspendedStatusReason1Code.mmObject();
		}

		@Override
		public SuspendedStatusReason1Code getValue(PaymentStatusReasonCode5Choice obj) {
			return obj.getSuspended();
		}

		@Override
		public void setValue(PaymentStatusReasonCode5Choice obj, SuspendedStatusReason1Code value) {
			obj.setSuspended(value);
		}
	};
	@XmlElement(name = "PdgFlngSttlm", required = true)
	protected PendingFailingSettlement1Code pendingFailingSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingFailingSettlement1Code
	 * PendingFailingSettlement1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmPendingFailingSettlement
	 * PaymentStatus.mmPendingFailingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice
	 * PaymentStatusReasonCode5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgFlngSttlm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingFailingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason why the payment status is pending (failing settlement)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmPendingFailingSettlement
	 * PaymentStatusReasonCode6Choice.mmPendingFailingSettlement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentStatusReasonCode5Choice, PendingFailingSettlement1Code> mmPendingFailingSettlement = new MMMessageAttribute<PaymentStatusReasonCode5Choice, PendingFailingSettlement1Code>() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmPendingFailingSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgFlngSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingFailingSettlement";
			definition = "Reason why the payment status is pending (failing settlement).";
			nextVersions_lazy = () -> Arrays.asList(PaymentStatusReasonCode6Choice.mmPendingFailingSettlement);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingFailingSettlement1Code.mmObject();
		}

		@Override
		public PendingFailingSettlement1Code getValue(PaymentStatusReasonCode5Choice obj) {
			return obj.getPendingFailingSettlement();
		}

		@Override
		public void setValue(PaymentStatusReasonCode5Choice obj, PendingFailingSettlement1Code value) {
			obj.setPendingFailingSettlement(value);
		}
	};
	@XmlElement(name = "PdgSttlm", required = true)
	protected PendingSettlement2Code pendingSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmPendingSettlement
	 * PaymentStatus.mmPendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice
	 * PaymentStatusReasonCode5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgSttlm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason why the payment status is pending (settlement)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmPendingSettlement
	 * PaymentStatusReasonCode6Choice.mmPendingSettlement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentStatusReasonCode5Choice, PendingSettlement2Code> mmPendingSettlement = new MMMessageAttribute<PaymentStatusReasonCode5Choice, PendingSettlement2Code>() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmPendingSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSettlement";
			definition = "Reason why the payment status is pending (settlement).";
			nextVersions_lazy = () -> Arrays.asList(PaymentStatusReasonCode6Choice.mmPendingSettlement);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingSettlement2Code.mmObject();
		}

		@Override
		public PendingSettlement2Code getValue(PaymentStatusReasonCode5Choice obj) {
			return obj.getPendingSettlement();
		}

		@Override
		public void setValue(PaymentStatusReasonCode5Choice obj, PendingSettlement2Code value) {
			obj.setPendingSettlement(value);
		}
	};
	@XmlElement(name = "PrtryRjctn", required = true)
	protected ProprietaryStatusJustification proprietaryRejection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusJustification
	 * ProprietaryStatusJustification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice
	 * PaymentStatusReasonCode5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryRjctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the reason that has been used by the Target2 SSP system to reject the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmProprietaryRejection
	 * PaymentStatusReasonCode6Choice.mmProprietaryRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentStatusReasonCode5Choice, ProprietaryStatusJustification> mmProprietaryRejection = new MMMessageAttribute<PaymentStatusReasonCode5Choice, ProprietaryStatusJustification>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryRjctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryRejection";
			definition = "Defines the reason that has been used by the Target2 SSP system to reject the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentStatusReasonCode6Choice.mmProprietaryRejection);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ProprietaryStatusJustification.mmObject();
		}

		@Override
		public ProprietaryStatusJustification getValue(PaymentStatusReasonCode5Choice obj) {
			return obj.getProprietaryRejection();
		}

		@Override
		public void setValue(PaymentStatusReasonCode5Choice obj, ProprietaryStatusJustification value) {
			obj.setProprietaryRejection(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected Max4AlphaNumericText proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode5Choice
	 * PaymentStatusReasonCode5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines a free text proprietary reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode6Choice#mmProprietary
	 * PaymentStatusReasonCode6Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentStatusReasonCode5Choice, Max4AlphaNumericText> mmProprietary = new MMMessageAttribute<PaymentStatusReasonCode5Choice, Max4AlphaNumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Defines a free text proprietary reason.";
			nextVersions_lazy = () -> Arrays.asList(PaymentStatusReasonCode6Choice.mmProprietary);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Max4AlphaNumericText getValue(PaymentStatusReasonCode5Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(PaymentStatusReasonCode5Choice obj, Max4AlphaNumericText value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmUnmatched, com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmCancelled,
						com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmSuspended, com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmPendingFailingSettlement,
						com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmPendingSettlement, com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmProprietaryRejection,
						com.tools20022.repository.choice.PaymentStatusReasonCode5Choice.mmProprietary);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentStatusReasonCode5Choice";
				definition = "Reason for the status of the transaction.";
				nextVersions_lazy = () -> Arrays.asList(PaymentStatusReasonCode6Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public UnmatchedStatusReason1Code getUnmatched() {
		return unmatched;
	}

	public PaymentStatusReasonCode5Choice setUnmatched(UnmatchedStatusReason1Code unmatched) {
		this.unmatched = Objects.requireNonNull(unmatched);
		return this;
	}

	public CancelledStatusReason1Code getCancelled() {
		return cancelled;
	}

	public PaymentStatusReasonCode5Choice setCancelled(CancelledStatusReason1Code cancelled) {
		this.cancelled = Objects.requireNonNull(cancelled);
		return this;
	}

	public SuspendedStatusReason1Code getSuspended() {
		return suspended;
	}

	public PaymentStatusReasonCode5Choice setSuspended(SuspendedStatusReason1Code suspended) {
		this.suspended = Objects.requireNonNull(suspended);
		return this;
	}

	public PendingFailingSettlement1Code getPendingFailingSettlement() {
		return pendingFailingSettlement;
	}

	public PaymentStatusReasonCode5Choice setPendingFailingSettlement(PendingFailingSettlement1Code pendingFailingSettlement) {
		this.pendingFailingSettlement = Objects.requireNonNull(pendingFailingSettlement);
		return this;
	}

	public PendingSettlement2Code getPendingSettlement() {
		return pendingSettlement;
	}

	public PaymentStatusReasonCode5Choice setPendingSettlement(PendingSettlement2Code pendingSettlement) {
		this.pendingSettlement = Objects.requireNonNull(pendingSettlement);
		return this;
	}

	public ProprietaryStatusJustification getProprietaryRejection() {
		return proprietaryRejection;
	}

	public PaymentStatusReasonCode5Choice setProprietaryRejection(ProprietaryStatusJustification proprietaryRejection) {
		this.proprietaryRejection = Objects.requireNonNull(proprietaryRejection);
		return this;
	}

	public Max4AlphaNumericText getProprietary() {
		return proprietary;
	}

	public PaymentStatusReasonCode5Choice setProprietary(Max4AlphaNumericText proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}