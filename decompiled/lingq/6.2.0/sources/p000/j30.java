package p000;

/* JADX INFO: loaded from: classes.dex */
public final class j30 {

    /* JADX INFO: renamed from: a */
    public int f44989a;

    /* JADX INFO: renamed from: b */
    public String f44990b;

    /* JADX INFO: renamed from: c */
    public int f44991c;

    /* JADX INFO: renamed from: d */
    public long f44992d;

    /* JADX INFO: renamed from: e */
    public long f44993e;

    /* JADX INFO: renamed from: f */
    public boolean f44994f;

    /* JADX INFO: renamed from: g */
    public int f44995g;

    /* JADX INFO: renamed from: h */
    public String f44996h;

    /* JADX INFO: renamed from: i */
    public String f44997i;

    /* JADX INFO: renamed from: j */
    public byte f44998j;

    /* JADX INFO: renamed from: a */
    public final k30 m14280a() {
        String str;
        String str2;
        String str3;
        if (this.f44998j == 63 && (str = this.f44990b) != null && (str2 = this.f44996h) != null && (str3 = this.f44997i) != null) {
            return new k30(this.f44989a, str, this.f44991c, this.f44992d, this.f44993e, this.f44994f, this.f44995g, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f44998j & 1) == 0) {
            sb.append(" arch");
        }
        if (this.f44990b == null) {
            sb.append(" model");
        }
        if ((this.f44998j & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.f44998j & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.f44998j & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.f44998j & 16) == 0) {
            sb.append(" simulator");
        }
        if ((this.f44998j & 32) == 0) {
            sb.append(" state");
        }
        if (this.f44996h == null) {
            sb.append(" manufacturer");
        }
        if (this.f44997i == null) {
            sb.append(" modelClass");
        }
        C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
        return null;
    }
}
