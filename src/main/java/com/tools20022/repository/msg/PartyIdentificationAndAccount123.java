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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PartyIdentification70Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.ContactPersonRole;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContactIdentification2;
import com.tools20022.repository.msg.SubAccount5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Party involved in the settlement chain.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123#mmPartyIdentification
 * PartyIdentificationAndAccount123.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123#mmAccountIdentification
 * PartyIdentificationAndAccount123.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123#mmProcessingReference
 * PartyIdentificationAndAccount123.mmProcessingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123#mmProcessingDate
 * PartyIdentificationAndAccount123.mmProcessingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123#mmSubAccountDetails
 * PartyIdentificationAndAccount123.mmSubAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123#mmContactPerson
 * PartyIdentificationAndAccount123.mmContactPerson}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentificationAndAccount123"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party involved in the settlement chain."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount158
 * PartyIdentificationAndAccount158}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4
 * PartyIdentificationAndAccount4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentificationAndAccount123", propOrder = {"partyIdentification", "accountIdentification", "processingReference", "processingDate", "subAccountDetails", "contactPerson"})
public class PartyIdentificationAndAccount123 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtyId", required = true)
	protected PartyIdentification70Choice partyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123
	 * PartyIdentificationAndAccount123}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
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
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount158#mmPartyIdentification
	 * PartyIdentificationAndAccount158.mmPartyIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4#mmPartyIdentification
	 * PartyIdentificationAndAccount4.mmPartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationAndAccount123, PartyIdentification70Choice> mmPartyIdentification = new MMMessageAttribute<PartyIdentificationAndAccount123, PartyIdentification70Choice>() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount123.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationAndAccount158.mmPartyIdentification);
			previousVersion_lazy = () -> PartyIdentificationAndAccount4.mmPartyIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification70Choice.mmObject();
		}

		@Override
		public PartyIdentification70Choice getValue(PartyIdentificationAndAccount123 obj) {
			return obj.getPartyIdentification();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount123 obj, PartyIdentification70Choice value) {
			obj.setPartyIdentification(value);
		}
	};
	@XmlElement(name = "AcctId")
	protected Max35Text accountIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123
	 * PartyIdentificationAndAccount123}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the account owned by the party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount158#mmAccountIdentification
	 * PartyIdentificationAndAccount158.mmAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4#mmAccountIdentification
	 * PartyIdentificationAndAccount4.mmAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationAndAccount123, Optional<Max35Text>> mmAccountIdentification = new MMMessageAttribute<PartyIdentificationAndAccount123, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount123.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Identification of the account owned by the party.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationAndAccount158.mmAccountIdentification);
			previousVersion_lazy = () -> PartyIdentificationAndAccount4.mmAccountIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PartyIdentificationAndAccount123 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount123 obj, Optional<Max35Text> value) {
			obj.setAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcgRef")
	protected Max35Text processingReference;
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
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123
	 * PartyIdentificationAndAccount123}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reference of the transaction at the party identified in the sequence."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount158#mmProcessingReference
	 * PartyIdentificationAndAccount158.mmProcessingReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4#mmProcessingReference
	 * PartyIdentificationAndAccount4.mmProcessingReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationAndAccount123, Optional<Max35Text>> mmProcessingReference = new MMMessageAttribute<PartyIdentificationAndAccount123, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount123.mmObject();
			isDerived = false;
			xmlTag = "PrcgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingReference";
			definition = "Specifies the reference of the transaction at the party identified in the sequence.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationAndAccount158.mmProcessingReference);
			previousVersion_lazy = () -> PartyIdentificationAndAccount4.mmProcessingReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PartyIdentificationAndAccount123 obj) {
			return obj.getProcessingReference();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount123 obj, Optional<Max35Text> value) {
			obj.setProcessingReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcgDt")
	protected DateAndDateTimeChoice processingDate;
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
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123
	 * PartyIdentificationAndAccount123}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and optionally the time, at which this transaction was processed by the party identified in this sequence."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount158#mmProcessingDate
	 * PartyIdentificationAndAccount158.mmProcessingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4#mmProcessingDate
	 * PartyIdentificationAndAccount4.mmProcessingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationAndAccount123, Optional<DateAndDateTimeChoice>> mmProcessingDate = new MMMessageAttribute<PartyIdentificationAndAccount123, Optional<DateAndDateTimeChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount123.mmObject();
			isDerived = false;
			xmlTag = "PrcgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingDate";
			definition = "Date and optionally the time, at which this transaction was processed by the party identified in this sequence.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationAndAccount158.mmProcessingDate);
			previousVersion_lazy = () -> PartyIdentificationAndAccount4.mmProcessingDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(PartyIdentificationAndAccount123 obj) {
			return obj.getProcessingDate();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount123 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setProcessingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SubAcctDtls")
	protected SubAccount5 subAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubAccount5
	 * SubAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmSubAccount
	 * Account.mmSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123
	 * PartyIdentificationAndAccount123}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business relationship between two entities; one entity is the account owner, the other entity is the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount158#mmSubAccountDetails
	 * PartyIdentificationAndAccount158.mmSubAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4#mmSubAccountDetails
	 * PartyIdentificationAndAccount4.mmSubAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentificationAndAccount123, Optional<SubAccount5>> mmSubAccountDetails = new MMMessageAssociationEnd<PartyIdentificationAndAccount123, Optional<SubAccount5>>() {
		{
			businessElementTrace_lazy = () -> Account.mmSubAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount123.mmObject();
			isDerived = false;
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Business relationship between two entities; one entity is the account owner, the other entity is the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationAndAccount158.mmSubAccountDetails);
			previousVersion_lazy = () -> PartyIdentificationAndAccount4.mmSubAccountDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SubAccount5.mmObject();
		}

		@Override
		public Optional<SubAccount5> getValue(PartyIdentificationAndAccount123 obj) {
			return obj.getSubAccountDetails();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount123 obj, Optional<SubAccount5> value) {
			obj.setSubAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CtctPrsn")
	protected ContactIdentification2 contactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContactIdentification2
	 * ContactIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount123
	 * PartyIdentificationAndAccount123}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctPrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contact person and contact information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount158#mmContactPerson
	 * PartyIdentificationAndAccount158.mmContactPerson}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4#mmContactPerson
	 * PartyIdentificationAndAccount4.mmContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentificationAndAccount123, Optional<ContactIdentification2>> mmContactPerson = new MMMessageAssociationEnd<PartyIdentificationAndAccount123, Optional<ContactIdentification2>>() {
		{
			businessComponentTrace_lazy = () -> ContactPersonRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount123.mmObject();
			isDerived = false;
			xmlTag = "CtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPerson";
			definition = "Contact person and contact information.";
			nextVersions_lazy = () -> Arrays.asList(PartyIdentificationAndAccount158.mmContactPerson);
			previousVersion_lazy = () -> PartyIdentificationAndAccount4.mmContactPerson;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContactIdentification2.mmObject();
		}

		@Override
		public Optional<ContactIdentification2> getValue(PartyIdentificationAndAccount123 obj) {
			return obj.getContactPerson();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount123 obj, Optional<ContactIdentification2> value) {
			obj.setContactPerson(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentificationAndAccount123.mmPartyIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount123.mmAccountIdentification,
						com.tools20022.repository.msg.PartyIdentificationAndAccount123.mmProcessingReference, com.tools20022.repository.msg.PartyIdentificationAndAccount123.mmProcessingDate,
						com.tools20022.repository.msg.PartyIdentificationAndAccount123.mmSubAccountDetails, com.tools20022.repository.msg.PartyIdentificationAndAccount123.mmContactPerson);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentificationAndAccount123";
				definition = "Party involved in the settlement chain.";
				nextVersions_lazy = () -> Arrays.asList(PartyIdentificationAndAccount158.mmObject());
				previousVersion_lazy = () -> PartyIdentificationAndAccount4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification70Choice getPartyIdentification() {
		return partyIdentification;
	}

	public PartyIdentificationAndAccount123 setPartyIdentification(PartyIdentification70Choice partyIdentification) {
		this.partyIdentification = Objects.requireNonNull(partyIdentification);
		return this;
	}

	public Optional<Max35Text> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public PartyIdentificationAndAccount123 setAccountIdentification(Max35Text accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}

	public Optional<Max35Text> getProcessingReference() {
		return processingReference == null ? Optional.empty() : Optional.of(processingReference);
	}

	public PartyIdentificationAndAccount123 setProcessingReference(Max35Text processingReference) {
		this.processingReference = processingReference;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getProcessingDate() {
		return processingDate == null ? Optional.empty() : Optional.of(processingDate);
	}

	public PartyIdentificationAndAccount123 setProcessingDate(DateAndDateTimeChoice processingDate) {
		this.processingDate = processingDate;
		return this;
	}

	public Optional<SubAccount5> getSubAccountDetails() {
		return subAccountDetails == null ? Optional.empty() : Optional.of(subAccountDetails);
	}

	public PartyIdentificationAndAccount123 setSubAccountDetails(SubAccount5 subAccountDetails) {
		this.subAccountDetails = subAccountDetails;
		return this;
	}

	public Optional<ContactIdentification2> getContactPerson() {
		return contactPerson == null ? Optional.empty() : Optional.of(contactPerson);
	}

	public PartyIdentificationAndAccount123 setContactPerson(ContactIdentification2 contactPerson) {
		this.contactPerson = contactPerson;
		return this;
	}
}