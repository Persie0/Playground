package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class u45 {

    /* JADX INFO: renamed from: a */
    public final int f63394a;

    /* JADX INFO: renamed from: b */
    public final String f63395b;

    /* JADX INFO: renamed from: c */
    public final String f63396c;

    /* JADX INFO: renamed from: d */
    public final String f63397d;

    /* JADX INFO: renamed from: e */
    public final String f63398e;

    /* JADX INFO: renamed from: f */
    public final String f63399f;

    /* JADX INFO: renamed from: g */
    public final String f63400g;

    /* JADX INFO: renamed from: h */
    public final String f63401h;

    public /* synthetic */ u45(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        this((i2 & 1) != 0 ? 0 : i, str, str2, str3, str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u45)) {
            return false;
        }
        u45 u45Var = (u45) obj;
        return this.f63394a == u45Var.f63394a && fa4.m11650l(this.f63395b, u45Var.f63395b) && fa4.m11650l(this.f63396c, u45Var.f63396c) && fa4.m11650l(this.f63397d, u45Var.f63397d) && fa4.m11650l(this.f63398e, u45Var.f63398e) && fa4.m11650l(this.f63399f, u45Var.f63399f) && fa4.m11650l(this.f63400g, u45Var.f63400g) && fa4.m11650l(this.f63401h, u45Var.f63401h);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(Integer.hashCode(this.f63394a) * 31, this.f63395b, 31);
        String str = this.f63396c;
        int iHashCode = (iM22980c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f63397d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f63398e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f63399f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f63400g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f63401h;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f63394a, "LessonListening(id=", ", title=", this.f63395b, ", imageUrl=");
        AbstractC3393o1.m17725C(sbM22995r, this.f63396c, ", collectionTitle=", this.f63397d, ", videoUrl=");
        AbstractC3393o1.m17725C(sbM22995r, this.f63398e, ", audioUrl=", this.f63399f, ", externalAudioUrl=");
        return wq1.m24125u(sbM22995r, this.f63400g, ", originalUrl=", this.f63401h, ")");
    }

    public u45(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f63394a = i;
        this.f63395b = str;
        this.f63396c = str2;
        this.f63397d = str3;
        this.f63398e = str4;
        this.f63399f = str5;
        this.f63400g = str6;
        this.f63401h = str7;
    }
}
