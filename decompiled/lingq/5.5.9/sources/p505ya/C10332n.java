package p505ya;

import com.google.android.exoplayer2.InterfaceC2409f;
import p479xa.C10134c0;

/* JADX INFO: renamed from: ya.n */
/* JADX INFO: loaded from: classes.dex */
public final class C10332n implements InterfaceC2409f {

    /* JADX INFO: renamed from: e */
    public static final C10332n f52011e = new C10332n(1.0f, 0, 0, 0);

    /* JADX INFO: renamed from: f */
    public static final String f52012f = C10134c0.m19021F(0);

    /* JADX INFO: renamed from: g */
    public static final String f52013g = C10134c0.m19021F(1);

    /* JADX INFO: renamed from: h */
    public static final String f52014h = C10134c0.m19021F(2);

    /* JADX INFO: renamed from: i */
    public static final String f52015i = C10134c0.m19021F(3);

    /* JADX INFO: renamed from: a */
    public final int f52016a;

    /* JADX INFO: renamed from: b */
    public final int f52017b;

    /* JADX INFO: renamed from: c */
    public final int f52018c;

    /* JADX INFO: renamed from: d */
    public final float f52019d;

    public C10332n(float f3, int i10, int i11, int i12) {
        this.f52016a = i10;
        this.f52017b = i11;
        this.f52018c = i12;
        this.f52019d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10332n)) {
            return false;
        }
        C10332n c10332n = (C10332n) obj;
        return this.f52016a == c10332n.f52016a && this.f52017b == c10332n.f52017b && this.f52018c == c10332n.f52018c && this.f52019d == c10332n.f52019d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f52019d) + ((((((217 + this.f52016a) * 31) + this.f52017b) * 31) + this.f52018c) * 31);
    }
}
