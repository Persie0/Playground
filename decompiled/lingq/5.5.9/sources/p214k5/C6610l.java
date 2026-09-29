package p214k5;

import androidx.activity.result.C0204c;
import dm.C5207g;

/* JADX INFO: renamed from: k5.l */
/* JADX INFO: loaded from: classes.dex */
public final class C6610l {

    /* JADX INFO: renamed from: a */
    public final String f37514a;

    /* JADX INFO: renamed from: b */
    public final int f37515b;

    public C6610l(String str, int i10) {
        C5207g.m11111f(str, "workSpecId");
        this.f37514a = str;
        this.f37515b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6610l)) {
            return false;
        }
        C6610l c6610l = (C6610l) obj;
        if (C5207g.m11106a(this.f37514a, c6610l.f37514a) && this.f37515b == c6610l.f37515b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37515b) + (this.f37514a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f37514a);
        sb2.append(", generation=");
        return C0204c.m853l(sb2, this.f37515b, ')');
    }
}
