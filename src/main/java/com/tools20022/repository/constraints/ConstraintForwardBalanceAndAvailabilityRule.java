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
import com.tools20022.repository.msg.CashBalance3;
import com.tools20022.repository.msg.CashBalance7;
import com.tools20022.repository.msg.CashBalance8;
import java.util.Arrays;

/**
 * If Type is equal to ForwardAvailable, Availability is not allowed.
 */
public class ConstraintForwardBalanceAndAvailabilityRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashBalance3 CashBalance3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Availability[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Type&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Type/CodeOrProprietary&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/Type/CodeOrProprietary/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;ForwardAvailable&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardBalanceAndAvailabilityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is equal to ForwardAvailable, Availability is not allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintForwardBalanceAndAvailabilityRule#forCashBalance7
	 * ConstraintForwardBalanceAndAvailabilityRule.forCashBalance7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashBalance3> forCashBalance3 = new MMConstraint<CashBalance3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardBalanceAndAvailabilityRule";
			definition = "If Type is equal to ForwardAvailable, Availability is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintForwardBalanceAndAvailabilityRule.forCashBalance7);
			owner_lazy = () -> CashBalance3.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Availability[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Type</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Type/CodeOrProprietary</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/Type/CodeOrProprietary/Code</leftOperand><rightOperand>ForwardAvailable</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CashBalance3 obj) throws Exception {
			checkCashBalance3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashBalance8 CashBalance8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardBalanceAndAvailabilityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is equal to ForwardAvailable, Availability is not allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintForwardBalanceAndAvailabilityRule#forCashBalance7
	 * ConstraintForwardBalanceAndAvailabilityRule.forCashBalance7}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashBalance8> forCashBalance8 = new MMConstraint<CashBalance8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardBalanceAndAvailabilityRule";
			definition = "If Type is equal to ForwardAvailable, Availability is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintForwardBalanceAndAvailabilityRule.forCashBalance7;
			owner_lazy = () -> CashBalance8.mmObject();
		}

		@Override
		public void executeValidator(CashBalance8 obj) throws Exception {
			checkCashBalance8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashBalance7 CashBalance7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Availability[*]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Type&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/Type/CodeOrProprietary&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/Type/CodeOrProprietary/Code&lt;/leftOperand&gt;&lt;rightOperand&gt;ForwardAvailable&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardBalanceAndAvailabilityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is equal to ForwardAvailable, Availability is not allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintForwardBalanceAndAvailabilityRule#forCashBalance8
	 * ConstraintForwardBalanceAndAvailabilityRule.forCashBalance8}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintForwardBalanceAndAvailabilityRule#forCashBalance3
	 * ConstraintForwardBalanceAndAvailabilityRule.forCashBalance3}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashBalance7> forCashBalance7 = new MMConstraint<CashBalance7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardBalanceAndAvailabilityRule";
			definition = "If Type is equal to ForwardAvailable, Availability is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintForwardBalanceAndAvailabilityRule.forCashBalance8);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintForwardBalanceAndAvailabilityRule.forCashBalance3;
			owner_lazy = () -> CashBalance7.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/Availability[*]</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/Type</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/Type/CodeOrProprietary</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/Type/CodeOrProprietary/Code</leftOperand><rightOperand>ForwardAvailable</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(CashBalance7 obj) throws Exception {
			checkCashBalance7(obj);
		}
	};

	/**
	 * If Type is equal to ForwardAvailable, Availability is not allowed.
	 */
	public static void checkCashBalance3(CashBalance3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type is equal to ForwardAvailable, Availability is not allowed.
	 */
	public static void checkCashBalance8(CashBalance8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type is equal to ForwardAvailable, Availability is not allowed.
	 */
	public static void checkCashBalance7(CashBalance7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}