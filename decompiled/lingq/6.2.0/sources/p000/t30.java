package p000;

/* JADX INFO: loaded from: classes.dex */
public final class t30 {

    /* JADX INFO: renamed from: a */
    public long f61780a;

    /* JADX INFO: renamed from: b */
    public String f61781b;

    /* JADX INFO: renamed from: c */
    public String f61782c;

    /* JADX INFO: renamed from: d */
    public long f61783d;

    /* JADX INFO: renamed from: e */
    public int f61784e;

    /* JADX INFO: renamed from: f */
    public byte f61785f;

    /* JADX INFO: renamed from: a */
    public final u30 m21825a() {
        String str;
        if (this.f61785f == 7 && (str = this.f61781b) != null) {
            return new u30(this.f61780a, str, this.f61782c, this.f61783d, this.f61784e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f61785f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.f61781b == null) {
            sb.append(" symbol");
        }
        if ((this.f61785f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f61785f & 4) == 0) {
            sb.append(" importance");
        }
        C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
        return null;
    }
}
