package com.google.android.exoplayer2;

import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2412i implements InterfaceC2409f {

    /* JADX INFO: renamed from: a */
    public final int f12264a;

    /* JADX INFO: renamed from: b */
    public final int f12265b;

    /* JADX INFO: renamed from: c */
    public final int f12266c;

    static {
        C10134c0.m19021F(0);
        C10134c0.m19021F(1);
        C10134c0.m19021F(2);
    }

    public C2412i(int i10, int i11, int i12) {
        this.f12264a = i10;
        this.f12265b = i11;
        this.f12266c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2412i)) {
            return false;
        }
        C2412i c2412i = (C2412i) obj;
        return this.f12264a == c2412i.f12264a && this.f12265b == c2412i.f12265b && this.f12266c == c2412i.f12266c;
    }

    public final int hashCode() {
        return ((((527 + this.f12264a) * 31) + this.f12265b) * 31) + this.f12266c;
    }
}
