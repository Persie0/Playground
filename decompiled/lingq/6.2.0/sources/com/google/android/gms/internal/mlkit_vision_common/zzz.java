package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes2.dex */
final class zzz extends zzr {

    /* JADX INFO: renamed from: d */
    public final transient Object[] f11983d;

    public zzz(Object[] objArr) {
        this.f11983d = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f11983d;
            Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
            } else {
                obj2 = null;
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }
}
