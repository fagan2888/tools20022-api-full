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
import com.tools20022.repository.choice.MemberIdentificationChoice;
import com.tools20022.repository.entity.SystemMemberRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ErrorHandling3;
import com.tools20022.repository.msg.MemberDetails;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reports either on a member or a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberReport2#MemberInformationOrBusinessErrorRule
 * MemberReport2.MemberInformationOrBusinessErrorRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberReport2#mmMemberIdentification
 * MemberReport2.mmMemberIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberReport2#mmBusinessError
 * MemberReport2.mmBusinessError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberReport2#mmMemberInformation
 * MemberReport2.mmMemberInformation}</li>
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
 * "MemberReport2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reports either on a member or a business error."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MemberReport2", propOrder = {"memberIdentification", "businessError", "memberInformation"})
public class MemberReport2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MmbId", required = true)
	protected MemberIdentificationChoice memberIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MemberIdentificationChoice
	 * MemberIdentificationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberReport2 MemberReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MmbId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a member within a system, assigned using the member identification scheme of the system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberReport2, MemberIdentificationChoice> mmMemberIdentification = new MMMessageAttribute<MemberReport2, MemberIdentificationChoice>() {
		{
			businessComponentTrace_lazy = () -> SystemMemberRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberReport2.mmObject();
			isDerived = false;
			xmlTag = "MmbId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberIdentification";
			definition = "Unique and unambiguous identification of a member within a system, assigned using the member identification scheme of the system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MemberIdentificationChoice.mmObject();
		}

		@Override
		public MemberIdentificationChoice getValue(MemberReport2 obj) {
			return obj.getMemberIdentification();
		}

		@Override
		public void setValue(MemberReport2 obj, MemberIdentificationChoice value) {
			obj.setMemberIdentification(value);
		}
	};
	@XmlElement(name = "BizErr", required = true)
	protected ErrorHandling3 businessError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling3
	 * ErrorHandling3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberReport2 MemberReport2}</li>
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
	public static final MMMessageAssociationEnd<MemberReport2, ErrorHandling3> mmBusinessError = new MMMessageAssociationEnd<MemberReport2, ErrorHandling3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberReport2.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason the requested business information is not given.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling3.mmObject();
		}

		@Override
		public ErrorHandling3 getValue(MemberReport2 obj) {
			return obj.getBusinessError();
		}

		@Override
		public void setValue(MemberReport2 obj, ErrorHandling3 value) {
			obj.setBusinessError(value);
		}
	};
	@XmlElement(name = "MmbInf", required = true)
	protected MemberDetails memberInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MemberDetails
	 * MemberDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberReport2 MemberReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MmbInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested business information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MemberReport2, MemberDetails> mmMemberInformation = new MMMessageAssociationEnd<MemberReport2, MemberDetails>() {
		{
			businessComponentTrace_lazy = () -> SystemMemberRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberReport2.mmObject();
			isDerived = false;
			xmlTag = "MmbInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberInformation";
			definition = "Requested business information.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MemberDetails.mmObject();
		}

		@Override
		public MemberDetails getValue(MemberReport2 obj) {
			return obj.getMemberInformation();
		}

		@Override
		public void setValue(MemberReport2 obj, MemberDetails value) {
			obj.setMemberInformation(value);
		}
	};
	/**
	 * Either MemberInformation or BusinessError must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.MemberReport2 MemberReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberReport2#mmBusinessError
	 * MemberReport2.mmBusinessError}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberReport2#mmMemberInformation
	 * MemberReport2.mmMemberInformation}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberInformationOrBusinessErrorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either MemberInformation or BusinessError must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor MemberInformationOrBusinessErrorRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberInformationOrBusinessErrorRule";
			definition = "Either MemberInformation or BusinessError must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.MemberReport2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MemberReport2.mmBusinessError, com.tools20022.repository.msg.MemberReport2.mmMemberInformation);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MemberReport2.mmMemberIdentification, com.tools20022.repository.msg.MemberReport2.mmBusinessError,
						com.tools20022.repository.msg.MemberReport2.mmMemberInformation);
				trace_lazy = () -> SystemMemberRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "MemberReport2";
				definition = "Reports either on a member or a business error.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MemberReport2.MemberInformationOrBusinessErrorRule);
			}
		});
		return mmObject_lazy.get();
	}

	public MemberIdentificationChoice getMemberIdentification() {
		return memberIdentification;
	}

	public MemberReport2 setMemberIdentification(MemberIdentificationChoice memberIdentification) {
		this.memberIdentification = Objects.requireNonNull(memberIdentification);
		return this;
	}

	public ErrorHandling3 getBusinessError() {
		return businessError;
	}

	public MemberReport2 setBusinessError(ErrorHandling3 businessError) {
		this.businessError = Objects.requireNonNull(businessError);
		return this;
	}

	public MemberDetails getMemberInformation() {
		return memberInformation;
	}

	public MemberReport2 setMemberInformation(MemberDetails memberInformation) {
		this.memberInformation = Objects.requireNonNull(memberInformation);
		return this;
	}
}