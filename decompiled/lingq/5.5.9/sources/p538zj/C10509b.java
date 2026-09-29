package p538zj;

import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: zj.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10509b {

    /* JADX INFO: renamed from: a */
    public final String f52463a;

    /* JADX INFO: renamed from: b */
    public final int f52464b;

    /* JADX INFO: renamed from: c */
    public int f52465c;

    public C10509b(String str, int i10, int i11) {
        C5207g.m11111f(str, "text");
        this.f52463a = str;
        this.f52464b = i10;
        this.f52465c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10509b)) {
            return false;
        }
        C10509b c10509b = (C10509b) obj;
        return C5207g.m11106a(this.f52463a, c10509b.f52463a) && this.f52464b == c10509b.f52464b && this.f52465c == c10509b.f52465c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52465c) + C0009a.m16d(this.f52464b, this.f52463a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SentenceWord(text=" + this.f52463a + ", index=" + this.f52464b + ", viewIndex=" + this.f52465c + ")";
    }
}
