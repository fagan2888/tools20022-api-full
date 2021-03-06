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
import com.tools20022.repository.area.camt.*;
import java.util.Arrays;

/**
 * MessagePagination may be present or NotificationPagination may be present,
 * but not both.
 */
public class ConstraintMessageOrNotificationPaginationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV05
	 * BankToCustomerDebitCreditNotificationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/GroupHeader/MessagePagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Notification[*]/NotificationPagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrNotificationPaginationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MessagePagination may be present or NotificationPagination may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrNotificationPaginationRule#for_camt_BankToCustomerDebitCreditNotificationV06
	 * ConstraintMessageOrNotificationPaginationRule.
	 * for_camt_BankToCustomerDebitCreditNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrNotificationPaginationRule#for_camt_BankToCustomerDebitCreditNotificationV04
	 * ConstraintMessageOrNotificationPaginationRule.
	 * for_camt_BankToCustomerDebitCreditNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerDebitCreditNotificationV05> for_camt_BankToCustomerDebitCreditNotificationV05 = new MMConstraint<BankToCustomerDebitCreditNotificationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrNotificationPaginationRule";
			definition = "MessagePagination may be present or NotificationPagination may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrNotificationPaginationRule.for_camt_BankToCustomerDebitCreditNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrNotificationPaginationRule.for_camt_BankToCustomerDebitCreditNotificationV04;
			owner_lazy = () -> BankToCustomerDebitCreditNotificationV05.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/GroupHeader/MessagePagination</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/Notification[*]/NotificationPagination</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(BankToCustomerDebitCreditNotificationV05 obj) throws Exception {
			check_camt_BankToCustomerDebitCreditNotificationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV07
	 * BankToCustomerDebitCreditNotificationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/GroupHeader/MessagePagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Notification[*]/NotificationPagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrNotificationPaginationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MessagePagination may be present or NotificationPagination may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrNotificationPaginationRule#for_camt_BankToCustomerDebitCreditNotificationV06
	 * ConstraintMessageOrNotificationPaginationRule.
	 * for_camt_BankToCustomerDebitCreditNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerDebitCreditNotificationV07> for_camt_BankToCustomerDebitCreditNotificationV07 = new MMConstraint<BankToCustomerDebitCreditNotificationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrNotificationPaginationRule";
			definition = "MessagePagination may be present or NotificationPagination may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrNotificationPaginationRule.for_camt_BankToCustomerDebitCreditNotificationV06;
			owner_lazy = () -> BankToCustomerDebitCreditNotificationV07.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/GroupHeader/MessagePagination</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/Notification[*]/NotificationPagination</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(BankToCustomerDebitCreditNotificationV07 obj) throws Exception {
			check_camt_BankToCustomerDebitCreditNotificationV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV06
	 * BankToCustomerDebitCreditNotificationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/GroupHeader/MessagePagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Notification[*]/NotificationPagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrNotificationPaginationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MessagePagination may be present or NotificationPagination may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrNotificationPaginationRule#for_camt_BankToCustomerDebitCreditNotificationV07
	 * ConstraintMessageOrNotificationPaginationRule.
	 * for_camt_BankToCustomerDebitCreditNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrNotificationPaginationRule#for_camt_BankToCustomerDebitCreditNotificationV05
	 * ConstraintMessageOrNotificationPaginationRule.
	 * for_camt_BankToCustomerDebitCreditNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerDebitCreditNotificationV06> for_camt_BankToCustomerDebitCreditNotificationV06 = new MMConstraint<BankToCustomerDebitCreditNotificationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrNotificationPaginationRule";
			definition = "MessagePagination may be present or NotificationPagination may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrNotificationPaginationRule.for_camt_BankToCustomerDebitCreditNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrNotificationPaginationRule.for_camt_BankToCustomerDebitCreditNotificationV05;
			owner_lazy = () -> BankToCustomerDebitCreditNotificationV06.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/GroupHeader/MessagePagination</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/Notification[*]/NotificationPagination</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(BankToCustomerDebitCreditNotificationV06 obj) throws Exception {
			check_camt_BankToCustomerDebitCreditNotificationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV03
	 * BankToCustomerDebitCreditNotificationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/GroupHeader/MessagePagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Notification[*]/NotificationPagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrNotificationPaginationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MessagePagination may be present or NotificationPagination may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerDebitCreditNotificationV03> for_camt_BankToCustomerDebitCreditNotificationV03 = new MMConstraint<BankToCustomerDebitCreditNotificationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrNotificationPaginationRule";
			definition = "MessagePagination may be present or NotificationPagination may be present, but not both.";
			owner_lazy = () -> BankToCustomerDebitCreditNotificationV03.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/GroupHeader/MessagePagination</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/Notification[*]/NotificationPagination</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(BankToCustomerDebitCreditNotificationV03 obj) throws Exception {
			check_camt_BankToCustomerDebitCreditNotificationV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV04
	 * BankToCustomerDebitCreditNotificationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/GroupHeader/MessagePagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/Notification[*]/NotificationPagination&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;/SimpleRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrNotificationPaginationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MessagePagination may be present or NotificationPagination may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrNotificationPaginationRule#for_camt_BankToCustomerDebitCreditNotificationV05
	 * ConstraintMessageOrNotificationPaginationRule.
	 * for_camt_BankToCustomerDebitCreditNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerDebitCreditNotificationV04> for_camt_BankToCustomerDebitCreditNotificationV04 = new MMConstraint<BankToCustomerDebitCreditNotificationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrNotificationPaginationRule";
			definition = "MessagePagination may be present or NotificationPagination may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrNotificationPaginationRule.for_camt_BankToCustomerDebitCreditNotificationV05);
			owner_lazy = () -> BankToCustomerDebitCreditNotificationV04.mmObject();
			expression = "<RuleDefinition><SimpleRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SimpleRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/GroupHeader/MessagePagination</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/Notification[*]/NotificationPagination</leftOperand></BooleanRule></mustBe></SimpleRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(BankToCustomerDebitCreditNotificationV04 obj) throws Exception {
			check_camt_BankToCustomerDebitCreditNotificationV04(obj);
		}
	};

	/**
	 * MessagePagination may be present or NotificationPagination may be
	 * present, but not both.
	 */
	public static void check_camt_BankToCustomerDebitCreditNotificationV05(BankToCustomerDebitCreditNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MessagePagination may be present or NotificationPagination may be
	 * present, but not both.
	 */
	public static void check_camt_BankToCustomerDebitCreditNotificationV07(BankToCustomerDebitCreditNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MessagePagination may be present or NotificationPagination may be
	 * present, but not both.
	 */
	public static void check_camt_BankToCustomerDebitCreditNotificationV06(BankToCustomerDebitCreditNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MessagePagination may be present or NotificationPagination may be
	 * present, but not both.
	 */
	public static void check_camt_BankToCustomerDebitCreditNotificationV03(BankToCustomerDebitCreditNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * MessagePagination may be present or NotificationPagination may be
	 * present, but not both.
	 */
	public static void check_camt_BankToCustomerDebitCreditNotificationV04(BankToCustomerDebitCreditNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}