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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of characters to be matched to be considered as valid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CharacterSearch1Choice#mmEqual
 * CharacterSearch1Choice.mmEqual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CharacterSearch1Choice#mmNotEqual
 * CharacterSearch1Choice.mmNotEqual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CharacterSearch1Choice#mmContain
 * CharacterSearch1Choice.mmContain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CharacterSearch1Choice#mmNotContain
 * CharacterSearch1Choice.mmNotContain}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CharacterSearch1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of characters to be matched to be considered as valid."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.CharacterSearchChoice
 * CharacterSearchChoice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CharacterSearch1Choice", propOrder = {"equal", "notEqual", "contain", "notContain"})
public class CharacterSearch1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "EQ", required = true)
	protected Max35Text equal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CharacterSearch1Choice
	 * CharacterSearch1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EQ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exact set of characters to be matched to be considered valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CharacterSearchChoice#mmEqual
	 * CharacterSearchChoice.mmEqual}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CharacterSearch1Choice, Max35Text> mmEqual = new MMMessageAttribute<CharacterSearch1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CharacterSearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "EQ";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equal";
			definition = "Exact set of characters to be matched to be considered valid.";
			previousVersion_lazy = () -> CharacterSearchChoice.mmEqual;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CharacterSearch1Choice obj) {
			return obj.getEqual();
		}

		@Override
		public void setValue(CharacterSearch1Choice obj, Max35Text value) {
			obj.setEqual(value);
		}
	};
	@XmlElement(name = "NEQ", required = true)
	protected Max35Text notEqual;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CharacterSearch1Choice
	 * CharacterSearch1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NEQ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEqual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exact set of characters that cannot match to be considered valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CharacterSearchChoice#mmNotEqual
	 * CharacterSearchChoice.mmNotEqual}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CharacterSearch1Choice, Max35Text> mmNotEqual = new MMMessageAttribute<CharacterSearch1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CharacterSearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "NEQ";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEqual";
			definition = "Exact set of characters that cannot match to be considered valid.";
			previousVersion_lazy = () -> CharacterSearchChoice.mmNotEqual;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CharacterSearch1Choice obj) {
			return obj.getNotEqual();
		}

		@Override
		public void setValue(CharacterSearch1Choice obj, Max35Text value) {
			obj.setNotEqual(value);
		}
	};
	@XmlElement(name = "CT", required = true)
	protected Max35Text contain;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CharacterSearch1Choice
	 * CharacterSearch1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Contain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of characters to be matched to be considered valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CharacterSearchChoice#mmContain
	 * CharacterSearchChoice.mmContain}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CharacterSearch1Choice, Max35Text> mmContain = new MMMessageAttribute<CharacterSearch1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CharacterSearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "CT";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Contain";
			definition = "Set of characters to be matched to be considered valid.";
			previousVersion_lazy = () -> CharacterSearchChoice.mmContain;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CharacterSearch1Choice obj) {
			return obj.getContain();
		}

		@Override
		public void setValue(CharacterSearch1Choice obj, Max35Text value) {
			obj.setContain(value);
		}
	};
	@XmlElement(name = "NCT", required = true)
	protected Max35Text notContain;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CharacterSearch1Choice
	 * CharacterSearch1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NCT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotContain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characters that cannot match to be considered valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CharacterSearchChoice#mmNotContain
	 * CharacterSearchChoice.mmNotContain}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CharacterSearch1Choice, Max35Text> mmNotContain = new MMMessageAttribute<CharacterSearch1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CharacterSearch1Choice.mmObject();
			isDerived = false;
			xmlTag = "NCT";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotContain";
			definition = "Set of characters that cannot match to be considered valid.";
			previousVersion_lazy = () -> CharacterSearchChoice.mmNotContain;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CharacterSearch1Choice obj) {
			return obj.getNotContain();
		}

		@Override
		public void setValue(CharacterSearch1Choice obj, Max35Text value) {
			obj.setNotContain(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CharacterSearch1Choice.mmEqual, com.tools20022.repository.choice.CharacterSearch1Choice.mmNotEqual,
						com.tools20022.repository.choice.CharacterSearch1Choice.mmContain, com.tools20022.repository.choice.CharacterSearch1Choice.mmNotContain);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CharacterSearch1Choice";
				definition = "Set of characters to be matched to be considered as valid.";
				previousVersion_lazy = () -> CharacterSearchChoice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getEqual() {
		return equal;
	}

	public CharacterSearch1Choice setEqual(Max35Text equal) {
		this.equal = Objects.requireNonNull(equal);
		return this;
	}

	public Max35Text getNotEqual() {
		return notEqual;
	}

	public CharacterSearch1Choice setNotEqual(Max35Text notEqual) {
		this.notEqual = Objects.requireNonNull(notEqual);
		return this;
	}

	public Max35Text getContain() {
		return contain;
	}

	public CharacterSearch1Choice setContain(Max35Text contain) {
		this.contain = Objects.requireNonNull(contain);
		return this;
	}

	public Max35Text getNotContain() {
		return notContain;
	}

	public CharacterSearch1Choice setNotContain(Max35Text notContain) {
		this.notContain = Objects.requireNonNull(notContain);
		return this;
	}
}