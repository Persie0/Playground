package p513yj;

import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: yj.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C10399a {

    /* JADX INFO: renamed from: a */
    public final String f52197a;

    /* JADX INFO: renamed from: b */
    public final String f52198b;

    public C10399a() {
        this("", "");
    }

    public C10399a(String str, String str2) {
        C5207g.m11111f(str, "text");
        C5207g.m11111f(str2, "answer");
        this.f52197a = str;
        this.f52198b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10399a)) {
            return false;
        }
        C10399a c10399a = (C10399a) obj;
        return C5207g.m11106a(this.f52197a, c10399a.f52197a) && C5207g.m11106a(this.f52198b, c10399a.f52198b);
    }

    public final int hashCode() {
        return this.f52198b.hashCode() + (this.f52197a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MatchPair(text=");
        sb2.append(this.f52197a);
        sb2.append(", answer=");
        return C0009a.m23l(sb2, this.f52198b, ")");
    }
}
