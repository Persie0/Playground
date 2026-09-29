package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class rc8 {

    /* JADX INFO: renamed from: a */
    public final String f59072a;

    /* JADX INFO: renamed from: b */
    public final boolean f59073b;

    public rc8(String str, boolean z) {
        str.getClass();
        this.f59072a = str;
        this.f59073b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc8)) {
            return false;
        }
        rc8 rc8Var = (rc8) obj;
        return fa4.m11650l(this.f59072a, rc8Var.f59072a) && this.f59073b == rc8Var.f59073b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59073b) + (this.f59072a.hashCode() * 31);
    }

    public final String toString() {
        return "ReviewChoiceOptionState(text=" + this.f59072a + ", isCorrect=" + this.f59073b + ")";
    }
}
