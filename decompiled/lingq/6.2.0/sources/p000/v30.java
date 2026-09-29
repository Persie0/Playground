package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v30 {

    /* JADX INFO: renamed from: a */
    public String f64773a;

    /* JADX INFO: renamed from: b */
    public int f64774b;

    /* JADX INFO: renamed from: c */
    public int f64775c;

    /* JADX INFO: renamed from: d */
    public boolean f64776d;

    /* JADX INFO: renamed from: e */
    public byte f64777e;

    /* JADX INFO: renamed from: a */
    public final w30 m23076a() {
        String str;
        if (this.f64777e == 7 && (str = this.f64773a) != null) {
            return new w30(this.f64774b, this.f64775c, str, this.f64776d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f64773a == null) {
            sb.append(" processName");
        }
        if ((this.f64777e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.f64777e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.f64777e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
        return null;
    }
}
