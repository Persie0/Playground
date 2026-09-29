package p000;

/* JADX INFO: loaded from: classes.dex */
public final class z25 {
    public static final x25 Companion = new x25();

    /* JADX INFO: renamed from: a */
    public final boolean f70787a;

    /* JADX INFO: renamed from: b */
    public final int f70788b;

    /* JADX INFO: renamed from: c */
    public final String f70789c;

    /* JADX INFO: renamed from: d */
    public final String f70790d;

    /* JADX INFO: renamed from: e */
    public final String f70791e;

    /* JADX INFO: renamed from: f */
    public final String f70792f;

    /* JADX INFO: renamed from: g */
    public final boolean f70793g;

    public z25(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        str4.getClass();
        this.f70787a = z;
        this.f70788b = i;
        this.f70789c = str;
        this.f70790d = str2;
        this.f70791e = str3;
        this.f70792f = str4;
        this.f70793g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z25)) {
            return false;
        }
        z25 z25Var = (z25) obj;
        return this.f70787a == z25Var.f70787a && this.f70788b == z25Var.f70788b && fa4.m11650l(this.f70789c, z25Var.f70789c) && fa4.m11650l(this.f70790d, z25Var.f70790d) && fa4.m11650l(this.f70791e, z25Var.f70791e) && fa4.m11650l(this.f70792f, z25Var.f70792f) && this.f70793g == z25Var.f70793g;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(wq1.m24106b(this.f70788b, Boolean.hashCode(this.f70787a) * 31, 31), this.f70789c, 31), this.f70790d, 31);
        String str = this.f70791e;
        return Boolean.hashCode(this.f70793g) + ux5.m22980c((iM22980c + (str == null ? 0 : str.hashCode())) * 31, this.f70792f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonInfoBottomSheetState(show=");
        sb.append(this.f70787a);
        sb.append(", lessonId=");
        sb.append(this.f70788b);
        sb.append(", title=");
        AbstractC3393o1.m17725C(sb, this.f70789c, ", imageUrl=", this.f70790d, ", originalImageUrl=");
        AbstractC3393o1.m17725C(sb, this.f70791e, ", shelfCode=", this.f70792f, ", isPremium=");
        return AbstractC3393o1.m17740o(sb, this.f70793g, ")");
    }

    public /* synthetic */ z25() {
        this(0, "", "", null, "", false, false);
    }
}
