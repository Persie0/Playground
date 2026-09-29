package p470x1;

import androidx.activity.result.C0204c;
import p003a2.C0009a;

/* JADX INFO: renamed from: x1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10021i {

    /* JADX INFO: renamed from: a */
    public final int f50976a;

    /* JADX INFO: renamed from: b */
    public final int f50977b;

    /* JADX INFO: renamed from: c */
    public final int f50978c;

    /* JADX INFO: renamed from: d */
    public final int f50979d;

    public C10021i(int i10, int i11, int i12, int i13) {
        this.f50976a = i10;
        this.f50977b = i11;
        this.f50978c = i12;
        this.f50979d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10021i)) {
            return false;
        }
        C10021i c10021i = (C10021i) obj;
        return this.f50976a == c10021i.f50976a && this.f50977b == c10021i.f50977b && this.f50978c == c10021i.f50978c && this.f50979d == c10021i.f50979d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50979d) + C0009a.m16d(this.f50978c, C0009a.m16d(this.f50977b, Integer.hashCode(this.f50976a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f50976a);
        sb2.append(", ");
        sb2.append(this.f50977b);
        sb2.append(", ");
        sb2.append(this.f50978c);
        sb2.append(", ");
        return C0204c.m853l(sb2, this.f50979d, ')');
    }
}
