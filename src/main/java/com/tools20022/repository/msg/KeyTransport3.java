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
import com.tools20022.repository.datatype.Max3000Binary;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AlgorithmIdentification7;
import com.tools20022.repository.msg.CertificateIdentifier1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Key encryption key (KEK), encrypted with a previously distributed asymmetric
 * public key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.KeyTransport3#mmVersion
 * KeyTransport3.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.KeyTransport3#mmRecipientIdentification
 * KeyTransport3.mmRecipientIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.KeyTransport3#mmKeyEncryptionAlgorithm
 * KeyTransport3.mmKeyEncryptionAlgorithm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.KeyTransport3#mmEncryptedKey
 * KeyTransport3.mmEncryptedKey}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "KeyTransport3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Key encryption key (KEK), encrypted with a previously distributed asymmetric public key."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.KeyTransport4 KeyTransport4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.KeyTransport2
 * KeyTransport2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "KeyTransport3", propOrder = {"version", "recipientIdentification", "keyEncryptionAlgorithm", "encryptedKey"})
public class KeyTransport3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Vrsn")
	protected Number version;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport3 KeyTransport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.KeyTransport4#mmVersion
	 * KeyTransport4.mmVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport2#mmVersion
	 * KeyTransport2.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<KeyTransport3, Optional<Number>> mmVersion = new MMMessageAttribute<KeyTransport3, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KeyTransport3.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(KeyTransport4.mmVersion);
			previousVersion_lazy = () -> KeyTransport2.mmVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(KeyTransport3 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(KeyTransport3 obj, Optional<Number> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "RcptId", required = true)
	protected CertificateIdentifier1 recipientIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CertificateIdentifier1
	 * CertificateIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport3 KeyTransport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transport key or key encryption key (KEK) for the recipient."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.KeyTransport4#mmRecipientIdentification
	 * KeyTransport4.mmRecipientIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport2#mmRecipientIdentification
	 * KeyTransport2.mmRecipientIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<KeyTransport3, CertificateIdentifier1> mmRecipientIdentification = new MMMessageAssociationEnd<KeyTransport3, CertificateIdentifier1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KeyTransport3.mmObject();
			isDerived = false;
			xmlTag = "RcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientIdentification";
			definition = "Transport key or key encryption key (KEK) for the recipient.";
			nextVersions_lazy = () -> Arrays.asList(KeyTransport4.mmRecipientIdentification);
			previousVersion_lazy = () -> KeyTransport2.mmRecipientIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CertificateIdentifier1.mmObject();
		}

		@Override
		public CertificateIdentifier1 getValue(KeyTransport3 obj) {
			return obj.getRecipientIdentification();
		}

		@Override
		public void setValue(KeyTransport3 obj, CertificateIdentifier1 value) {
			obj.setRecipientIdentification(value);
		}
	};
	@XmlElement(name = "KeyNcrptnAlgo", required = true)
	protected AlgorithmIdentification7 keyEncryptionAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification7
	 * AlgorithmIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport3 KeyTransport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyNcrptnAlgo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyEncryptionAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Algorithm to encrypt the key encryption key (KEK)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.KeyTransport4#mmKeyEncryptionAlgorithm
	 * KeyTransport4.mmKeyEncryptionAlgorithm}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport2#mmKeyEncryptionAlgorithm
	 * KeyTransport2.mmKeyEncryptionAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<KeyTransport3, AlgorithmIdentification7> mmKeyEncryptionAlgorithm = new MMMessageAssociationEnd<KeyTransport3, AlgorithmIdentification7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KeyTransport3.mmObject();
			isDerived = false;
			xmlTag = "KeyNcrptnAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyEncryptionAlgorithm";
			definition = "Algorithm to encrypt the key encryption key (KEK).";
			nextVersions_lazy = () -> Arrays.asList(KeyTransport4.mmKeyEncryptionAlgorithm);
			previousVersion_lazy = () -> KeyTransport2.mmKeyEncryptionAlgorithm;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AlgorithmIdentification7.mmObject();
		}

		@Override
		public AlgorithmIdentification7 getValue(KeyTransport3 obj) {
			return obj.getKeyEncryptionAlgorithm();
		}

		@Override
		public void setValue(KeyTransport3 obj, AlgorithmIdentification7 value) {
			obj.setKeyEncryptionAlgorithm(value);
		}
	};
	@XmlElement(name = "NcrptdKey", required = true)
	protected Max3000Binary encryptedKey;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3000Binary
	 * Max3000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport3 KeyTransport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcrptdKey"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptedKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted key encryption key (KEK)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.KeyTransport4#mmEncryptedKey
	 * KeyTransport4.mmEncryptedKey}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KeyTransport2#mmEncryptedKey
	 * KeyTransport2.mmEncryptedKey}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<KeyTransport3, Max3000Binary> mmEncryptedKey = new MMMessageAttribute<KeyTransport3, Max3000Binary>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KeyTransport3.mmObject();
			isDerived = false;
			xmlTag = "NcrptdKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedKey";
			definition = "Encrypted key encryption key (KEK).";
			nextVersions_lazy = () -> Arrays.asList(KeyTransport4.mmEncryptedKey);
			previousVersion_lazy = () -> KeyTransport2.mmEncryptedKey;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}

		@Override
		public Max3000Binary getValue(KeyTransport3 obj) {
			return obj.getEncryptedKey();
		}

		@Override
		public void setValue(KeyTransport3 obj, Max3000Binary value) {
			obj.setEncryptedKey(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.KeyTransport3.mmVersion, com.tools20022.repository.msg.KeyTransport3.mmRecipientIdentification,
						com.tools20022.repository.msg.KeyTransport3.mmKeyEncryptionAlgorithm, com.tools20022.repository.msg.KeyTransport3.mmEncryptedKey);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "KeyTransport3";
				definition = "Key encryption key (KEK), encrypted with a previously distributed asymmetric public key.";
				nextVersions_lazy = () -> Arrays.asList(KeyTransport4.mmObject());
				previousVersion_lazy = () -> KeyTransport2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public KeyTransport3 setVersion(Number version) {
		this.version = version;
		return this;
	}

	public CertificateIdentifier1 getRecipientIdentification() {
		return recipientIdentification;
	}

	public KeyTransport3 setRecipientIdentification(CertificateIdentifier1 recipientIdentification) {
		this.recipientIdentification = Objects.requireNonNull(recipientIdentification);
		return this;
	}

	public AlgorithmIdentification7 getKeyEncryptionAlgorithm() {
		return keyEncryptionAlgorithm;
	}

	public KeyTransport3 setKeyEncryptionAlgorithm(AlgorithmIdentification7 keyEncryptionAlgorithm) {
		this.keyEncryptionAlgorithm = Objects.requireNonNull(keyEncryptionAlgorithm);
		return this;
	}

	public Max3000Binary getEncryptedKey() {
		return encryptedKey;
	}

	public KeyTransport3 setEncryptedKey(Max3000Binary encryptedKey) {
		this.encryptedKey = Objects.requireNonNull(encryptedKey);
		return this;
	}
}