package p214k5;

import androidx.activity.result.C0204c;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: k5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6607i {

    /* JADX INFO: renamed from: a */
    public final String f37507a;

    /* JADX INFO: renamed from: b */
    public final int f37508b;

    /* JADX INFO: renamed from: c */
    public final int f37509c;

    public C6607i(String str, int i10, int i11) {
        C5207g.m11111f(str, "workSpecId");
        this.f37507a = str;
        this.f37508b = i10;
        this.f37509c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6607i)) {
            return false;
        }
        C6607i c6607i = (C6607i) obj;
        return C5207g.m11106a(this.f37507a, c6607i.f37507a) && this.f37508b == c6607i.f37508b && this.f37509c == c6607i.f37509c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37509c) + C0009a.m16d(this.f37508b, this.f37507a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f37507a);
        sb2.append(", generation=");
        sb2.append(this.f37508b);
        sb2.append(", systemId=");
        return C0204c.m853l(sb2, this.f37509c, ')');
    }
}
