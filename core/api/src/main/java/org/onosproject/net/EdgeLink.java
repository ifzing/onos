/*
 * Copyright 2014 Open Networking Laboratory
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
package org.onlab.onos.net;

/**
 * Abstraction of a link between an end-station host and the network
 * infrastructure.
 */
public interface EdgeLink extends Link {

    /**
     * Returns the host identification.
     *
     * @return host identifier
     */
    HostId hostId();

    /**
     * Returns the connection point where the host attaches to the
     * network infrastructure.
     *
     * @return host location point
     */
    HostLocation hostLocation();

}