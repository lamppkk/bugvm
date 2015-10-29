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

import com.bugvm.apple.coregraphics.CGSize;
import com.bugvm.apple.foundation.NSIndexPath;
import com.bugvm.objc.annotation.NotImplemented;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICollectionViewDelegateFlowLayoutAdapter/*</name>*/ 
    extends /*<extends>*/UICollectionViewDelegateAdapter/*</extends>*/ 
    /*<implements>*/implements UICollectionViewDelegateFlowLayout/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("collectionView:layout:sizeForItemAtIndexPath:")
    public @ByVal
    CGSize getItemSize(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, NSIndexPath indexPath) { return null; }
    @NotImplemented("collectionView:layout:insetForSectionAtIndex:")
    public @ByVal UIEdgeInsets getSectionInset(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section) { return null; }
    @NotImplemented("collectionView:layout:minimumLineSpacingForSectionAtIndex:")
    public @MachineSizedFloat double getSectionMinimumLineSpacing(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section) { return 0; }
    @NotImplemented("collectionView:layout:minimumInteritemSpacingForSectionAtIndex:")
    public @MachineSizedFloat double getSectionMinimumInteritemSpacing(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section) { return 0; }
    @NotImplemented("collectionView:layout:referenceSizeForHeaderInSection:")
    public @ByVal CGSize getSectionHeaderReferenceSize(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section) { return null; }
    @NotImplemented("collectionView:layout:referenceSizeForFooterInSection:")
    public @ByVal CGSize getSectionFooterReferenceSize(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section) { return null; }
    /*</methods>*/
}