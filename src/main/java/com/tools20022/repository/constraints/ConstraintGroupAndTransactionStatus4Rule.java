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
import com.tools20022.repository.area.pacs.PaymentStatusReportV02;
import com.tools20022.repository.area.pain.*;
import java.util.Arrays;

/**
 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to
 * RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.
 */
public class ConstraintGroupAndTransactionStatus4Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV05
	 * CreditorPaymentActivationRequestStatusReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupAndTransactionStatus4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus4Rule#forCreditorPaymentActivationRequestStatusReportV06
	 * ConstraintGroupAndTransactionStatus4Rule.
	 * forCreditorPaymentActivationRequestStatusReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus4Rule#forCreditorPaymentActivationRequestStatusReportV04
	 * ConstraintGroupAndTransactionStatus4Rule.
	 * forCreditorPaymentActivationRequestStatusReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestStatusReportV05> forCreditorPaymentActivationRequestStatusReportV05 = new MMConstraint<CreditorPaymentActivationRequestStatusReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupAndTransactionStatus4Rule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus4Rule.forCreditorPaymentActivationRequestStatusReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus4Rule.forCreditorPaymentActivationRequestStatusReportV04;
			owner_lazy = () -> CreditorPaymentActivationRequestStatusReportV05.mmObject();
		}

		@Override
		public void executeValidator(CreditorPaymentActivationRequestStatusReportV05 obj) throws Exception {
			checkCreditorPaymentActivationRequestStatusReportV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06
	 * CreditorPaymentActivationRequestStatusReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupAndTransactionStatus4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus4Rule#forCreditorPaymentActivationRequestStatusReportV05
	 * ConstraintGroupAndTransactionStatus4Rule.
	 * forCreditorPaymentActivationRequestStatusReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestStatusReportV06> forCreditorPaymentActivationRequestStatusReportV06 = new MMConstraint<CreditorPaymentActivationRequestStatusReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupAndTransactionStatus4Rule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus4Rule.forCreditorPaymentActivationRequestStatusReportV05;
			owner_lazy = () -> CreditorPaymentActivationRequestStatusReportV06.mmObject();
		}

		@Override
		public void executeValidator(CreditorPaymentActivationRequestStatusReportV06 obj) throws Exception {
			checkCreditorPaymentActivationRequestStatusReportV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.PaymentStatusReportV02
	 * PaymentStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupAndTransactionStatus4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.area.pain.PaymentStatusReportV02> forPaymentStatusReportV02 = new MMConstraint<com.tools20022.repository.area.pain.PaymentStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupAndTransactionStatus4Rule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			owner_lazy = () -> com.tools20022.repository.area.pain.PaymentStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(com.tools20022.repository.area.pain.PaymentStatusReportV02 obj) throws Exception {
			checkPaymentStatusReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV01
	 * CreditorPaymentActivationRequestStatusReportV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupAndTransactionStatus4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestStatusReportV01> forCreditorPaymentActivationRequestStatusReportV01 = new MMConstraint<CreditorPaymentActivationRequestStatusReportV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupAndTransactionStatus4Rule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			owner_lazy = () -> CreditorPaymentActivationRequestStatusReportV01.mmObject();
		}

		@Override
		public void executeValidator(CreditorPaymentActivationRequestStatusReportV01 obj) throws Exception {
			checkCreditorPaymentActivationRequestStatusReportV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV02
	 * CreditorPaymentActivationRequestStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupAndTransactionStatus4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestStatusReportV02> forCreditorPaymentActivationRequestStatusReportV02 = new MMConstraint<CreditorPaymentActivationRequestStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupAndTransactionStatus4Rule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			owner_lazy = () -> CreditorPaymentActivationRequestStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(CreditorPaymentActivationRequestStatusReportV02 obj) throws Exception {
			checkCreditorPaymentActivationRequestStatusReportV02(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV03
	 * CreditorPaymentActivationRequestStatusReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupAndTransactionStatus4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus4Rule#forCreditorPaymentActivationRequestStatusReportV04
	 * ConstraintGroupAndTransactionStatus4Rule.
	 * forCreditorPaymentActivationRequestStatusReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestStatusReportV03> forCreditorPaymentActivationRequestStatusReportV03 = new MMConstraint<CreditorPaymentActivationRequestStatusReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupAndTransactionStatus4Rule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus4Rule.forCreditorPaymentActivationRequestStatusReportV04);
			owner_lazy = () -> CreditorPaymentActivationRequestStatusReportV03.mmObject();
		}

		@Override
		public void executeValidator(CreditorPaymentActivationRequestStatusReportV03 obj) throws Exception {
			checkCreditorPaymentActivationRequestStatusReportV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV04
	 * CreditorPaymentActivationRequestStatusReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupAndTransactionStatus4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus4Rule#forCreditorPaymentActivationRequestStatusReportV05
	 * ConstraintGroupAndTransactionStatus4Rule.
	 * forCreditorPaymentActivationRequestStatusReportV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus4Rule#forCreditorPaymentActivationRequestStatusReportV03
	 * ConstraintGroupAndTransactionStatus4Rule.
	 * forCreditorPaymentActivationRequestStatusReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestStatusReportV04> forCreditorPaymentActivationRequestStatusReportV04 = new MMConstraint<CreditorPaymentActivationRequestStatusReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupAndTransactionStatus4Rule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus4Rule.forCreditorPaymentActivationRequestStatusReportV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus4Rule.forCreditorPaymentActivationRequestStatusReportV03;
			owner_lazy = () -> CreditorPaymentActivationRequestStatusReportV04.mmObject();
		}

		@Override
		public void executeValidator(CreditorPaymentActivationRequestStatusReportV04 obj) throws Exception {
			checkCreditorPaymentActivationRequestStatusReportV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentStatusReportV02
	 * PaymentStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupAndTransactionStatus4Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.area.pacs.PaymentStatusReportV02> forPaymentStatusReportV02 = new MMConstraint<com.tools20022.repository.area.pacs.PaymentStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupAndTransactionStatus4Rule";
			definition = "If OriginalGroupInformationAndStatus/GroupStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.\n.";
			owner_lazy = () -> com.tools20022.repository.area.pacs.PaymentStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(com.tools20022.repository.area.pacs.PaymentStatusReportV02 obj) throws Exception {
			checkPaymentStatusReportV02(obj);
		}
	};

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RCVD, then TransactionInformationAndStatus/TransactionStatus is not
	 * allowed.
	 */
	public static void checkCreditorPaymentActivationRequestStatusReportV05(CreditorPaymentActivationRequestStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RCVD, then TransactionInformationAndStatus/TransactionStatus is not
	 * allowed.
	 */
	public static void checkCreditorPaymentActivationRequestStatusReportV06(CreditorPaymentActivationRequestStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RCVD, then TransactionInformationAndStatus/TransactionStatus is not
	 * allowed.
	 */
	public static void checkPaymentStatusReportV02(com.tools20022.repository.area.pain.PaymentStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RCVD, then TransactionInformationAndStatus/TransactionStatus is not
	 * allowed.
	 */
	public static void checkCreditorPaymentActivationRequestStatusReportV01(CreditorPaymentActivationRequestStatusReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RCVD, then TransactionInformationAndStatus/TransactionStatus is not
	 * allowed.
	 */
	public static void checkCreditorPaymentActivationRequestStatusReportV02(CreditorPaymentActivationRequestStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RCVD, then TransactionInformationAndStatus/TransactionStatus is not
	 * allowed.
	 */
	public static void checkCreditorPaymentActivationRequestStatusReportV03(CreditorPaymentActivationRequestStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RCVD, then TransactionInformationAndStatus/TransactionStatus is not
	 * allowed.
	 */
	public static void checkCreditorPaymentActivationRequestStatusReportV04(CreditorPaymentActivationRequestStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OriginalGroupInformationAndStatus/GroupStatus is present and is equal
	 * to RCVD, then TransactionInformationAndStatus/TransactionStatus is not
	 * allowed. .
	 */
	public static void checkPaymentStatusReportV02(com.tools20022.repository.area.pacs.PaymentStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}