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
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * Either TransferDetails\EffectiveSettlementDate or SettlementDetails\Effective
 * Settlement Date may be present, but not both.
 */
public class ConstraintEffectiveSettlementDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04
	 * TransferInConfirmationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\EffectiveSettlementDate or SettlementDetails\\Effective Settlement Date may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#for_sese_TransferInConfirmationV05
	 * ConstraintEffectiveSettlementDateRule.for_sese_TransferInConfirmationV05}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInConfirmationV04> for_sese_TransferInConfirmationV04 = new MMConstraint<TransferInConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails\\EffectiveSettlementDate or SettlementDetails\\Effective Settlement Date may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.for_sese_TransferInConfirmationV05);
			owner_lazy = () -> TransferInConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(TransferInConfirmationV04 obj) throws Exception {
			check_sese_TransferInConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07
	 * TransferInConfirmationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/Effective Settlement Date may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#for_sese_TransferInConfirmationV08
	 * ConstraintEffectiveSettlementDateRule.for_sese_TransferInConfirmationV08}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#for_sese_TransferInConfirmationV06
	 * ConstraintEffectiveSettlementDateRule.for_sese_TransferInConfirmationV06}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInConfirmationV07> for_sese_TransferInConfirmationV07 = new MMConstraint<TransferInConfirmationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/Effective Settlement Date may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.for_sese_TransferInConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.for_sese_TransferInConfirmationV06;
			owner_lazy = () -> TransferInConfirmationV07.mmObject();
		}

		@Override
		public void executeValidator(TransferInConfirmationV07 obj) throws Exception {
			check_sese_TransferInConfirmationV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05
	 * TransferInConfirmationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\EffectiveSettlementDate or SettlementDetails\\Effective Settlement Date may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#for_sese_TransferInConfirmationV06
	 * ConstraintEffectiveSettlementDateRule.for_sese_TransferInConfirmationV06}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#for_sese_TransferInConfirmationV04
	 * ConstraintEffectiveSettlementDateRule.for_sese_TransferInConfirmationV04}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInConfirmationV05> for_sese_TransferInConfirmationV05 = new MMConstraint<TransferInConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails\\EffectiveSettlementDate or SettlementDetails\\Effective Settlement Date may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.for_sese_TransferInConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.for_sese_TransferInConfirmationV04;
			owner_lazy = () -> TransferInConfirmationV05.mmObject();
		}

		@Override
		public void executeValidator(TransferInConfirmationV05 obj) throws Exception {
			check_sese_TransferInConfirmationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut14 TransferOut14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/EffectiveSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#forTransferOut16
	 * ConstraintEffectiveSettlementDateRule.forTransferOut16}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#forTransferOut12
	 * ConstraintEffectiveSettlementDateRule.forTransferOut12}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOut14> forTransferOut14 = new MMConstraint<TransferOut14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/EffectiveSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.forTransferOut16);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.forTransferOut12;
			owner_lazy = () -> TransferOut14.mmObject();
		}

		@Override
		public void executeValidator(TransferOut14 obj) throws Exception {
			checkTransferOut14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05
	 * TransferOutConfirmationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/EffectiveSettlementDate or SettlementDetails/EffectiveSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#for_sese_TransferOutConfirmationV06
	 * ConstraintEffectiveSettlementDateRule.for_sese_TransferOutConfirmationV06
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#for_sese_TransferOutConfirmationV04
	 * ConstraintEffectiveSettlementDateRule.for_sese_TransferOutConfirmationV04
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutConfirmationV05> for_sese_TransferOutConfirmationV05 = new MMConstraint<TransferOutConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails/EffectiveSettlementDate or SettlementDetails/EffectiveSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.for_sese_TransferOutConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.for_sese_TransferOutConfirmationV04;
			owner_lazy = () -> TransferOutConfirmationV05.mmObject();
		}

		@Override
		public void executeValidator(TransferOutConfirmationV05 obj) throws Exception {
			check_sese_TransferOutConfirmationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV08
	 * TransferInConfirmationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/Effective Settlement Date may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#for_sese_TransferInConfirmationV07
	 * ConstraintEffectiveSettlementDateRule.for_sese_TransferInConfirmationV07}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInConfirmationV08> for_sese_TransferInConfirmationV08 = new MMConstraint<TransferInConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/Effective Settlement Date may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.for_sese_TransferInConfirmationV07;
			owner_lazy = () -> TransferInConfirmationV08.mmObject();
		}

		@Override
		public void executeValidator(TransferInConfirmationV08 obj) throws Exception {
			check_sese_TransferInConfirmationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV04
	 * TransferOutConfirmationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\EffectiveSettlementDate or SettlementDetails\\Effective Settlement Date may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#for_sese_TransferOutConfirmationV05
	 * ConstraintEffectiveSettlementDateRule.for_sese_TransferOutConfirmationV05
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutConfirmationV04> for_sese_TransferOutConfirmationV04 = new MMConstraint<TransferOutConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails\\EffectiveSettlementDate or SettlementDetails\\Effective Settlement Date may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.for_sese_TransferOutConfirmationV05);
			owner_lazy = () -> TransferOutConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(TransferOutConfirmationV04 obj) throws Exception {
			check_sese_TransferOutConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn14 TransferIn14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/EffectiveSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#forTransferIn12
	 * ConstraintEffectiveSettlementDateRule.forTransferIn12}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferIn14> forTransferIn14 = new MMConstraint<TransferIn14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/EffectiveSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.forTransferIn12;
			owner_lazy = () -> TransferIn14.mmObject();
		}

		@Override
		public void executeValidator(TransferIn14 obj) throws Exception {
			checkTransferIn14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut16 TransferOut16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/EffectiveSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#forTransferOut14
	 * ConstraintEffectiveSettlementDateRule.forTransferOut14}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOut16> forTransferOut16 = new MMConstraint<TransferOut16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/EffectiveSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.forTransferOut14;
			owner_lazy = () -> TransferOut16.mmObject();
		}

		@Override
		public void executeValidator(TransferOut16 obj) throws Exception {
			checkTransferOut16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06
	 * TransferInConfirmationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/Effective Settlement Date may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#for_sese_TransferInConfirmationV07
	 * ConstraintEffectiveSettlementDateRule.for_sese_TransferInConfirmationV07}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#for_sese_TransferInConfirmationV05
	 * ConstraintEffectiveSettlementDateRule.for_sese_TransferInConfirmationV05}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInConfirmationV06> for_sese_TransferInConfirmationV06 = new MMConstraint<TransferInConfirmationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/Effective Settlement Date may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.for_sese_TransferInConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.for_sese_TransferInConfirmationV05;
			owner_lazy = () -> TransferInConfirmationV06.mmObject();
		}

		@Override
		public void executeValidator(TransferInConfirmationV06 obj) throws Exception {
			check_sese_TransferInConfirmationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn9 TransferIn9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/EffectiveSettlementDate or SettlementDetails/EffectiveSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#forTransferIn12
	 * ConstraintEffectiveSettlementDateRule.forTransferIn12}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#forTransferIn8
	 * ConstraintEffectiveSettlementDateRule.forTransferIn8}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferIn9> forTransferIn9 = new MMConstraint<TransferIn9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails/EffectiveSettlementDate or SettlementDetails/EffectiveSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.forTransferIn12);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.forTransferIn8;
			owner_lazy = () -> TransferIn9.mmObject();
		}

		@Override
		public void executeValidator(TransferIn9 obj) throws Exception {
			checkTransferIn9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn8 TransferIn8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\EffectiveSettlementDate or SettlementDetails\\EffectiveSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#forTransferIn9
	 * ConstraintEffectiveSettlementDateRule.forTransferIn9}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferIn8> forTransferIn8 = new MMConstraint<TransferIn8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails\\EffectiveSettlementDate or SettlementDetails\\EffectiveSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.forTransferIn9);
			owner_lazy = () -> TransferIn8.mmObject();
		}

		@Override
		public void executeValidator(TransferIn8 obj) throws Exception {
			checkTransferIn8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06
	 * TransferOutConfirmationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/EffectiveSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#for_sese_TransferOutConfirmationV07
	 * ConstraintEffectiveSettlementDateRule.for_sese_TransferOutConfirmationV07
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#for_sese_TransferOutConfirmationV05
	 * ConstraintEffectiveSettlementDateRule.for_sese_TransferOutConfirmationV05
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutConfirmationV06> for_sese_TransferOutConfirmationV06 = new MMConstraint<TransferOutConfirmationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/EffectiveSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.for_sese_TransferOutConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.for_sese_TransferOutConfirmationV05;
			owner_lazy = () -> TransferOutConfirmationV06.mmObject();
		}

		@Override
		public void executeValidator(TransferOutConfirmationV06 obj) throws Exception {
			check_sese_TransferOutConfirmationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut10 TransferOut10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\EffectiveSettlementDate or SettlementDetails\\EffectiveSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#forTransferOut12
	 * ConstraintEffectiveSettlementDateRule.forTransferOut12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOut10> forTransferOut10 = new MMConstraint<TransferOut10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails\\EffectiveSettlementDate or SettlementDetails\\EffectiveSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.forTransferOut12);
			owner_lazy = () -> TransferOut10.mmObject();
		}

		@Override
		public void executeValidator(TransferOut10 obj) throws Exception {
			checkTransferOut10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn12 TransferIn12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/EffectiveSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#forTransferIn14
	 * ConstraintEffectiveSettlementDateRule.forTransferIn14}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#forTransferIn9
	 * ConstraintEffectiveSettlementDateRule.forTransferIn9}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferIn12> forTransferIn12 = new MMConstraint<TransferIn12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/EffectiveSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.forTransferIn14);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.forTransferIn9;
			owner_lazy = () -> TransferIn12.mmObject();
		}

		@Override
		public void executeValidator(TransferIn12 obj) throws Exception {
			checkTransferIn12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV08
	 * TransferOutConfirmationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/EffectiveSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#for_sese_TransferOutConfirmationV07
	 * ConstraintEffectiveSettlementDateRule.for_sese_TransferOutConfirmationV07
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutConfirmationV08> for_sese_TransferOutConfirmationV08 = new MMConstraint<TransferOutConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/EffectiveSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.for_sese_TransferOutConfirmationV07;
			owner_lazy = () -> TransferOutConfirmationV08.mmObject();
		}

		@Override
		public void executeValidator(TransferOutConfirmationV08 obj) throws Exception {
			check_sese_TransferOutConfirmationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut12 TransferOut12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/EffectiveSettlementDate or SettlementDetails/EffectiveSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#forTransferOut14
	 * ConstraintEffectiveSettlementDateRule.forTransferOut14}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#forTransferOut10
	 * ConstraintEffectiveSettlementDateRule.forTransferOut10}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOut12> forTransferOut12 = new MMConstraint<TransferOut12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails/EffectiveSettlementDate or SettlementDetails/EffectiveSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.forTransferOut14);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.forTransferOut10;
			owner_lazy = () -> TransferOut12.mmObject();
		}

		@Override
		public void executeValidator(TransferOut12 obj) throws Exception {
			checkTransferOut12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07
	 * TransferOutConfirmationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/EffectiveSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#for_sese_TransferOutConfirmationV08
	 * ConstraintEffectiveSettlementDateRule.for_sese_TransferOutConfirmationV08
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule#for_sese_TransferOutConfirmationV06
	 * ConstraintEffectiveSettlementDateRule.for_sese_TransferOutConfirmationV06
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutConfirmationV07> for_sese_TransferOutConfirmationV07 = new MMConstraint<TransferOutConfirmationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDateRule";
			definition = "Either TransferDetails/EffectiveSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/EffectiveSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.for_sese_TransferOutConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEffectiveSettlementDateRule.for_sese_TransferOutConfirmationV06;
			owner_lazy = () -> TransferOutConfirmationV07.mmObject();
		}

		@Override
		public void executeValidator(TransferOutConfirmationV07 obj) throws Exception {
			check_sese_TransferOutConfirmationV07(obj);
		}
	};

	/**
	 * Either TransferDetails\EffectiveSettlementDate or
	 * SettlementDetails\Effective Settlement Date may be present, but not both.
	 */
	public static void check_sese_TransferInConfirmationV04(TransferInConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/EffectiveSettlementDate may be present in one or
	 * more occurrences of TransferDetails or SettlementDetails/Effective
	 * Settlement Date may be present, but not both.
	 */
	public static void check_sese_TransferInConfirmationV07(TransferInConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\EffectiveSettlementDate or
	 * SettlementDetails\Effective Settlement Date may be present, but not both.
	 */
	public static void check_sese_TransferInConfirmationV05(TransferInConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/EffectiveSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/EffectiveSettlementDate may be present, but not both.
	 */
	public static void checkTransferOut14(TransferOut14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/EffectiveSettlementDate or
	 * SettlementDetails/EffectiveSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferOutConfirmationV05(TransferOutConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/EffectiveSettlementDate may be present in one or
	 * more occurrences of TransferDetails or SettlementDetails/Effective
	 * Settlement Date may be present, but not both.
	 */
	public static void check_sese_TransferInConfirmationV08(TransferInConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\EffectiveSettlementDate or
	 * SettlementDetails\Effective Settlement Date may be present, but not both.
	 */
	public static void check_sese_TransferOutConfirmationV04(TransferOutConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/EffectiveSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/EffectiveSettlementDate may be present, but not both.
	 */
	public static void checkTransferIn14(TransferIn14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/EffectiveSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/EffectiveSettlementDate may be present, but not both.
	 */
	public static void checkTransferOut16(TransferOut16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/EffectiveSettlementDate may be present in one or
	 * more occurrences of TransferDetails or SettlementDetails/Effective
	 * Settlement Date may be present, but not both.
	 */
	public static void check_sese_TransferInConfirmationV06(TransferInConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/EffectiveSettlementDate or
	 * SettlementDetails/EffectiveSettlementDate may be present, but not both.
	 */
	public static void checkTransferIn9(TransferIn9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\EffectiveSettlementDate or
	 * SettlementDetails\EffectiveSettlementDate may be present, but not both.
	 */
	public static void checkTransferIn8(TransferIn8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/EffectiveSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/EffectiveSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferOutConfirmationV06(TransferOutConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\EffectiveSettlementDate or
	 * SettlementDetails\EffectiveSettlementDate may be present, but not both.
	 */
	public static void checkTransferOut10(TransferOut10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/EffectiveSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/EffectiveSettlementDate may be present, but not both.
	 */
	public static void checkTransferIn12(TransferIn12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/EffectiveSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/EffectiveSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferOutConfirmationV08(TransferOutConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/EffectiveSettlementDate or
	 * SettlementDetails/EffectiveSettlementDate may be present, but not both.
	 */
	public static void checkTransferOut12(TransferOut12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/EffectiveSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/EffectiveSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferOutConfirmationV07(TransferOutConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}