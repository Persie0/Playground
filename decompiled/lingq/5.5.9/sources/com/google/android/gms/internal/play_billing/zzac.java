package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import p480xb.C10164g;

/* JADX INFO: loaded from: classes.dex */
final class zzac extends zzy {

    /* JADX INFO: renamed from: c */
    public final transient zzx f14573c;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f14574d;

    /* JADX INFO: renamed from: e */
    public final transient int f14575e;

    public zzac(zzx zzxVar, Object[] objArr, int i10) {
        this.f14573c = zzxVar;
        this.f14574d = objArr;
        this.f14575e = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzy
    /* JADX INFO: renamed from: D */
    public final zzu mo8523D() {
        return new zzab(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: a */
    public final int mo8519a(Object[] objArr) {
        return mo8525s().mo8519a(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f14573c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo8525s().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14575e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: t */
    public final C10164g iterator() {
        return mo8525s().listIterator(0);
    }
}
