package dev.hilla.parser.plugins.transfertypes.uuid;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Set;

import org.junit.jupiter.api.Test;

import dev.hilla.parser.core.Parser;
import dev.hilla.parser.plugins.backbone.BackbonePlugin;
import dev.hilla.parser.plugins.transfertypes.TransferTypesPlugin;
import dev.hilla.parser.plugins.transfertypes.test.helpers.TestHelper;

public class UUIDTest {
    private final TestHelper helper = new TestHelper(getClass());

    @Test
    public void should_ReplaceUUIDClassWithString()
            throws IOException, URISyntaxException {
        var openAPI = new Parser()
                .classPath(Set.of(helper.getTargetDir().toString()))
                .endpointAnnotation(Endpoint.class.getName())
                .endpointExposedAnnotation(EndpointExposed.class.getName())
                .addPlugin(new TransferTypesPlugin())
                .addPlugin(new BackbonePlugin()).execute();

        helper.executeParserWithConfig(openAPI);
    }
}
