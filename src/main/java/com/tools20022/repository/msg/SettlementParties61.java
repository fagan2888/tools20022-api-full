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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification120;
import com.tools20022.repository.msg.PartyIdentificationAndAccount128;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies settlement parties (delivering/receiving).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementParties61#mmDepository
 * SettlementParties61.mmDepository}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties61#mmParty1
 * SettlementParties61.mmParty1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties61#mmParty2
 * SettlementParties61.mmParty2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties61#mmParty3
 * SettlementParties61.mmParty3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
 * SecuritiesSettlementPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementParties61"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies settlement parties (delivering/receiving)."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintParty2PresenceRule#forSettlementParties61
 * ConstraintParty2PresenceRule.forSettlementParties61}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintParty3PresenceRule#forSettlementParties61
 * ConstraintParty3PresenceRule.forSettlementParties61}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SettlementParties43
 * SettlementParties43}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementParties61", propOrder = {"depository", "party1", "party2", "party3"})
public class SettlementParties61 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dpstry")
	protected PartyIdentification120 depository;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification120
	 * PartyIdentification120}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties61
	 * SettlementParties61}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dpstry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Depository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First receiving party in the settlement chain. In a plain vanilla settlement, it is the central securities depository where the receiving side of the transaction requests to receive the financial instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::PSET</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties43#mmDepository
	 * SettlementParties43.mmDepository}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties61, Optional<PartyIdentification120>> mmDepository = new MMMessageAssociationEnd<SettlementParties61, Optional<PartyIdentification120>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties61.mmObject();
			isDerived = false;
			xmlTag = "Dpstry";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::PSET"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Depository";
			definition = "First receiving party in the settlement chain. In a plain vanilla settlement, it is the central securities depository where the receiving side of the transaction requests to receive the financial instrument.";
			previousVersion_lazy = () -> SettlementParties43.mmDepository;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification120.mmObject();
		}

		@Override
		public Optional<PartyIdentification120> getValue(SettlementParties61 obj) {
			return obj.getDepository();
		}

		@Override
		public void setValue(SettlementParties61 obj, Optional<PartyIdentification120> value) {
			obj.setDepository(value.orElse(null));
		}
	};
	@XmlElement(name = "Pty1")
	protected PartyIdentificationAndAccount128 party1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount128
	 * PartyIdentificationAndAccount128}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties61
	 * SettlementParties61}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that interacts with the depository."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a:DEAG or REAG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties43#mmParty1
	 * SettlementParties43.mmParty1}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties61, Optional<PartyIdentificationAndAccount128>> mmParty1 = new MMMessageAssociationEnd<SettlementParties61, Optional<PartyIdentificationAndAccount128>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties61.mmObject();
			isDerived = false;
			xmlTag = "Pty1";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a:DEAG or REAG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party1";
			definition = "Party that interacts with the depository.";
			previousVersion_lazy = () -> SettlementParties43.mmParty1;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount128.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount128> getValue(SettlementParties61 obj) {
			return obj.getParty1();
		}

		@Override
		public void setValue(SettlementParties61 obj, Optional<PartyIdentificationAndAccount128> value) {
			obj.setParty1(value.orElse(null));
		}
	};
	@XmlElement(name = "Pty2")
	protected PartyIdentificationAndAccount128 party2;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount128
	 * PartyIdentificationAndAccount128}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties61
	 * SettlementParties61}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that interacts with the party1."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::REI2 or DEI2, ISO15022Synonym:
	 * :95a::REI1 or DEI1, ISO15022Synonym: :95a::RECU or DECU, ISO15022Synonym:
	 * :95a::BUYR or SELL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties43#mmParty2
	 * SettlementParties43.mmParty2}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties61, Optional<PartyIdentificationAndAccount128>> mmParty2 = new MMMessageAssociationEnd<SettlementParties61, Optional<PartyIdentificationAndAccount128>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties61.mmObject();
			isDerived = false;
			xmlTag = "Pty2";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::REI2 or DEI2"), new ISO15022Synonym(this, ":95a::REI1 or DEI1"), new ISO15022Synonym(this, ":95a::RECU or DECU"), new ISO15022Synonym(this,
					":95a::BUYR or SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party2";
			definition = "Party that interacts with the party1.";
			previousVersion_lazy = () -> SettlementParties43.mmParty2;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount128.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount128> getValue(SettlementParties61 obj) {
			return obj.getParty2();
		}

		@Override
		public void setValue(SettlementParties61 obj, Optional<PartyIdentificationAndAccount128> value) {
			obj.setParty2(value.orElse(null));
		}
	};
	@XmlElement(name = "Pty3")
	protected PartyIdentificationAndAccount128 party3;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount128
	 * PartyIdentificationAndAccount128}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties61
	 * SettlementParties61}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty3"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that interacts with the party2."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::REI1 or DEI1, ISO15022Synonym:
	 * :95a::RECU or DECU, ISO15022Synonym: :95a::BUYR or SELL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties43#mmParty3
	 * SettlementParties43.mmParty3}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties61, Optional<PartyIdentificationAndAccount128>> mmParty3 = new MMMessageAssociationEnd<SettlementParties61, Optional<PartyIdentificationAndAccount128>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties61.mmObject();
			isDerived = false;
			xmlTag = "Pty3";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::REI1 or DEI1"), new ISO15022Synonym(this, ":95a::RECU or DECU"), new ISO15022Synonym(this, ":95a::BUYR or SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party3";
			definition = "Party that interacts with the party2.";
			previousVersion_lazy = () -> SettlementParties43.mmParty3;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount128.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount128> getValue(SettlementParties61 obj) {
			return obj.getParty3();
		}

		@Override
		public void setValue(SettlementParties61 obj, Optional<PartyIdentificationAndAccount128> value) {
			obj.setParty3(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementParties61.mmDepository, com.tools20022.repository.msg.SettlementParties61.mmParty1,
						com.tools20022.repository.msg.SettlementParties61.mmParty2, com.tools20022.repository.msg.SettlementParties61.mmParty3);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintParty2PresenceRule.forSettlementParties61, com.tools20022.repository.constraints.ConstraintParty3PresenceRule.forSettlementParties61);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementParties61";
				definition = "Specifies settlement parties (delivering/receiving).";
				previousVersion_lazy = () -> SettlementParties43.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentification120> getDepository() {
		return depository == null ? Optional.empty() : Optional.of(depository);
	}

	public SettlementParties61 setDepository(PartyIdentification120 depository) {
		this.depository = depository;
		return this;
	}

	public Optional<PartyIdentificationAndAccount128> getParty1() {
		return party1 == null ? Optional.empty() : Optional.of(party1);
	}

	public SettlementParties61 setParty1(PartyIdentificationAndAccount128 party1) {
		this.party1 = party1;
		return this;
	}

	public Optional<PartyIdentificationAndAccount128> getParty2() {
		return party2 == null ? Optional.empty() : Optional.of(party2);
	}

	public SettlementParties61 setParty2(PartyIdentificationAndAccount128 party2) {
		this.party2 = party2;
		return this;
	}

	public Optional<PartyIdentificationAndAccount128> getParty3() {
		return party3 == null ? Optional.empty() : Optional.of(party3);
	}

	public SettlementParties61 setParty3(PartyIdentificationAndAccount128 party3) {
		this.party3 = party3;
		return this;
	}
}