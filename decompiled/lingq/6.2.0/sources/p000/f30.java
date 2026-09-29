package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f30 {

    /* JADX INFO: renamed from: a */
    public String f38320a;

    /* JADX INFO: renamed from: b */
    public String f38321b;

    /* JADX INFO: renamed from: c */
    public String f38322c;

    /* JADX INFO: renamed from: d */
    public long f38323d;

    /* JADX INFO: renamed from: e */
    public Long f38324e;

    /* JADX INFO: renamed from: f */
    public boolean f38325f;

    /* JADX INFO: renamed from: g */
    public cq1 f38326g;

    /* JADX INFO: renamed from: h */
    public tq1 f38327h;

    /* JADX INFO: renamed from: i */
    public sq1 f38328i;

    /* JADX INFO: renamed from: j */
    public dq1 f38329j;

    /* JADX INFO: renamed from: k */
    public List f38330k;

    /* JADX INFO: renamed from: l */
    public int f38331l;

    /* JADX INFO: renamed from: m */
    public byte f38332m;

    /* JADX INFO: renamed from: a */
    public final g30 m11510a() {
        String str;
        String str2;
        cq1 cq1Var;
        if (this.f38332m == 7 && (str = this.f38320a) != null && (str2 = this.f38321b) != null && (cq1Var = this.f38326g) != null) {
            return new g30(str, str2, this.f38322c, this.f38323d, this.f38324e, this.f38325f, cq1Var, this.f38327h, this.f38328i, this.f38329j, this.f38330k, this.f38331l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f38320a == null) {
            sb.append(" generator");
        }
        if (this.f38321b == null) {
            sb.append(" identifier");
        }
        if ((this.f38332m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.f38332m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.f38326g == null) {
            sb.append(" app");
        }
        if ((this.f38332m & 4) == 0) {
            sb.append(" generatorType");
        }
        C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
        return null;
    }
}
