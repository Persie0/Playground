package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class e50 {

    /* JADX INFO: renamed from: a */
    public String f36711a;

    /* JADX INFO: renamed from: b */
    public String f36712b;

    /* JADX INFO: renamed from: c */
    public String f36713c;

    /* JADX INFO: renamed from: d */
    public String f36714d;

    /* JADX INFO: renamed from: e */
    public long f36715e;

    /* JADX INFO: renamed from: f */
    public byte f36716f;

    /* JADX INFO: renamed from: a */
    public final f50 m10849a() {
        if (this.f36716f == 1 && this.f36711a != null && this.f36712b != null && this.f36713c != null && this.f36714d != null) {
            return new f50(this.f36711a, this.f36712b, this.f36713c, this.f36714d, this.f36715e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f36711a == null) {
            sb.append(" rolloutId");
        }
        if (this.f36712b == null) {
            sb.append(" variantId");
        }
        if (this.f36713c == null) {
            sb.append(" parameterKey");
        }
        if (this.f36714d == null) {
            sb.append(" parameterValue");
        }
        if ((this.f36716f & 1) == 0) {
            sb.append(" templateVersion");
        }
        C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m10850b(String str) {
        if (str != null) {
            this.f36713c = str;
        } else {
            C3386nv.m17635v("Null parameterKey");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10851c(String str) {
        this.f36714d = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m10852d(String str) {
        if (str != null) {
            this.f36711a = str;
        } else {
            C3386nv.m17635v("Null rolloutId");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10853e(long j) {
        this.f36715e = j;
        this.f36716f = (byte) (this.f36716f | 1);
    }

    /* JADX INFO: renamed from: f */
    public final void m10854f(String str) {
        if (str != null) {
            this.f36712b = str;
        } else {
            C3386nv.m17635v("Null variantId");
        }
    }
}
