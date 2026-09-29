package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzcf extends zzca {

    /* JADX INFO: renamed from: c */
    public final transient zzbz f12214c;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f12215d;

    /* JADX INFO: renamed from: e */
    public final transient int f12216e;

    public zzcf(zzbz zzbzVar, Object[] objArr, int i) {
        this.f12214c = zzbzVar;
        this.f12215d = objArr;
        this.f12216e = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f12214c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: d */
    public final int mo5660d(Object[] objArr) {
        return mo5663h().mo5660d(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo5663h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzca
    /* JADX INFO: renamed from: k */
    public final zzbw mo5674k() {
        return new zzce(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12216e;
    }
}
