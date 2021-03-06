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
import com.tools20022.repository.codeset.ContentType1Code;
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AlgorithmIdentification6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Encrypted data with an encryption key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncryptedContent2#mmContentType
 * EncryptedContent2.mmContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncryptedContent2#mmContentEncryptionAlgorithm
 * EncryptedContent2.mmContentEncryptionAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EncryptedContent2#mmEncryptedData
 * EncryptedContent2.mmEncryptedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EncryptedContent2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Encrypted data with an encryption key."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EncryptedContent3
 * EncryptedContent3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.EncryptedContent1
 * EncryptedContent1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EncryptedContent2", propOrder = {"contentType", "contentEncryptionAlgorithm", "encryptedData"})
public class EncryptedContent2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CnttTp", required = true)
	protected ContentType1Code contentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType1Code
	 * ContentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EncryptedContent2
	 * EncryptedContent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnttTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of data which have been encrypted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EncryptedContent3#mmContentType
	 * EncryptedContent3.mmContentType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EncryptedContent2, ContentType1Code> mmContentType = new MMMessageAttribute<EncryptedContent2, ContentType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EncryptedContent2.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data which have been encrypted.";
			nextVersions_lazy = () -> Arrays.asList(EncryptedContent3.mmContentType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ContentType1Code.mmObject();
		}

		@Override
		public ContentType1Code getValue(EncryptedContent2 obj) {
			return obj.getContentType();
		}

		@Override
		public void setValue(EncryptedContent2 obj, ContentType1Code value) {
			obj.setContentType(value);
		}
	};
	@XmlElement(name = "CnttNcrptnAlgo", required = true)
	protected AlgorithmIdentification6 contentEncryptionAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification6
	 * AlgorithmIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EncryptedContent2
	 * EncryptedContent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnttNcrptnAlgo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContentEncryptionAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Algorithm used to encrypt the data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EncryptedContent3#mmContentEncryptionAlgorithm
	 * EncryptedContent3.mmContentEncryptionAlgorithm}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EncryptedContent2, AlgorithmIdentification6> mmContentEncryptionAlgorithm = new MMMessageAssociationEnd<EncryptedContent2, AlgorithmIdentification6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EncryptedContent2.mmObject();
			isDerived = false;
			xmlTag = "CnttNcrptnAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentEncryptionAlgorithm";
			definition = "Algorithm used to encrypt the data.";
			nextVersions_lazy = () -> Arrays.asList(EncryptedContent3.mmContentEncryptionAlgorithm);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AlgorithmIdentification6.mmObject();
		}

		@Override
		public AlgorithmIdentification6 getValue(EncryptedContent2 obj) {
			return obj.getContentEncryptionAlgorithm();
		}

		@Override
		public void setValue(EncryptedContent2 obj, AlgorithmIdentification6 value) {
			obj.setContentEncryptionAlgorithm(value);
		}
	};
	@XmlElement(name = "NcrptdData", required = true)
	protected Max10000Binary encryptedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EncryptedContent2
	 * EncryptedContent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcrptdData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted data, result of the content encryption."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EncryptedContent3#mmEncryptedData
	 * EncryptedContent3.mmEncryptedData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EncryptedContent2, Max10000Binary> mmEncryptedData = new MMMessageAttribute<EncryptedContent2, Max10000Binary>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EncryptedContent2.mmObject();
			isDerived = false;
			xmlTag = "NcrptdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedData";
			definition = "Encrypted data, result of the content encryption.";
			nextVersions_lazy = () -> Arrays.asList(EncryptedContent3.mmEncryptedData);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public Max10000Binary getValue(EncryptedContent2 obj) {
			return obj.getEncryptedData();
		}

		@Override
		public void setValue(EncryptedContent2 obj, Max10000Binary value) {
			obj.setEncryptedData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EncryptedContent2.mmContentType, com.tools20022.repository.msg.EncryptedContent2.mmContentEncryptionAlgorithm,
						com.tools20022.repository.msg.EncryptedContent2.mmEncryptedData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EncryptedContent2";
				definition = "Encrypted data with an encryption key.";
				nextVersions_lazy = () -> Arrays.asList(EncryptedContent3.mmObject());
				previousVersion_lazy = () -> EncryptedContent1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ContentType1Code getContentType() {
		return contentType;
	}

	public EncryptedContent2 setContentType(ContentType1Code contentType) {
		this.contentType = Objects.requireNonNull(contentType);
		return this;
	}

	public AlgorithmIdentification6 getContentEncryptionAlgorithm() {
		return contentEncryptionAlgorithm;
	}

	public EncryptedContent2 setContentEncryptionAlgorithm(AlgorithmIdentification6 contentEncryptionAlgorithm) {
		this.contentEncryptionAlgorithm = Objects.requireNonNull(contentEncryptionAlgorithm);
		return this;
	}

	public Max10000Binary getEncryptedData() {
		return encryptedData;
	}

	public EncryptedContent2 setEncryptedData(Max10000Binary encryptedData) {
		this.encryptedData = Objects.requireNonNull(encryptedData);
		return this;
	}
}