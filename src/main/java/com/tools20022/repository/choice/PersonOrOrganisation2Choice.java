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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.PersonIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PersonIdentification10;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the identification of a person or an organisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation2Choice#mmLEI
 * PersonOrOrganisation2Choice.mmLEI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation2Choice#mmPerson
 * PersonOrOrganisation2Choice.mmPerson}</li>
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
 * "PersonOrOrganisation2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the identification of a person or an organisation."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice
 * PersonOrOrganisation1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PersonOrOrganisation2Choice", propOrder = {"lEI", "person"})
public class PersonOrOrganisation2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LEI", required = true)
	protected LEIIdentifier lEI;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmLEI
	 * PartyIdentificationInformation.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation2Choice
	 * PersonOrOrganisation2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LEI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal entity identifier of the party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice#mmLEI
	 * PersonOrOrganisation1Choice.mmLEI}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PersonOrOrganisation2Choice, LEIIdentifier> mmLEI = new MMMessageAttribute<PersonOrOrganisation2Choice, LEIIdentifier>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> com.tools20022.repository.choice.PersonOrOrganisation2Choice.mmObject();
			isDerived = false;
			xmlTag = "LEI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LEI";
			definition = "Legal entity identifier of the party.";
			previousVersion_lazy = () -> PersonOrOrganisation1Choice.mmLEI;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public LEIIdentifier getValue(PersonOrOrganisation2Choice obj) {
			return obj.getLEI();
		}

		@Override
		public void setValue(PersonOrOrganisation2Choice obj, LEIIdentifier value) {
			obj.setLEI(value);
		}
	};
	@XmlElement(name = "Prsn", required = true)
	protected PersonIdentification10 person;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PersonIdentification10
	 * PersonIdentification10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation2Choice
	 * PersonOrOrganisation2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Person"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a person."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PersonOrOrganisation1Choice#mmPerson
	 * PersonOrOrganisation1Choice.mmPerson}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PersonOrOrganisation2Choice, PersonIdentification10> mmPerson = new MMMessageAssociationEnd<PersonOrOrganisation2Choice, PersonIdentification10>() {
		{
			businessComponentTrace_lazy = () -> PersonIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PersonOrOrganisation2Choice.mmObject();
			isDerived = false;
			xmlTag = "Prsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Person";
			definition = "Identification of a person.";
			previousVersion_lazy = () -> PersonOrOrganisation1Choice.mmPerson;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PersonIdentification10.mmObject();
		}

		@Override
		public PersonIdentification10 getValue(PersonOrOrganisation2Choice obj) {
			return obj.getPerson();
		}

		@Override
		public void setValue(PersonOrOrganisation2Choice obj, PersonIdentification10 value) {
			obj.setPerson(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PersonOrOrganisation2Choice.mmLEI, com.tools20022.repository.choice.PersonOrOrganisation2Choice.mmPerson);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonOrOrganisation2Choice";
				definition = "Specifies the identification of a person or an organisation.";
				previousVersion_lazy = () -> PersonOrOrganisation1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public LEIIdentifier getLEI() {
		return lEI;
	}

	public PersonOrOrganisation2Choice setLEI(LEIIdentifier lEI) {
		this.lEI = Objects.requireNonNull(lEI);
		return this;
	}

	public PersonIdentification10 getPerson() {
		return person;
	}

	public PersonOrOrganisation2Choice setPerson(PersonIdentification10 person) {
		this.person = Objects.requireNonNull(person);
		return this;
	}
}