package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;
import p480xb.C10164g;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzy extends zzr implements Set {

    /* JADX INFO: renamed from: b */
    public transient zzu f14593b;

    /* JADX INFO: renamed from: D */
    public zzu mo8523D() {
        Object[] array = toArray();
        C10164g c10164g = zzu.f14589b;
        int length = array.length;
        return length == 0 ? zzaa.f14569e : new zzaa(length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean z10 = true;
        if (obj != this && obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size() && containsAll(set)) {
                        return true;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            z10 = false;
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: s */
    public zzu mo8525s() {
        zzu zzuVar = this.f14593b;
        if (zzuVar != null) {
            return zzuVar;
        }
        zzu zzuVarMo8523D = mo8523D();
        this.f14593b = zzuVarMo8523D;
        return zzuVarMo8523D;
    }
}
