package com.google.android.exoplayer2;

import java.util.Arrays;
import p402u0.C9362e;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.z */
/* JADX INFO: loaded from: classes.dex */
public final class C2537z extends AbstractC2535x {

    /* JADX INFO: renamed from: e */
    public static final String f13787e = C10134c0.m19021F(1);

    /* JADX INFO: renamed from: f */
    public static final String f13788f = C10134c0.m19021F(2);

    /* JADX INFO: renamed from: g */
    public static final C9362e f13789g = new C9362e(15);

    /* JADX INFO: renamed from: c */
    public final int f13790c;

    /* JADX INFO: renamed from: d */
    public final float f13791d;

    public C2537z(int i10) {
        C10129a.m18989a("maxStars must be a positive integer", i10 > 0);
        this.f13790c = i10;
        this.f13791d = -1.0f;
    }

    public C2537z(int i10, float f3) {
        boolean z10 = true;
        C10129a.m18989a("maxStars must be a positive integer", i10 > 0);
        if (f3 < 0.0f || f3 > i10) {
            z10 = false;
        }
        C10129a.m18989a("starRating is out of range [0, maxStars]", z10);
        this.f13790c = i10;
        this.f13791d = f3;
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof C2537z)) {
            return false;
        }
        C2537z c2537z = (C2537z) obj;
        if (this.f13790c == c2537z.f13790c && this.f13791d == c2537z.f13791d) {
            z10 = true;
        }
        return z10;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13790c), Float.valueOf(this.f13791d)});
    }
}
