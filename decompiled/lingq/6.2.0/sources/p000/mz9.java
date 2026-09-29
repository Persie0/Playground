package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class mz9 {

    /* JADX INFO: renamed from: a */
    public final boolean f52087a;

    /* JADX INFO: renamed from: b */
    public final boolean f52088b;

    /* JADX INFO: renamed from: c */
    public final boolean f52089c;

    public mz9(boolean z, boolean z2, boolean z3) {
        this.f52087a = z;
        this.f52088b = z2;
        this.f52089c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz9)) {
            return false;
        }
        mz9 mz9Var = (mz9) obj;
        return this.f52087a == mz9Var.f52087a && this.f52088b == mz9Var.f52088b && this.f52089c == mz9Var.f52089c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52089c) + g9a.m12428e(Boolean.hashCode(this.f52087a) * 31, 31, this.f52088b);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(hn1.m13357g("ReadingToggleSettings(tapToPage=", ", statusBar=", ", showVocabulary=", this.f52087a, this.f52088b), this.f52089c, ")");
    }
}
