package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o30 extends jq1 {

    /* JADX INFO: renamed from: a */
    public final List f53753a;

    /* JADX INFO: renamed from: b */
    public final fq1 f53754b;

    /* JADX INFO: renamed from: c */
    public final xp1 f53755c;

    /* JADX INFO: renamed from: d */
    public final r30 f53756d;

    /* JADX INFO: renamed from: e */
    public final List f53757e;

    public o30(List list, q30 q30Var, xp1 xp1Var, r30 r30Var, List list2) {
        this.f53753a = list;
        this.f53754b = q30Var;
        this.f53755c = xp1Var;
        this.f53756d = r30Var;
        this.f53757e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jq1)) {
            return false;
        }
        jq1 jq1Var = (jq1) obj;
        List list = this.f53753a;
        if (list == null) {
            if (((o30) jq1Var).f53753a != null) {
                return false;
            }
        } else if (!list.equals(((o30) jq1Var).f53753a)) {
            return false;
        }
        fq1 fq1Var = this.f53754b;
        if (fq1Var == null) {
            if (((o30) jq1Var).f53754b != null) {
                return false;
            }
        } else if (!fq1Var.equals(((o30) jq1Var).f53754b)) {
            return false;
        }
        xp1 xp1Var = this.f53755c;
        if (xp1Var == null) {
            if (((o30) jq1Var).f53755c != null) {
                return false;
            }
        } else if (!xp1Var.equals(((o30) jq1Var).f53755c)) {
            return false;
        }
        o30 o30Var = (o30) jq1Var;
        return this.f53756d.equals(o30Var.f53756d) && this.f53757e.equals(o30Var.f53757e);
    }

    public final int hashCode() {
        List list = this.f53753a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        fq1 fq1Var = this.f53754b;
        int iHashCode2 = (iHashCode ^ (fq1Var == null ? 0 : fq1Var.hashCode())) * 1000003;
        xp1 xp1Var = this.f53755c;
        return this.f53757e.hashCode() ^ (((((xp1Var != null ? xp1Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f53756d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Execution{threads=");
        sb.append(this.f53753a);
        sb.append(", exception=");
        sb.append(this.f53754b);
        sb.append(", appExitInfo=");
        sb.append(this.f53755c);
        sb.append(", signal=");
        sb.append(this.f53756d);
        sb.append(", binaries=");
        return hn1.m13356f(sb, this.f53757e, "}");
    }
}
