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
import com.tools20022.repository.choice.MemberIdentification2Choice;
import com.tools20022.repository.entity.FinancialInstitution;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.entity.SystemMemberRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CommunicationAddressDetails;
import com.tools20022.repository.msg.ContactIdentificationAndAddress;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the members of a system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Member2#mmReturnAddress
 * Member2.mmReturnAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Member2#mmContactReference
 * Member2.mmContactReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Member2#mmCommunicationAddress
 * Member2.mmCommunicationAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SystemMemberRole
 * SystemMemberRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Member2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the members of a system."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2018</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Member2", propOrder = {"returnAddress", "contactReference", "communicationAddress"})
public class Member2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RtrAdr")
	protected List<MemberIdentification2Choice> returnAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MemberIdentification2Choice
	 * MemberIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstitution
	 * FinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Member2
	 * Member2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical/logical address belonging to a member, segregated from its main address that is used for normal operations. The fund return address is used to route messages that require specific attention/exception handling, for example returns or rejects."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Member2, List<MemberIdentification2Choice>> mmReturnAddress = new MMMessageAttribute<Member2, List<MemberIdentification2Choice>>() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Member2.mmObject();
			isDerived = false;
			xmlTag = "RtrAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnAddress";
			definition = "Physical/logical address belonging to a member, segregated from its main address that is used for normal operations. The fund return address is used to route messages that require specific attention/exception handling, for example returns or rejects.";
			minOccurs = 0;
			complexType_lazy = () -> MemberIdentification2Choice.mmObject();
		}

		@Override
		public List<MemberIdentification2Choice> getValue(Member2 obj) {
			return obj.getReturnAddress();
		}

		@Override
		public void setValue(Member2 obj, List<MemberIdentification2Choice> value) {
			obj.setReturnAddress(value);
		}
	};
	@XmlElement(name = "CtctRef")
	protected List<ContactIdentificationAndAddress> contactReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentificationAndAddress
	 * ContactIdentificationAndAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Member2
	 * Member2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in a given organisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Member2, List<ContactIdentificationAndAddress>> mmContactReference = new MMMessageAssociationEnd<Member2, List<ContactIdentificationAndAddress>>() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Member2.mmObject();
			isDerived = false;
			xmlTag = "CtctRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactReference";
			definition = "Person to be contacted in a given organisation.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContactIdentificationAndAddress.mmObject();
		}

		@Override
		public List<ContactIdentificationAndAddress> getValue(Member2 obj) {
			return obj.getContactReference();
		}

		@Override
		public void setValue(Member2 obj, List<ContactIdentificationAndAddress> value) {
			obj.setContactReference(value);
		}
	};
	@XmlElement(name = "ComAdr")
	protected CommunicationAddressDetails communicationAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddressDetails
	 * CommunicationAddressDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmContactPoint
	 * Party.mmContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Member2
	 * Member2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunicationAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number, or virtual address, used for communication."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Member2, Optional<CommunicationAddressDetails>> mmCommunicationAddress = new MMMessageAssociationEnd<Member2, Optional<CommunicationAddressDetails>>() {
		{
			businessElementTrace_lazy = () -> Party.mmContactPoint;
			componentContext_lazy = () -> com.tools20022.repository.msg.Member2.mmObject();
			isDerived = false;
			xmlTag = "ComAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunicationAddress";
			definition = "Number, or virtual address, used for communication.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommunicationAddressDetails.mmObject();
		}

		@Override
		public Optional<CommunicationAddressDetails> getValue(Member2 obj) {
			return obj.getCommunicationAddress();
		}

		@Override
		public void setValue(Member2 obj, Optional<CommunicationAddressDetails> value) {
			obj.setCommunicationAddress(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Member2.mmReturnAddress, com.tools20022.repository.msg.Member2.mmContactReference, com.tools20022.repository.msg.Member2.mmCommunicationAddress);
				trace_lazy = () -> SystemMemberRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Member2";
				definition = "Information about the members of a system.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<MemberIdentification2Choice> getReturnAddress() {
		return returnAddress == null ? returnAddress = new ArrayList<>() : returnAddress;
	}

	public Member2 setReturnAddress(List<MemberIdentification2Choice> returnAddress) {
		this.returnAddress = Objects.requireNonNull(returnAddress);
		return this;
	}

	public List<ContactIdentificationAndAddress> getContactReference() {
		return contactReference == null ? contactReference = new ArrayList<>() : contactReference;
	}

	public Member2 setContactReference(List<ContactIdentificationAndAddress> contactReference) {
		this.contactReference = Objects.requireNonNull(contactReference);
		return this;
	}

	public Optional<CommunicationAddressDetails> getCommunicationAddress() {
		return communicationAddress == null ? Optional.empty() : Optional.of(communicationAddress);
	}

	public Member2 setCommunicationAddress(CommunicationAddressDetails communicationAddress) {
		this.communicationAddress = communicationAddress;
		return this;
	}
}