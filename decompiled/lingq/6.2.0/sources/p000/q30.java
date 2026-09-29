package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q30 extends fq1 {

    /* JADX INFO: renamed from: a */
    public final String f57179a;

    /* JADX INFO: renamed from: b */
    public final String f57180b;

    /* JADX INFO: renamed from: c */
    public final List f57181c;

    /* JADX INFO: renamed from: d */
    public final fq1 f57182d;

    /* JADX INFO: renamed from: e */
    public final int f57183e;

    public q30(String str, String str2, List list, fq1 fq1Var, int i) {
        this.f57179a = str;
        this.f57180b = str2;
        this.f57181c = list;
        this.f57182d = fq1Var;
        this.f57183e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fq1) {
            q30 q30Var = (q30) ((fq1) obj);
            if (this.f57179a.equals(q30Var.f57179a)) {
                String str = q30Var.f57180b;
                String str2 = this.f57180b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f57181c.equals(q30Var.f57181c)) {
                        fq1 fq1Var = q30Var.f57182d;
                        fq1 fq1Var2 = this.f57182d;
                        if (fq1Var2 != null ? fq1Var2.equals(fq1Var) : fq1Var == null) {
                            if (this.f57183e == q30Var.f57183e) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f57179a.hashCode() ^ 1000003) * 1000003;
        String str = this.f57180b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f57181c.hashCode()) * 1000003;
        fq1 fq1Var = this.f57182d;
        return this.f57183e ^ ((iHashCode2 ^ (fq1Var != null ? fq1Var.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f57179a);
        sb.append(", reason=");
        sb.append(this.f57180b);
        sb.append(", frames=");
        sb.append(this.f57181c);
        sb.append(", causedBy=");
        sb.append(this.f57182d);
        sb.append(", overflowCount=");
        return wq1.m24123s(sb, this.f57183e, "}");
    }
}
