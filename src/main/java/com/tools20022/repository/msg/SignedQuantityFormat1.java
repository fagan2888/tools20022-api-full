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
import com.tools20022.repository.choice.Quantity2Choice;
import com.tools20022.repository.codeset.ShortLong1Code;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
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
 * Signed quantity of security formats.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat1#mmShortLongPosition
 * SignedQuantityFormat1.mmShortLongPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat1#mmQuantityChoice
 * SignedQuantityFormat1.mmQuantityChoice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SignedQuantityFormat1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Signed quantity of security formats."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forSignedQuantityFormat1
 * ConstraintCoexistenceQuantityRule.forSignedQuantityFormat1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SignedQuantityFormat7
 * SignedQuantityFormat7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SignedQuantityFormat1", propOrder = {"shortLongPosition", "quantityChoice"})
public class SignedQuantityFormat1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ShrtLngPos", required = true)
	protected ShortLong1Code shortLongPosition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ShortLong1Code
	 * ShortLong1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmShortLong
	 * SecuritiesBalance.mmShortLong}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat1
	 * SignedQuantityFormat1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtLngPos"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sign of the quantity of security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat7#mmShortLongPosition
	 * SignedQuantityFormat7.mmShortLongPosition}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SignedQuantityFormat1, ShortLong1Code> mmShortLongPosition = new MMMessageAttribute<SignedQuantityFormat1, ShortLong1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmShortLong;
			componentContext_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat1.mmObject();
			isDerived = false;
			xmlTag = "ShrtLngPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongPosition";
			definition = "Sign of the quantity of security.";
			nextVersions_lazy = () -> Arrays.asList(SignedQuantityFormat7.mmShortLongPosition);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ShortLong1Code.mmObject();
		}

		@Override
		public ShortLong1Code getValue(SignedQuantityFormat1 obj) {
			return obj.getShortLongPosition();
		}

		@Override
		public void setValue(SignedQuantityFormat1 obj, ShortLong1Code value) {
			obj.setShortLongPosition(value);
		}
	};
	@XmlElement(name = "QtyChc", required = true)
	protected Quantity2Choice quantityChoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity2Choice
	 * Quantity2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
	 * SecuritiesBalance.mmAggregateQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat1
	 * SignedQuantityFormat1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyChc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Choice between different quantity of security formats."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat7#mmQuantityChoice
	 * SignedQuantityFormat7.mmQuantityChoice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SignedQuantityFormat1, Quantity2Choice> mmQuantityChoice = new MMMessageAssociationEnd<SignedQuantityFormat1, Quantity2Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmAggregateQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SignedQuantityFormat1.mmObject();
			isDerived = false;
			xmlTag = "QtyChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityChoice";
			definition = "Choice between different quantity of security formats.";
			nextVersions_lazy = () -> Arrays.asList(SignedQuantityFormat7.mmQuantityChoice);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quantity2Choice.mmObject();
		}

		@Override
		public Quantity2Choice getValue(SignedQuantityFormat1 obj) {
			return obj.getQuantityChoice();
		}

		@Override
		public void setValue(SignedQuantityFormat1 obj, Quantity2Choice value) {
			obj.setQuantityChoice(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SignedQuantityFormat1.mmShortLongPosition, com.tools20022.repository.msg.SignedQuantityFormat1.mmQuantityChoice);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forSignedQuantityFormat1);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SignedQuantityFormat1";
				definition = "Signed quantity of security formats.";
				nextVersions_lazy = () -> Arrays.asList(SignedQuantityFormat7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ShortLong1Code getShortLongPosition() {
		return shortLongPosition;
	}

	public SignedQuantityFormat1 setShortLongPosition(ShortLong1Code shortLongPosition) {
		this.shortLongPosition = Objects.requireNonNull(shortLongPosition);
		return this;
	}

	public Quantity2Choice getQuantityChoice() {
		return quantityChoice;
	}

	public SignedQuantityFormat1 setQuantityChoice(Quantity2Choice quantityChoice) {
		this.quantityChoice = Objects.requireNonNull(quantityChoice);
		return this;
	}
}