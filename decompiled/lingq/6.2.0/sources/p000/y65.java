package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class y65 {

    /* JADX INFO: renamed from: a */
    public final boolean f69368a;

    /* JADX INFO: renamed from: b */
    public final boolean f69369b;

    /* JADX INFO: renamed from: c */
    public final String f69370c;

    /* JADX INFO: renamed from: d */
    public final String f69371d;

    /* JADX INFO: renamed from: e */
    public final String f69372e;

    /* JADX INFO: renamed from: f */
    public final String f69373f;

    /* JADX INFO: renamed from: g */
    public final boolean f69374g;

    public y65(boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3) {
        ux5.m22974A(str, str2, str4);
        this.f69368a = z;
        this.f69369b = z2;
        this.f69370c = str;
        this.f69371d = str2;
        this.f69372e = str3;
        this.f69373f = str4;
        this.f69374g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y65)) {
            return false;
        }
        y65 y65Var = (y65) obj;
        return this.f69368a == y65Var.f69368a && this.f69369b == y65Var.f69369b && fa4.m11650l(this.f69370c, y65Var.f69370c) && fa4.m11650l(this.f69371d, y65Var.f69371d) && fa4.m11650l(this.f69372e, y65Var.f69372e) && fa4.m11650l(this.f69373f, y65Var.f69373f) && this.f69374g == y65Var.f69374g;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(g9a.m12428e(Boolean.hashCode(this.f69368a) * 31, 31, this.f69369b), this.f69370c, 31), this.f69371d, 31);
        String str = this.f69372e;
        return Boolean.hashCode(this.f69374g) + ux5.m22980c((iM22980c + (str == null ? 0 : str.hashCode())) * 31, this.f69373f, 31);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("LessonUiState(isLiked=", ", inPlaylist=", ", lessonTitle=", this.f69368a, this.f69369b);
        AbstractC3393o1.m17725C(sbM13357g, this.f69370c, ", courseTitle=", this.f69371d, ", lessonImageUrl=");
        AbstractC3393o1.m17725C(sbM13357g, this.f69372e, ", language=", this.f69373f, ", hasAudio=");
        return AbstractC3393o1.m17740o(sbM13357g, this.f69374g, ")");
    }
}
