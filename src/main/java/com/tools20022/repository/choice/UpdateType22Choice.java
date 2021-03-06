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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequest002V04;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23;
import com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24;
import com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the type of update requested. That is addition, deletion or
 * modification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UpdateType22Choice#mmAddition
 * UpdateType22Choice.mmAddition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UpdateType22Choice#mmDeletion
 * UpdateType22Choice.mmDeletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UpdateType22Choice#mmModification
 * UpdateType22Choice.mmModification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequest002V04#mmUpdateType
 * SecuritiesSettlementTransactionModificationRequest002V04.mmUpdateType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UpdateType22Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of update requested. That is addition, deletion or modification."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UpdateType22Choice", propOrder = {"addition", "deletion", "modification"})
public class UpdateType22Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Addtn", required = true)
	protected SecuritiesSettlementTransactionDetails23 addition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23
	 * SecuritiesSettlementTransactionDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType22Choice
	 * UpdateType22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Addtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Addition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Addition of information to the securities transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UpdateType22Choice, SecuritiesSettlementTransactionDetails23> mmAddition = new MMMessageAssociationEnd<UpdateType22Choice, SecuritiesSettlementTransactionDetails23>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UpdateType22Choice.mmObject();
			isDerived = false;
			xmlTag = "Addtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Addition";
			definition = "Addition of information to the securities transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesSettlementTransactionDetails23.mmObject();
		}

		@Override
		public SecuritiesSettlementTransactionDetails23 getValue(UpdateType22Choice obj) {
			return obj.getAddition();
		}

		@Override
		public void setValue(UpdateType22Choice obj, SecuritiesSettlementTransactionDetails23 value) {
			obj.setAddition(value);
		}
	};
	@XmlElement(name = "Deltn", required = true)
	protected SecuritiesSettlementTransactionDetails24 deletion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24
	 * SecuritiesSettlementTransactionDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType22Choice
	 * UpdateType22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Deltn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deletion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deletion of information in the securities transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UpdateType22Choice, SecuritiesSettlementTransactionDetails24> mmDeletion = new MMMessageAssociationEnd<UpdateType22Choice, SecuritiesSettlementTransactionDetails24>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UpdateType22Choice.mmObject();
			isDerived = false;
			xmlTag = "Deltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deletion";
			definition = "Deletion of information in the securities transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesSettlementTransactionDetails24.mmObject();
		}

		@Override
		public SecuritiesSettlementTransactionDetails24 getValue(UpdateType22Choice obj) {
			return obj.getDeletion();
		}

		@Override
		public void setValue(UpdateType22Choice obj, SecuritiesSettlementTransactionDetails24 value) {
			obj.setDeletion(value);
		}
	};
	@XmlElement(name = "Mod", required = true)
	protected SecuritiesSettlementTransactionDetails25 modification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25
	 * SecuritiesSettlementTransactionDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType22Choice
	 * UpdateType22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mod"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification of information in the securities transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UpdateType22Choice, SecuritiesSettlementTransactionDetails25> mmModification = new MMMessageAssociationEnd<UpdateType22Choice, SecuritiesSettlementTransactionDetails25>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UpdateType22Choice.mmObject();
			isDerived = false;
			xmlTag = "Mod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Modification of information in the securities transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesSettlementTransactionDetails25.mmObject();
		}

		@Override
		public SecuritiesSettlementTransactionDetails25 getValue(UpdateType22Choice obj) {
			return obj.getModification();
		}

		@Override
		public void setValue(UpdateType22Choice obj, SecuritiesSettlementTransactionDetails25 value) {
			obj.setModification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.UpdateType22Choice.mmAddition, com.tools20022.repository.choice.UpdateType22Choice.mmDeletion,
						com.tools20022.repository.choice.UpdateType22Choice.mmModification);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequest002V04.mmUpdateType);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UpdateType22Choice";
				definition = "Specifies the type of update requested. That is addition, deletion or modification.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesSettlementTransactionDetails23 getAddition() {
		return addition;
	}

	public UpdateType22Choice setAddition(SecuritiesSettlementTransactionDetails23 addition) {
		this.addition = Objects.requireNonNull(addition);
		return this;
	}

	public SecuritiesSettlementTransactionDetails24 getDeletion() {
		return deletion;
	}

	public UpdateType22Choice setDeletion(SecuritiesSettlementTransactionDetails24 deletion) {
		this.deletion = Objects.requireNonNull(deletion);
		return this;
	}

	public SecuritiesSettlementTransactionDetails25 getModification() {
		return modification;
	}

	public UpdateType22Choice setModification(SecuritiesSettlementTransactionDetails25 modification) {
		this.modification = Objects.requireNonNull(modification);
		return this;
	}
}