package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ug8 {

    /* JADX INFO: renamed from: a */
    public final String f63892a;

    /* JADX INFO: renamed from: b */
    public final String f63893b;

    /* JADX INFO: renamed from: c */
    public final String f63894c;

    /* JADX INFO: renamed from: d */
    public final boolean f63895d;

    /* JADX INFO: renamed from: e */
    public final boolean f63896e;

    /* JADX INFO: renamed from: f */
    public final int f63897f;

    public ug8(int i, String str, String str2, String str3, boolean z, boolean z2) {
        str2.getClass();
        str3.getClass();
        this.f63892a = str;
        this.f63893b = str2;
        this.f63894c = str3;
        this.f63895d = z;
        this.f63896e = z2;
        this.f63897f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug8)) {
            return false;
        }
        ug8 ug8Var = (ug8) obj;
        return this.f63892a.equals(ug8Var.f63892a) && fa4.m11650l(this.f63893b, ug8Var.f63893b) && fa4.m11650l(this.f63894c, ug8Var.f63894c) && this.f63895d == ug8Var.f63895d && this.f63896e == ug8Var.f63896e && this.f63897f == ug8Var.f63897f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63897f) + g9a.m12428e(g9a.m12428e(ux5.m22980c(ux5.m22980c(this.f63892a.hashCode() * 31, this.f63893b, 31), this.f63894c, 31), 31, this.f63895d), 31, this.f63896e);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ReviewUnscrambleState(sentence=", this.f63892a, ", translation=", this.f63893b, ", answer=");
        ux5.m22976C(this.f63894c, ", isSubmitEnabled=", ", isRtl=", sbM23000w, this.f63895d);
        sbM23000w.append(this.f63896e);
        sbM23000w.append(", resetTrigger=");
        sbM23000w.append(this.f63897f);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
