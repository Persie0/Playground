package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class bu1 {

    /* JADX INFO: renamed from: a */
    public final Integer f9018a;

    /* JADX INFO: renamed from: b */
    public final int f9019b;

    public bu1(int i, Integer num) {
        this.f9018a = num;
        this.f9019b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu1)) {
            return false;
        }
        bu1 bu1Var = (bu1) obj;
        return fa4.m11650l(this.f9018a, bu1Var.f9018a) && this.f9019b == bu1Var.f9019b;
    }

    public final int hashCode() {
        Integer num = this.f9018a;
        return Integer.hashCode(this.f9019b) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "CupMeSummary(rank=" + this.f9018a + ", score=" + this.f9019b + ")";
    }
}
