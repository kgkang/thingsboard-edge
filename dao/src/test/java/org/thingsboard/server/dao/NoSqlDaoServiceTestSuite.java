/**
 * Copyright © 2016-2022 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.dao;

import org.cassandraunit.dataset.cql.ClassPathCQLDataSet;
import org.junit.ClassRule;
import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.extensions.cpsuite.ClasspathSuite.ClassnameFilters;
import org.junit.runner.RunWith;

import java.util.Arrays;

// @voba - merge comment
// NoSQL is not supported on edge
//@RunWith(ClasspathSuite.class)
@ClassnameFilters({
        "org.thingsboard.server.dao.service.*.nosql.*ServiceNoSqlTest",
})
public class NoSqlDaoServiceTestSuite {

    @ClassRule
    public static CustomCassandraCQLUnit cassandraUnit =
            new CustomCassandraCQLUnit(
                    Arrays.asList(
                            new ClassPathCQLDataSet("cassandra/schema-keyspace.cql", false, false),
                            new ClassPathCQLDataSet("cassandra/schema-ts.cql", false, false),
                            new ClassPathCQLDataSet("cassandra/schema-ts-latest.cql", false, false)
                    ),
                    "cassandra-test.yaml", 30000L);

}
