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
import com.tools20022.repository.choice.DateAndDateTime1Choice;
import com.tools20022.repository.codeset.DateType6Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification13;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the value of a date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.DateFormat56Choice#mmDate
 * DateFormat56Choice.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateFormat56Choice#mmNotSpecifiedDate
 * DateFormat56Choice.mmNotSpecifiedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateFormat56Choice#mmProprietary
 * DateFormat56Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DateFormat56Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the value of a date."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
 * DateFormat4Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DateFormat56Choice", propOrder = {"date", "notSpecifiedDate", "proprietary"})
public class DateFormat56Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dt", required = true)
	protected DateAndDateTime1Choice date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime1Choice
	 * DateAndDateTime1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat56Choice
	 * DateFormat56Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date expressed as an ISO Date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice#mmDate
	 * DateFormat4Choice.mmDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateFormat56Choice, DateAndDateTime1Choice> mmDate = new MMMessageAttribute<DateFormat56Choice, DateAndDateTime1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateFormat56Choice.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date expressed as an ISO Date.";
			previousVersion_lazy = () -> DateFormat4Choice.mmDate;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTime1Choice.mmObject();
		}

		@Override
		public DateAndDateTime1Choice getValue(DateFormat56Choice obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(DateFormat56Choice obj, DateAndDateTime1Choice value) {
			obj.setDate(value);
		}
	};
	@XmlElement(name = "NotSpcfdDt", required = true)
	protected DateType6Code notSpecifiedDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DateType6Code
	 * DateType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat56Choice
	 * DateFormat56Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotSpcfdDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The date is not specified, eg, the date is unknown."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice#mmNotSpecifiedDate
	 * DateFormat4Choice.mmNotSpecifiedDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateFormat56Choice, DateType6Code> mmNotSpecifiedDate = new MMMessageAttribute<DateFormat56Choice, DateType6Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateFormat56Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedDate";
			definition = "The date is not specified, eg, the date is unknown.";
			previousVersion_lazy = () -> DateFormat4Choice.mmNotSpecifiedDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DateType6Code.mmObject();
		}

		@Override
		public DateType6Code getValue(DateFormat56Choice obj) {
			return obj.getNotSpecifiedDate();
		}

		@Override
		public void setValue(DateFormat56Choice obj, DateType6Code value) {
			obj.setNotSpecifiedDate(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected GenericIdentification13 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification13
	 * GenericIdentification13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat56Choice
	 * DateFormat56Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary scheme to specify a date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice#mmProprietary
	 * DateFormat4Choice.mmProprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateFormat56Choice, GenericIdentification13> mmProprietary = new MMMessageAttribute<DateFormat56Choice, GenericIdentification13>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.DateFormat56Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary scheme to specify a date.";
			previousVersion_lazy = () -> DateFormat4Choice.mmProprietary;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification13.mmObject();
		}

		@Override
		public GenericIdentification13 getValue(DateFormat56Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(DateFormat56Choice obj, GenericIdentification13 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DateFormat56Choice.mmDate, com.tools20022.repository.choice.DateFormat56Choice.mmNotSpecifiedDate,
						com.tools20022.repository.choice.DateFormat56Choice.mmProprietary);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DateFormat56Choice";
				definition = "Specifies the value of a date.";
				previousVersion_lazy = () -> DateFormat4Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DateAndDateTime1Choice getDate() {
		return date;
	}

	public DateFormat56Choice setDate(DateAndDateTime1Choice date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public DateType6Code getNotSpecifiedDate() {
		return notSpecifiedDate;
	}

	public DateFormat56Choice setNotSpecifiedDate(DateType6Code notSpecifiedDate) {
		this.notSpecifiedDate = Objects.requireNonNull(notSpecifiedDate);
		return this;
	}

	public GenericIdentification13 getProprietary() {
		return proprietary;
	}

	public DateFormat56Choice setProprietary(GenericIdentification13 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}