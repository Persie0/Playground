package com.google.android.exoplayer2;

import ge.C5789m;
import java.util.Arrays;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2380b0 extends AbstractC2535x {

    /* JADX INFO: renamed from: e */
    public static final String f12042e = C10134c0.m19021F(1);

    /* JADX INFO: renamed from: f */
    public static final String f12043f = C10134c0.m19021F(2);

    /* JADX INFO: renamed from: g */
    public static final C5789m f12044g = new C5789m(9);

    /* JADX INFO: renamed from: c */
    public final boolean f12045c;

    /* JADX INFO: renamed from: d */
    public final boolean f12046d;

    public C2380b0() {
        this.f12045c = false;
        this.f12046d = false;
    }

    public C2380b0(boolean z10) {
        this.f12045c = true;
        this.f12046d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2380b0)) {
            return false;
        }
        C2380b0 c2380b0 = (C2380b0) obj;
        return this.f12046d == c2380b0.f12046d && this.f12045c == c2380b0.f12045c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f12045c), Boolean.valueOf(this.f12046d)});
    }
}
