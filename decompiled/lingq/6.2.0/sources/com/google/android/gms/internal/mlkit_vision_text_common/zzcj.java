package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzcj extends zzbm {

    /* JADX INFO: renamed from: d */
    public final transient Object[] f12108d;

    public zzcj(Object[] objArr) {
        this.f12108d = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f12108d;
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                Objects.requireNonNull(obj2);
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
