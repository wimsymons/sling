/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sling.testing.paxexam;

import java.util.HashMap;
import java.util.Map;

import org.ops4j.pax.exam.options.MavenUrlReference.VersionResolver;

/**
 * NOTE: This file is generated from Sling's Launchpad Karaf Features
 */
public class SlingVersionResolver implements VersionResolver {

    private final Map<String, String> versions = new HashMap<>();

    public SlingVersionResolver() {
        versions.put("org.apache.felix:org.apache.felix.configadmin", "1.8.8");
        versions.put("org.apache.felix:org.apache.felix.eventadmin", "1.4.6");
        versions.put("org.apache.felix:org.apache.felix.http.jetty", "3.2.0");
        versions.put("org.apache.felix:org.apache.felix.http.servlet-api", "1.1.2");
        versions.put("org.apache.felix:org.apache.felix.http.whiteboard", "3.0.0");
        versions.put("org.apache.aries:org.apache.aries.util", "1.1.1");
        versions.put("org.apache.aries.jmx:org.apache.aries.jmx.api", "1.1.5");
        versions.put("org.apache.aries.jmx:org.apache.aries.jmx.core", "1.1.6");
        versions.put("org.apache.aries.jmx:org.apache.aries.jmx.whiteboard", "1.1.5");
        versions.put("org.apache.felix:org.apache.felix.inventory", "1.0.4");
        versions.put("org.apache.felix:org.apache.felix.metatype", "1.1.2");
        versions.put("org.apache.felix:org.apache.felix.scr", "2.0.2");
        versions.put("org.apache.felix:org.apache.felix.webconsole", "4.2.16");
        versions.put("com.composum.sling.core:composum-sling-core-commons", "1.5.3");
        versions.put("com.composum.sling.core:composum-sling-core-console", "1.5.3");
        versions.put("com.composum.sling.core:composum-sling-core-jslibs", "1.5.3");
        versions.put("com.google.guava:guava", "15.0");
        versions.put("com.sun.mail:javax.mail", "1.5.5");
        versions.put("commons-codec:commons-codec", "1.10");
        versions.put("commons-collections:commons-collections", "3.2.2");
        versions.put("commons-fileupload:commons-fileupload", "1.3.2");
        versions.put("commons-io:commons-io", "2.5");
        versions.put("commons-lang:commons-lang", "2.6");
        versions.put("io.dropwizard.metrics:metrics-core", "3.1.2");
        versions.put("io.wcm.osgi.wrapper:io.wcm.osgi.wrapper.rxjava", "1.0.14-0000");
        versions.put("javax.jcr:jcr", "2.0");
        versions.put("javax.mail:javax.mail-api", "1.5.5");
        versions.put("org.apache.commons:commons-email", "1.4");
        versions.put("org.apache.commons:commons-lang3", "3.4");
        versions.put("org.apache.commons:commons-math", "2.2");
        versions.put("org.apache.felix:org.apache.felix.inventory", "1.0.4");
        versions.put("org.apache.felix:org.apache.felix.jaas", "0.0.4");
        versions.put("org.apache.felix:org.apache.felix.prefs", "1.0.6");
        versions.put("org.apache.felix:org.apache.felix.webconsole.plugins.memoryusage", "1.0.6");
        versions.put("org.apache.felix:org.apache.felix.webconsole.plugins.packageadmin", "1.0.2");
        versions.put("org.apache.geronimo.bundles:commons-httpclient", "3.1_2");
        versions.put("org.apache.geronimo.bundles:json", "20090211_1");
        versions.put("org.apache.geronimo.specs:geronimo-atinject_1.0_spec", "1.0");
        versions.put("org.apache.geronimo.specs:geronimo-el_2.2_spec", "1.0.4");
        versions.put("org.apache.geronimo.specs:geronimo-interceptor_1.1_spec", "1.0");
        versions.put("org.apache.geronimo.specs:geronimo-jcdi_1.0_spec", "1.0");
        versions.put("org.apache.geronimo.specs:geronimo-jta_1.1_spec", "1.1.1");
        versions.put("org.apache.geronimo.specs:geronimo-servlet_3.0_spec", "1.0");
        versions.put("org.apache.httpcomponents:httpclient-osgi", "4.5.2");
        versions.put("org.apache.httpcomponents:httpcore-osgi", "4.4.5");
        versions.put("org.apache.jackrabbit:jackrabbit-api", "2.12.1");
        versions.put("org.apache.jackrabbit:jackrabbit-data", "2.12.1");
        versions.put("org.apache.jackrabbit:jackrabbit-jcr-commons", "2.12.1");
        versions.put("org.apache.jackrabbit:jackrabbit-jcr-rmi", "2.12.1");
        versions.put("org.apache.jackrabbit:jackrabbit-spi", "2.12.1");
        versions.put("org.apache.jackrabbit:jackrabbit-spi-commons", "2.12.1");
        versions.put("org.apache.jackrabbit:jackrabbit-webdav", "2.12.1");
        versions.put("org.apache.jackrabbit:oak-blob", "1.5.3");
        versions.put("org.apache.jackrabbit:oak-commons", "1.5.3");
        versions.put("org.apache.jackrabbit:oak-core", "1.5.3");
        versions.put("org.apache.jackrabbit:oak-jcr", "1.5.3");
        versions.put("org.apache.jackrabbit:oak-lucene", "1.5.3");
        versions.put("org.apache.jackrabbit:oak-segment", "1.5.3");
        versions.put("org.apache.jackrabbit.vault:org.apache.jackrabbit.vault", "3.1.26");
        versions.put("org.apache.servicemix.bundles:org.apache.servicemix.bundles.rhino", "1.7.7.1_1");
        versions.put("org.apache.servicemix.bundles:org.apache.servicemix.bundles.urlrewritefilter", "4.0.4_1");
        versions.put("org.apache.sling:org.apache.sling.adapter", "2.1.6");
        versions.put("org.apache.sling:org.apache.sling.api", "2.11.1-SNAPSHOT");
        versions.put("org.apache.sling:org.apache.sling.auth.core", "1.3.14");
        versions.put("org.apache.sling:org.apache.sling.auth.form", "1.0.8");
        versions.put("org.apache.sling:org.apache.sling.auth.openid", "1.0.4");
        versions.put("org.apache.sling:org.apache.sling.auth.selector", "1.0.6");
        versions.put("org.apache.sling:org.apache.sling.bundleresource.impl", "2.2.0");
        versions.put("org.apache.sling:org.apache.sling.commons.classloader", "1.3.2");
        versions.put("org.apache.sling:org.apache.sling.commons.compiler", "2.3.0");
        versions.put("org.apache.sling:org.apache.sling.commons.fsclassloader", "1.0.2");
        versions.put("org.apache.sling:org.apache.sling.commons.html", "1.0.0");
        versions.put("org.apache.sling:org.apache.sling.commons.json", "2.0.18");
        versions.put("org.apache.sling:org.apache.sling.commons.messaging", "0.0.1-SNAPSHOT");
        versions.put("org.apache.sling:org.apache.sling.commons.messaging.mail", "0.0.1-SNAPSHOT");
        versions.put("org.apache.sling:org.apache.sling.commons.metrics", "1.0.0");
        versions.put("org.apache.sling:org.apache.sling.commons.mime", "2.1.8");
        versions.put("org.apache.sling:org.apache.sling.commons.osgi", "2.4.0");
        versions.put("org.apache.sling:org.apache.sling.commons.scheduler", "2.4.14");
        versions.put("org.apache.sling:org.apache.sling.commons.threads", "3.2.6");
        versions.put("org.apache.sling:org.apache.sling.discovery.api", "1.0.4");
        versions.put("org.apache.sling:org.apache.sling.discovery.base", "1.1.3-SNAPSHOT");
        versions.put("org.apache.sling:org.apache.sling.discovery.commons", "1.0.12");
        versions.put("org.apache.sling:org.apache.sling.discovery.impl", "1.2.7-SNAPSHOT");
        versions.put("org.apache.sling:org.apache.sling.discovery.oak", "1.2.7-SNAPSHOT");
        versions.put("org.apache.sling:org.apache.sling.discovery.standalone", "1.0.2");
        versions.put("org.apache.sling:org.apache.sling.discovery.support", "1.0.0");
        versions.put("org.apache.sling:org.apache.sling.distribution.api", "0.3.0");
        versions.put("org.apache.sling:org.apache.sling.distribution.core", "0.1.18");
        versions.put("org.apache.sling:org.apache.sling.engine", "2.4.6");
        versions.put("org.apache.sling:org.apache.sling.event", "4.0.2");
        versions.put("org.apache.sling:org.apache.sling.event.dea", "1.0.4");
        versions.put("org.apache.sling:org.apache.sling.extensions.explorer", "1.0.4");
        versions.put("org.apache.sling:org.apache.sling.extensions.threaddump", "0.2.2");
        versions.put("org.apache.sling:org.apache.sling.featureflags", "1.0.2");
        versions.put("org.apache.sling:org.apache.sling.fsresource", "1.1.4");
        versions.put("org.apache.sling:org.apache.sling.hc.core", "1.2.5-SNAPSHOT");
        versions.put("org.apache.sling:org.apache.sling.hc.jmx", "1.0.6");
        versions.put("org.apache.sling:org.apache.sling.hc.support", "1.0.4");
        versions.put("org.apache.sling:org.apache.sling.hc.webconsole", "1.1.2");
        versions.put("org.apache.sling:org.apache.sling.i18n", "2.4.6");
        versions.put("org.apache.sling:org.apache.sling.installer.console", "1.0.0");
        versions.put("org.apache.sling:org.apache.sling.installer.core", "3.6.8");
        versions.put("org.apache.sling:org.apache.sling.installer.factory.configuration", "1.1.2");
        versions.put("org.apache.sling:org.apache.sling.installer.provider.file", "1.1.0");
        versions.put("org.apache.sling:org.apache.sling.installer.provider.jcr", "3.1.18");
        versions.put("org.apache.sling:org.apache.sling.jcr.api", "2.3.1-SNAPSHOT");
        versions.put("org.apache.sling:org.apache.sling.jcr.base", "2.3.3-SNAPSHOT");
        versions.put("org.apache.sling:org.apache.sling.jcr.classloader", "3.2.2");
        versions.put("org.apache.sling:org.apache.sling.jcr.compiler", "2.1.0");
        versions.put("org.apache.sling:org.apache.sling.jcr.contentloader", "2.1.10");
        versions.put("org.apache.sling:org.apache.sling.jcr.davex", "1.3.4");
        versions.put("org.apache.sling:org.apache.sling.jcr.jackrabbit.accessmanager", "2.1.2");
        versions.put("org.apache.sling:org.apache.sling.jcr.jackrabbit.usermanager", "2.2.4");
        versions.put("org.apache.sling:org.apache.sling.jcr.oak.server", "1.0.1-SNAPSHOT");
        versions.put("org.apache.sling:org.apache.sling.jcr.registration", "1.0.2");
        versions.put("org.apache.sling:org.apache.sling.jcr.resource", "2.8.0");
        versions.put("org.apache.sling:org.apache.sling.jcr.webconsole", "1.0.2");
        versions.put("org.apache.sling:org.apache.sling.jcr.webdav", "2.3.4");
        versions.put("org.apache.sling:org.apache.sling.jmx.provider", "1.0.2");
        versions.put("org.apache.sling:org.apache.sling.launchpad.content", "2.0.8");
        versions.put("org.apache.sling:org.apache.sling.models.api", "1.2.2");
        versions.put("org.apache.sling:org.apache.sling.models.impl", "1.2.8");
        versions.put("org.apache.sling:org.apache.sling.nosql.couchbase-client", "1.0.2");
        versions.put("org.apache.sling:org.apache.sling.nosql.couchbase-resourceprovider", "1.1.0");
        versions.put("org.apache.sling:org.apache.sling.nosql.generic", "1.1.0");
        versions.put("org.apache.sling:org.apache.sling.nosql.mongodb-resourceprovider", "1.1.0");
        versions.put("org.apache.sling:org.apache.sling.query", "3.0.0");
        versions.put("org.apache.sling:org.apache.sling.resource.inventory", "1.0.4");
        versions.put("org.apache.sling:org.apache.sling.resourcemerger", "1.3.0");
        versions.put("org.apache.sling:org.apache.sling.resourceresolver", "1.4.12");
        versions.put("org.apache.sling:org.apache.sling.rewriter", "1.1.2");
        versions.put("org.apache.sling:org.apache.sling.scripting.api", "2.1.8");
        versions.put("org.apache.sling:org.apache.sling.scripting.core", "2.0.37-SNAPSHOT");
        versions.put("org.apache.sling:org.apache.sling.scripting.freemarker", "1.0.0-SNAPSHOT");
        versions.put("org.apache.sling:org.apache.sling.scripting.groovy", "1.0.2");
        versions.put("org.apache.sling:org.apache.sling.scripting.java", "2.0.14");
        versions.put("org.apache.sling:org.apache.sling.scripting.javascript", "2.0.30");
        versions.put("org.apache.sling:org.apache.sling.scripting.jsp", "2.1.8");
        versions.put("org.apache.sling:org.apache.sling.scripting.jsp.taglib", "2.2.6");
        versions.put("org.apache.sling:org.apache.sling.scripting.sightly", "1.0.18");
        versions.put("org.apache.sling:org.apache.sling.scripting.sightly.js.provider", "1.0.10");
        versions.put("org.apache.sling:org.apache.sling.scripting.thymeleaf", "0.1.7-SNAPSHOT");
        versions.put("org.apache.sling:org.apache.sling.security", "1.0.18");
        versions.put("org.apache.sling:org.apache.sling.serviceusermapper", "1.2.2");
        versions.put("org.apache.sling:org.apache.sling.servlets.get", "2.1.14");
        versions.put("org.apache.sling:org.apache.sling.servlets.post", "2.3.12");
        versions.put("org.apache.sling:org.apache.sling.servlets.resolver", "2.4.3-SNAPSHOT");
        versions.put("org.apache.sling:org.apache.sling.settings", "1.3.8");
        versions.put("org.apache.sling:org.apache.sling.urlrewriter", "0.0.2");
        versions.put("org.apache.sling:org.apache.sling.validation.api", "1.0.0-SNAPSHOT");
        versions.put("org.apache.sling:org.apache.sling.validation.core", "1.0.0-SNAPSHOT");
        versions.put("org.apache.sling:org.apache.sling.xss", "1.0.8");
        versions.put("org.apache.sling.samples:org.apache.sling.samples.fling", "0.0.1-SNAPSHOT");
        versions.put("org.apache.tika:tika-bundle", "1.13");
        versions.put("org.apache.tika:tika-core", "1.13");
        versions.put("org.codehaus.groovy:groovy", "2.4.7");
        versions.put("org.codehaus.groovy:groovy-json", "2.4.7");
        versions.put("org.codehaus.groovy:groovy-templates", "2.4.7");
        versions.put("org.javassist:javassist", "3.20.0-GA");
        versions.put("org.mongodb:mongo-java-driver", "2.14.2");
    }

    private String key(final String groupId, final String artifactId) {
        return String.format("%s:%s", groupId, artifactId);
    }

    public String setVersion(final String groupId, final String artifactId, final String version) {
        return versions.put(key(groupId, artifactId), version);
    }

    @Override
    public String getVersion(final String groupId, final String artifactId) {
        return versions.get(key(groupId, artifactId));
    }

}
