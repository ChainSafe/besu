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
package org.hyperledger.besu.ethereum.api.jsonrpc.internal.methods;

import org.hyperledger.besu.ethereum.api.jsonrpc.RpcMethod;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.JsonRpcRequest;
<<<<<<< HEAD
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.parameters.JsonRpcParameter;
=======
>>>>>>> 9b9c373c88e4b662e81e83a516597e69d2e45b27
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.response.JsonRpcResponse;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.response.JsonRpcSuccessResponse;
import org.hyperledger.besu.ethereum.api.jsonrpc.internal.results.Quantity;
import org.hyperledger.besu.ethereum.api.query.BlockchainQueries;
import org.hyperledger.besu.ethereum.core.Hash;

public class EthGetUncleCountByBlockHash implements JsonRpcMethod {

  private final BlockchainQueries blockchain;

  public EthGetUncleCountByBlockHash(final BlockchainQueries blockchain) {
    this.blockchain = blockchain;
  }

  @Override
  public String getName() {
    return RpcMethod.ETH_GET_UNCLE_COUNT_BY_BLOCK_HASH.getMethodName();
  }

  @Override
  public JsonRpcResponse response(final JsonRpcRequest request) {
    final Hash hash = request.getRequiredParameter(0, Hash.class);
    final String result = blockchain.getOmmerCount(hash).map(Quantity::create).orElse(null);
    return new JsonRpcSuccessResponse(request.getId(), result);
  }
}
