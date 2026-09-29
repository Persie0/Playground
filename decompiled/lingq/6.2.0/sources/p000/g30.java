package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g30 extends uq1 {

    /* JADX INFO: renamed from: a */
    public final String f40092a;

    /* JADX INFO: renamed from: b */
    public final String f40093b;

    /* JADX INFO: renamed from: c */
    public final String f40094c;

    /* JADX INFO: renamed from: d */
    public final long f40095d;

    /* JADX INFO: renamed from: e */
    public final Long f40096e;

    /* JADX INFO: renamed from: f */
    public final boolean f40097f;

    /* JADX INFO: renamed from: g */
    public final cq1 f40098g;

    /* JADX INFO: renamed from: h */
    public final tq1 f40099h;

    /* JADX INFO: renamed from: i */
    public final sq1 f40100i;

    /* JADX INFO: renamed from: j */
    public final dq1 f40101j;

    /* JADX INFO: renamed from: k */
    public final List f40102k;

    /* JADX INFO: renamed from: l */
    public final int f40103l;

    public g30(String str, String str2, String str3, long j, Long l, boolean z, cq1 cq1Var, tq1 tq1Var, sq1 sq1Var, dq1 dq1Var, List list, int i) {
        this.f40092a = str;
        this.f40093b = str2;
        this.f40094c = str3;
        this.f40095d = j;
        this.f40096e = l;
        this.f40097f = z;
        this.f40098g = cq1Var;
        this.f40099h = tq1Var;
        this.f40100i = sq1Var;
        this.f40101j = dq1Var;
        this.f40102k = list;
        this.f40103l = i;
    }

    @Override // p000.uq1
    /* JADX INFO: renamed from: a */
    public final f30 mo12307a() {
        f30 f30Var = new f30();
        f30Var.f38320a = this.f40092a;
        f30Var.f38321b = this.f40093b;
        f30Var.f38322c = this.f40094c;
        f30Var.f38323d = this.f40095d;
        f30Var.f38324e = this.f40096e;
        f30Var.f38325f = this.f40097f;
        f30Var.f38326g = this.f40098g;
        f30Var.f38327h = this.f40099h;
        f30Var.f38328i = this.f40100i;
        f30Var.f38329j = this.f40101j;
        f30Var.f38330k = this.f40102k;
        f30Var.f38331l = this.f40103l;
        f30Var.f38332m = (byte) 7;
        return f30Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uq1) {
            g30 g30Var = (g30) ((uq1) obj);
            if (this.f40092a.equals(g30Var.f40092a) && this.f40093b.equals(g30Var.f40093b)) {
                String str = g30Var.f40094c;
                String str2 = this.f40094c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f40095d == g30Var.f40095d) {
                        Long l = g30Var.f40096e;
                        Long l2 = this.f40096e;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f40097f == g30Var.f40097f && this.f40098g.equals(g30Var.f40098g)) {
                                tq1 tq1Var = g30Var.f40099h;
                                tq1 tq1Var2 = this.f40099h;
                                if (tq1Var2 != null ? tq1Var2.equals(tq1Var) : tq1Var == null) {
                                    sq1 sq1Var = g30Var.f40100i;
                                    sq1 sq1Var2 = this.f40100i;
                                    if (sq1Var2 != null ? sq1Var2.equals(sq1Var) : sq1Var == null) {
                                        dq1 dq1Var = g30Var.f40101j;
                                        dq1 dq1Var2 = this.f40101j;
                                        if (dq1Var2 != null ? dq1Var2.equals(dq1Var) : dq1Var == null) {
                                            List list = g30Var.f40102k;
                                            List list2 = this.f40102k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.f40103l == g30Var.f40103l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f40092a.hashCode() ^ 1000003) * 1000003) ^ this.f40093b.hashCode()) * 1000003;
        String str = this.f40094c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.f40095d;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.f40096e;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f40097f ? 1231 : 1237)) * 1000003) ^ this.f40098g.hashCode()) * 1000003;
        tq1 tq1Var = this.f40099h;
        int iHashCode4 = (iHashCode3 ^ (tq1Var == null ? 0 : tq1Var.hashCode())) * 1000003;
        sq1 sq1Var = this.f40100i;
        int iHashCode5 = (iHashCode4 ^ (sq1Var == null ? 0 : sq1Var.hashCode())) * 1000003;
        dq1 dq1Var = this.f40101j;
        int iHashCode6 = (iHashCode5 ^ (dq1Var == null ? 0 : dq1Var.hashCode())) * 1000003;
        List list = this.f40102k;
        return this.f40103l ^ ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f40092a);
        sb.append(", identifier=");
        sb.append(this.f40093b);
        sb.append(", appQualitySessionId=");
        sb.append(this.f40094c);
        sb.append(", startedAt=");
        sb.append(this.f40095d);
        sb.append(", endedAt=");
        sb.append(this.f40096e);
        sb.append(", crashed=");
        sb.append(this.f40097f);
        sb.append(", app=");
        sb.append(this.f40098g);
        sb.append(", user=");
        sb.append(this.f40099h);
        sb.append(", os=");
        sb.append(this.f40100i);
        sb.append(", device=");
        sb.append(this.f40101j);
        sb.append(", events=");
        sb.append(this.f40102k);
        sb.append(", generatorType=");
        return wq1.m24123s(sb, this.f40103l, "}");
    }
}
