/*
 * Copyright (C) 2008-2010 Wayne Meissner
 *
 * This file is part of the JNR project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jnr.ffi.provider;

import jnr.ffi.Pointer;

import java.nio.ByteBuffer;

/**
 * Manages access to various types of java and native memory.
 */
public interface MemoryManager {
    public abstract Pointer allocate(int size);
    public abstract Pointer allocateDirect(int size);
    public abstract Pointer allocateDirect(long size);
    public abstract Pointer allocateDirect(int size, boolean clear);
    public abstract Pointer allocateDirect(long size, boolean clear);
    public abstract Pointer allocateTemporary(int size, boolean clear);
    public abstract Pointer newPointer(ByteBuffer buffer);
    public abstract Pointer newPointer(long address);
    public abstract Pointer newPointer(long address, long size);
    public abstract Pointer newOpaquePointer(long address);
}
