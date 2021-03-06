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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.SystemIdentificationChoice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BusinessDayInformationDetails1;
import com.tools20022.repository.msg.ErrorHandling2;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reports either on business day information or on a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReport1#BusinessDayInformationOrBusinessErrorRule
 * BusinessDayInformationReport1.BusinessDayInformationOrBusinessErrorRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReport1#mmSystemIdentification
 * BusinessDayInformationReport1.mmSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReport1#mmBusinessError
 * BusinessDayInformationReport1.mmBusinessError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReport1#mmBusinessDayInformation
 * BusinessDayInformationReport1.mmBusinessDayInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessDayInformationReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reports either on business day information or on a business error."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BusinessDayInformationReport1", propOrder = {"systemIdentification", "businessError", "businessDayInformation"})
public class BusinessDayInformationReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SysId", required = true)
	protected List<SystemIdentificationChoice> systemIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SystemIdentificationChoice
	 * SystemIdentificationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReport1
	 * BusinessDayInformationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a particular cash clearing system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessDayInformationReport1, List<SystemIdentificationChoice>> mmSystemIdentification = new MMMessageAttribute<BusinessDayInformationReport1, List<SystemIdentificationChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayInformationReport1.mmObject();
			isDerived = false;
			xmlTag = "SysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemIdentification";
			definition = "Identification of a particular cash clearing system.";
			minOccurs = 1;
			complexType_lazy = () -> SystemIdentificationChoice.mmObject();
		}

		@Override
		public List<SystemIdentificationChoice> getValue(BusinessDayInformationReport1 obj) {
			return obj.getSystemIdentification();
		}

		@Override
		public void setValue(BusinessDayInformationReport1 obj, List<SystemIdentificationChoice> value) {
			obj.setSystemIdentification(value);
		}
	};
	@XmlElement(name = "BizErr", required = true)
	protected ErrorHandling2 businessError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling2
	 * ErrorHandling2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReport1
	 * BusinessDayInformationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the requested business information is not given."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BusinessDayInformationReport1, ErrorHandling2> mmBusinessError = new MMMessageAssociationEnd<BusinessDayInformationReport1, ErrorHandling2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayInformationReport1.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason the requested business information is not given.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling2.mmObject();
		}

		@Override
		public ErrorHandling2 getValue(BusinessDayInformationReport1 obj) {
			return obj.getBusinessError();
		}

		@Override
		public void setValue(BusinessDayInformationReport1 obj, ErrorHandling2 value) {
			obj.setBusinessError(value);
		}
	};
	@XmlElement(name = "BizDayInf", required = true)
	protected BusinessDayInformationDetails1 businessDayInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationDetails1
	 * BusinessDayInformationDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReport1
	 * BusinessDayInformationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizDayInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessDayInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The requested business information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BusinessDayInformationReport1, BusinessDayInformationDetails1> mmBusinessDayInformation = new MMMessageAssociationEnd<BusinessDayInformationReport1, BusinessDayInformationDetails1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayInformationReport1.mmObject();
			isDerived = false;
			xmlTag = "BizDayInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessDayInformation";
			definition = "The requested business information.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BusinessDayInformationDetails1.mmObject();
		}

		@Override
		public BusinessDayInformationDetails1 getValue(BusinessDayInformationReport1 obj) {
			return obj.getBusinessDayInformation();
		}

		@Override
		public void setValue(BusinessDayInformationReport1 obj, BusinessDayInformationDetails1 value) {
			obj.setBusinessDayInformation(value);
		}
	};
	/**
	 * Either BusinessDayInformation or BusinessError must be present, but not
	 * both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReport1
	 * BusinessDayInformationReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReport1#mmBusinessError
	 * BusinessDayInformationReport1.mmBusinessError}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationReport1#mmBusinessDayInformation
	 * BusinessDayInformationReport1.mmBusinessDayInformation}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessDayInformationOrBusinessErrorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either BusinessDayInformation or BusinessError must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor BusinessDayInformationOrBusinessErrorRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessDayInformationOrBusinessErrorRule";
			definition = "Either BusinessDayInformation or BusinessError must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.BusinessDayInformationReport1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BusinessDayInformationReport1.mmBusinessError, com.tools20022.repository.msg.BusinessDayInformationReport1.mmBusinessDayInformation);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BusinessDayInformationReport1.mmSystemIdentification, com.tools20022.repository.msg.BusinessDayInformationReport1.mmBusinessError,
						com.tools20022.repository.msg.BusinessDayInformationReport1.mmBusinessDayInformation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "BusinessDayInformationReport1";
				definition = "Reports either on business day information or on a business error.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BusinessDayInformationReport1.BusinessDayInformationOrBusinessErrorRule);
			}
		});
		return mmObject_lazy.get();
	}

	public List<SystemIdentificationChoice> getSystemIdentification() {
		return systemIdentification == null ? systemIdentification = new ArrayList<>() : systemIdentification;
	}

	public BusinessDayInformationReport1 setSystemIdentification(List<SystemIdentificationChoice> systemIdentification) {
		this.systemIdentification = Objects.requireNonNull(systemIdentification);
		return this;
	}

	public ErrorHandling2 getBusinessError() {
		return businessError;
	}

	public BusinessDayInformationReport1 setBusinessError(ErrorHandling2 businessError) {
		this.businessError = Objects.requireNonNull(businessError);
		return this;
	}

	public BusinessDayInformationDetails1 getBusinessDayInformation() {
		return businessDayInformation;
	}

	public BusinessDayInformationReport1 setBusinessDayInformation(BusinessDayInformationDetails1 businessDayInformation) {
		this.businessDayInformation = Objects.requireNonNull(businessDayInformation);
		return this;
	}
}