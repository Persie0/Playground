package p118fe;

import android.support.v4.media.session.C0166e;
import p003a2.C0009a;

/* JADX INFO: renamed from: fe.m */
/* JADX INFO: loaded from: classes.dex */
public final class C5521m {

    /* JADX INFO: renamed from: a */
    public final C5527s<?> f34182a;

    /* JADX INFO: renamed from: b */
    public final int f34183b;

    /* JADX INFO: renamed from: c */
    public final int f34184c;

    public C5521m(int i10, int i11, Class cls) {
        this((C5527s<?>) C5527s.m11765a(cls), i10, i11);
    }

    public C5521m(C5527s<?> c5527s, int i10, int i11) {
        this.f34182a = c5527s;
        this.f34183b = i10;
        this.f34184c = i11;
    }

    /* JADX INFO: renamed from: a */
    public static C5521m m11761a(Class<?> cls) {
        return new C5521m(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5521m)) {
            return false;
        }
        C5521m c5521m = (C5521m) obj;
        return this.f34182a.equals(c5521m.f34182a) && this.f34183b == c5521m.f34183b && this.f34184c == c5521m.f34184c;
    }

    public final int hashCode() {
        return ((((this.f34182a.hashCode() ^ 1000003) * 1000003) ^ this.f34183b) * 1000003) ^ this.f34184c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f34182a);
        sb2.append(", type=");
        int i10 = this.f34183b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f34184c;
        if (i11 == 0) {
            str2 = "direct";
        } else if (i11 == 1) {
            str2 = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(C0166e.m761g("Unsupported injection: ", i11));
            }
            str2 = "deferred";
        }
        return C0009a.m23l(sb2, str2, "}");
    }
}
