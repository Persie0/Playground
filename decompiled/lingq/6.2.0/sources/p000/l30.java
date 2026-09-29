package p000;

/* JADX INFO: loaded from: classes.dex */
public final class l30 {

    /* JADX INFO: renamed from: a */
    public long f48952a;

    /* JADX INFO: renamed from: b */
    public String f48953b;

    /* JADX INFO: renamed from: c */
    public lq1 f48954c;

    /* JADX INFO: renamed from: d */
    public mq1 f48955d;

    /* JADX INFO: renamed from: e */
    public nq1 f48956e;

    /* JADX INFO: renamed from: f */
    public qq1 f48957f;

    /* JADX INFO: renamed from: g */
    public byte f48958g;

    /* JADX INFO: renamed from: a */
    public final m30 m15768a() {
        String str;
        lq1 lq1Var;
        mq1 mq1Var;
        if (this.f48958g == 1 && (str = this.f48953b) != null && (lq1Var = this.f48954c) != null && (mq1Var = this.f48955d) != null) {
            return new m30(this.f48952a, str, lq1Var, mq1Var, this.f48956e, this.f48957f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.f48958g) == 0) {
            sb.append(" timestamp");
        }
        if (this.f48953b == null) {
            sb.append(" type");
        }
        if (this.f48954c == null) {
            sb.append(" app");
        }
        if (this.f48955d == null) {
            sb.append(" device");
        }
        C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
        return null;
    }
}
