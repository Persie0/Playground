package p000;

/* JADX INFO: loaded from: classes.dex */
public final class f40 {

    /* JADX INFO: renamed from: a */
    public int f38382a;

    /* JADX INFO: renamed from: b */
    public String f38383b;

    /* JADX INFO: renamed from: c */
    public String f38384c;

    /* JADX INFO: renamed from: d */
    public boolean f38385d;

    /* JADX INFO: renamed from: e */
    public byte f38386e;

    /* JADX INFO: renamed from: a */
    public final g40 m11529a() {
        String str;
        String str2;
        if (this.f38386e == 3 && (str = this.f38383b) != null && (str2 = this.f38384c) != null) {
            return new g40(str, this.f38382a, str2, this.f38385d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f38386e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.f38383b == null) {
            sb.append(" version");
        }
        if (this.f38384c == null) {
            sb.append(" buildVersion");
        }
        if ((this.f38386e & 2) == 0) {
            sb.append(" jailbroken");
        }
        C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
        return null;
    }
}
