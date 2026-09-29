package com.google.android.exoplayer2;

import java.util.Arrays;
import p291o7.C8002l;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2463n extends AbstractC2535x {

    /* JADX INFO: renamed from: e */
    public static final String f12756e = C10134c0.m19021F(1);

    /* JADX INFO: renamed from: f */
    public static final String f12757f = C10134c0.m19021F(2);

    /* JADX INFO: renamed from: g */
    public static final C8002l f12758g = new C8002l(9);

    /* JADX INFO: renamed from: c */
    public final boolean f12759c;

    /* JADX INFO: renamed from: d */
    public final boolean f12760d;

    public C2463n() {
        this.f12759c = false;
        this.f12760d = false;
    }

    public C2463n(boolean z10) {
        this.f12759c = true;
        this.f12760d = z10;
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof C2463n)) {
            return false;
        }
        C2463n c2463n = (C2463n) obj;
        if (this.f12760d == c2463n.f12760d && this.f12759c == c2463n.f12759c) {
            z10 = true;
        }
        return z10;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f12759c), Boolean.valueOf(this.f12760d)});
    }
}
