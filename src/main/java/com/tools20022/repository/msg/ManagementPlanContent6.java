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
import com.tools20022.repository.datatype.Max10KBinary;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.entity.TerminalManagementAction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TMSAction6;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Content of the management plan.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ManagementPlanContent6#mmTMChallenge
 * ManagementPlanContent6.mmTMChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ManagementPlanContent6#mmKeyEnciphermentCertificate
 * ManagementPlanContent6.mmKeyEnciphermentCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ManagementPlanContent6#mmAction
 * ManagementPlanContent6.mmAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
 * TerminalManagementAction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ManagementPlanContent6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Content of the management plan."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ManagementPlanContent7
 * ManagementPlanContent7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ManagementPlanContent5
 * ManagementPlanContent5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ManagementPlanContent6", propOrder = {"tMChallenge", "keyEnciphermentCertificate", "action"})
public class ManagementPlanContent6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TMChllng")
	protected Max140Binary tMChallenge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ManagementPlanContent6
	 * ManagementPlanContent6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMChllng"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal manager challenge for cryptographic key injection."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlanContent7#mmTMChallenge
	 * ManagementPlanContent7.mmTMChallenge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ManagementPlanContent5#mmTMChallenge
	 * ManagementPlanContent5.mmTMChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ManagementPlanContent6, Optional<Max140Binary>> mmTMChallenge = new MMMessageAttribute<ManagementPlanContent6, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ManagementPlanContent6.mmObject();
			isDerived = false;
			xmlTag = "TMChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMChallenge";
			definition = "Terminal manager challenge for cryptographic key injection.";
			nextVersions_lazy = () -> Arrays.asList(ManagementPlanContent7.mmTMChallenge);
			previousVersion_lazy = () -> ManagementPlanContent5.mmTMChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(ManagementPlanContent6 obj) {
			return obj.getTMChallenge();
		}

		@Override
		public void setValue(ManagementPlanContent6 obj, Optional<Max140Binary> value) {
			obj.setTMChallenge(value.orElse(null));
		}
	};
	@XmlElement(name = "KeyNcphrmntCert")
	protected List<Max10KBinary> keyEnciphermentCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10KBinary Max10KBinary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ManagementPlanContent6
	 * ManagementPlanContent6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyNcphrmntCert"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyEnciphermentCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate chain of an asymmetric encryption keys for the encryption of temporary transport key of the key to inject."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlanContent7#mmKeyEnciphermentCertificate
	 * ManagementPlanContent7.mmKeyEnciphermentCertificate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ManagementPlanContent5#mmKeyEnciphermentCertificate
	 * ManagementPlanContent5.mmKeyEnciphermentCertificate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ManagementPlanContent6, List<Max10KBinary>> mmKeyEnciphermentCertificate = new MMMessageAttribute<ManagementPlanContent6, List<Max10KBinary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ManagementPlanContent6.mmObject();
			isDerived = false;
			xmlTag = "KeyNcphrmntCert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyEnciphermentCertificate";
			definition = "Certificate chain of an asymmetric encryption keys for the encryption of temporary transport key of the key to inject.";
			nextVersions_lazy = () -> Arrays.asList(ManagementPlanContent7.mmKeyEnciphermentCertificate);
			previousVersion_lazy = () -> ManagementPlanContent5.mmKeyEnciphermentCertificate;
			minOccurs = 0;
			simpleType_lazy = () -> Max10KBinary.mmObject();
		}

		@Override
		public List<Max10KBinary> getValue(ManagementPlanContent6 obj) {
			return obj.getKeyEnciphermentCertificate();
		}

		@Override
		public void setValue(ManagementPlanContent6 obj, List<Max10KBinary> value) {
			obj.setKeyEnciphermentCertificate(value);
		}
	};
	@XmlElement(name = "Actn", required = true)
	protected List<TMSAction6> action;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TMSAction6 TMSAction6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ManagementPlanContent6
	 * ManagementPlanContent6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Actn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Action"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management action to be performed by the point of interaction (POI)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlanContent7#mmAction
	 * ManagementPlanContent7.mmAction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ManagementPlanContent5#mmAction
	 * ManagementPlanContent5.mmAction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ManagementPlanContent6, List<TMSAction6>> mmAction = new MMMessageAssociationEnd<ManagementPlanContent6, List<TMSAction6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ManagementPlanContent6.mmObject();
			isDerived = false;
			xmlTag = "Actn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Action";
			definition = "Terminal management action to be performed by the point of interaction (POI).";
			nextVersions_lazy = () -> Arrays.asList(ManagementPlanContent7.mmAction);
			previousVersion_lazy = () -> ManagementPlanContent5.mmAction;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TMSAction6.mmObject();
		}

		@Override
		public List<TMSAction6> getValue(ManagementPlanContent6 obj) {
			return obj.getAction();
		}

		@Override
		public void setValue(ManagementPlanContent6 obj, List<TMSAction6> value) {
			obj.setAction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ManagementPlanContent6.mmTMChallenge, com.tools20022.repository.msg.ManagementPlanContent6.mmKeyEnciphermentCertificate,
						com.tools20022.repository.msg.ManagementPlanContent6.mmAction);
				trace_lazy = () -> TerminalManagementAction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ManagementPlanContent6";
				definition = "Content of the management plan.";
				nextVersions_lazy = () -> Arrays.asList(ManagementPlanContent7.mmObject());
				previousVersion_lazy = () -> ManagementPlanContent5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max140Binary> getTMChallenge() {
		return tMChallenge == null ? Optional.empty() : Optional.of(tMChallenge);
	}

	public ManagementPlanContent6 setTMChallenge(Max140Binary tMChallenge) {
		this.tMChallenge = tMChallenge;
		return this;
	}

	public List<Max10KBinary> getKeyEnciphermentCertificate() {
		return keyEnciphermentCertificate == null ? keyEnciphermentCertificate = new ArrayList<>() : keyEnciphermentCertificate;
	}

	public ManagementPlanContent6 setKeyEnciphermentCertificate(List<Max10KBinary> keyEnciphermentCertificate) {
		this.keyEnciphermentCertificate = Objects.requireNonNull(keyEnciphermentCertificate);
		return this;
	}

	public List<TMSAction6> getAction() {
		return action == null ? action = new ArrayList<>() : action;
	}

	public ManagementPlanContent6 setAction(List<TMSAction6> action) {
		this.action = Objects.requireNonNull(action);
		return this;
	}
}