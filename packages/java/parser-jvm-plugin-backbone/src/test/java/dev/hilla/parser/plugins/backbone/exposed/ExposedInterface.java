package dev.hilla.parser.plugins.backbone.exposed;

@EndpointExposed
public interface ExposedInterface {
    default ExposedInterfaceEntity methodFromExposedInterface() {
        return new ExposedInterfaceEntity();
    }
}
