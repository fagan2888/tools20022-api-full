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
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be present.
 * If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is not allowed.
 */
public class ConstraintPhysicalTransferDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7
	 * ReceiveInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation7> forReceiveInformation7 = new MMConstraint<ReceiveInformation7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation7.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation7 obj) throws Exception {
			checkReceiveInformation7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8
	 * ReceiveInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation8> forReceiveInformation8 = new MMConstraint<ReceiveInformation8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation8.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation8 obj) throws Exception {
			checkReceiveInformation8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5
	 * ReceiveInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation5> forReceiveInformation5 = new MMConstraint<ReceiveInformation5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation5.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation5 obj) throws Exception {
			checkReceiveInformation5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4
	 * ReceiveInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferIndicator is \"true\" or \"1\" (Yes), then PhysicalTransferDetails must be present. If PhysicalTransferIndicator is \"false\" or \"0\" (No), then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation4> forReceiveInformation4 = new MMConstraint<ReceiveInformation4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransferIndicator is \"true\" or \"1\" (Yes), then PhysicalTransferDetails must be present. If PhysicalTransferIndicator is \"false\" or \"0\" (No), then PhysicalTransferDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation4.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation4 obj) throws Exception {
			checkReceiveInformation4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14
	 * ReceiveInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation17
	 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation17}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation12
	 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation12}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation14> forReceiveInformation14 = new MMConstraint<ReceiveInformation14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation17);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation12;
			owner_lazy = () -> ReceiveInformation14.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation14 obj) throws Exception {
			checkReceiveInformation14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13
	 * ReceiveInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation15
	 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation15}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation9
	 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation9}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation13> forReceiveInformation13 = new MMConstraint<ReceiveInformation13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation15);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation9;
			owner_lazy = () -> ReceiveInformation13.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation13 obj) throws Exception {
			checkReceiveInformation13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12
	 * ReceiveInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation14
	 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation14}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation11
	 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation11}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation12> forReceiveInformation12 = new MMConstraint<ReceiveInformation12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation14);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation11;
			owner_lazy = () -> ReceiveInformation12.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation12 obj) throws Exception {
			checkReceiveInformation12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9
	 * DeliverInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation13
	 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation13}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation9> forDeliverInformation9 = new MMConstraint<DeliverInformation9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation13);
			owner_lazy = () -> DeliverInformation9.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation9 obj) throws Exception {
			checkDeliverInformation9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12
	 * DeliverInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation14
	 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation14}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation11
	 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation11}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation12> forDeliverInformation12 = new MMConstraint<DeliverInformation12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation14);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation11;
			owner_lazy = () -> DeliverInformation12.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation12 obj) throws Exception {
			checkDeliverInformation12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation1
	 * DeliverInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferIndicator is \"true\" or \"1\" (Yes), then PhysicalTransferDetails must be present. If PhysicalTransferIndicator is \"false\" or \"0\" (No), then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation1> forDeliverInformation1 = new MMConstraint<DeliverInformation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransferIndicator is \"true\" or \"1\" (Yes), then PhysicalTransferDetails must be present. If PhysicalTransferIndicator is \"false\" or \"0\" (No), then PhysicalTransferDetails is not allowed.";
			owner_lazy = () -> DeliverInformation1.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation1 obj) throws Exception {
			checkDeliverInformation1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18
	 * ReceiveInformation18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must be present. If PhysicalTransfer is DEMT (Dematerialised), then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation17
	 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation17}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation18> forReceiveInformation18 = new MMConstraint<ReceiveInformation18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must be present. If PhysicalTransfer is DEMT (Dematerialised), then PhysicalTransferDetails is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation17;
			owner_lazy = () -> ReceiveInformation18.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation18 obj) throws Exception {
			checkReceiveInformation18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must be present. If PhysicalTransfer is DEMT (Dematerialised), then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation16
	 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation16}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation19> forDeliverInformation19 = new MMConstraint<DeliverInformation19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must be present. If PhysicalTransfer is DEMT (Dematerialised), then PhysicalTransferDetails is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation16;
			owner_lazy = () -> DeliverInformation19.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation19 obj) throws Exception {
			checkDeliverInformation19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6
	 * ReceiveInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation6> forReceiveInformation6 = new MMConstraint<ReceiveInformation6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation6.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation6 obj) throws Exception {
			checkReceiveInformation6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11
	 * DeliverInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation12
	 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation11> forDeliverInformation11 = new MMConstraint<DeliverInformation11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation12);
			owner_lazy = () -> DeliverInformation11.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation11 obj) throws Exception {
			checkDeliverInformation11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9
	 * ReceiveInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation13
	 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation13}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation9> forReceiveInformation9 = new MMConstraint<ReceiveInformation9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation13);
			owner_lazy = () -> ReceiveInformation9.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation9 obj) throws Exception {
			checkReceiveInformation9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation1
	 * ReceiveInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferIndicator is \"true\" or \"1\" (Yes), then PhysicalTransferDetails must be present. If PhysicalTransferIndicator is \"false\" or \"0\" (No), then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation1> forReceiveInformation1 = new MMConstraint<ReceiveInformation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransferIndicator is \"true\" or \"1\" (Yes), then PhysicalTransferDetails must be present. If PhysicalTransferIndicator is \"false\" or \"0\" (No), then PhysicalTransferDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation1.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation1 obj) throws Exception {
			checkReceiveInformation1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15
	 * ReceiveInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation16
	 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation16}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation13
	 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation13}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation15> forReceiveInformation15 = new MMConstraint<ReceiveInformation15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation16);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation13;
			owner_lazy = () -> ReceiveInformation15.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation15 obj) throws Exception {
			checkReceiveInformation15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3
	 * ReceiveInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferIndicator is \"true\" or \"1\" (Yes), then PhysicalTransferDetails must be present. If PhysicalTransferIndicator is \"false\" or \"0\" (No), then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation3> forReceiveInformation3 = new MMConstraint<ReceiveInformation3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransferIndicator is \"true\" or \"1\" (Yes), then PhysicalTransferDetails must be present. If PhysicalTransferIndicator is \"false\" or \"0\" (No), then PhysicalTransferDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation3.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation3 obj) throws Exception {
			checkReceiveInformation3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation19
	 * ReceiveInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must be present. If PhysicalTransfer is DEMT (Dematerialised), then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation16
	 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation16}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation19> forReceiveInformation19 = new MMConstraint<ReceiveInformation19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must be present. If PhysicalTransfer is DEMT (Dematerialised), then PhysicalTransferDetails is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation16;
			owner_lazy = () -> ReceiveInformation19.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation19 obj) throws Exception {
			checkReceiveInformation19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation2
	 * ReceiveInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferIndicator is \"true\" or \"1\" (Yes), then PhysicalTransferDetails must be present. If PhysicalTransferIndicator is \"false\" or \"0\" (No), then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation2> forReceiveInformation2 = new MMConstraint<ReceiveInformation2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransferIndicator is \"true\" or \"1\" (Yes), then PhysicalTransferDetails must be present. If PhysicalTransferIndicator is \"false\" or \"0\" (No), then PhysicalTransferDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation2.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation2 obj) throws Exception {
			checkReceiveInformation2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7
	 * DeliverInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation7> forDeliverInformation7 = new MMConstraint<DeliverInformation7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			owner_lazy = () -> DeliverInformation7.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation7 obj) throws Exception {
			checkDeliverInformation7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15
	 * DeliverInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation16
	 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation16}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation13
	 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation13}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation15> forDeliverInformation15 = new MMConstraint<DeliverInformation15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation16);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation13;
			owner_lazy = () -> DeliverInformation15.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation15 obj) throws Exception {
			checkDeliverInformation15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16
	 * DeliverInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must be present. If PhysicalTransfer is DEMT (Dematerialised), then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation19
	 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation15
	 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation15}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation16> forDeliverInformation16 = new MMConstraint<DeliverInformation16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must be present. If PhysicalTransfer is DEMT (Dematerialised), then PhysicalTransferDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation15;
			owner_lazy = () -> DeliverInformation16.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation16 obj) throws Exception {
			checkDeliverInformation16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation2
	 * DeliverInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferIndicator is \"true\" or \"1\" (Yes), then PhysicalTransferDetails must be present. If PhysicalTransferIndicator is \"false\" or \"0\" (No), then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation2> forDeliverInformation2 = new MMConstraint<DeliverInformation2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransferIndicator is \"true\" or \"1\" (Yes), then PhysicalTransferDetails must be present. If PhysicalTransferIndicator is \"false\" or \"0\" (No), then PhysicalTransferDetails is not allowed.";
			owner_lazy = () -> DeliverInformation2.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation2 obj) throws Exception {
			checkDeliverInformation2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4
	 * DeliverInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferIndicator is \"true\" or \"1\" (Yes), then PhysicalTransferDetails must be present. If PhysicalTransferIndicator is \"false\" or \"0\" (No), then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation4> forDeliverInformation4 = new MMConstraint<DeliverInformation4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransferIndicator is \"true\" or \"1\" (Yes), then PhysicalTransferDetails must be present. If PhysicalTransferIndicator is \"false\" or \"0\" (No), then PhysicalTransferDetails is not allowed.";
			owner_lazy = () -> DeliverInformation4.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation4 obj) throws Exception {
			checkDeliverInformation4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13
	 * DeliverInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation15
	 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation15}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation9
	 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation9}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation13> forDeliverInformation13 = new MMConstraint<DeliverInformation13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation15);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation9;
			owner_lazy = () -> DeliverInformation13.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation13 obj) throws Exception {
			checkDeliverInformation13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8
	 * DeliverInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation8> forDeliverInformation8 = new MMConstraint<DeliverInformation8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			owner_lazy = () -> DeliverInformation8.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation8 obj) throws Exception {
			checkDeliverInformation8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3
	 * DeliverInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferIndicator is \"true\" or \"1\" (Yes), then PhysicalTransferDetails must be present. If PhysicalTransferIndicator is \"false\" or \"0\" (No), then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation3> forDeliverInformation3 = new MMConstraint<DeliverInformation3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransferIndicator is \"true\" or \"1\" (Yes), then PhysicalTransferDetails must be present. If PhysicalTransferIndicator is \"false\" or \"0\" (No), then PhysicalTransferDetails is not allowed.";
			owner_lazy = () -> DeliverInformation3.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation3 obj) throws Exception {
			checkDeliverInformation3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14
	 * DeliverInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation17
	 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation17}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation12
	 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation12}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation14> forDeliverInformation14 = new MMConstraint<DeliverInformation14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation17);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation12;
			owner_lazy = () -> DeliverInformation14.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation14 obj) throws Exception {
			checkDeliverInformation14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17
	 * DeliverInformation17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must be present. If PhysicalTransfer is DEMT (Dematerialised), then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation18
	 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation18}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation14
	 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation14}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation17> forDeliverInformation17 = new MMConstraint<DeliverInformation17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must be present. If PhysicalTransfer is DEMT (Dematerialised), then PhysicalTransferDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation18);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation14;
			owner_lazy = () -> DeliverInformation17.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation17 obj) throws Exception {
			checkDeliverInformation17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18
	 * DeliverInformation18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must be present. If PhysicalTransfer is DEMT (Dematerialised), then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forDeliverInformation17
	 * ConstraintPhysicalTransferDetailsRule.forDeliverInformation17}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation18> forDeliverInformation18 = new MMConstraint<DeliverInformation18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must be present. If PhysicalTransfer is DEMT (Dematerialised), then PhysicalTransferDetails is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forDeliverInformation17;
			owner_lazy = () -> DeliverInformation18.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation18 obj) throws Exception {
			checkDeliverInformation18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6
	 * DeliverInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation6> forDeliverInformation6 = new MMConstraint<DeliverInformation6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			owner_lazy = () -> DeliverInformation6.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation6 obj) throws Exception {
			checkDeliverInformation6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11
	 * ReceiveInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation12
	 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation11> forReceiveInformation11 = new MMConstraint<ReceiveInformation11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation12);
			owner_lazy = () -> ReceiveInformation11.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation11 obj) throws Exception {
			checkReceiveInformation11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16
	 * ReceiveInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must be present. If PhysicalTransfer is DEMT (Dematerialised), then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation19
	 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation15
	 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation15}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation16> forReceiveInformation16 = new MMConstraint<ReceiveInformation16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must be present. If PhysicalTransfer is DEMT (Dematerialised), then PhysicalTransferDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation15;
			owner_lazy = () -> ReceiveInformation16.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation16 obj) throws Exception {
			checkReceiveInformation16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5
	 * DeliverInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation5> forDeliverInformation5 = new MMConstraint<DeliverInformation5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is \"PHYS\", then PhysicalTransferDetails must be present. If PhysicalTransfer is \"DEMT\", then PhysicalTransferDetails is not allowed.";
			owner_lazy = () -> DeliverInformation5.mmObject();
		}

		@Override
		public void executeValidator(DeliverInformation5 obj) throws Exception {
			checkDeliverInformation5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17
	 * ReceiveInformation17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalTransferDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must be present. If PhysicalTransfer is DEMT (Dematerialised), then PhysicalTransferDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation18
	 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation18}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule#forReceiveInformation14
	 * ConstraintPhysicalTransferDetailsRule.forReceiveInformation14}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation17> forReceiveInformation17 = new MMConstraint<ReceiveInformation17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalTransferDetailsRule";
			definition = "If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must be present. If PhysicalTransfer is DEMT (Dematerialised), then PhysicalTransferDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation18);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintPhysicalTransferDetailsRule.forReceiveInformation14;
			owner_lazy = () -> ReceiveInformation17.mmObject();
		}

		@Override
		public void executeValidator(ReceiveInformation17 obj) throws Exception {
			checkReceiveInformation17(obj);
		}
	};

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkReceiveInformation7(ReceiveInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkReceiveInformation8(ReceiveInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkReceiveInformation5(ReceiveInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferIndicator is "true" or "1" (Yes), then
	 * PhysicalTransferDetails must be present. If PhysicalTransferIndicator is
	 * "false" or "0" (No), then PhysicalTransferDetails is not allowed.
	 */
	public static void checkReceiveInformation4(ReceiveInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkReceiveInformation14(ReceiveInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkReceiveInformation13(ReceiveInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkReceiveInformation12(ReceiveInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkDeliverInformation9(DeliverInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkDeliverInformation12(DeliverInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferIndicator is "true" or "1" (Yes), then
	 * PhysicalTransferDetails must be present. If PhysicalTransferIndicator is
	 * "false" or "0" (No), then PhysicalTransferDetails is not allowed.
	 */
	public static void checkDeliverInformation1(DeliverInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must
	 * be present. If PhysicalTransfer is DEMT (Dematerialised), then
	 * PhysicalTransferDetails is not allowed.
	 */
	public static void checkReceiveInformation18(ReceiveInformation18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must
	 * be present. If PhysicalTransfer is DEMT (Dematerialised), then
	 * PhysicalTransferDetails is not allowed.
	 */
	public static void checkDeliverInformation19(DeliverInformation19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkReceiveInformation6(ReceiveInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkDeliverInformation11(DeliverInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkReceiveInformation9(ReceiveInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferIndicator is "true" or "1" (Yes), then
	 * PhysicalTransferDetails must be present. If PhysicalTransferIndicator is
	 * "false" or "0" (No), then PhysicalTransferDetails is not allowed.
	 */
	public static void checkReceiveInformation1(ReceiveInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkReceiveInformation15(ReceiveInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferIndicator is "true" or "1" (Yes), then
	 * PhysicalTransferDetails must be present. If PhysicalTransferIndicator is
	 * "false" or "0" (No), then PhysicalTransferDetails is not allowed.
	 */
	public static void checkReceiveInformation3(ReceiveInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must
	 * be present. If PhysicalTransfer is DEMT (Dematerialised), then
	 * PhysicalTransferDetails is not allowed.
	 */
	public static void checkReceiveInformation19(ReceiveInformation19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferIndicator is "true" or "1" (Yes), then
	 * PhysicalTransferDetails must be present. If PhysicalTransferIndicator is
	 * "false" or "0" (No), then PhysicalTransferDetails is not allowed.
	 */
	public static void checkReceiveInformation2(ReceiveInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkDeliverInformation7(DeliverInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkDeliverInformation15(DeliverInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must
	 * be present. If PhysicalTransfer is DEMT (Dematerialised), then
	 * PhysicalTransferDetails is not allowed.
	 */
	public static void checkDeliverInformation16(DeliverInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferIndicator is "true" or "1" (Yes), then
	 * PhysicalTransferDetails must be present. If PhysicalTransferIndicator is
	 * "false" or "0" (No), then PhysicalTransferDetails is not allowed.
	 */
	public static void checkDeliverInformation2(DeliverInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferIndicator is "true" or "1" (Yes), then
	 * PhysicalTransferDetails must be present. If PhysicalTransferIndicator is
	 * "false" or "0" (No), then PhysicalTransferDetails is not allowed.
	 */
	public static void checkDeliverInformation4(DeliverInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkDeliverInformation13(DeliverInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkDeliverInformation8(DeliverInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferIndicator is "true" or "1" (Yes), then
	 * PhysicalTransferDetails must be present. If PhysicalTransferIndicator is
	 * "false" or "0" (No), then PhysicalTransferDetails is not allowed.
	 */
	public static void checkDeliverInformation3(DeliverInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkDeliverInformation14(DeliverInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must
	 * be present. If PhysicalTransfer is DEMT (Dematerialised), then
	 * PhysicalTransferDetails is not allowed.
	 */
	public static void checkDeliverInformation17(DeliverInformation17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must
	 * be present. If PhysicalTransfer is DEMT (Dematerialised), then
	 * PhysicalTransferDetails is not allowed.
	 */
	public static void checkDeliverInformation18(DeliverInformation18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkDeliverInformation6(DeliverInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkReceiveInformation11(ReceiveInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must
	 * be present. If PhysicalTransfer is DEMT (Dematerialised), then
	 * PhysicalTransferDetails is not allowed.
	 */
	public static void checkReceiveInformation16(ReceiveInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is "PHYS", then PhysicalTransferDetails must be
	 * present. If PhysicalTransfer is "DEMT", then PhysicalTransferDetails is
	 * not allowed.
	 */
	public static void checkDeliverInformation5(DeliverInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransfer is PHYS (Physical), then PhysicalTransferDetails must
	 * be present. If PhysicalTransfer is DEMT (Dematerialised), then
	 * PhysicalTransferDetails is not allowed.
	 */
	public static void checkReceiveInformation17(ReceiveInformation17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}