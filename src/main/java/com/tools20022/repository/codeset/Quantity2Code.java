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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Quantity2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies quantity of a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Quantity2Code#AllSecurities
 * Quantity2Code.AllSecurities}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Quantity2Code#Open
 * Quantity2Code.Open}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Quantity2Code#UnknownQuantity
 * Quantity2Code.UnknownQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.QuantityCode QuantityCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Quantity2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies quantity of a financial instrument."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"QALL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Quantity2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Quantity2Code
	 * Quantity2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Quantity2Code AllSecurities = new Quantity2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.Quantity2Code.mmObject();
			codeName = QuantityCode.AllSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Quantity2Code
	 * Quantity2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Open"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Quantity2Code Open = new Quantity2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Open";
			owner_lazy = () -> com.tools20022.repository.codeset.Quantity2Code.mmObject();
			codeName = QuantityCode.Open.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Quantity2Code
	 * Quantity2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Quantity2Code UnknownQuantity = new Quantity2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.Quantity2Code.mmObject();
			codeName = QuantityCode.UnknownQuantity.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Quantity2Code> codesByName = new LinkedHashMap<>();

	protected Quantity2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("QALL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Quantity2Code";
				definition = "Specifies quantity of a financial instrument.";
				trace_lazy = () -> QuantityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Quantity2Code.AllSecurities, com.tools20022.repository.codeset.Quantity2Code.Open, com.tools20022.repository.codeset.Quantity2Code.UnknownQuantity);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AllSecurities.getCodeName().get(), AllSecurities);
		codesByName.put(Open.getCodeName().get(), Open);
		codesByName.put(UnknownQuantity.getCodeName().get(), UnknownQuantity);
	}

	public static Quantity2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Quantity2Code[] values() {
		Quantity2Code[] values = new Quantity2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Quantity2Code> {
		@Override
		public Quantity2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Quantity2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}