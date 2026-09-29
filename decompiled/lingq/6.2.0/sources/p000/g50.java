package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class g50 extends wh8 {

    /* JADX INFO: renamed from: b */
    public final String f40217b;

    /* JADX INFO: renamed from: c */
    public final String f40218c;

    /* JADX INFO: renamed from: d */
    public final String f40219d;

    /* JADX INFO: renamed from: e */
    public final String f40220e;

    /* JADX INFO: renamed from: f */
    public final long f40221f;

    public g50(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            C3386nv.m17635v("Null rolloutId");
            throw null;
        }
        this.f40217b = str;
        if (str2 == null) {
            C3386nv.m17635v("Null parameterKey");
            throw null;
        }
        this.f40218c = str2;
        this.f40219d = str3;
        if (str4 == null) {
            C3386nv.m17635v("Null variantId");
            throw null;
        }
        this.f40220e = str4;
        this.f40221f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wh8)) {
            return false;
        }
        g50 g50Var = (g50) ((wh8) obj);
        return this.f40217b.equals(g50Var.f40217b) && this.f40218c.equals(g50Var.f40218c) && this.f40219d.equals(g50Var.f40219d) && this.f40220e.equals(g50Var.f40220e) && this.f40221f == g50Var.f40221f;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f40217b.hashCode() ^ 1000003) * 1000003) ^ this.f40218c.hashCode()) * 1000003) ^ this.f40219d.hashCode()) * 1000003) ^ this.f40220e.hashCode()) * 1000003;
        long j = this.f40221f;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f40217b);
        sb.append(", parameterKey=");
        sb.append(this.f40218c);
        sb.append(", parameterValue=");
        sb.append(this.f40219d);
        sb.append(", variantId=");
        sb.append(this.f40220e);
        sb.append(", templateVersion=");
        return wq1.m24113i(this.f40221f, "}", sb);
    }
}
