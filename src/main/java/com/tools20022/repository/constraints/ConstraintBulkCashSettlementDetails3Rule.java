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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.SubscriptionBulkOrder2;
import com.tools20022.repository.msg.SubscriptionBulkOrder3;
import com.tools20022.repository.msg.SubscriptionBulkOrder4;
import com.tools20022.repository.msg.SubscriptionBulkOrder5;
import java.util.Arrays;

/**
 * Either IndividualOrderDetails/CashSettlementDetails or
 * BulkCashSettlementDetails may be present, but not both.
 */
public class ConstraintBulkCashSettlementDetails3Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder5
	 * SubscriptionBulkOrder5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetails3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails3Rule#forSubscriptionBulkOrder4
	 * ConstraintBulkCashSettlementDetails3Rule.forSubscriptionBulkOrder4}</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrder5> forSubscriptionBulkOrder5 = new MMConstraint<SubscriptionBulkOrder5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails3Rule";
			definition = "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails3Rule.forSubscriptionBulkOrder4;
			owner_lazy = () -> SubscriptionBulkOrder5.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrder5 obj) throws Exception {
			checkSubscriptionBulkOrder5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder2
	 * SubscriptionBulkOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetails3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrder2> forSubscriptionBulkOrder2 = new MMConstraint<SubscriptionBulkOrder2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails3Rule";
			definition = "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			owner_lazy = () -> SubscriptionBulkOrder2.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrder2 obj) throws Exception {
			checkSubscriptionBulkOrder2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder4
	 * SubscriptionBulkOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetails3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails3Rule#forSubscriptionBulkOrder5
	 * ConstraintBulkCashSettlementDetails3Rule.forSubscriptionBulkOrder5}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrder4> forSubscriptionBulkOrder4 = new MMConstraint<SubscriptionBulkOrder4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails3Rule";
			definition = "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails3Rule.forSubscriptionBulkOrder5);
			owner_lazy = () -> SubscriptionBulkOrder4.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrder4 obj) throws Exception {
			checkSubscriptionBulkOrder4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionBulkOrder3
	 * SubscriptionBulkOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetails3Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SubscriptionBulkOrder3> forSubscriptionBulkOrder3 = new MMConstraint<SubscriptionBulkOrder3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails3Rule";
			definition = "Either IndividualOrderDetails/CashSettlementDetails or BulkCashSettlementDetails may be present, but not both.";
			owner_lazy = () -> SubscriptionBulkOrder3.mmObject();
		}

		@Override
		public void executeValidator(SubscriptionBulkOrder3 obj) throws Exception {
			checkSubscriptionBulkOrder3(obj);
		}
	};

	/**
	 * Either IndividualOrderDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkSubscriptionBulkOrder5(SubscriptionBulkOrder5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either IndividualOrderDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkSubscriptionBulkOrder2(SubscriptionBulkOrder2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either IndividualOrderDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkSubscriptionBulkOrder4(SubscriptionBulkOrder4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either IndividualOrderDetails/CashSettlementDetails or
	 * BulkCashSettlementDetails may be present, but not both.
	 */
	public static void checkSubscriptionBulkOrder3(SubscriptionBulkOrder3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}