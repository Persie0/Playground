package com.google.android.gms.internal.play_billing;

import java.util.Set;
import p000.ddd;
import p000.yqb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzca extends zzbt implements Set {

    /* JADX INFO: renamed from: b */
    public transient zzbw f12209b;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: h */
    public zzbw mo5663h() {
        zzbw zzbwVar = this.f12209b;
        if (zzbwVar != null) {
            return zzbwVar;
        }
        zzbw zzbwVarMo5674k = mo5674k();
        this.f12209b = zzbwVarMo5674k;
        return zzbwVarMo5674k;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return ddd.m10305b(this);
    }

    /* JADX INFO: renamed from: k */
    public zzbw mo5674k() {
        Object[] array = toArray();
        yqb yqbVar = zzbw.f12205b;
        return zzbw.m5667l(array, array.length);
    }
}
