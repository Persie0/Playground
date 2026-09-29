package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class g84 implements Iterable, tg4 {

    /* JADX INFO: renamed from: a */
    public final int f40379a;

    /* JADX INFO: renamed from: b */
    public final int f40380b;

    /* JADX INFO: renamed from: c */
    public final int f40381c;

    public g84(int i, int i2, int i3) {
        if (i3 == 0) {
            C3386nv.m17626m("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            C3386nv.m17626m("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f40379a = i;
        this.f40380b = AbstractC3695vr.m23507r(i, i2, i3);
        this.f40381c = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g84)) {
            return false;
        }
        if (isEmpty() && ((g84) obj).isEmpty()) {
            return true;
        }
        g84 g84Var = (g84) obj;
        return this.f40379a == g84Var.f40379a && this.f40380b == g84Var.f40380b && this.f40381c == g84Var.f40381c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f40379a * 31) + this.f40380b) * 31) + this.f40381c;
    }

    public boolean isEmpty() {
        int i = this.f40380b;
        int i2 = this.f40381c;
        int i3 = this.f40379a;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new h84(this.f40379a, this.f40380b, this.f40381c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f40380b;
        int i2 = this.f40381c;
        int i3 = this.f40379a;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
