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
import com.tools20022.repository.codeset.SubscriptionRequest1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of subscription to market data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SubscriptionRequest1Code#Snapshot
 * SubscriptionRequest1Code.Snapshot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SubscriptionRequest1Code#Subscribe
 * SubscriptionRequest1Code.Subscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SubscriptionRequest1Code#Unsubscribe
 * SubscriptionRequest1Code.Unsubscribe}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SubscriptionRequestCode
 * SubscriptionRequestCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionRequest1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of subscription to market data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SNAP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SubscriptionRequest1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SubscriptionRequest1Code
	 * SubscriptionRequest1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Snapshot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SubscriptionRequest1Code Snapshot = new SubscriptionRequest1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Snapshot";
			owner_lazy = () -> com.tools20022.repository.codeset.SubscriptionRequest1Code.mmObject();
			codeName = SubscriptionRequestCode.Snapshot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SubscriptionRequest1Code
	 * SubscriptionRequest1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscribe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SubscriptionRequest1Code Subscribe = new SubscriptionRequest1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscribe";
			owner_lazy = () -> com.tools20022.repository.codeset.SubscriptionRequest1Code.mmObject();
			codeName = SubscriptionRequestCode.Subscribe.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SubscriptionRequest1Code
	 * SubscriptionRequest1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unsubscribe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SubscriptionRequest1Code Unsubscribe = new SubscriptionRequest1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unsubscribe";
			owner_lazy = () -> com.tools20022.repository.codeset.SubscriptionRequest1Code.mmObject();
			codeName = SubscriptionRequestCode.Unsubscribe.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SubscriptionRequest1Code> codesByName = new LinkedHashMap<>();

	protected SubscriptionRequest1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SNAP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionRequest1Code";
				definition = "Type of subscription to market data.";
				trace_lazy = () -> SubscriptionRequestCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SubscriptionRequest1Code.Snapshot, com.tools20022.repository.codeset.SubscriptionRequest1Code.Subscribe,
						com.tools20022.repository.codeset.SubscriptionRequest1Code.Unsubscribe);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Snapshot.getCodeName().get(), Snapshot);
		codesByName.put(Subscribe.getCodeName().get(), Subscribe);
		codesByName.put(Unsubscribe.getCodeName().get(), Unsubscribe);
	}

	public static SubscriptionRequest1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SubscriptionRequest1Code[] values() {
		SubscriptionRequest1Code[] values = new SubscriptionRequest1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SubscriptionRequest1Code> {
		@Override
		public SubscriptionRequest1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SubscriptionRequest1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}