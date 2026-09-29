package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.graphics.C0306b;
import p000.aa1;
import p000.d16;
import p000.d32;
import p000.fa4;
import p000.g9a;
import p000.i16;
import p000.o39;
import p000.ux5;
import p000.xj2;
import p000.y64;
import p000.z91;

/* JADX INFO: renamed from: androidx.compose.ui.draw.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0298e extends i16 {

    /* JADX INFO: renamed from: b */
    public final float f3872b;

    /* JADX INFO: renamed from: c */
    public final o39 f3873c;

    /* JADX INFO: renamed from: d */
    public final boolean f3874d;

    /* JADX INFO: renamed from: e */
    public final long f3875e;

    /* JADX INFO: renamed from: f */
    public final long f3876f;

    public C0298e(float f, o39 o39Var, boolean z, long j, long j2) {
        this.f3872b = f;
        this.f3873c = o39Var;
        this.f3874d = z;
        this.f3875e = j;
        this.f3876f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0298e)) {
            return false;
        }
        C0298e c0298e = (C0298e) obj;
        return xj2.m24560b(this.f3872b, c0298e.f3872b) && fa4.m11650l(this.f3873c, c0298e.f3873c) && this.f3874d == c0298e.f3874d && aa1.m199c(this.f3875e, c0298e.f3875e) && aa1.m199c(this.f3876f, c0298e.f3876f);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0306b(new ShadowGraphicsLayerElement$createBlock$1(this));
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e((this.f3873c.hashCode() + (Float.hashCode(this.f3872b) * 31)) * 31, 31, this.f3874d);
        int i = aa1.f413l;
        return Long.hashCode(this.f3876f) + ux5.m22981d(this.f3875e, iM12428e, 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "shadow";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(new xj2(this.f3872b), "elevation");
        z91Var.m25511b(this.f3873c, "shape");
        z91Var.m25511b(Boolean.valueOf(this.f3874d), "clip");
        z91Var.m25511b(new aa1(this.f3875e), "ambientColor");
        z91Var.m25511b(new aa1(this.f3876f), "spotColor");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0306b c0306b = (C0306b) d16Var;
        ShadowGraphicsLayerElement$createBlock$1 shadowGraphicsLayerElement$createBlock$1 = new ShadowGraphicsLayerElement$createBlock$1(this);
        c0306b.f3925J = shadowGraphicsLayerElement$createBlock$1;
        d32.m10052m0(c0306b, shadowGraphicsLayerElement$createBlock$1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) xj2.m24561c(this.f3872b));
        sb.append(", shape=");
        sb.append(this.f3873c);
        sb.append(", clip=");
        sb.append(this.f3874d);
        sb.append(", ambientColor=");
        ux5.m23002y(this.f3875e, ", spotColor=", sb);
        sb.append((Object) aa1.m205i(this.f3876f));
        sb.append(')');
        return sb.toString();
    }
}
