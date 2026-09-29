package p424v0;

import android.support.v4.media.AbstractC0140a;
import androidx.activity.result.C0204c;
import dm.C5207g;
import p003a2.C0009a;
import p387t0.C9158m0;
import p387t0.C9160n0;

/* JADX INFO: renamed from: v0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9624h extends AbstractC0140a {

    /* JADX INFO: renamed from: a */
    public final float f49296a;

    /* JADX INFO: renamed from: b */
    public final float f49297b;

    /* JADX INFO: renamed from: c */
    public final int f49298c;

    /* JADX INFO: renamed from: d */
    public final int f49299d;

    public C9624h(float f3, float f10, int i10, int i11, int i12) {
        f3 = (i12 & 1) != 0 ? 0.0f : f3;
        f10 = (i12 & 2) != 0 ? 4.0f : f10;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        this.f49296a = f3;
        this.f49297b = f10;
        this.f49298c = i10;
        this.f49299d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9624h)) {
            return false;
        }
        C9624h c9624h = (C9624h) obj;
        if (!(this.f49296a == c9624h.f49296a)) {
            return false;
        }
        if (!(this.f49297b == c9624h.f49297b)) {
            return false;
        }
        if (!(this.f49298c == c9624h.f49298c)) {
            return false;
        }
        if (!(this.f49299d == c9624h.f49299d)) {
            return false;
        }
        c9624h.getClass();
        return C5207g.m11106a(null, null);
    }

    public final int hashCode() {
        return C0009a.m16d(this.f49299d, C0009a.m16d(this.f49298c, C0204c.m846e(this.f49297b, Float.hashCode(this.f49296a) * 31, 31), 31), 31) + 0;
    }

    public final String toString() {
        return "Stroke(width=" + this.f49296a + ", miter=" + this.f49297b + ", cap=" + ((Object) C9158m0.m17477a(this.f49298c)) + ", join=" + ((Object) C9160n0.m17479a(this.f49299d)) + ", pathEffect=" + ((Object) null) + ')';
    }
}
