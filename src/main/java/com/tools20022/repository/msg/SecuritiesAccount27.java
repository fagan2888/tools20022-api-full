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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.SecuritiesTransactionStatusQuery002V04;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.RestrictedFINXMax35Text;
import com.tools20022.repository.entity.AccountIdentification;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification47;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account to or from which a securities entry is made.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount27#mmIdentification
 * SecuritiesAccount27.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount27#mmType
 * SecuritiesAccount27.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount27#mmName
 * SecuritiesAccount27.mmName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
 * SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReport002V05#mmSafekeepingAccount
 * SecuritiesSettlementTransactionAllegementReport002V05.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReport002V06#mmSafekeepingAccount
 * SecuritiesTransactionPostingReport002V06.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReport002V05#mmSafekeepingAccount
 * IntraPositionMovementPostingReport002V05.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAuditTrailReport002V03#mmSafekeepingAccount
 * SecuritiesSettlementTransactionAuditTrailReport002V03.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQuery002V04#mmSafekeepingAccount
 * SecuritiesTransactionStatusQuery002V04.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageCancellationAdvice002V05#mmSafekeepingAccount
 * SecuritiesMessageCancellationAdvice002V05.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReport002V07#mmSafekeepingAccount
 * SecuritiesTransactionPendingReport002V07.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesStatementQuery002V06#mmSafekeepingAccount
 * SecuritiesStatementQuery002V06.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstruction002V04#mmSafekeepingAccount
 * IntraPositionMovementInstruction002V04.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmation002V05#mmSafekeepingAccount
 * IntraPositionMovementConfirmation002V05.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.SecuritiesTransactionPendingReport002V08#mmSafekeepingAccount
 * SecuritiesTransactionPendingReport002V08.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.IntraPositionMovementConfirmation002V06#mmSafekeepingAccount
 * IntraPositionMovementConfirmation002V06.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.IntraPositionMovementPostingReport002V06#mmSafekeepingAccount
 * IntraPositionMovementPostingReport002V06.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.SecuritiesSettlementTransactionAllegementReport002V06#mmSafekeepingAccount
 * SecuritiesSettlementTransactionAllegementReport002V06.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.SecuritiesTransactionPostingReport002V07#mmSafekeepingAccount
 * SecuritiesTransactionPostingReport002V07.mmSafekeepingAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesAccount27"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a securities entry is made."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = November 11, 2018</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesAccount27", propOrder = {"identification", "type", "name"})
public class SecuritiesAccount27 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected RestrictedFINXMax35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax35Text
	 * RestrictedFINXMax35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount27
	 * SecuritiesAccount27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification for the account between the account owner and the account servicer.”."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1, FIXSynonym: 660, ISO15022Synonym:
	 * :97a::SAFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccount27, RestrictedFINXMax35Text> mmIdentification = new MMMessageAttribute<SecuritiesAccount27, RestrictedFINXMax35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount27.mmObject();
			isDerived = false;
			xmlTag = "Id";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1"), new FIXSynonym(this, "660"), new ISO15022Synonym(this, ":97a::SAFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unambiguous identification for the account between the account owner and the account servicer.”.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax35Text.mmObject();
		}

		@Override
		public RestrictedFINXMax35Text getValue(SecuritiesAccount27 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(SecuritiesAccount27 obj, RestrictedFINXMax35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Tp")
	protected GenericIdentification47 type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification47
	 * GenericIdentification47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesAccountType
	 * SecuritiesAccount.mmSecuritiesAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount27
	 * SecuritiesAccount27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of securities account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 581, ISO15022Synonym: :97B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccount27, Optional<GenericIdentification47>> mmType = new MMMessageAttribute<SecuritiesAccount27, Optional<GenericIdentification47>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesAccount.mmSecuritiesAccountType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount27.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "581"), new ISO15022Synonym(this, ":97B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of securities account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GenericIdentification47.mmObject();
		}

		@Override
		public Optional<GenericIdentification47> getValue(SecuritiesAccount27 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(SecuritiesAccount27 obj, Optional<GenericIdentification47> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Nm")
	protected Max70Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount27
	 * SecuritiesAccount27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccount27, Optional<Max70Text>> mmName = new MMMessageAttribute<SecuritiesAccount27, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount27.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Description of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(SecuritiesAccount27 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(SecuritiesAccount27 obj, Optional<Max70Text> value) {
			obj.setName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccount27.mmIdentification, com.tools20022.repository.msg.SecuritiesAccount27.mmType,
						com.tools20022.repository.msg.SecuritiesAccount27.mmName);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAllegementReport002V05.mmSafekeepingAccount, SecuritiesTransactionPostingReport002V06.mmSafekeepingAccount,
						IntraPositionMovementPostingReport002V05.mmSafekeepingAccount, SecuritiesSettlementTransactionAuditTrailReport002V03.mmSafekeepingAccount, SecuritiesTransactionStatusQuery002V04.mmSafekeepingAccount,
						SecuritiesMessageCancellationAdvice002V05.mmSafekeepingAccount, SecuritiesTransactionPendingReport002V07.mmSafekeepingAccount, SecuritiesStatementQuery002V06.mmSafekeepingAccount,
						IntraPositionMovementInstruction002V04.mmSafekeepingAccount, IntraPositionMovementConfirmation002V05.mmSafekeepingAccount, SecuritiesTransactionPendingReport002V08.mmSafekeepingAccount,
						IntraPositionMovementConfirmation002V06.mmSafekeepingAccount, IntraPositionMovementPostingReport002V06.mmSafekeepingAccount, SecuritiesSettlementTransactionAllegementReport002V06.mmSafekeepingAccount,
						SecuritiesTransactionPostingReport002V07.mmSafekeepingAccount);
				trace_lazy = () -> SecuritiesAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("November 11, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SecuritiesAccount27";
				definition = "Account to or from which a securities entry is made.";
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedFINXMax35Text getIdentification() {
		return identification;
	}

	public SecuritiesAccount27 setIdentification(RestrictedFINXMax35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<GenericIdentification47> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public SecuritiesAccount27 setType(GenericIdentification47 type) {
		this.type = type;
		return this;
	}

	public Optional<Max70Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public SecuritiesAccount27 setName(Max70Text name) {
		this.name = name;
		return this;
	}
}