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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.InstructionForMeeting;
import com.tools20022.repository.entity.SecuritiesQuantity;
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
 * Request to execute instructions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestInformation#mmIdentification
 * RequestInformation.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestInformation#mmRequestedExecutionDate
 * RequestInformation.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestInformation#mmQuantityOfSecurity
 * RequestInformation.mmQuantityOfSecurity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InstructionForMeeting
 * InstructionForMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Request to execute instructions."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequestInformation", propOrder = {"identification", "requestedExecutionDate", "quantityOfSecurity"})
public class RequestInformation {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.msg.RequestInformation
	 * RequestInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestInformation, Max35Text> mmIdentification = new MMMessageAttribute<RequestInformation, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestInformation.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(RequestInformation obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(RequestInformation obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "ReqdExctnDt")
	protected ISODateTime requestedExecutionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmRequestedExecutionDate
	 * InstructionForMeeting.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestInformation
	 * RequestInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdExctnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the instruction must b e executed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestInformation, Optional<ISODateTime>> mmRequestedExecutionDate = new MMMessageAttribute<RequestInformation, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmRequestedExecutionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestInformation.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the instruction must b e executed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(RequestInformation obj) {
			return obj.getRequestedExecutionDate();
		}

		@Override
		public void setValue(RequestInformation obj, Optional<ISODateTime> value) {
			obj.setRequestedExecutionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyOfScty")
	protected Number quantityOfSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnit
	 * SecuritiesQuantity.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestInformation
	 * RequestInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyOfScty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityOfSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity expressed as a number, eg, a number of shares."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestInformation, Optional<Number>> mmQuantityOfSecurity = new MMMessageAttribute<RequestInformation, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestInformation.mmObject();
			isDerived = false;
			xmlTag = "QtyOfScty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityOfSecurity";
			definition = "Quantity expressed as a number, eg, a number of shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(RequestInformation obj) {
			return obj.getQuantityOfSecurity();
		}

		@Override
		public void setValue(RequestInformation obj, Optional<Number> value) {
			obj.setQuantityOfSecurity(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestInformation.mmIdentification, com.tools20022.repository.msg.RequestInformation.mmRequestedExecutionDate,
						com.tools20022.repository.msg.RequestInformation.mmQuantityOfSecurity);
				trace_lazy = () -> InstructionForMeeting.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "RequestInformation";
				definition = "Request to execute instructions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public RequestInformation setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<ISODateTime> getRequestedExecutionDate() {
		return requestedExecutionDate == null ? Optional.empty() : Optional.of(requestedExecutionDate);
	}

	public RequestInformation setRequestedExecutionDate(ISODateTime requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
		return this;
	}

	public Optional<Number> getQuantityOfSecurity() {
		return quantityOfSecurity == null ? Optional.empty() : Optional.of(quantityOfSecurity);
	}

	public RequestInformation setQuantityOfSecurity(Number quantityOfSecurity) {
		this.quantityOfSecurity = quantityOfSecurity;
		return this;
	}
}