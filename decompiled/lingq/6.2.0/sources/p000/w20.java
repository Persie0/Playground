package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w20 {

    /* JADX INFO: renamed from: a */
    public String f66237a;

    /* JADX INFO: renamed from: b */
    public String f66238b;

    /* JADX INFO: renamed from: c */
    public int f66239c;

    /* JADX INFO: renamed from: d */
    public String f66240d;

    /* JADX INFO: renamed from: e */
    public String f66241e;

    /* JADX INFO: renamed from: f */
    public String f66242f;

    /* JADX INFO: renamed from: g */
    public String f66243g;

    /* JADX INFO: renamed from: h */
    public String f66244h;

    /* JADX INFO: renamed from: i */
    public String f66245i;

    /* JADX INFO: renamed from: j */
    public uq1 f66246j;

    /* JADX INFO: renamed from: k */
    public aq1 f66247k;

    /* JADX INFO: renamed from: l */
    public xp1 f66248l;

    /* JADX INFO: renamed from: m */
    public byte f66249m;

    /* JADX INFO: renamed from: a */
    public final x20 m23675a() {
        if (this.f66249m == 1 && this.f66237a != null && this.f66238b != null && this.f66240d != null && this.f66244h != null && this.f66245i != null) {
            return new x20(this.f66237a, this.f66238b, this.f66239c, this.f66240d, this.f66241e, this.f66242f, this.f66243g, this.f66244h, this.f66245i, this.f66246j, this.f66247k, this.f66248l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f66237a == null) {
            sb.append(" sdkVersion");
        }
        if (this.f66238b == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.f66249m) == 0) {
            sb.append(" platform");
        }
        if (this.f66240d == null) {
            sb.append(" installationUuid");
        }
        if (this.f66244h == null) {
            sb.append(" buildVersion");
        }
        if (this.f66245i == null) {
            sb.append(" displayVersion");
        }
        C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
        return null;
    }
}
