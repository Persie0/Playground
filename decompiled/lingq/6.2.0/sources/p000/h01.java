package p000;

import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002ui.state.ToggleableState;

/* JADX INFO: loaded from: classes.dex */
public final class h01 {

    /* JADX INFO: renamed from: a */
    public final long f41590a;

    /* JADX INFO: renamed from: b */
    public final long f41591b;

    /* JADX INFO: renamed from: c */
    public final long f41592c;

    /* JADX INFO: renamed from: d */
    public final long f41593d;

    /* JADX INFO: renamed from: e */
    public final long f41594e;

    /* JADX INFO: renamed from: f */
    public final long f41595f;

    /* JADX INFO: renamed from: g */
    public final long f41596g;

    /* JADX INFO: renamed from: h */
    public final long f41597h;

    /* JADX INFO: renamed from: i */
    public final long f41598i;

    /* JADX INFO: renamed from: j */
    public final long f41599j;

    /* JADX INFO: renamed from: k */
    public final long f41600k;

    /* JADX INFO: renamed from: l */
    public final long f41601l;

    /* JADX INFO: renamed from: m */
    public final long f41602m;

    public h01(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.f41590a = j;
        this.f41591b = j2;
        this.f41592c = j3;
        this.f41593d = j4;
        this.f41594e = j5;
        this.f41595f = j6;
        this.f41596g = j7;
        this.f41597h = j8;
        this.f41598i = j9;
        this.f41599j = j10;
        this.f41600k = j11;
        this.f41601l = j12;
        this.f41602m = j13;
    }

    /* JADX INFO: renamed from: a */
    public static l43 m12991a(ToggleableState toggleableState, ye1 ye1Var) {
        if (toggleableState == ToggleableState.Off) {
            tj3 tj3Var = (tj3) ye1Var;
            tj3Var.m22111b0(1539238463);
            l43 l43VarM21705c0 = ss5.m21705c0(MotionSchemeKeyTokens.FastEffects, tj3Var);
            tj3Var.m22139q(false);
            return l43VarM21705c0;
        }
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22111b0(1539331773);
        l43 l43VarM21705c1 = ss5.m21705c0(MotionSchemeKeyTokens.DefaultEffects, tj3Var2);
        tj3Var2.m22139q(false);
        return l43VarM21705c1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h01)) {
            return false;
        }
        h01 h01Var = (h01) obj;
        return aa1.m199c(this.f41590a, h01Var.f41590a) && aa1.m199c(this.f41591b, h01Var.f41591b) && aa1.m199c(this.f41602m, h01Var.f41602m) && aa1.m199c(this.f41592c, h01Var.f41592c) && aa1.m199c(this.f41593d, h01Var.f41593d) && aa1.m199c(this.f41594e, h01Var.f41594e) && aa1.m199c(this.f41595f, h01Var.f41595f) && aa1.m199c(this.f41596g, h01Var.f41596g) && aa1.m199c(this.f41597h, h01Var.f41597h) && aa1.m199c(this.f41598i, h01Var.f41598i) && aa1.m199c(this.f41599j, h01Var.f41599j) && aa1.m199c(this.f41600k, h01Var.f41600k) && aa1.m199c(this.f41601l, h01Var.f41601l);
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Long.hashCode(this.f41601l) + ux5.m22981d(this.f41600k, ux5.m22981d(this.f41599j, ux5.m22981d(this.f41598i, ux5.m22981d(this.f41597h, ux5.m22981d(this.f41596g, ux5.m22981d(this.f41595f, ux5.m22981d(this.f41594e, ux5.m22981d(this.f41593d, ux5.m22981d(this.f41592c, ux5.m22981d(this.f41602m, ux5.m22981d(this.f41591b, Long.hashCode(this.f41590a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
