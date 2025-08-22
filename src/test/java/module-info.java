import dev.ikm.tinkar.common.service.DataServiceController;
import dev.ikm.tinkar.common.service.DefaultDescriptionForNidService;
import dev.ikm.tinkar.common.service.PublicIdService;
import dev.ikm.tinkar.entity.EntityService;
import dev.ikm.tinkar.entity.StampService;

module dev.ikm.tinkar.forge.test {
    requires dev.ikm.tinkar.forge;
    requires dev.ikm.tinkar.common;
    requires dev.ikm.tinkar.entity;
    requires org.eclipse.collections.api;
    requires org.eclipse.collections.impl;
    requires org.junit.jupiter.api;
    requires org.slf4j;

    exports dev.ikm.tinkar.forge.test;

    uses DataServiceController;
    uses DefaultDescriptionForNidService;
    uses EntityService;
    uses PublicIdService;
    uses StampService;
}