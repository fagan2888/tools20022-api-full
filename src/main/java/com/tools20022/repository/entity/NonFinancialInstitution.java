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

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CounterpartyTradeNature4Choice;
import com.tools20022.repository.choice.CounterpartyTradeNature5Choice;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NonFinancialInstitutionIdentification1;
import com.tools20022.repository.msg.NonFinancialInstitutionSector1;
import com.tools20022.repository.msg.NonFinancialInstitutionSector2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * An organisation primarily established to offer and perform services other
 * than financial services.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="NonFinancialInstitution"
 * src="doc-files/NonFinancialInstitution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyTradeNature5Choice#mmNonFinancialInstitution
 * CounterpartyTradeNature5Choice.mmNonFinancialInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyTradeNature4Choice#mmNonFinancialInstitution
 * CounterpartyTradeNature4Choice.mmNonFinancialInstitution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1
 * NonFinancialInstitutionIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NonFinancialInstitutionSector1
 * NonFinancialInstitutionSector1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NonFinancialInstitutionSector2
 * NonFinancialInstitutionSector2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NonFinancialInstitution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An organisation primarily established to offer and perform services other than financial services."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class NonFinancialInstitution extends Organisation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NonFinancialInstitution";
				definition = "An organisation primarily established to offer and perform services other than financial services.";
				derivationElement_lazy = () -> Arrays.asList(CounterpartyTradeNature5Choice.mmNonFinancialInstitution, CounterpartyTradeNature4Choice.mmNonFinancialInstitution);
				superType_lazy = () -> Organisation.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(NonFinancialInstitutionIdentification1.mmObject(), NonFinancialInstitutionSector1.mmObject(), NonFinancialInstitutionSector2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return NonFinancialInstitution.class;
			}
		});
		return mmObject_lazy.get();
	}
}