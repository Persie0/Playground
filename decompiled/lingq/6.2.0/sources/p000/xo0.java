package p000;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class xo0 {

    /* JADX INFO: renamed from: c */
    public static final xo0 f68421c = new xo0(u91.m22627s1(new ArrayList()), null);

    /* JADX INFO: renamed from: a */
    public final Set f68422a;

    /* JADX INFO: renamed from: b */
    public final vz1 f68423b;

    public xo0(Set set, vz1 vz1Var) {
        this.f68422a = set;
        this.f68423b = vz1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xo0)) {
            return false;
        }
        xo0 xo0Var = (xo0) obj;
        return xo0Var.f68422a.equals(this.f68422a) && fa4.m11650l(xo0Var.f68423b, this.f68423b);
    }

    public final int hashCode() {
        int iHashCode = (this.f68422a.hashCode() + 1517) * 41;
        vz1 vz1Var = this.f68423b;
        return iHashCode + (vz1Var != null ? vz1Var.hashCode() : 0);
    }
}
