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
import com.tools20022.repository.choice.PersonOrOrganisation1Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to identify a person or an organisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification76#mmIdentification
 * PartyIdentification76.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification76#mmCountryOfBranch
 * PartyIdentification76.mmCountryOfBranch}</li>
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
 * "PartyIdentification76"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of elements used to identify a person or an organisation."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification79
 * PartyIdentification79}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification12
 * PersonIdentification12}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentification76", propOrder = {"identification", "countryOfBranch"})
public class PartyIdentification76 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected PersonOrOrganisation1Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice
	 * PersonOrOrganisation1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification76
	 * PartyIdentification76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the owner of the investment account which is used to acquire or sell financial instruments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification12#mmOther
	 * PersonIdentification12.mmOther}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentification76, PersonOrOrganisation1Choice> mmIdentification = new MMMessageAssociationEnd<PartyIdentification76, PersonOrOrganisation1Choice>() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification76.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the owner of the investment account which is used to acquire or sell financial instruments.";
			nextVersions_lazy = () -> Arrays.asList(PersonIdentification12.mmOther);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PersonOrOrganisation1Choice.mmObject();
		}

		@Override
		public PersonOrOrganisation1Choice getValue(PartyIdentification76 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(PartyIdentification76 obj, PersonOrOrganisation1Choice value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "CtryOfBrnch")
	protected CountryCode countryOfBranch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmCountry
	 * PostalAddress.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification76
	 * PartyIdentification76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfBrnch"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of the branch that received the order from the client or made an investment decision for a client in accordance with a discretionary mandate given to it by the client."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification12#mmCountryOfBranch
	 * PersonIdentification12.mmCountryOfBranch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentification76, Optional<CountryCode>> mmCountryOfBranch = new MMMessageAttribute<PartyIdentification76, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmCountry;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification76.mmObject();
			isDerived = false;
			xmlTag = "CtryOfBrnch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfBranch";
			definition = "Country of the branch that received the order from the client or made an investment decision for a client in accordance with a discretionary mandate given to it by the client.";
			nextVersions_lazy = () -> Arrays.asList(PersonIdentification12.mmCountryOfBranch);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(PartyIdentification76 obj) {
			return obj.getCountryOfBranch();
		}

		@Override
		public void setValue(PartyIdentification76 obj, Optional<CountryCode> value) {
			obj.setCountryOfBranch(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentification76.mmIdentification, com.tools20022.repository.msg.PartyIdentification76.mmCountryOfBranch);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification76";
				definition = "Set of elements used to identify a person or an organisation.";
				nextVersions_lazy = () -> Arrays.asList(PartyIdentification79.mmObject(), PersonIdentification12.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PersonOrOrganisation1Choice getIdentification() {
		return identification;
	}

	public PartyIdentification76 setIdentification(PersonOrOrganisation1Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<CountryCode> getCountryOfBranch() {
		return countryOfBranch == null ? Optional.empty() : Optional.of(countryOfBranch);
	}

	public PartyIdentification76 setCountryOfBranch(CountryCode countryOfBranch) {
		this.countryOfBranch = countryOfBranch;
		return this;
	}
}