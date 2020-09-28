/*
 * Copyright 2011-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.neo4j.integration.shared;

import org.springframework.data.neo4j.core.schema.Id;

/**
 * @author Gerrit Meier
 */
public class EntityWithConvertedId {

	@Id private IdentifyingEnum identifyingEnum;

	public IdentifyingEnum getIdentifyingEnum() {
		return identifyingEnum;
	}

	public void setIdentifyingEnum(IdentifyingEnum identifyingEnum) {
		this.identifyingEnum = identifyingEnum;
	}

	/**
	 * Could also be another type that gets converted inside the framework
	 */
	public enum IdentifyingEnum {
		A, B
	}
}