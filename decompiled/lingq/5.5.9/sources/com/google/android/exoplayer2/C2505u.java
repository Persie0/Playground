package com.google.android.exoplayer2;

import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2505u implements InterfaceC2409f {

    /* JADX INFO: renamed from: d */
    public static final C2505u f13473d = new C2505u(1.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public final float f13474a;

    /* JADX INFO: renamed from: b */
    public final float f13475b;

    /* JADX INFO: renamed from: c */
    public final int f13476c;

    static {
        C10134c0.m19021F(0);
        C10134c0.m19021F(1);
    }

    public C2505u(float f3, float f10) {
        boolean z10 = true;
        C10129a.m18990b(f3 > 0.0f);
        if (f10 <= 0.0f) {
            z10 = false;
        }
        C10129a.m18990b(z10);
        this.f13474a = f3;
        this.f13475b = f10;
        this.f13476c = Math.round(f3 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2505u.class == obj.getClass()) {
            C2505u c2505u = (C2505u) obj;
            return this.f13474a == c2505u.f13474a && this.f13475b == c2505u.f13475b;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f13475b) + ((Float.floatToRawIntBits(this.f13474a) + 527) * 31);
    }

    public final String toString() {
        return C10134c0.m19045l("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f13474a), Float.valueOf(this.f13475b));
    }
}
