package com.bumptech.glide;

import com.bumptech.glide.AbstractC2144m;
import p215k6.C6624a;
import p258m6.C7492l;

/* JADX INFO: renamed from: com.bumptech.glide.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2144m<CHILD extends AbstractC2144m<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final C6624a.a f10851a = C6624a.f37565a;

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC2144m) {
            return C7492l.m14881b(this.f10851a, ((AbstractC2144m) obj).f10851a);
        }
        return false;
    }

    public int hashCode() {
        C6624a.a aVar = this.f10851a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }
}
