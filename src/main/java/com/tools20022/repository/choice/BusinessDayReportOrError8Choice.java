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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BusinessDay7;
import com.tools20022.repository.msg.ErrorHandling4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between business day information details or a business error when the
 * requested data cannot be retrieved.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError8Choice#mmBusinessDayInformation
 * BusinessDayReportOrError8Choice.mmBusinessDayInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError8Choice#mmBusinessError
 * BusinessDayReportOrError8Choice.mmBusinessError}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessDayReportOrError8Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between business day information details or a business error when the requested data cannot be retrieved."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError6Choice
 * BusinessDayReportOrError6Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BusinessDayReportOrError8Choice", propOrder = {"businessDayInformation", "businessError"})
public class BusinessDayReportOrError8Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BizDayInf", required = true)
	protected BusinessDay7 businessDayInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BusinessDay7
	 * BusinessDay7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError8Choice
	 * BusinessDayReportOrError8Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizDayInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessDayInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested system details for a specific business day."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError6Choice#mmBusinessDayInformation
	 * BusinessDayReportOrError6Choice.mmBusinessDayInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BusinessDayReportOrError8Choice, BusinessDay7> mmBusinessDayInformation = new MMMessageAssociationEnd<BusinessDayReportOrError8Choice, BusinessDay7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.BusinessDayReportOrError8Choice.mmObject();
			isDerived = false;
			xmlTag = "BizDayInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessDayInformation";
			definition = "Requested system details for a specific business day.";
			previousVersion_lazy = () -> BusinessDayReportOrError6Choice.mmBusinessDayInformation;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BusinessDay7.mmObject();
		}

		@Override
		public BusinessDay7 getValue(BusinessDayReportOrError8Choice obj) {
			return obj.getBusinessDayInformation();
		}

		@Override
		public void setValue(BusinessDayReportOrError8Choice obj, BusinessDay7 value) {
			obj.setBusinessDayInformation(value);
		}
	};
	@XmlElement(name = "BizErr", required = true)
	protected List<ErrorHandling4> businessError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling4
	 * ErrorHandling4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError8Choice
	 * BusinessDayReportOrError8Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError6Choice#mmBusinessError
	 * BusinessDayReportOrError6Choice.mmBusinessError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BusinessDayReportOrError8Choice, List<ErrorHandling4>> mmBusinessError = new MMMessageAssociationEnd<BusinessDayReportOrError8Choice, List<ErrorHandling4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.BusinessDayReportOrError8Choice.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason the requested business information is not given.";
			previousVersion_lazy = () -> BusinessDayReportOrError6Choice.mmBusinessError;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling4.mmObject();
		}

		@Override
		public List<ErrorHandling4> getValue(BusinessDayReportOrError8Choice obj) {
			return obj.getBusinessError();
		}

		@Override
		public void setValue(BusinessDayReportOrError8Choice obj, List<ErrorHandling4> value) {
			obj.setBusinessError(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BusinessDayReportOrError8Choice.mmBusinessDayInformation, com.tools20022.repository.choice.BusinessDayReportOrError8Choice.mmBusinessError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BusinessDayReportOrError8Choice";
				definition = "Choice between business day information details or a business error when the requested data cannot be retrieved.";
				previousVersion_lazy = () -> BusinessDayReportOrError6Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public BusinessDay7 getBusinessDayInformation() {
		return businessDayInformation;
	}

	public BusinessDayReportOrError8Choice setBusinessDayInformation(BusinessDay7 businessDayInformation) {
		this.businessDayInformation = Objects.requireNonNull(businessDayInformation);
		return this;
	}

	public List<ErrorHandling4> getBusinessError() {
		return businessError == null ? businessError = new ArrayList<>() : businessError;
	}

	public BusinessDayReportOrError8Choice setBusinessError(List<ErrorHandling4> businessError) {
		this.businessError = Objects.requireNonNull(businessError);
		return this;
	}
}