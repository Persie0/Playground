package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
final class zzab extends zzu {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzac f14572c;

    public zzab(zzac zzacVar) {
        this.f14572c = zzacVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzac zzacVar = this.f14572c;
        C8573r0.m16745o1(i10, zzacVar.f14575e);
        int i11 = i10 + i10;
        Object[] objArr = zzacVar.f14574d;
        Object obj = objArr[i11];
        obj.getClass();
        Object obj2 = objArr[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14572c.f14575e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: y */
    public final boolean mo8522y() {
        return true;
    }
}
