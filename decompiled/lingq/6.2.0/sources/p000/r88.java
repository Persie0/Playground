package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class r88 {

    /* JADX INFO: renamed from: a */
    public final boolean f58890a;

    /* JADX INFO: renamed from: b */
    public final String f58891b;

    /* JADX INFO: renamed from: c */
    public final boolean f58892c;

    public r88(String str, boolean z, boolean z2) {
        str.getClass();
        this.f58890a = z;
        this.f58891b = str;
        this.f58892c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r88)) {
            return false;
        }
        r88 r88Var = (r88) obj;
        return this.f58890a == r88Var.f58890a && fa4.m11650l(this.f58891b, r88Var.f58891b) && this.f58892c == r88Var.f58892c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58892c) + ux5.m22980c(Boolean.hashCode(this.f58890a) * 31, this.f58891b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultActivity(isCorrect=");
        sb.append(this.f58890a);
        sb.append(", emoji=");
        sb.append(this.f58891b);
        sb.append(", show=");
        return AbstractC3393o1.m17740o(sb, this.f58892c, ")");
    }

    public /* synthetic */ r88() {
        this("", false, false);
    }
}
