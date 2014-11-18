/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hive.ql.exec.spark;

import org.apache.hadoop.hive.ql.DriverContext;
import org.apache.hadoop.hive.ql.exec.spark.status.SparkJobRef;
import org.apache.hadoop.hive.ql.plan.SparkWork;

import java.io.Closeable;
import java.io.Serializable;

public interface HiveSparkClient extends Serializable, Closeable {
  /**
   * HiveSparkClient should generate Spark RDD graph by given sparkWork and driverContext,
   * and submit RDD graph to Spark cluster.
   * @param driverContext
   * @param sparkWork
   * @return SparkJobRef could be used to track spark job progress and metrics.
   * @throws Exception
   */
  public SparkJobRef execute(DriverContext driverContext, SparkWork sparkWork) throws Exception;
}
