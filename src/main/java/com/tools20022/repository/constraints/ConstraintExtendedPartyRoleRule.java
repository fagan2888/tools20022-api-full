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
import com.tools20022.repository.msg.AccountParties2;
import com.tools20022.repository.msg.AccountParties3;

/**
 * If OtherParty is present, then OtherParty/ExtendedPartyRole must be present.
 */
public class ConstraintExtendedPartyRoleRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedPartyRoleRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherParty is present, then OtherParty/ExtendedPartyRole must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties2> forAccountParties2 = new MMConstraint<AccountParties2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedPartyRoleRule";
			definition = "If OtherParty is present, then OtherParty/ExtendedPartyRole must be present.";
			owner_lazy = () -> AccountParties2.mmObject();
		}

		@Override
		public void executeValidator(AccountParties2 obj) throws Exception {
			checkAccountParties2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedPartyRoleRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OtherParty is present, then OtherParty/ExtendedPartyRole must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<AccountParties3> forAccountParties3 = new MMConstraint<AccountParties3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedPartyRoleRule";
			definition = "If OtherParty is present, then OtherParty/ExtendedPartyRole must be present.";
			owner_lazy = () -> AccountParties3.mmObject();
		}

		@Override
		public void executeValidator(AccountParties3 obj) throws Exception {
			checkAccountParties3(obj);
		}
	};

	/**
	 * If OtherParty is present, then OtherParty/ExtendedPartyRole must be
	 * present.
	 */
	public static void checkAccountParties2(AccountParties2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If OtherParty is present, then OtherParty/ExtendedPartyRole must be
	 * present.
	 */
	public static void checkAccountParties3(AccountParties3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}