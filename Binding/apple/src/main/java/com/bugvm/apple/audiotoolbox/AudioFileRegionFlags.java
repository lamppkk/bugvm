/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.audiotoolbox;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.audiounit.*;
import com.bugvm.apple.coreaudio.*;
import com.bugvm.apple.coremidi.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/AudioFileRegionFlags/*</name>*/ extends Bits</*<name>*/AudioFileRegionFlags/*</name>*/> {
    /*<values>*/
    public static final AudioFileRegionFlags None = new AudioFileRegionFlags(0L);
    public static final AudioFileRegionFlags LoopEnable = new AudioFileRegionFlags(1L);
    public static final AudioFileRegionFlags PlayForward = new AudioFileRegionFlags(2L);
    public static final AudioFileRegionFlags PlayBackward = new AudioFileRegionFlags(4L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/AudioFileRegionFlags/*</name>*/[] values = _values(/*<name>*/AudioFileRegionFlags/*</name>*/.class);

    public /*<name>*/AudioFileRegionFlags/*</name>*/(long value) { super(value); }
    private /*<name>*/AudioFileRegionFlags/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/AudioFileRegionFlags/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/AudioFileRegionFlags/*</name>*/(value, mask);
    }
    protected /*<name>*/AudioFileRegionFlags/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/AudioFileRegionFlags/*</name>*/[] values() {
        return values.clone();
    }
}
