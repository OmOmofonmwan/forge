module dev.ikm.tinkar.forge {
    requires org.eclipse.collections.api;
    requires org.eclipse.collections.impl;
    requires dev.ikm.tinkar.entity;
    requires dev.ikm.tinkar.terms;
    requires freemarker;
    requires org.slf4j;

    exports dev.ikm.tinkar.forge;
    exports dev.ikm.tinkar.forge.wrapper.record;

    uses dev.ikm.tinkar.forge.ForgeMethodWrapper;
}