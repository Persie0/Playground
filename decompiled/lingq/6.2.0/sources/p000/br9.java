package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class br9 {

    /* JADX INFO: renamed from: a */
    public final String f8901a;

    /* JADX INFO: renamed from: b */
    public final boolean f8902b;

    public br9(String str, boolean z) {
        str.getClass();
        this.f8901a = str;
        this.f8902b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br9)) {
            return false;
        }
        br9 br9Var = (br9) obj;
        return fa4.m11650l(this.f8901a, br9Var.f8901a) && this.f8902b == br9Var.f8902b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8902b) + (this.f8901a.hashCode() * 31);
    }

    public final String toString() {
        return "TagUiState(tag=" + this.f8901a + ", isGrammarTag=" + this.f8902b + ")";
    }
}
