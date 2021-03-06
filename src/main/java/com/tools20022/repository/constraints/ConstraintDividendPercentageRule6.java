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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03;
import com.tools20022.repository.area.acmt.AccountModificationInstructionV03;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV03;
import java.util.Arrays;

/**
 * WithdrawalInvestmentPlan\CashSettlement\InterestPaymentInstrument\
 * DividendPercentage is not allowed.
 */
public class ConstraintDividendPercentageRule6 {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03
	 * AccountDetailsConfirmationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/WithdrawalInvestmentPlan[*]/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentageRule6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "WithdrawalInvestmentPlan\\CashSettlement\\InterestPaymentInstrument\\DividendPercentage is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule#for_acmt_AccountDetailsConfirmationV04
	 * ConstraintDividendPercentage6Rule.for_acmt_AccountDetailsConfirmationV04}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountDetailsConfirmationV03> for_acmt_AccountDetailsConfirmationV03 = new MMConstraint<AccountDetailsConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentageRule6";
			definition = "WithdrawalInvestmentPlan\\CashSettlement\\InterestPaymentInstrument\\DividendPercentage is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule.for_acmt_AccountDetailsConfirmationV04);
			owner_lazy = () -> AccountDetailsConfirmationV03.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/WithdrawalInvestmentPlan[*]/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(AccountDetailsConfirmationV03 obj) throws Exception {
			check_acmt_AccountDetailsConfirmationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03
	 * AccountOpeningInstructionV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/WithdrawalInvestmentPlan[*]/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentageRule6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "WithdrawalInvestmentPlan\\CashSettlement\\InterestPaymentInstrument\\DividendPercentage is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule#for_acmt_AccountOpeningInstructionV04
	 * ConstraintDividendPercentage6Rule.for_acmt_AccountOpeningInstructionV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountOpeningInstructionV03> for_acmt_AccountOpeningInstructionV03 = new MMConstraint<AccountOpeningInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentageRule6";
			definition = "WithdrawalInvestmentPlan\\CashSettlement\\InterestPaymentInstrument\\DividendPercentage is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule.for_acmt_AccountOpeningInstructionV04);
			owner_lazy = () -> AccountOpeningInstructionV03.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/WithdrawalInvestmentPlan[*]/CashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(AccountOpeningInstructionV03 obj) throws Exception {
			check_acmt_AccountOpeningInstructionV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03
	 * AccountModificationInstructionV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/ModifiedWithdrawalInvestmentPlan[*]/InvestmentPlan/ModifiedCashSettlement[*]/InterestPaymentInstrument/DividendPercentage&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentageRule6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ModifiedWithdrawalInvestmentPlan\\InvestmentPlan\\ModifiedCashSettlement\\InterestPaymentInstrument\\DividendPercentage is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule#for_acmt_AccountModificationInstructionV04
	 * ConstraintDividendPercentage6Rule.
	 * for_acmt_AccountModificationInstructionV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AccountModificationInstructionV03> for_acmt_AccountModificationInstructionV03 = new MMConstraint<AccountModificationInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentageRule6";
			definition = "ModifiedWithdrawalInvestmentPlan\\InvestmentPlan\\ModifiedCashSettlement\\InterestPaymentInstrument\\DividendPercentage is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDividendPercentage6Rule.for_acmt_AccountModificationInstructionV04);
			owner_lazy = () -> AccountModificationInstructionV03.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/ModifiedWithdrawalInvestmentPlan[*]/InvestmentPlan/ModifiedCashSettlement[*]/InterestPaymentInstrument/DividendPercentage</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(AccountModificationInstructionV03 obj) throws Exception {
			check_acmt_AccountModificationInstructionV03(obj);
		}
	};

	/**
	 * WithdrawalInvestmentPlan\CashSettlement\InterestPaymentInstrument\
	 * DividendPercentage is not allowed.
	 */
	public static void check_acmt_AccountDetailsConfirmationV03(AccountDetailsConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * WithdrawalInvestmentPlan\CashSettlement\InterestPaymentInstrument\
	 * DividendPercentage is not allowed.
	 */
	public static void check_acmt_AccountOpeningInstructionV03(AccountOpeningInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ModifiedWithdrawalInvestmentPlan\InvestmentPlan\ModifiedCashSettlement\
	 * InterestPaymentInstrument\DividendPercentage is not allowed.
	 */
	public static void check_acmt_AccountModificationInstructionV03(AccountModificationInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}