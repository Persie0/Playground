package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class pr0 implements rr0 {

    /* JADX INFO: renamed from: a */
    public final ws1 f56711a;

    public pr0(ws1 ws1Var) {
        ws1Var.getClass();
        this.f56711a = ws1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr0) && fa4.m11650l(this.f56711a, ((pr0) obj).f56711a);
    }

    @Override // p000.rr0
    public final String getKey() {
        return "cup-ended";
    }

    public final int hashCode() {
        return this.f56711a.hashCode();
    }

    public final String toString() {
        return "EndedCup(banner=" + this.f56711a + ")";
    }
}
