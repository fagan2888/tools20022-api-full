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
import com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification1;
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
 * Status is rejected.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1#ReasonRule
 * ConfirmationRejectedStatus1.ReasonRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1#mmReason
 * ConfirmationRejectedStatus1.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1#mmExtendedReason
 * ConfirmationRejectedStatus1.mmExtendedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1#mmDataSourceScheme
 * ConfirmationRejectedStatus1.mmDataSourceScheme}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ConfirmationRejectedStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status is rejected."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus2
 * ConfirmationRejectedStatus2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ConfirmationRejectedStatus1", propOrder = {"reason", "extendedReason", "dataSourceScheme"})
public class ConfirmationRejectedStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rsn", required = true)
	protected RejectedConfirmationStatusReason1Code reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedConfirmationStatusReason1Code
	 * RejectedConfirmationStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConfirmationRejectedStatusReason
	 * SecuritiesOrderStatus.mmConfirmationRejectedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1
	 * ConfirmationRejectedStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the rejected status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus2#mmReason
	 * ConfirmationRejectedStatus2.mmReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ConfirmationRejectedStatus1, RejectedConfirmationStatusReason1Code> mmReason = new MMMessageAttribute<ConfirmationRejectedStatus1, RejectedConfirmationStatusReason1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmConfirmationRejectedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationRejectedStatus1.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for the rejected status.";
			nextVersions_lazy = () -> Arrays.asList(ConfirmationRejectedStatus2.mmReason);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectedConfirmationStatusReason1Code.mmObject();
		}

		@Override
		public RejectedConfirmationStatusReason1Code getValue(ConfirmationRejectedStatus1 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(ConfirmationRejectedStatus1 obj, RejectedConfirmationStatusReason1Code value) {
			obj.setReason(value);
		}
	};
	@XmlElement(name = "XtndedRsn", required = true)
	protected Extended350Code extendedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1
	 * ConfirmationRejectedStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the rejected status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ConfirmationRejectedStatus1, Extended350Code> mmExtendedReason = new MMMessageAttribute<ConfirmationRejectedStatus1, Extended350Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationRejectedStatus1.mmObject();
			isDerived = false;
			xmlTag = "XtndedRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedReason";
			definition = "Reason for the rejected status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Extended350Code getValue(ConfirmationRejectedStatus1 obj) {
			return obj.getExtendedReason();
		}

		@Override
		public void setValue(ConfirmationRejectedStatus1 obj, Extended350Code value) {
			obj.setExtendedReason(value);
		}
	};
	@XmlElement(name = "DataSrcSchme", required = true)
	protected GenericIdentification1 dataSourceScheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericIdentification1
	 * GenericIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmDataSourceScheme
	 * StatusReason.mmDataSourceScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1
	 * ConfirmationRejectedStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSrcSchme"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSourceScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of the reason for a rejected status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ConfirmationRejectedStatus1, GenericIdentification1> mmDataSourceScheme = new MMMessageAssociationEnd<ConfirmationRejectedStatus1, GenericIdentification1>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmDataSourceScheme;
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationRejectedStatus1.mmObject();
			isDerived = false;
			xmlTag = "DataSrcSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSourceScheme";
			definition = "Proprietary identification of the reason for a rejected status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification1.mmObject();
		}

		@Override
		public GenericIdentification1 getValue(ConfirmationRejectedStatus1 obj) {
			return obj.getDataSourceScheme();
		}

		@Override
		public void setValue(ConfirmationRejectedStatus1 obj, GenericIdentification1 value) {
			obj.setDataSourceScheme(value);
		}
	};
	/**
	 * One and only one message element in the list (ExtendedReason, Reason,
	 * DataSourceScheme) must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1
	 * ConfirmationRejectedStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1#mmReason
	 * ConfirmationRejectedStatus1.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1#mmExtendedReason
	 * ConfirmationRejectedStatus1.mmExtendedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1#mmDataSourceScheme
	 * ConfirmationRejectedStatus1.mmDataSourceScheme}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one message element in the list (ExtendedReason, Reason, DataSourceScheme) must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor ReasonRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonRule";
			definition = "One and only one message element in the list (ExtendedReason, Reason, DataSourceScheme) must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.ConfirmationRejectedStatus1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ConfirmationRejectedStatus1.mmReason, com.tools20022.repository.msg.ConfirmationRejectedStatus1.mmExtendedReason,
					com.tools20022.repository.msg.ConfirmationRejectedStatus1.mmDataSourceScheme);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ConfirmationRejectedStatus1.mmReason, com.tools20022.repository.msg.ConfirmationRejectedStatus1.mmExtendedReason,
						com.tools20022.repository.msg.ConfirmationRejectedStatus1.mmDataSourceScheme);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "ConfirmationRejectedStatus1";
				definition = "Status is rejected.";
				nextVersions_lazy = () -> Arrays.asList(ConfirmationRejectedStatus2.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ConfirmationRejectedStatus1.ReasonRule);
			}
		});
		return mmObject_lazy.get();
	}

	public RejectedConfirmationStatusReason1Code getReason() {
		return reason;
	}

	public ConfirmationRejectedStatus1 setReason(RejectedConfirmationStatusReason1Code reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public Extended350Code getExtendedReason() {
		return extendedReason;
	}

	public ConfirmationRejectedStatus1 setExtendedReason(Extended350Code extendedReason) {
		this.extendedReason = Objects.requireNonNull(extendedReason);
		return this;
	}

	public GenericIdentification1 getDataSourceScheme() {
		return dataSourceScheme;
	}

	public ConfirmationRejectedStatus1 setDataSourceScheme(GenericIdentification1 dataSourceScheme) {
		this.dataSourceScheme = Objects.requireNonNull(dataSourceScheme);
		return this;
	}
}