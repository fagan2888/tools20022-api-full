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
import com.tools20022.repository.datatype.RequestedIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to report on the cash balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria1#mmTypeIndicator
 * CashBalanceReturnCriteria1.mmTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria1#mmStatusIndicator
 * CashBalanceReturnCriteria1.mmStatusIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria1#mmValueDateIndicator
 * CashBalanceReturnCriteria1.mmValueDateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria1#mmNumberOfPaymentsIndicator
 * CashBalanceReturnCriteria1.mmNumberOfPaymentsIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashBalanceReturnCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on the cash balance."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria
 * CashBalanceReturnCriteria}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashBalanceReturnCriteria1", propOrder = {"typeIndicator", "statusIndicator", "valueDateIndicator", "numberOfPaymentsIndicator"})
public class CashBalanceReturnCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TpInd", required = true)
	protected RequestedIndicator typeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria1
	 * CashBalanceReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the balance type is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria#mmTypeIndicator
	 * CashBalanceReturnCriteria.mmTypeIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashBalanceReturnCriteria1, RequestedIndicator> mmTypeIndicator = new MMMessageAttribute<CashBalanceReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashBalanceReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "TpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeIndicator";
			definition = "Indicates whether the balance type is requested.";
			previousVersion_lazy = () -> CashBalanceReturnCriteria.mmTypeIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(CashBalanceReturnCriteria1 obj) {
			return obj.getTypeIndicator();
		}

		@Override
		public void setValue(CashBalanceReturnCriteria1 obj, RequestedIndicator value) {
			obj.setTypeIndicator(value);
		}
	};
	@XmlElement(name = "StsInd", required = true)
	protected RequestedIndicator statusIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria1
	 * CashBalanceReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the balance status is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria#mmStatusIndicator
	 * CashBalanceReturnCriteria.mmStatusIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashBalanceReturnCriteria1, RequestedIndicator> mmStatusIndicator = new MMMessageAttribute<CashBalanceReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashBalanceReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "StsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusIndicator";
			definition = "Indicates whether the balance status is requested.";
			previousVersion_lazy = () -> CashBalanceReturnCriteria.mmStatusIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(CashBalanceReturnCriteria1 obj) {
			return obj.getStatusIndicator();
		}

		@Override
		public void setValue(CashBalanceReturnCriteria1 obj, RequestedIndicator value) {
			obj.setStatusIndicator(value);
		}
	};
	@XmlElement(name = "ValDtInd", required = true)
	protected RequestedIndicator valueDateIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria1
	 * CashBalanceReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the value date is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria#mmValueDateIndicator
	 * CashBalanceReturnCriteria.mmValueDateIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashBalanceReturnCriteria1, RequestedIndicator> mmValueDateIndicator = new MMMessageAttribute<CashBalanceReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashBalanceReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ValDtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDateIndicator";
			definition = "Indicates whether the value date is requested.";
			previousVersion_lazy = () -> CashBalanceReturnCriteria.mmValueDateIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(CashBalanceReturnCriteria1 obj) {
			return obj.getValueDateIndicator();
		}

		@Override
		public void setValue(CashBalanceReturnCriteria1 obj, RequestedIndicator value) {
			obj.setValueDateIndicator(value);
		}
	};
	@XmlElement(name = "NbOfPmtsInd", required = true)
	protected RequestedIndicator numberOfPaymentsIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria1
	 * CashBalanceReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfPmtsInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfPaymentsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the number of payment is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceReturnCriteria#mmNumberOfPaymentsIndicator
	 * CashBalanceReturnCriteria.mmNumberOfPaymentsIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashBalanceReturnCriteria1, RequestedIndicator> mmNumberOfPaymentsIndicator = new MMMessageAttribute<CashBalanceReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashBalanceReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "NbOfPmtsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfPaymentsIndicator";
			definition = "Indicates whether the number of payment is requested.";
			previousVersion_lazy = () -> CashBalanceReturnCriteria.mmNumberOfPaymentsIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(CashBalanceReturnCriteria1 obj) {
			return obj.getNumberOfPaymentsIndicator();
		}

		@Override
		public void setValue(CashBalanceReturnCriteria1 obj, RequestedIndicator value) {
			obj.setNumberOfPaymentsIndicator(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalanceReturnCriteria1.mmTypeIndicator, com.tools20022.repository.msg.CashBalanceReturnCriteria1.mmStatusIndicator,
						com.tools20022.repository.msg.CashBalanceReturnCriteria1.mmValueDateIndicator, com.tools20022.repository.msg.CashBalanceReturnCriteria1.mmNumberOfPaymentsIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashBalanceReturnCriteria1";
				definition = "Defines the criteria used to report on the cash balance.";
				previousVersion_lazy = () -> CashBalanceReturnCriteria.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public RequestedIndicator getTypeIndicator() {
		return typeIndicator;
	}

	public CashBalanceReturnCriteria1 setTypeIndicator(RequestedIndicator typeIndicator) {
		this.typeIndicator = Objects.requireNonNull(typeIndicator);
		return this;
	}

	public RequestedIndicator getStatusIndicator() {
		return statusIndicator;
	}

	public CashBalanceReturnCriteria1 setStatusIndicator(RequestedIndicator statusIndicator) {
		this.statusIndicator = Objects.requireNonNull(statusIndicator);
		return this;
	}

	public RequestedIndicator getValueDateIndicator() {
		return valueDateIndicator;
	}

	public CashBalanceReturnCriteria1 setValueDateIndicator(RequestedIndicator valueDateIndicator) {
		this.valueDateIndicator = Objects.requireNonNull(valueDateIndicator);
		return this;
	}

	public RequestedIndicator getNumberOfPaymentsIndicator() {
		return numberOfPaymentsIndicator;
	}

	public CashBalanceReturnCriteria1 setNumberOfPaymentsIndicator(RequestedIndicator numberOfPaymentsIndicator) {
		this.numberOfPaymentsIndicator = Objects.requireNonNull(numberOfPaymentsIndicator);
		return this;
	}
}