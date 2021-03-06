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
import com.tools20022.repository.codeset.ExternalBankTransactionDomainCode;
import com.tools20022.repository.entity.BankTransaction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BankTransactionCodeStructure3;
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
 * Code of the underlying bank transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure2#mmCode
 * BankTransactionCodeStructure2.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure2#mmFamily
 * BankTransactionCodeStructure2.mmFamily}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BankTransaction
 * BankTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BankTransactionCodeStructure2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Code of the underlying bank transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BankTransactionCodeStructure2", propOrder = {"code", "family"})
public class BankTransactionCodeStructure2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected ExternalBankTransactionDomainCode code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalBankTransactionDomainCode
	 * ExternalBankTransactionDomainCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmDomain
	 * BankTransaction.mmDomain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure2
	 * BankTransactionCodeStructure2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the business area of the underlying transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BankTransactionCodeStructure2, ExternalBankTransactionDomainCode> mmCode = new MMMessageAttribute<BankTransactionCodeStructure2, ExternalBankTransactionDomainCode>() {
		{
			businessElementTrace_lazy = () -> BankTransaction.mmDomain;
			componentContext_lazy = () -> com.tools20022.repository.msg.BankTransactionCodeStructure2.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Specifies the business area of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalBankTransactionDomainCode.mmObject();
		}

		@Override
		public ExternalBankTransactionDomainCode getValue(BankTransactionCodeStructure2 obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(BankTransactionCodeStructure2 obj, ExternalBankTransactionDomainCode value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "Fmly", required = true)
	protected BankTransactionCodeStructure3 family;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure3
	 * BankTransactionCodeStructure3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BankTransaction#mmFamily
	 * BankTransaction.mmFamily}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure2
	 * BankTransactionCodeStructure2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fmly"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Family"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the family and the sub-family of the bank transaction code, within a specific domain, in a structured and hierarchical format."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BankTransactionCodeStructure2, BankTransactionCodeStructure3> mmFamily = new MMMessageAssociationEnd<BankTransactionCodeStructure2, BankTransactionCodeStructure3>() {
		{
			businessElementTrace_lazy = () -> BankTransaction.mmFamily;
			componentContext_lazy = () -> com.tools20022.repository.msg.BankTransactionCodeStructure2.mmObject();
			isDerived = false;
			xmlTag = "Fmly";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Family";
			definition = "Specifies the family and the sub-family of the bank transaction code, within a specific domain, in a structured and hierarchical format.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BankTransactionCodeStructure3.mmObject();
		}

		@Override
		public BankTransactionCodeStructure3 getValue(BankTransactionCodeStructure2 obj) {
			return obj.getFamily();
		}

		@Override
		public void setValue(BankTransactionCodeStructure2 obj, BankTransactionCodeStructure3 value) {
			obj.setFamily(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BankTransactionCodeStructure2.mmCode, com.tools20022.repository.msg.BankTransactionCodeStructure2.mmFamily);
				trace_lazy = () -> BankTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "BankTransactionCodeStructure2";
				definition = "Code of the underlying bank transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public ExternalBankTransactionDomainCode getCode() {
		return code;
	}

	public BankTransactionCodeStructure2 setCode(ExternalBankTransactionDomainCode code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public BankTransactionCodeStructure3 getFamily() {
		return family;
	}

	public BankTransactionCodeStructure2 setFamily(BankTransactionCodeStructure3 family) {
		this.family = Objects.requireNonNull(family);
		return this;
	}
}