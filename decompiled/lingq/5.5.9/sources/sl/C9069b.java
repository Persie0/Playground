package sl;

import dm.C5207g;
import jm.C6526i;

/* JADX INFO: renamed from: sl.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9069b implements Comparable<C9069b> {

    /* JADX INFO: renamed from: e */
    public static final C9069b f47354e = new C9069b(8, 21);

    /* JADX INFO: renamed from: a */
    public final int f47355a;

    /* JADX INFO: renamed from: b */
    public final int f47356b;

    /* JADX INFO: renamed from: c */
    public final int f47357c;

    /* JADX INFO: renamed from: d */
    public final int f47358d;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C9069b() {
        throw null;
    }

    public C9069b(int i10, int i11) {
        this.f47355a = 1;
        this.f47356b = i10;
        this.f47357c = i11;
        if (new C6526i(0, 255).m13106i(1) && new C6526i(0, 255).m13106i(i10) && new C6526i(0, 255).m13106i(i11)) {
            this.f47358d = 65536 + (i10 << 8) + i11;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: 1." + i10 + '.' + i11).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(C9069b c9069b) {
        C9069b c9069b2 = c9069b;
        C5207g.m11111f(c9069b2, "other");
        return this.f47358d - c9069b2.f47358d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C9069b c9069b = obj instanceof C9069b ? (C9069b) obj : null;
        if (c9069b != null && this.f47358d == c9069b.f47358d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f47358d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f47355a);
        sb2.append('.');
        sb2.append(this.f47356b);
        sb2.append('.');
        sb2.append(this.f47357c);
        return sb2.toString();
    }
}
