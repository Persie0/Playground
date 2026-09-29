package p000;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class zy8 {
    public static final yy8 Companion = new yy8();

    /* JADX INFO: renamed from: a */
    public final String f72388a;

    /* JADX INFO: renamed from: b */
    public final String f72389b;

    /* JADX INFO: renamed from: c */
    public final int f72390c;

    /* JADX INFO: renamed from: d */
    public final long f72391d;

    public /* synthetic */ zy8(int i, String str, String str2, int i2, long j) {
        if (15 != (i & 15)) {
            n3c.m17204b(i, 15, xy8.f68973a.getDescriptor());
            throw null;
        }
        this.f72388a = str;
        this.f72389b = str2;
        this.f72390c = i2;
        this.f72391d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy8)) {
            return false;
        }
        zy8 zy8Var = (zy8) obj;
        return fa4.m11650l(this.f72388a, zy8Var.f72388a) && fa4.m11650l(this.f72389b, zy8Var.f72389b) && this.f72390c == zy8Var.f72390c && this.f72391d == zy8Var.f72391d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f72391d) + wq1.m24106b(this.f72390c, ux5.m22980c(this.f72388a.hashCode() * 31, this.f72389b, 31), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f72388a + ", firstSessionId=" + this.f72389b + ", sessionIndex=" + this.f72390c + ", sessionStartTimestampUs=" + this.f72391d + ')';
    }

    public zy8(String str, String str2, int i, long j) {
        this.f72388a = str;
        this.f72389b = str2;
        this.f72390c = i;
        this.f72391d = j;
    }
}
