/*
 * The MIT License
 *
 * Copyright 2015 Manuel Schmid.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package de.mash1t.networklib.packets;

import java.io.Serializable;

/**
 * Used as a body for all other packets
 *
 * @author Manuel Schmid
 */
public abstract class Packet implements Serializable {

    protected PacketType packetType = PacketType.Packet;
    //protected String senderAlias = "Server";
//    protected boolean isPrepared = false;

    /**
     * Returns the packet type
     *
     * @return
     */
    public PacketType getType() {
        return this.packetType;
    }

//    /**
//     * Getter for senderAlias
//     *
//     * @return
//     */
//    public String getSenderAlias() {
//        return this.senderAlias;
//    }
//
//    /**
//     * Setter for senderAlias protected because of one time usage of packets
//     *
//     * @param senderAlias
//     */
//    protected void setSenderAlias(String senderAlias) {
//        this.senderAlias = senderAlias;
//    }
//
//    /**
//     * Sets the internal boolean isPrepared to true/false depending on what the current value is Use this for e.g. encrypting/decrypting a specific message
//     */
//    public void switchPrepared() {
//        this.isPrepared = !this.isPrepared;
//    }
}
