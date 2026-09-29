package p160hj;

import android.support.v4.media.session.C0166e;
import p003a2.C0009a;

/* JADX INFO: renamed from: hj.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6055a {

    /* JADX INFO: renamed from: a */
    public int f35750a;

    /* JADX INFO: renamed from: b */
    public int f35751b;

    /* JADX INFO: renamed from: c */
    public int f35752c;

    public C6055a() {
        this(0);
    }

    public C6055a(int i10) {
        this.f35750a = -1;
        this.f35751b = -1;
        this.f35752c = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6055a)) {
            return false;
        }
        C6055a c6055a = (C6055a) obj;
        return this.f35750a == c6055a.f35750a && this.f35751b == c6055a.f35751b && this.f35752c == c6055a.f35752c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35752c) + C0009a.m16d(this.f35751b, Integer.hashCode(this.f35750a) * 31, 31);
    }

    public final String toString() {
        int i10 = this.f35750a;
        int i11 = this.f35751b;
        return C0166e.m768o(C0009a.m25n("DataInfo(completedPages=", i10, ", totalPages=", i11, ", currentPage="), this.f35752c, ")");
    }
}
