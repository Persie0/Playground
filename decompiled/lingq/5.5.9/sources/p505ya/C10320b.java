package p505ya;

import android.support.v4.media.session.C0166e;
import com.google.android.exoplayer2.InterfaceC2409f;
import java.util.Arrays;
import p291o7.C8002l;
import p479xa.C10134c0;

/* JADX INFO: renamed from: ya.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10320b implements InterfaceC2409f {

    /* JADX INFO: renamed from: f */
    public static final String f51891f = C10134c0.m19021F(0);

    /* JADX INFO: renamed from: g */
    public static final String f51892g = C10134c0.m19021F(1);

    /* JADX INFO: renamed from: h */
    public static final String f51893h = C10134c0.m19021F(2);

    /* JADX INFO: renamed from: i */
    public static final String f51894i = C10134c0.m19021F(3);

    /* JADX INFO: renamed from: j */
    public static final C8002l f51895j = new C8002l(18);

    /* JADX INFO: renamed from: a */
    public final int f51896a;

    /* JADX INFO: renamed from: b */
    public final int f51897b;

    /* JADX INFO: renamed from: c */
    public final int f51898c;

    /* JADX INFO: renamed from: d */
    public final byte[] f51899d;

    /* JADX INFO: renamed from: e */
    public int f51900e;

    public C10320b(int i10, int i11, int i12, byte[] bArr) {
        this.f51896a = i10;
        this.f51897b = i11;
        this.f51898c = i12;
        this.f51899d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10320b.class != obj.getClass()) {
            return false;
        }
        C10320b c10320b = (C10320b) obj;
        return this.f51896a == c10320b.f51896a && this.f51897b == c10320b.f51897b && this.f51898c == c10320b.f51898c && Arrays.equals(this.f51899d, c10320b.f51899d);
    }

    public final int hashCode() {
        if (this.f51900e == 0) {
            this.f51900e = Arrays.hashCode(this.f51899d) + ((((((527 + this.f51896a) * 31) + this.f51897b) * 31) + this.f51898c) * 31);
        }
        return this.f51900e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f51896a);
        sb2.append(", ");
        sb2.append(this.f51897b);
        sb2.append(", ");
        sb2.append(this.f51898c);
        sb2.append(", ");
        return C0166e.m769p(sb2, this.f51899d != null, ")");
    }
}
