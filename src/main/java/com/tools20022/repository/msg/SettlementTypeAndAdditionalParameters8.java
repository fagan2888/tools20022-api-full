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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DeliveryReceiptType2Code;
import com.tools20022.repository.codeset.ReceiveDelivery1Code;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CorporateActionEventRegistration;
import com.tools20022.repository.entity.SecuritiesSettlement;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides transaction type and identification information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8#mmSecuritiesMovementType
 * SettlementTypeAndAdditionalParameters8.mmSecuritiesMovementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8#mmPayment
 * SettlementTypeAndAdditionalParameters8.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8#mmCommonIdentification
 * SettlementTypeAndAdditionalParameters8.mmCommonIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8#mmCorporateActionEventIdentification
 * SettlementTypeAndAdditionalParameters8.mmCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8#mmReconciliationIndicator
 * SettlementTypeAndAdditionalParameters8.mmReconciliationIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementTypeAndAdditionalParameters8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides transaction type and identification information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#forSettlementTypeAndAdditionalParameters8
 * ConstraintCoexistenceIdentificationRule.
 * forSettlementTypeAndAdditionalParameters8}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementTypeAndAdditionalParameters8", propOrder = {"securitiesMovementType", "payment", "commonIdentification", "corporateActionEventIdentification", "reconciliationIndicator"})
public class SettlementTypeAndAdditionalParameters8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesMvmntTp")
	protected ReceiveDelivery1Code securitiesMovementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReceiveDelivery1Code
	 * ReceiveDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesMovementType
	 * SecuritiesSettlement.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8
	 * SettlementTypeAndAdditionalParameters8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesMvmntTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the movement on a securities account results from a deliver or a receive instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::REDE, ISO15022Synonym: MT 540-1
	 * or 542-3</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementTypeAndAdditionalParameters8, Optional<ReceiveDelivery1Code>> mmSecuritiesMovementType = new MMMessageAttribute<SettlementTypeAndAdditionalParameters8, Optional<ReceiveDelivery1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecuritiesMovementType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::REDE"), new ISO15022Synonym(this, "MT 540-1 or 542-3"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Specifies if the movement on a securities account results from a deliver or a receive instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReceiveDelivery1Code.mmObject();
		}

		@Override
		public Optional<ReceiveDelivery1Code> getValue(SettlementTypeAndAdditionalParameters8 obj) {
			return obj.getSecuritiesMovementType();
		}

		@Override
		public void setValue(SettlementTypeAndAdditionalParameters8 obj, Optional<ReceiveDelivery1Code> value) {
			obj.setSecuritiesMovementType(value.orElse(null));
		}
	};
	@XmlElement(name = "Pmt")
	protected DeliveryReceiptType2Code payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType2Code
	 * DeliveryReceiptType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementType
	 * SecuritiesSettlement.mmSettlementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8
	 * SettlementTypeAndAdditionalParameters8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the transaction is to be settled, for example, against payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::PAYM, ISO15022Synonym: MT
	 * 541-543 or 540-542</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementTypeAndAdditionalParameters8, Optional<DeliveryReceiptType2Code>> mmPayment = new MMMessageAttribute<SettlementTypeAndAdditionalParameters8, Optional<DeliveryReceiptType2Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8.mmObject();
			isDerived = false;
			xmlTag = "Pmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::PAYM"), new ISO15022Synonym(this, "MT 541-543 or 540-542"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "Specifies how the transaction is to be settled, for example, against payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}

		@Override
		public Optional<DeliveryReceiptType2Code> getValue(SettlementTypeAndAdditionalParameters8 obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(SettlementTypeAndAdditionalParameters8 obj, Optional<DeliveryReceiptType2Code> value) {
			obj.setPayment(value.orElse(null));
		}
	};
	@XmlElement(name = "CmonId")
	protected RestrictedFINXMax16Text commonIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCommonIdentification
	 * TradeIdentification.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8
	 * SettlementTypeAndAdditionalParameters8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference agreed upon by the two trade counterparties to identify the trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::COMM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementTypeAndAdditionalParameters8, Optional<RestrictedFINXMax16Text>> mmCommonIdentification = new MMMessageAttribute<SettlementTypeAndAdditionalParameters8, Optional<RestrictedFINXMax16Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCommonIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8.mmObject();
			isDerived = false;
			xmlTag = "CmonId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::COMM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonIdentification";
			definition = "Unique reference agreed upon by the two trade counterparties to identify the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax16Text> getValue(SettlementTypeAndAdditionalParameters8 obj) {
			return obj.getCommonIdentification();
		}

		@Override
		public void setValue(SettlementTypeAndAdditionalParameters8 obj, Optional<RestrictedFINXMax16Text> value) {
			obj.setCommonIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnEvtId")
	protected RestrictedFINXMax16Text corporateActionEventIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEventIdentification
	 * CorporateActionEventRegistration.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8
	 * SettlementTypeAndAdditionalParameters8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by the account servicer to unambiguously identify a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::CORP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementTypeAndAdditionalParameters8, Optional<RestrictedFINXMax16Text>> mmCorporateActionEventIdentification = new MMMessageAttribute<SettlementTypeAndAdditionalParameters8, Optional<RestrictedFINXMax16Text>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmCorporateActionEventIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::CORP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventIdentification";
			definition = "Identification assigned by the account servicer to unambiguously identify a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax16Text> getValue(SettlementTypeAndAdditionalParameters8 obj) {
			return obj.getCorporateActionEventIdentification();
		}

		@Override
		public void setValue(SettlementTypeAndAdditionalParameters8 obj, Optional<RestrictedFINXMax16Text> value) {
			obj.setCorporateActionEventIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RcncltnInd")
	protected YesNoIndicator reconciliationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8
	 * SettlementTypeAndAdditionalParameters8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the settlement transaction was already sent on the market and that it is only sent by an account owner to an account servicer for reconciliation purposes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :23G:4!c/RECO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementTypeAndAdditionalParameters8, Optional<YesNoIndicator>> mmReconciliationIndicator = new MMMessageAttribute<SettlementTypeAndAdditionalParameters8, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8.mmObject();
			isDerived = false;
			xmlTag = "RcncltnInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":23G:4!c/RECO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIndicator";
			definition = "Indicates whether the settlement transaction was already sent on the market and that it is only sent by an account owner to an account servicer for reconciliation purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SettlementTypeAndAdditionalParameters8 obj) {
			return obj.getReconciliationIndicator();
		}

		@Override
		public void setValue(SettlementTypeAndAdditionalParameters8 obj, Optional<YesNoIndicator> value) {
			obj.setReconciliationIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8.mmSecuritiesMovementType, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8.mmPayment,
						com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8.mmCommonIdentification, com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8.mmCorporateActionEventIdentification,
						com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8.mmReconciliationIndicator);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.forSettlementTypeAndAdditionalParameters8);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SettlementTypeAndAdditionalParameters8";
				definition = "Provides transaction type and identification information.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ReceiveDelivery1Code> getSecuritiesMovementType() {
		return securitiesMovementType == null ? Optional.empty() : Optional.of(securitiesMovementType);
	}

	public SettlementTypeAndAdditionalParameters8 setSecuritiesMovementType(ReceiveDelivery1Code securitiesMovementType) {
		this.securitiesMovementType = securitiesMovementType;
		return this;
	}

	public Optional<DeliveryReceiptType2Code> getPayment() {
		return payment == null ? Optional.empty() : Optional.of(payment);
	}

	public SettlementTypeAndAdditionalParameters8 setPayment(DeliveryReceiptType2Code payment) {
		this.payment = payment;
		return this;
	}

	public Optional<RestrictedFINXMax16Text> getCommonIdentification() {
		return commonIdentification == null ? Optional.empty() : Optional.of(commonIdentification);
	}

	public SettlementTypeAndAdditionalParameters8 setCommonIdentification(RestrictedFINXMax16Text commonIdentification) {
		this.commonIdentification = commonIdentification;
		return this;
	}

	public Optional<RestrictedFINXMax16Text> getCorporateActionEventIdentification() {
		return corporateActionEventIdentification == null ? Optional.empty() : Optional.of(corporateActionEventIdentification);
	}

	public SettlementTypeAndAdditionalParameters8 setCorporateActionEventIdentification(RestrictedFINXMax16Text corporateActionEventIdentification) {
		this.corporateActionEventIdentification = corporateActionEventIdentification;
		return this;
	}

	public Optional<YesNoIndicator> getReconciliationIndicator() {
		return reconciliationIndicator == null ? Optional.empty() : Optional.of(reconciliationIndicator);
	}

	public SettlementTypeAndAdditionalParameters8 setReconciliationIndicator(YesNoIndicator reconciliationIndicator) {
		this.reconciliationIndicator = reconciliationIndicator;
		return this;
	}
}