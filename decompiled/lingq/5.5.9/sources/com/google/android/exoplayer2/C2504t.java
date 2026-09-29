package com.google.android.exoplayer2;

import java.util.Arrays;
import p291o7.C8002l;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2504t extends AbstractC2535x {

    /* JADX INFO: renamed from: d */
    public static final String f13470d = C10134c0.m19021F(1);

    /* JADX INFO: renamed from: e */
    public static final C8002l f13471e = new C8002l(11);

    /* JADX INFO: renamed from: c */
    public final float f13472c;

    public C2504t() {
        this.f13472c = -1.0f;
    }

    public C2504t(float f3) {
        C10129a.m18989a("percent must be in the range of [0, 100]", f3 >= 0.0f && f3 <= 100.0f);
        this.f13472c = f3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2504t) {
            return this.f13472c == ((C2504t) obj).f13472c;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f13472c)});
    }
}
