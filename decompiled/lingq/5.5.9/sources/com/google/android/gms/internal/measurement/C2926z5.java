package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2926z5 {

    /* JADX INFO: renamed from: a */
    public final Object f14520a;

    /* JADX INFO: renamed from: b */
    public final int f14521b;

    public C2926z5(int i10, Object obj) {
        this.f14520a = obj;
        this.f14521b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2926z5)) {
            return false;
        }
        C2926z5 c2926z5 = (C2926z5) obj;
        return this.f14520a == c2926z5.f14520a && this.f14521b == c2926z5.f14521b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f14520a) * 65535) + this.f14521b;
    }
}
