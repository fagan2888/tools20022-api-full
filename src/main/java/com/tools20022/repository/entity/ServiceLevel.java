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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ServiceLevelCode;
import com.tools20022.repository.codeset.SWIFTServiceLevelCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PaymentProcessing;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RequestedModification;
import com.tools20022.repository.msg.ServiceLevel4;
import com.tools20022.repository.msg.ServiceLevel5;
import com.tools20022.repository.msg.ServiceLevel6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Agreement under which or rules under which the transaction should be
 * processed.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ServiceLevel" src="doc-files/ServiceLevel.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ServiceLevel#mmPaymentProcessing
 * ServiceLevel.mmPaymentProcessing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ServiceLevel#mmCode
 * ServiceLevel.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ServiceLevel#mmOther
 * ServiceLevel.mmOther}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ServiceLevel#mmBilateral
 * ServiceLevel.mmBilateral}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmServiceLevel
 * PaymentProcessing.mmServiceLevel}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ServiceLevel2Choice#mmProprietary
 * ServiceLevel2Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ServiceLevel8Choice#mmProprietary
 * ServiceLevel8Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ServiceLevel3Choice#mmProprietary
 * ServiceLevel3Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ServiceLevel6Choice#mmProprietary
 * ServiceLevel6Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ServiceLevel7Choice#mmProprietary
 * ServiceLevel7Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ServiceLevel2Choice
 * ServiceLevel2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ServiceLevel8Choice
 * ServiceLevel8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ServiceLevel3Choice
 * ServiceLevel3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RestrictedProprietaryChoice
 * RestrictedProprietaryChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceLevel4 ServiceLevel4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ServiceLevel6Choice
 * ServiceLevel6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceLevel6 ServiceLevel6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceLevel5 ServiceLevel5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ServiceLevel7Choice
 * ServiceLevel7Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ServiceLevel"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agreement under which or rules under which the transaction should be processed."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class ServiceLevel {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentProcessing paymentProcessing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentProcessing
	 * PaymentProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmServiceLevel
	 * PaymentProcessing.mmServiceLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel ServiceLevel}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment process for which a service level is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ServiceLevel, Optional<PaymentProcessing>> mmPaymentProcessing = new MMBusinessAssociationEnd<ServiceLevel, Optional<PaymentProcessing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ServiceLevel.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentProcessing";
			definition = "Payment process for which a service level is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PaymentProcessing.mmServiceLevel;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentProcessing.mmObject();
		}

		@Override
		public Optional<PaymentProcessing> getValue(ServiceLevel obj) {
			return obj.getPaymentProcessing();
		}

		@Override
		public void setValue(ServiceLevel obj, Optional<PaymentProcessing> value) {
			obj.setPaymentProcessing(value.orElse(null));
		}
	};
	protected ServiceLevelCode code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceLevelCode
	 * ServiceLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ServiceLevel2Choice#mmCode
	 * ServiceLevel2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ServiceLevel8Choice#mmCode
	 * ServiceLevel8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ServiceLevel3Choice#mmCode
	 * ServiceLevel3Choice.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ServiceLevel4#mmCode
	 * ServiceLevel4.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ServiceLevel6Choice#mmCode
	 * ServiceLevel6Choice.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ServiceLevel6#mmCode
	 * ServiceLevel6.mmCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ServiceLevel5#mmCode
	 * ServiceLevel5.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ServiceLevel7Choice#mmCode
	 * ServiceLevel7Choice.mmCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel ServiceLevel}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a pre-agreed level of service between the parties in a coded form."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ServiceLevel, ServiceLevelCode> mmCode = new MMBusinessAttribute<ServiceLevel, ServiceLevelCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ServiceLevel2Choice.mmCode, ServiceLevel8Choice.mmCode, ServiceLevel3Choice.mmCode, ServiceLevel4.mmCode, ServiceLevel6Choice.mmCode, ServiceLevel6.mmCode, ServiceLevel5.mmCode,
					ServiceLevel7Choice.mmCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ServiceLevel.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Identification of a pre-agreed level of service between the parties in a coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ServiceLevelCode.mmObject();
		}

		@Override
		public ServiceLevelCode getValue(ServiceLevel obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(ServiceLevel obj, ServiceLevelCode value) {
			obj.setCode(value);
		}
	};
	protected SWIFTServiceLevelCode other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevelCode
	 * SWIFTServiceLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmBankOperationCode
	 * RequestedModification.mmBankOperationCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel ServiceLevel}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SWIFT defined service level applies to the payment instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ServiceLevel, SWIFTServiceLevelCode> mmOther = new MMBusinessAttribute<ServiceLevel, SWIFTServiceLevelCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RequestedModification.mmBankOperationCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ServiceLevel.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "SWIFT defined service level applies to the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SWIFTServiceLevelCode.mmObject();
		}

		@Override
		public SWIFTServiceLevelCode getValue(ServiceLevel obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(ServiceLevel obj, SWIFTServiceLevelCode value) {
			obj.setOther(value);
		}
	};
	protected Max35Text bilateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel ServiceLevel}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bilateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of a pre-agreed level of service between the parties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ServiceLevel, Max35Text> mmBilateral = new MMBusinessAttribute<ServiceLevel, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ServiceLevel.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bilateral";
			definition = "Unambiguous identification of a pre-agreed level of service between the parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ServiceLevel obj) {
			return obj.getBilateral();
		}

		@Override
		public void setValue(ServiceLevel obj, Max35Text value) {
			obj.setBilateral(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ServiceLevel";
				definition = "Agreement under which or rules under which the transaction should be processed.";
				associationDomain_lazy = () -> Arrays.asList(PaymentProcessing.mmServiceLevel);
				derivationElement_lazy = () -> Arrays.asList(ServiceLevel2Choice.mmProprietary, ServiceLevel8Choice.mmProprietary, ServiceLevel3Choice.mmProprietary, ServiceLevel6Choice.mmProprietary, ServiceLevel7Choice.mmProprietary);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ServiceLevel.mmPaymentProcessing, com.tools20022.repository.entity.ServiceLevel.mmCode, com.tools20022.repository.entity.ServiceLevel.mmOther,
						com.tools20022.repository.entity.ServiceLevel.mmBilateral);
				derivationComponent_lazy = () -> Arrays.asList(ServiceLevel2Choice.mmObject(), ServiceLevel8Choice.mmObject(), ServiceLevel3Choice.mmObject(), RestrictedProprietaryChoice.mmObject(), ServiceLevel4.mmObject(),
						ServiceLevel6Choice.mmObject(), ServiceLevel6.mmObject(), ServiceLevel5.mmObject(), ServiceLevel7Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return ServiceLevel.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PaymentProcessing> getPaymentProcessing() {
		return paymentProcessing == null ? Optional.empty() : Optional.of(paymentProcessing);
	}

	public ServiceLevel setPaymentProcessing(PaymentProcessing paymentProcessing) {
		this.paymentProcessing = paymentProcessing;
		return this;
	}

	public ServiceLevelCode getCode() {
		return code;
	}

	public ServiceLevel setCode(ServiceLevelCode code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public SWIFTServiceLevelCode getOther() {
		return other;
	}

	public ServiceLevel setOther(SWIFTServiceLevelCode other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}

	public Max35Text getBilateral() {
		return bilateral;
	}

	public ServiceLevel setBilateral(Max35Text bilateral) {
		this.bilateral = Objects.requireNonNull(bilateral);
		return this;
	}
}