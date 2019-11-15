/*
 * Copyright ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.besu.ethereum.api.jsonrpc.methods;

import org.hyperledger.besu.ethereum.api.jsonrpc.RpcApi;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.methods.JsonRpcMethod;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.methods.TraceReplayBlockTransactions;
<<<<<<< HEAD
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.parameters.JsonRpcParameter;
=======
>>>>>>> 9b9c373c88e4b662e81e83a516597e69d2e45b27
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.processor.BlockReplay;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.processor.BlockTracer;
import org.hyperledger.besu.ethereum.api.query.BlockchainQueries;
import org.hyperledger.besu.ethereum.mainnet.ProtocolSchedule;

import java.util.Map;

public class TraceJsonRpcMethods extends ApiGroupJsonRpcMethods {

<<<<<<< HEAD
  private final JsonRpcParameter parameter = new JsonRpcParameter();
=======
>>>>>>> 9b9c373c88e4b662e81e83a516597e69d2e45b27
  private final BlockchainQueries blockchainQueries;
  private final ProtocolSchedule<?> protocolSchedule;

  public TraceJsonRpcMethods(
      final BlockchainQueries blockchainQueries, final ProtocolSchedule<?> protocolSchedule) {
    this.blockchainQueries = blockchainQueries;
    this.protocolSchedule = protocolSchedule;
  }

  @Override
  protected RpcApi getApiGroup() {
    // Disable TRACE functionality while under development
    //    return RpcApis.TRACE;
    return null;
  }

  @Override
  protected Map<String, JsonRpcMethod> create() {
    return mapOf(
        new TraceReplayBlockTransactions(
<<<<<<< HEAD
            parameter,
=======
>>>>>>> 9b9c373c88e4b662e81e83a516597e69d2e45b27
            new BlockTracer(
                new BlockReplay(
                    protocolSchedule,
                    blockchainQueries.getBlockchain(),
                    blockchainQueries.getWorldStateArchive())),
            blockchainQueries,
            protocolSchedule));
  }
}
