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
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max45Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.CardholderRole;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.entity.PersonName;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Data related to the cardholder.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder10#mmIdentification
 * Cardholder10.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder10#mmName
 * Cardholder10.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder10#mmLanguage
 * Cardholder10.mmLanguage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder10#mmBillingAddress
 * Cardholder10.mmBillingAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder10#mmShippingAddress
 * Cardholder10.mmShippingAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder10#mmTripNumber
 * Cardholder10.mmTripNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder10#mmVehicle
 * Cardholder10.mmVehicle}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder10#mmAuthentication
 * Cardholder10.mmAuthentication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Cardholder10#mmTransactionVerificationResult
 * Cardholder10.mmTransactionVerificationResult}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder10#mmPersonalData
 * Cardholder10.mmPersonalData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardholderRole
 * CardholderRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Cardholder10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Data related to the cardholder."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder12 Cardholder12}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Cardholder9
 * Cardholder9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Cardholder10", propOrder = {"identification", "name", "language", "billingAddress", "shippingAddress", "tripNumber", "vehicle", "authentication", "transactionVerificationResult", "personalData"})
public class Cardholder10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id")
	protected PersonIdentification11 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PersonIdentification11
	 * PersonIdentification11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder10 Cardholder10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the cardholder involved in a transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder12#mmIdentification
	 * Cardholder12.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder9#mmIdentification
	 * Cardholder9.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Cardholder10, Optional<PersonIdentification11>> mmIdentification = new MMMessageAssociationEnd<Cardholder10, Optional<PersonIdentification11>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder10.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the cardholder involved in a transaction.";
			nextVersions_lazy = () -> Arrays.asList(Cardholder12.mmIdentification);
			previousVersion_lazy = () -> Cardholder9.mmIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PersonIdentification11.mmObject();
		}

		@Override
		public Optional<PersonIdentification11> getValue(Cardholder10 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Cardholder10 obj, Optional<PersonIdentification11> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Nm")
	protected Max45Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max45Text
	 * Max45Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmGivenName
	 * PersonName.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder10 Cardholder10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder name associated with the card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder12#mmName
	 * Cardholder12.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder9#mmName
	 * Cardholder9.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cardholder10, Optional<Max45Text>> mmName = new MMMessageAttribute<Cardholder10, Optional<Max45Text>>() {
		{
			businessElementTrace_lazy = () -> PersonName.mmGivenName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder10.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Cardholder name associated with the card.";
			nextVersions_lazy = () -> Arrays.asList(Cardholder12.mmName);
			previousVersion_lazy = () -> Cardholder9.mmName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max45Text.mmObject();
		}

		@Override
		public Optional<Max45Text> getValue(Cardholder10 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(Cardholder10 obj, Optional<Max45Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "Lang")
	protected LanguageCode language;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmLanguage
	 * Person.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder10 Cardholder10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lang"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Language selected for the cardholder interface during the transaction.\r\nReference ISO 639-1 (alpha-2) et ISO 639-2 (alpha-3)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder12#mmLanguage
	 * Cardholder12.mmLanguage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder9#mmLanguage
	 * Cardholder9.mmLanguage}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cardholder10, Optional<LanguageCode>> mmLanguage = new MMMessageAttribute<Cardholder10, Optional<LanguageCode>>() {
		{
			businessElementTrace_lazy = () -> Person.mmLanguage;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder10.mmObject();
			isDerived = false;
			xmlTag = "Lang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Language";
			definition = "Language selected for the cardholder interface during the transaction.\r\nReference ISO 639-1 (alpha-2) et ISO 639-2 (alpha-3).";
			nextVersions_lazy = () -> Arrays.asList(Cardholder12.mmLanguage);
			previousVersion_lazy = () -> Cardholder9.mmLanguage;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public Optional<LanguageCode> getValue(Cardholder10 obj) {
			return obj.getLanguage();
		}

		@Override
		public void setValue(Cardholder10 obj, Optional<LanguageCode> value) {
			obj.setLanguage(value.orElse(null));
		}
	};
	@XmlElement(name = "BllgAdr")
	protected PostalAddress18 billingAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress18
	 * PostalAddress18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder10 Cardholder10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BllgAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal address of the owner of the payment card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder12#mmBillingAddress
	 * Cardholder12.mmBillingAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder9#mmBillingAddress
	 * Cardholder9.mmBillingAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Cardholder10, Optional<PostalAddress18>> mmBillingAddress = new MMMessageAssociationEnd<Cardholder10, Optional<PostalAddress18>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder10.mmObject();
			isDerived = false;
			xmlTag = "BllgAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingAddress";
			definition = "Postal address of the owner of the payment card.";
			nextVersions_lazy = () -> Arrays.asList(Cardholder12.mmBillingAddress);
			previousVersion_lazy = () -> Cardholder9.mmBillingAddress;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress18.mmObject();
		}

		@Override
		public Optional<PostalAddress18> getValue(Cardholder10 obj) {
			return obj.getBillingAddress();
		}

		@Override
		public void setValue(Cardholder10 obj, Optional<PostalAddress18> value) {
			obj.setBillingAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "ShppgAdr")
	protected PostalAddress18 shippingAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress18
	 * PostalAddress18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder10 Cardholder10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShppgAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal address for delivery of goods or services."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder12#mmShippingAddress
	 * Cardholder12.mmShippingAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder9#mmShippingAddress
	 * Cardholder9.mmShippingAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Cardholder10, Optional<PostalAddress18>> mmShippingAddress = new MMMessageAssociationEnd<Cardholder10, Optional<PostalAddress18>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder10.mmObject();
			isDerived = false;
			xmlTag = "ShppgAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAddress";
			definition = "Postal address for delivery of goods or services.";
			nextVersions_lazy = () -> Arrays.asList(Cardholder12.mmShippingAddress);
			previousVersion_lazy = () -> Cardholder9.mmShippingAddress;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress18.mmObject();
		}

		@Override
		public Optional<PostalAddress18> getValue(Cardholder10 obj) {
			return obj.getShippingAddress();
		}

		@Override
		public void setValue(Cardholder10 obj, Optional<PostalAddress18> value) {
			obj.setShippingAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "TripNb")
	protected Max35Text tripNumber;
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
	 * {@linkplain com.tools20022.repository.msg.Cardholder10 Cardholder10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TripNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the trip."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder12#mmTripNumber
	 * Cardholder12.mmTripNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cardholder10, Optional<Max35Text>> mmTripNumber = new MMMessageAttribute<Cardholder10, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder10.mmObject();
			isDerived = false;
			xmlTag = "TripNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripNumber";
			definition = "Identification of the trip.";
			nextVersions_lazy = () -> Arrays.asList(Cardholder12.mmTripNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Cardholder10 obj) {
			return obj.getTripNumber();
		}

		@Override
		public void setValue(Cardholder10 obj, Optional<Max35Text> value) {
			obj.setTripNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "Vhcl")
	protected Vehicle1 vehicle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Vehicle1 Vehicle1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder10 Cardholder10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vhcl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vehicle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the vehicle used for the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder12#mmVehicle
	 * Cardholder12.mmVehicle}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Cardholder10, Optional<Vehicle1>> mmVehicle = new MMMessageAssociationEnd<Cardholder10, Optional<Vehicle1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder10.mmObject();
			isDerived = false;
			xmlTag = "Vhcl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vehicle";
			definition = "Information related to the vehicle used for the transaction.";
			nextVersions_lazy = () -> Arrays.asList(Cardholder12.mmVehicle);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Vehicle1.mmObject();
		}

		@Override
		public Optional<Vehicle1> getValue(Cardholder10 obj) {
			return obj.getVehicle();
		}

		@Override
		public void setValue(Cardholder10 obj, Optional<Vehicle1> value) {
			obj.setVehicle(value.orElse(null));
		}
	};
	@XmlElement(name = "Authntcn")
	protected List<CardholderAuthentication9> authentication;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication9
	 * CardholderAuthentication9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardholderRole#mmAuthentication
	 * CardholderRole.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder10 Cardholder10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Authntcn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authentication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method and data intended to be used for this transaction to authenticate the cardholder and its card."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder12#mmAuthentication
	 * Cardholder12.mmAuthentication}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder9#mmAuthentication
	 * Cardholder9.mmAuthentication}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Cardholder10, List<CardholderAuthentication9>> mmAuthentication = new MMMessageAssociationEnd<Cardholder10, List<CardholderAuthentication9>>() {
		{
			businessElementTrace_lazy = () -> CardholderRole.mmAuthentication;
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder10.mmObject();
			isDerived = false;
			xmlTag = "Authntcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authentication";
			definition = "Method and data intended to be used for this transaction to authenticate the cardholder and its card.";
			nextVersions_lazy = () -> Arrays.asList(Cardholder12.mmAuthentication);
			previousVersion_lazy = () -> Cardholder9.mmAuthentication;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardholderAuthentication9.mmObject();
		}

		@Override
		public List<CardholderAuthentication9> getValue(Cardholder10 obj) {
			return obj.getAuthentication();
		}

		@Override
		public void setValue(Cardholder10 obj, List<CardholderAuthentication9> value) {
			obj.setAuthentication(value);
		}
	};
	@XmlElement(name = "TxVrfctnRslt")
	protected List<TransactionVerificationResult4> transactionVerificationResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4
	 * TransactionVerificationResult4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder10 Cardholder10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxVrfctnRslt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionVerificationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of performed verifications for the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder12#mmTransactionVerificationResult
	 * Cardholder12.mmTransactionVerificationResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder9#mmTransactionVerificationResult
	 * Cardholder9.mmTransactionVerificationResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Cardholder10, List<TransactionVerificationResult4>> mmTransactionVerificationResult = new MMMessageAssociationEnd<Cardholder10, List<TransactionVerificationResult4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder10.mmObject();
			isDerived = false;
			xmlTag = "TxVrfctnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionVerificationResult";
			definition = "Result of performed verifications for the transaction.";
			nextVersions_lazy = () -> Arrays.asList(Cardholder12.mmTransactionVerificationResult);
			previousVersion_lazy = () -> Cardholder9.mmTransactionVerificationResult;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionVerificationResult4.mmObject();
		}

		@Override
		public List<TransactionVerificationResult4> getValue(Cardholder10 obj) {
			return obj.getTransactionVerificationResult();
		}

		@Override
		public void setValue(Cardholder10 obj, List<TransactionVerificationResult4> value) {
			obj.setTransactionVerificationResult(value);
		}
	};
	@XmlElement(name = "PrsnlData")
	protected Max70Text personalData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder10 Cardholder10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrsnlData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonalData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies personal data related to the cardholder."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder12#mmPersonalData
	 * Cardholder12.mmPersonalData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Cardholder9#mmPersonalData
	 * Cardholder9.mmPersonalData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Cardholder10, Optional<Max70Text>> mmPersonalData = new MMMessageAttribute<Cardholder10, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Cardholder10.mmObject();
			isDerived = false;
			xmlTag = "PrsnlData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonalData";
			definition = "Identifies personal data related to the cardholder.";
			nextVersions_lazy = () -> Arrays.asList(Cardholder12.mmPersonalData);
			previousVersion_lazy = () -> Cardholder9.mmPersonalData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(Cardholder10 obj) {
			return obj.getPersonalData();
		}

		@Override
		public void setValue(Cardholder10 obj, Optional<Max70Text> value) {
			obj.setPersonalData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cardholder10.mmIdentification, com.tools20022.repository.msg.Cardholder10.mmName, com.tools20022.repository.msg.Cardholder10.mmLanguage,
						com.tools20022.repository.msg.Cardholder10.mmBillingAddress, com.tools20022.repository.msg.Cardholder10.mmShippingAddress, com.tools20022.repository.msg.Cardholder10.mmTripNumber,
						com.tools20022.repository.msg.Cardholder10.mmVehicle, com.tools20022.repository.msg.Cardholder10.mmAuthentication, com.tools20022.repository.msg.Cardholder10.mmTransactionVerificationResult,
						com.tools20022.repository.msg.Cardholder10.mmPersonalData);
				trace_lazy = () -> CardholderRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cardholder10";
				definition = "Data related to the cardholder.";
				nextVersions_lazy = () -> Arrays.asList(Cardholder12.mmObject());
				previousVersion_lazy = () -> Cardholder9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PersonIdentification11> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public Cardholder10 setIdentification(PersonIdentification11 identification) {
		this.identification = identification;
		return this;
	}

	public Optional<Max45Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public Cardholder10 setName(Max45Text name) {
		this.name = name;
		return this;
	}

	public Optional<LanguageCode> getLanguage() {
		return language == null ? Optional.empty() : Optional.of(language);
	}

	public Cardholder10 setLanguage(LanguageCode language) {
		this.language = language;
		return this;
	}

	public Optional<PostalAddress18> getBillingAddress() {
		return billingAddress == null ? Optional.empty() : Optional.of(billingAddress);
	}

	public Cardholder10 setBillingAddress(PostalAddress18 billingAddress) {
		this.billingAddress = billingAddress;
		return this;
	}

	public Optional<PostalAddress18> getShippingAddress() {
		return shippingAddress == null ? Optional.empty() : Optional.of(shippingAddress);
	}

	public Cardholder10 setShippingAddress(PostalAddress18 shippingAddress) {
		this.shippingAddress = shippingAddress;
		return this;
	}

	public Optional<Max35Text> getTripNumber() {
		return tripNumber == null ? Optional.empty() : Optional.of(tripNumber);
	}

	public Cardholder10 setTripNumber(Max35Text tripNumber) {
		this.tripNumber = tripNumber;
		return this;
	}

	public Optional<Vehicle1> getVehicle() {
		return vehicle == null ? Optional.empty() : Optional.of(vehicle);
	}

	public Cardholder10 setVehicle(Vehicle1 vehicle) {
		this.vehicle = vehicle;
		return this;
	}

	public List<CardholderAuthentication9> getAuthentication() {
		return authentication == null ? authentication = new ArrayList<>() : authentication;
	}

	public Cardholder10 setAuthentication(List<CardholderAuthentication9> authentication) {
		this.authentication = Objects.requireNonNull(authentication);
		return this;
	}

	public List<TransactionVerificationResult4> getTransactionVerificationResult() {
		return transactionVerificationResult == null ? transactionVerificationResult = new ArrayList<>() : transactionVerificationResult;
	}

	public Cardholder10 setTransactionVerificationResult(List<TransactionVerificationResult4> transactionVerificationResult) {
		this.transactionVerificationResult = Objects.requireNonNull(transactionVerificationResult);
		return this;
	}

	public Optional<Max70Text> getPersonalData() {
		return personalData == null ? Optional.empty() : Optional.of(personalData);
	}

	public Cardholder10 setPersonalData(Max70Text personalData) {
		this.personalData = personalData;
		return this;
	}
}