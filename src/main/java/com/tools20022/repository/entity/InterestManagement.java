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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.FinancialTransaction;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.entity.InterestCalculation;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Management of interest which consists into calculating the interest,
 * requesting its payment or distributing the interest proceeds.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InterestManagement" src="doc-files/InterestManagement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmInterestCalculation
 * InterestManagement.mmInterestCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmFinancialTransaction
 * InterestManagement.mmFinancialTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmInterest
 * InterestManagement.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmPaymentObligation
 * InterestManagement.mmPaymentObligation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmInterest
 * PaymentObligation.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedInterestManagement
 * Interest.mmRelatedInterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRelatedInterestManagement
 * InterestCalculation.mmRelatedInterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmInterestManagement
 * FinancialTransaction.mmInterestManagement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration
 * CollateralInterestAdministration}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestManagement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class InterestManagement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected InterestCalculation interestCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRelatedInterestManagement
	 * InterestCalculation.mmRelatedInterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement
	 * InterestManagement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation parameters used to obtain the interest amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InterestManagement, InterestCalculation> mmInterestCalculation = new MMBusinessAssociationEnd<InterestManagement, InterestCalculation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestCalculation";
			definition = "Calculation parameters used to obtain the interest amount.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InterestCalculation.mmRelatedInterestManagement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InterestCalculation.mmObject();
		}

		@Override
		public InterestCalculation getValue(InterestManagement obj) {
			return obj.getInterestCalculation();
		}

		@Override
		public void setValue(InterestManagement obj, InterestCalculation value) {
			obj.setInterestCalculation(value);
		}
	};
	protected FinancialTransaction financialTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmInterestManagement
	 * FinancialTransaction.mmInterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement
	 * InterestManagement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial transaction to which the order belongs."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InterestManagement, FinancialTransaction> mmFinancialTransaction = new MMBusinessAssociationEnd<InterestManagement, FinancialTransaction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the order belongs.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> FinancialTransaction.mmInterestManagement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> FinancialTransaction.mmObject();
		}

		@Override
		public FinancialTransaction getValue(InterestManagement obj) {
			return obj.getFinancialTransaction();
		}

		@Override
		public void setValue(InterestManagement obj, FinancialTransaction value) {
			obj.setFinancialTransaction(value);
		}
	};
	protected List<Interest> interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedInterestManagement
	 * Interest.mmRelatedInterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement
	 * InterestManagement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest information used in the interest management process."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InterestManagement, List<Interest>> mmInterest = new MMBusinessAssociationEnd<InterestManagement, List<Interest>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest information used in the interest management process.";
			minOccurs = 0;
			opposite_lazy = () -> Interest.mmRelatedInterestManagement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Interest.mmObject();
		}

		@Override
		public List<Interest> getValue(InterestManagement obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(InterestManagement obj, List<Interest> value) {
			obj.setInterest(value);
		}
	};
	protected PaymentObligation paymentObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmInterest
	 * PaymentObligation.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement
	 * InterestManagement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment information for the settlement of interest or payment obligation to which interest charges are attached."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InterestManagement, PaymentObligation> mmPaymentObligation = new MMBusinessAssociationEnd<InterestManagement, PaymentObligation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Payment information for the settlement of interest or payment obligation to which interest charges are attached.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PaymentObligation.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}

		@Override
		public PaymentObligation getValue(InterestManagement obj) {
			return obj.getPaymentObligation();
		}

		@Override
		public void setValue(InterestManagement obj, PaymentObligation value) {
			obj.setPaymentObligation(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestManagement";
				definition = "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds.";
				associationDomain_lazy = () -> Arrays.asList(PaymentObligation.mmInterest, Interest.mmRelatedInterestManagement, InterestCalculation.mmRelatedInterestManagement, FinancialTransaction.mmInterestManagement);
				subType_lazy = () -> Arrays.asList(CollateralInterestAdministration.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InterestManagement.mmInterestCalculation, com.tools20022.repository.entity.InterestManagement.mmFinancialTransaction,
						com.tools20022.repository.entity.InterestManagement.mmInterest, com.tools20022.repository.entity.InterestManagement.mmPaymentObligation);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InterestManagement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public InterestCalculation getInterestCalculation() {
		return interestCalculation;
	}

	public InterestManagement setInterestCalculation(InterestCalculation interestCalculation) {
		this.interestCalculation = Objects.requireNonNull(interestCalculation);
		return this;
	}

	public FinancialTransaction getFinancialTransaction() {
		return financialTransaction;
	}

	public InterestManagement setFinancialTransaction(FinancialTransaction financialTransaction) {
		this.financialTransaction = Objects.requireNonNull(financialTransaction);
		return this;
	}

	public List<Interest> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public InterestManagement setInterest(List<Interest> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public PaymentObligation getPaymentObligation() {
		return paymentObligation;
	}

	public InterestManagement setPaymentObligation(PaymentObligation paymentObligation) {
		this.paymentObligation = Objects.requireNonNull(paymentObligation);
		return this;
	}
}