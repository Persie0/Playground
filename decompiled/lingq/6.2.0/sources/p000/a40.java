package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class a40 {

    /* JADX INFO: renamed from: a */
    public c40 f194a;

    /* JADX INFO: renamed from: b */
    public String f195b;

    /* JADX INFO: renamed from: c */
    public String f196c;

    /* JADX INFO: renamed from: d */
    public long f197d;

    /* JADX INFO: renamed from: e */
    public byte f198e;

    /* JADX INFO: renamed from: a */
    public final b40 m97a() {
        c40 c40Var;
        String str;
        String str2;
        if (this.f198e == 1 && (c40Var = this.f194a) != null && (str = this.f195b) != null && (str2 = this.f196c) != null) {
            return new b40(c40Var, str, str2, this.f197d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f194a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.f195b == null) {
            sb.append(" parameterKey");
        }
        if (this.f196c == null) {
            sb.append(" parameterValue");
        }
        if ((this.f198e & 1) == 0) {
            sb.append(" templateVersion");
        }
        C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m98b(String str) {
        if (str != null) {
            this.f195b = str;
        } else {
            C3386nv.m17635v("Null parameterKey");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m99c(long j) {
        this.f197d = j;
        this.f198e = (byte) (this.f198e | 1);
    }
}
