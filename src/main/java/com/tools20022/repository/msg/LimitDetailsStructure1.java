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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.entity.RiskManagementLimit;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.LimitDetails4;
import com.tools20022.repository.msg.LimitIdentificationDetails2;
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
 * Limit details of one particular limit set by the member and managed by the
 * transaction administrator.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure1#SingleLimitRule
 * LimitDetailsStructure1.SingleLimitRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure1#mmCurrentLimitIdentification
 * LimitDetailsStructure1.mmCurrentLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure1#mmDefaultLimitIdentification
 * LimitDetailsStructure1.mmDefaultLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure1#mmNewLimitValueSet
 * LimitDetailsStructure1.mmNewLimitValueSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RiskManagementLimit
 * RiskManagementLimit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitDetailsStructure1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Limit details of one particular limit set by the member and managed by the transaction administrator."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LimitDetailsStructure1", propOrder = {"currentLimitIdentification", "defaultLimitIdentification", "newLimitValueSet"})
public class LimitDetailsStructure1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CurLmtId", required = true)
	protected LimitIdentificationDetails2 currentLimitIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails2
	 * LimitIdentificationDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure1
	 * LimitDetailsStructure1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurLmtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentLimitIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the current limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LimitDetailsStructure1, LimitIdentificationDetails2> mmCurrentLimitIdentification = new MMMessageAssociationEnd<LimitDetailsStructure1, LimitIdentificationDetails2>() {
		{
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitDetailsStructure1.mmObject();
			isDerived = false;
			xmlTag = "CurLmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentLimitIdentification";
			definition = "Identification of the current limit.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LimitIdentificationDetails2.mmObject();
		}

		@Override
		public LimitIdentificationDetails2 getValue(LimitDetailsStructure1 obj) {
			return obj.getCurrentLimitIdentification();
		}

		@Override
		public void setValue(LimitDetailsStructure1 obj, LimitIdentificationDetails2 value) {
			obj.setCurrentLimitIdentification(value);
		}
	};
	@XmlElement(name = "DfltLmtId", required = true)
	protected LimitIdentificationDetails2 defaultLimitIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.LimitIdentificationDetails2
	 * LimitIdentificationDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure1
	 * LimitDetailsStructure1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltLmtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultLimitIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the default limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LimitDetailsStructure1, LimitIdentificationDetails2> mmDefaultLimitIdentification = new MMMessageAssociationEnd<LimitDetailsStructure1, LimitIdentificationDetails2>() {
		{
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitDetailsStructure1.mmObject();
			isDerived = false;
			xmlTag = "DfltLmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultLimitIdentification";
			definition = "Identification of the default limit.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LimitIdentificationDetails2.mmObject();
		}

		@Override
		public LimitIdentificationDetails2 getValue(LimitDetailsStructure1 obj) {
			return obj.getDefaultLimitIdentification();
		}

		@Override
		public void setValue(LimitDetailsStructure1 obj, LimitIdentificationDetails2 value) {
			obj.setDefaultLimitIdentification(value);
		}
	};
	@XmlElement(name = "NewLmtValSet", required = true)
	protected LimitDetails4 newLimitValueSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitDetails4
	 * LimitDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure1
	 * LimitDetailsStructure1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewLmtValSet"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewLimitValueSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New limit values."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LimitDetailsStructure1, LimitDetails4> mmNewLimitValueSet = new MMMessageAssociationEnd<LimitDetailsStructure1, LimitDetails4>() {
		{
			businessComponentTrace_lazy = () -> RiskManagementLimit.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitDetailsStructure1.mmObject();
			isDerived = false;
			xmlTag = "NewLmtValSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewLimitValueSet";
			definition = "New limit values.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LimitDetails4.mmObject();
		}

		@Override
		public LimitDetails4 getValue(LimitDetailsStructure1 obj) {
			return obj.getNewLimitValueSet();
		}

		@Override
		public void setValue(LimitDetailsStructure1 obj, LimitDetails4 value) {
			obj.setNewLimitValueSet(value);
		}
	};
	/**
	 * Each ModifyLimit message can only modify one type of limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure1
	 * LimitDetailsStructure1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure1#mmCurrentLimitIdentification
	 * LimitDetailsStructure1.mmCurrentLimitIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure1#mmDefaultLimitIdentification
	 * LimitDetailsStructure1.mmDefaultLimitIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleLimitRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Each ModifyLimit message can only modify one type of limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor SingleLimitRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleLimitRule";
			definition = "Each ModifyLimit message can only modify one type of limit.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.LimitDetailsStructure1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitDetailsStructure1.mmCurrentLimitIdentification, com.tools20022.repository.msg.LimitDetailsStructure1.mmDefaultLimitIdentification);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitDetailsStructure1.mmCurrentLimitIdentification, com.tools20022.repository.msg.LimitDetailsStructure1.mmDefaultLimitIdentification,
						com.tools20022.repository.msg.LimitDetailsStructure1.mmNewLimitValueSet);
				trace_lazy = () -> RiskManagementLimit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "LimitDetailsStructure1";
				definition = "Limit details of one particular limit set by the member and managed by the transaction administrator.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitDetailsStructure1.SingleLimitRule);
			}
		});
		return mmObject_lazy.get();
	}

	public LimitIdentificationDetails2 getCurrentLimitIdentification() {
		return currentLimitIdentification;
	}

	public LimitDetailsStructure1 setCurrentLimitIdentification(LimitIdentificationDetails2 currentLimitIdentification) {
		this.currentLimitIdentification = Objects.requireNonNull(currentLimitIdentification);
		return this;
	}

	public LimitIdentificationDetails2 getDefaultLimitIdentification() {
		return defaultLimitIdentification;
	}

	public LimitDetailsStructure1 setDefaultLimitIdentification(LimitIdentificationDetails2 defaultLimitIdentification) {
		this.defaultLimitIdentification = Objects.requireNonNull(defaultLimitIdentification);
		return this;
	}

	public LimitDetails4 getNewLimitValueSet() {
		return newLimitValueSet;
	}

	public LimitDetailsStructure1 setNewLimitValueSet(LimitDetails4 newLimitValueSet) {
		this.newLimitValueSet = Objects.requireNonNull(newLimitValueSet);
		return this;
	}
}