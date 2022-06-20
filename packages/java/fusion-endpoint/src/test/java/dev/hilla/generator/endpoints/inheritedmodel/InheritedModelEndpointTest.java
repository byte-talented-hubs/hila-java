/*
 * Copyright 2000-2022 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package dev.hilla.generator.endpoints.inheritedmodel;

import java.util.Arrays;

import com.fasterxml.jackson.core.Version;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.media.ArraySchema;
import io.swagger.v3.oas.models.media.Discriminator;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.media.XML;
import org.junit.Test;

import dev.hilla.generator.endpoints.AbstractEndpointGenerationTest;

public class InheritedModelEndpointTest extends AbstractEndpointGenerationTest {
    public InheritedModelEndpointTest() {
        super(Arrays.asList(InheritedModelEndpoint.class, Discriminator.class,
                Schema.class, ArraySchema.class, ExternalDocumentation.class,
                XML.class, Version.class));
    }

    @Test
    public void should_GenerateParentModel_When_UsingChildModel() {
        verifyOpenApiObjectAndGeneratedTs();
    }
}
