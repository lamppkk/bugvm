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
package com.bugvm.apple.uikit;

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
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coredata.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coretext.*;
import com.bugvm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIMenuItem/*</name>*/
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public interface OnActionListener {
        void onAction(UIMenuController menuController, UIMenuItem menuItem);
    }
    
    /*<ptr>*/public static class UIMenuItemPtr extends Ptr<UIMenuItem, UIMenuItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIMenuItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    static final LongMap<UIMenuItem> items = new LongMap<>();
    
    private OnActionListener actionListener;
    
    public UIMenuItem(String title) {
        setTitle(title);
    }
    
    public UIMenuItem(String title, OnActionListener action) {
        super((SkipInit) null);
        if (action == null) {
            throw new NullPointerException("action");
        }
        this.actionListener = action;
        Selector sel = getUniqueSelector();
        initObject(init(title, sel));
        
        synchronized (items) {
            items.put(sel.getHandle(), this);
        }
    }
    
    public void setActionListener(OnActionListener action) {
        this.actionListener = action;

        Selector sel = null;
        if (action != null) {
            sel = getUniqueSelector();
        } 
        setAction(sel);
        
        synchronized (items) {
            if (action != null) {
                items.put(sel.getHandle(), this);
            } else {
                items.remove(sel.getHandle());
            }
        }
    }
    public OnActionListener getActionListener() {
        return actionListener;
    }
    
    private Selector getUniqueSelector() {
        String name = "__menuitem_" + getHandle();
        return Selector.register(name);
    }
    /*<constructors>*/
    public UIMenuItem() {}
    protected UIMenuItem(SkipInit skipInit) { super(skipInit); }
    public UIMenuItem(String title, Selector action) { super((SkipInit) null); initObject(init(title, action)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "action")
    public native Selector getAction();
    @Property(selector = "setAction:")
    public native void setAction(Selector v);
    /*</properties>*/
    /*<members>*//*</members>*/
    
    /*<methods>*/
    @Method(selector = "initWithTitle:action:")
    protected native @Pointer long init(String title, Selector action);
    /*</methods>*/
}
